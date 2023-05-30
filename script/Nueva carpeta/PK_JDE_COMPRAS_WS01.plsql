CREATE OR REPLACE PACKAGE  BODY "DATA".PK_JDE_COMPRAS_WS AS
    /*Paquetes privados*/
    PROCEDURE SP_XMLINICIAR(P_BSSV VARCHAR);
    PROCEDURE SP_XMLFINALIZAR(P_PROCESO VARCHAR);

    PROCEDURE SP_XMLINICIAR(P_BSSV VARCHAR) AS 
    V_CONTADOR NUMBER;
    BEGIN 
        --DATOS DE USUARIO
        SELECT COUNT(1) INTO V_CONTADOR FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='1';  

        IF(V_CONTADOR=0) THEN 
             raise_application_error(-20000,'No existen datos de usuario en la UDC JDE_VTAS');
        END IF;

        SELECT VALOR, VALOR2 INTO G_USUARIO, G_CONTRASENA
        FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='1';

        IF(LENGTH(G_USUARIO)<1 OR LENGTH(G_CONTRASENA)<1) THEN 
             raise_application_error(-20000,'No existen datos de usuario en la UDC JDE_VTAS');
        END IF;       

        G_TRAMA := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:orac="'||P_BSSV||'">
                        <soapenv:Header>
                            <wsse:Security soapenv:mustUnderstand="1" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
                                <wsse:UsernameToken wsu:Id="UsernameToken-8" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
                                    <wsse:Username>'||G_USUARIO||'</wsse:Username>
                                    <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">'||G_CONTRASENA||'</wsse:Password>
                                </wsse:UsernameToken>
                            </wsse:Security>
                        </soapenv:Header>
                    <soapenv:Body>
             ';

    END SP_XMLINICIAR;

    /*Finaliza la trama XML de un proceso
    @param P_PROCESO VARCHAR nombre de proceso
    */
    PROCEDURE SP_XMLFINALIZAR(P_PROCESO VARCHAR) AS BEGIN 
         G_TRAMA :=G_TRAMA||'
                    </header>
                </orac:'||P_PROCESO||'>
            </soapenv:Body>
         </soapenv:Envelope>'; 
         --dbms_output.put_line('SP_XMLFINALIZAR: '||G_TRAMA); 
    END SP_XMLFINALIZAR;


      PROCEDURE SP_RECEPCIONORDENV2(P_VERSION IN VARCHAR, P_NUMERO NUMBER, P_TIPO VARCHAR,
    P_LINEA NUMBER, P_CANTIDAD NUMBER, P_COMPANIA VARCHAR)
    AS BEGIN
        SP_XMLINICIAR('http://oracle.e1.bssv.JP55ZML/');
        G_TRAMA :=G_TRAMA||
            ' <orac:callR554312A>
                 <targetValue>'||REPLACE(TO_CHAR(P_CANTIDAD),',', '.')||'</targetValue>
                 <orderNumberforSoftwareUpdate>'||P_NUMERO||'</orderNumberforSoftwareUpdate>
                 <orderCompanyOrderNumber>'||P_COMPANIA||'</orderCompanyOrderNumber>
                 <orderType>'||P_TIPO||'</orderType>
                 <lineNumber>'||REPLACE(TO_CHAR(P_LINEA/1000),',', '.')||'</lineNumber>
                 <versionHistory>'||P_VERSION||'</versionHistory>
              </orac:callR554312A>
         </soapenv:Body>
         </soapenv:Envelope>';

          IF(G_TRAMA IS NULL) THEN 
             raise_application_error(-20000,'No existe trama XML');
        END IF;

        SELECT  VALOR INTO G_URL  FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='5'; 

        -- LLAMA WEB SERVICE
        apex_web_service.g_request_headers(1).name := 'Content-Type';  
        apex_web_service.g_request_headers(1).value := 'application/xml';  
        apex_web_service.g_request_headers(2).name := 'BSSV';  
        apex_web_service.g_request_headers(2).value := 'UBECALL_R554312A_Servicio';  
        apex_web_service.g_request_headers(3).name := 'BSSVrequest';  
        apex_web_service.g_request_headers(3).value := 'http://oracle.e1.bssv.JP55ZML/UBECALL_R554312A_Servicio/callR554312ARequest';  

        G_RESULTADO := apex_web_service.make_rest_request(
          p_url => G_URL,
          p_http_method => 'POST'
          ,p_body =>G_TRAMA
        );
         PK_CORP_DEBUG.INFO(G_MODULO,'PK_JDE_COMPRAS_WS.SP_RECEPCIONORDENV2',' V_RESULTADO '||G_RESULTADO);
        --apex_json.parse (G_RESULTADO);
        IF PK_CORP_COMMONS.F_JSON_GET(P_TRAMA=>G_RESULTADO,P_ETIQUETA=>'exito')='true' THEN
            G_TRAMA := PK_CORP_COMMONS.F_JSON_GET(P_TRAMA=>G_RESULTADO,P_ETIQUETA=>'resultado');
            IF(PK_JDE_COMPRAS_WS.F_EXTRAEVALOR_TAG(G_TRAMA,'dataFieldErrorCode')<>0) THEN 
                 raise_application_error(-20000,'Error Al ejecutar reporte de recepcion en JDE en linea: '||P_LINEA);
            END IF;
        ELSE 
            -- no se ejecuto ws BSSV
             raise_application_error(-20000,'Error EN BSSV');
        END IF;

    END SP_RECEPCIONORDENV2;

    /*Llama al WS para recibir un orden de compra (Completa, parcial), debe llenar la trama G_TRAMA con los SP :
      SP_RECEPCIONORDEN_CAB_XML, SP_RECEPCIONORDEN_DET_XML, SP_XMLFINALIZAR;
      Modo de uso:  PK_JDE_COMPRAS_WS.SP_RECEPCIONORDEN(P_USUARIO=> 'JBALCAZAR');
      @param P_VERSION NUMBER version para llamar WS: 1 Rest Java, 2: Soap BSSV
      @param P_USUARIO VARCHAR usuario que realiza la transaccion 
    */    
    PROCEDURE SP_RECEPCIONORDEN(P_USUARIO IN VARCHAR) AS
    V_RESULTADO CLOB;
    V_CONTADOR NUMBER;
    V_EXITO NUMBER;
    V_MENSAJE VARCHAR(2500);
    BEGIN 
        IF(G_TRAMA IS NULL) THEN 
             raise_application_error(-20000,'No existe trama XML');
        END IF;

        SP_XMLFINALIZAR(G_RECEPCIONORDEN);   

        SELECT  VALOR INTO G_URL  FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='3';

        -- LLAMA WEB SERVICE
        apex_web_service.g_request_headers(1).name := 'Content-Type';  
        apex_web_service.g_request_headers(1).value := 'application/xml';  
        V_RESULTADO := apex_web_service.make_rest_request(
            p_url => G_URL||'recepcionOrden',
            p_http_method => 'POST'
            ,p_body =>G_TRAMA
        );
        PK_CORP_DEBUG.INFO(G_MODULO,'PK_JDE_COMPRAS_WS.SP_RECEPCIONORDEN',' V_RESULTADO '||V_RESULTADO);

       --apex_json.parse (V_RESULTADO);
       V_MENSAJE := PK_CORP_COMMONS.F_JSON_GET(P_TRAMA=>V_RESULTADO,P_ETIQUETA=>'mensaje');
       V_EXITO := CASE WHEN PK_CORP_COMMONS.F_JSON_GET(P_TRAMA=>V_RESULTADO,P_ETIQUETA=>'exito')='true' THEN 1 ELSE 0 END;

       IF(V_EXITO<>1) THEN
            raise_application_error(-20000,V_MENSAJE);
       END IF;

    END SP_RECEPCIONORDEN;


     /*Inicializa la trama XML generando la cabecera para llamar al proceso: PurchaseOrderReceiptManager-processPurchaseOrderReceipt 
      PK_JDE_COMPRAS_WS.SP_RECEPCIONORDEN_CAB_XML(P_NUMERO=>123544,
                                          P_TIPO=>'DT',
                                          P_COMPANIA=>'00001');
      @param P_VERSION VARCHAR version de la aplicacion JDE P4312
      @param P_NUMERO NUMBER numero de documento
      @param P_TIPO tipo de documento 
      @param P_COMPANIA VARCHAR codigo de compania */
    PROCEDURE SP_RECEPCIONORDEN_CAB_XML(P_VERSION IN VARCHAR DEFAULT NULL,P_NUMERO IN NUMBER, P_TIPO IN VARCHAR, P_COMPANIA IN VARCHAR) AS
    V_FECHA DATE :=SYSDATE;
    BEGIN 
         --Crear trama
        SP_XMLINICIAR(G_ORDERRECEIPT_BSSV);
        G_TRAMA :=G_TRAMA||
        '<orac:processPurchaseOrderReceipt>
         <header>
		 	<processingVersion>'||NVL(P_VERSION,'ERP0002')||'</processingVersion>
			<purchaseOrderKey>
               <documentCompany>'||P_COMPANIA||'</documentCompany>
               <documentNumber>'||P_NUMERO||'</documentNumber>
               <documentTypeCode>'||P_TIPO||'</documentTypeCode>
            </purchaseOrderKey>			
            <dates>             
               <dateAccounting>'||TO_CHAR(V_FECHA, 'YYYY-MM-DD')||'T00:00:00-05:00</dateAccounting>             
               <dateReceived>'||TO_CHAR(V_FECHA, 'YYYY-MM-DD')||'T00:00:00-05:00</dateReceived>
            </dates>
            ';                  
    END SP_RECEPCIONORDEN_CAB_XML;


     /*Agrega detalle de la trama XML del proceso: PurchaseOrderReceiptManager-processPurchaseOrderReceipt 
        PK_JDE_COMPRAS_WS.SP_RECEPCIONORDEN_DET_XML(P_NUMERO=>123544,
                                          P_TIPO=>'DT',
                                          P_LINEA =>1000,
                                          P_VALOR => NULL,
                                          P_BODEGA=>NULL,
                                          P_LOCALIDAD => NULL,
                                          P_COMPANIA=>'00001');

      @param P_NUMERO NUMBER numero de documento
      @param P_TIPO tipo de documento 
      @param P_LINEA numero linea del documento, en el caso que se null se procesara todas la lineas
      @param P_VALOR valor que se va a recibir, en el caso que se null se procesara el valor que esta en la tabla F4311- PDUOPN/10000
      @param P_BODEGA bodega donde se va a recibir, en el caso que se null se procesara la bodega que esta en la tabla F4311- PDMCU
      @param P_LOCALIDAD Localidad donde se va a recibir, en el caso que se null se procesara la localidd que esta en la tabla F4311- PDLOCN
      @param P_COMPANIA VARCHAR codigo de compania */
    PROCEDURE SP_RECEPCIONORDEN_DET_XML(P_NUMERO IN NUMBER, P_TIPO IN VARCHAR, P_LINEA IN NUMBER DEFAULT NULL,
                            P_VALOR IN NUMBER DEFAULT NULL, P_BODEGA IN VARCHAR DEFAULT NULL, 
                            P_LOCALIDAD IN VARCHAR DEFAULT NULL, P_LOTE IN VARCHAR DEFAULT NULL, P_LOTEFECHA IN DATE DEFAULT NULL, 
                            P_COMPANIA IN VARCHAR) AS
    V_FECHA DATE :=SYSDATE;
    V_VALIDACION NUMBER :=0;
    BEGIN 
         dbms_output.put_line('SP_RECEPCIONORDEN_DET_XML: P_NUMERO: '||P_NUMERO|| ' P_TIPO: '||P_TIPO||' P_LINEA: '||P_LINEA);  
        FOR LINEA IN (select REPLACE(TO_CHAR(PDLNID/1000),',', '.')  ID,  NVL(P_BODEGA,PDMCU)  BODEGA, NVL(P_LOCALIDAD,PDLOCN) DESTINO,
                        REPLACE(TO_CHAR(CASE WHEN P_LINEA IS NOT NULL AND P_VALOR>0 THEN P_VALOR ELSE  PDUOPN/10000 END),',', '.') CANTIDAD FROM F4311@JDEDTADL 
                        WHERE PDDOCO=P_NUMERO AND PDDCTO=P_TIPO AND PDNXTR IN (380, 385,400) AND (PDLNID=P_LINEA OR P_LINEA IS NULL)) LOOP
            V_VALIDACION :=1;            
            G_TRAMA :=G_TRAMA||
            '<detail>
                <purchaseOrderLineKey>
                    <documentLineNumber>'||LINEA.ID||'</documentLineNumber>
                 </purchaseOrderLineKey>
                   <businessunit>'||LINEA.BODEGA||'</businessunit>
                   <locationReceived>'||LINEA.DESTINO||'</locationReceived>
                   <quantity>
                          <quantityReceived>'||LINEA.CANTIDAD||'</quantityReceived>
                    </quantity>
                    '|| CASE WHEN P_LOTE IS NOT NULL THEN
                    '<lot>
                      <dateLotExpire>'||CASE WHEN P_LOTEFECHA IS NULL THEN '' ELSE TO_CHAR(P_LOTEFECHA, 'YYYY-MM-DD')||'T00:00:00-05:00' END||'</dateLotExpire>
                      <description></description>
                      <lotAlternative></lotAlternative>
                      <lotGrade></lotGrade>
                      <lotNumber>'||P_LOTE||'</lotNumber>
                      <lotPotency></lotPotency>
                      <lotStatusCode></lotStatusCode>
                   </lot>' ELSE '' END||
               '</detail>
               ';                  
        END LOOP;

        IF(V_VALIDACION=0) THEN 
            RAISE_APPLICATION_ERROR(-20000,'No se proceso la(s) lineas: '||P_LINEA);
        END IF;
    END SP_RECEPCIONORDEN_DET_XML;
FUNCTION F_EXTRAEVALOR_TAG(P_CADENA IN CLOB, P_ETIQUETA IN VARCHAR2)
RETURN VARCHAR2 
IS
v_out_valor VARCHAR2 (40);
BEGIN
  BEGIN
    select SUBSTR(P_CADENA,
    (INSTR(P_CADENA, P_ETIQUETA||'>')+LENGTH(P_ETIQUETA||'>')), 
    (INSTR(P_CADENA, '</'||P_ETIQUETA)) - (INSTR(P_CADENA, P_ETIQUETA||'>')+LENGTH(P_ETIQUETA||'>')))
    INTO v_out_valor
    FROM DUAL;
  EXCEPTION
    WHEN OTHERS THEN
      RAISE_APPLICATION_ERROR(-20001, 'OCURRIO UN ERROR AL OBTENER EL VALOR DE LA ETIQUETA - ' || P_ETIQUETA || ' ' ||
                              SQLCODE || ' -ERROR- ' || SQLERRM);
  END;
  RETURN v_out_valor;
END F_EXTRAEVALOR_TAG;

    /*
    PK_JDE_COMPRAS_WS.SP_CANCELAORDEN();
    */
    PROCEDURE SP_CANCELAORDEN AS 
    BEGIN 
        IF(G_TRAMA IS NULL) THEN 
             raise_application_error(-20000,'No existe trama XML');
        END IF;
        SP_XMLFINALIZAR('processPurchaseOrder');       
        SELECT  VALOR INTO G_URL  FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='5'; 
        -- LLAMA WEB SERVICE
        apex_web_service.g_request_headers(1).name := 'Content-Type';  
        apex_web_service.g_request_headers(1).value := 'application/xml';  
        apex_web_service.g_request_headers(2).name := 'BSSV';  
        apex_web_service.g_request_headers(2).value := 'ProcurementManager';  
        apex_web_service.g_request_headers(3).name := 'BSSVrequest';  
        apex_web_service.g_request_headers(3).value := 'http://oracle.e1.bssv.JP430000/ProcurementManager/processPurchaseOrderRequest';  

        G_RESULTADO := apex_web_service.make_rest_request(
          p_url => G_URL,
          p_http_method => 'POST'
          ,p_body =>G_TRAMA
        );
        PK_CORP_DEBUG.INFO(G_MODULO,'PK_JDE_COMPRAS_WS.SP_CANCELAORDEN',' V_RESULTADO '||G_RESULTADO);
        apex_json.parse (G_RESULTADO);
        IF apex_json.get_varchar2 ('exito')='true' THEN
            G_TRAMA := apex_json.get_varchar2 ('resultado');   
            G_NUMERO := PK_JDE_COMPRAS_WS.F_EXTRAEVALOR_TAG(G_TRAMA,'documentNumber');
            G_TIPO := PK_JDE_COMPRAS_WS.F_EXTRAEVALOR_TAG(G_TRAMA,'documentTypeCode');
        ELSE 
            -- no se ejecuto ws BSSV
             raise_application_error(-20000,'Error EN BSSV');
        END IF;
    end;
    /*
    PK_JDE_COMPRAS_WS.SP_CANCELAORDEN_CAB(  P_COMPANIA=>'00001',
                                          P_DOCUMENTO => '21001500',  
                                          P_TIPODOCUMENTO=>'CM');
    */
    PROCEDURE SP_CANCELAORDEN_CAB(P_COMPANIA VARCHAR, P_DOCUMENTO NUMBER, P_TIPODOCUMENTO VARCHAR) AS
    BEGIN 

     --Crear trama
        G_CONTADOR:=1;
        SP_XMLINICIAR(G_ORDENCANCELAR_BSSV);
        G_TRAMA :=G_TRAMA||
        '<orac:processPurchaseOrder>
         <header>
			<processing>
               	<actionType>2</actionType>
            </processing>
            <purchaseOrderKey>
                <documentCompany>'||P_COMPANIA||'</documentCompany>
                <documentNumber>'||P_DOCUMENTO||'</documentNumber>
                <documentTypeCode>'||P_TIPODOCUMENTO||'</documentTypeCode>
            </purchaseOrderKey>';
    END;        
     /*
    PK_JDE_COMPRAS_WS.SP_CREARORDEN_DET(    P_COMPANIA=>'00001',
                                            P_BODEGA=>17001,
                                            P_LINEA=> 1000);
    */
    PROCEDURE SP_CANCELAORDEN_DET (P_COMPANIA VARCHAR, P_BODEGA VARCHAR, P_CODIGOCORTO NUMBER, P_LINEAORDEN NUMBER) AS 
    BEGIN
        G_TRAMA :=G_TRAMA||
        '<detail>
			  	<actionType>D</actionType>
                <businessUnit>'|| P_BODEGA ||'</businessUnit>
               	<product>
               		<item>
               			<itemId>'|| P_CODIGOCORTO ||'</itemId>
               		</item>
               	</product>
               	<purchaseOrderLineKey>
               		<documentLineNumber>'|| P_LINEAORDEN ||'</documentLineNumber>
               	</purchaseOrderLineKey>
               </detail>';
               G_CONTADOR:=G_CONTADOR+1;
    END;
        /*
    PK_JDE_COMPRAS_WS.SP_CREARORDEN_CAB(  P_COMPANIA=>'00001',
                                          P_VERSION => 'ERP0036',  
                                          P_BODEGA=>'17001',
                                          P_COMPRADOR=>11679,  
                                          P_ENVIA=>1,
                                          P_PROVEEDOR=>92192,
                                          P_FECHAPROMETIDA=>SYSDATE);
    */
    PROCEDURE SP_CREARORDEN_CAB(P_COMPANIA VARCHAR, P_VERSION VARCHAR, P_BODEGA VARCHAR
    , P_COMPRADOR NUMBER, P_ENVIA NUMBER, P_PROVEEDOR NUMBER, P_FECHAPROMETIDA DATE) AS
    BEGIN 

     --Crear trama
        G_CONTADOR:=1;
        SP_XMLINICIAR(G_ORDENCREAR_BSSV);
        G_TRAMA :=G_TRAMA||
        '<orac:processPurchaseOrder>
         <header>
			<processing>
               	<actionType>1</actionType>
               	<processingVersion>'||P_VERSION||'</processingVersion>
            	</processing>
            	<purchaseOrderKey>
               	<documentCompany>'||P_COMPANIA||'</documentCompany>
            	</purchaseOrderKey>
            	<businessUnit>'||P_BODEGA||'</businessUnit>
                <buyer>
                    <entityId>'||P_COMPRADOR||'</entityId>
               </buyer>
               <shipToAddress>
                    <shipTo>
                        <entityId>'||P_ENVIA||'</entityId>
                  	</shipTo>
               </shipToAddress>
               <supplierAddress>
                    <supplier>
                        <entityId>'||P_PROVEEDOR||'</entityId>
                    </supplier>
               </supplierAddress>
               <dates>
                    <datePromisedDelivery>'||TO_CHAR(P_FECHAPROMETIDA, 'YYYY-MM-DD')||'</datePromisedDelivery>
                    <dateAccounting>'||TO_CHAR(P_FECHAPROMETIDA, 'YYYY-MM-DD')||'</dateAccounting>
               </dates> ';
    END;

    /*
    PK_JDE_COMPRAS_WS.SP_CREARORDEN_DET(    P_COMPANIA=>'00001',
                                            P_CODIGOCORTO=>1033269,
                                            P_CANTIDAD=> 100);
    */
    procedure sp_crearorden_det(
		p_compania varchar
		, p_codigocorto number
		, p_cantidad number
		, p_um varchar
		, p_preciounitario number
		, p_reqnumero number default null
		, p_reqtipo varchar default null
		, p_usuario varchar default null
		, p_linea number default null
	) as
	v_nombreusuario varchar2(20);
	begin
		v_log_app := 'pk_jde_compras_ws.sp_crearorden_det';
		v_log_dsc := 'p_compania: '||p_compania||', '||'p_codigocorto: '||p_codigocorto||', '||'p_cantidad: '||p_cantidad||', '||'p_um: '||p_um||', '||'p_preciounitario: '||p_preciounitario;
		v_log_dsc := v_log_dsc||', '||'p_reqnumero: '||p_reqnumero||', '||'p_reqtipo: '||p_reqtipo||', '||'p_usuario: '||p_usuario||', '||'p_linea: '||p_linea;

		data.pk_commons.sp_apex_log(v_log_app,0,v_log_dsc,null,null,null);

	    -- Busco datos de usuario del comprador que genera la orden
		begin
			select distinct nombreusuario into v_nombreusuario from vt_corp_usuario where coderp = p_usuario;

			exception when others then raise_application_error(-20000,'Error al obtener datos de usuario comprador.');
		end;

        g_trama := concat(g_trama,
			'<detail><actionType>A</actionType><originalOrderLineKey>
				<documentCompany>'|| P_COMPANIA ||'</documentCompany>
				<documentLineNumber>'|| G_CONTADOR ||'</documentLineNumber>
				<documentNumber>'|| P_REQNUMERO ||'</documentNumber>
				<documentTypeCode>'|| P_REQTIPO ||'</documentTypeCode>
			</originalOrderLineKey>
			<product>
				<item><itemId>'|| P_CODIGOCORTO ||'</itemId></item>
			</product>
			<quantityOrdered>'||P_CANTIDAD||'</quantityOrdered>
			<purchaseOrderLineKey>
				<documentLineNumber>'|| P_LINEA ||'</documentLineNumber>
			</purchaseOrderLineKey>
			<transactionOriginator>'|| v_nombreusuario ||'</transactionOriginator>
			<costUnitPurchasing>'||REPLACE(P_PRECIOUNITARIO,',','.') ||'</costUnitPurchasing>
			<unitOfMeasureCodePurchasing>'||P_UM||'</unitOfMeasureCodePurchasing>
			<unitOfMeasureCodeTransaction>'||P_UM||'</unitOfMeasureCodeTransaction>
			</detail>'
		);

		g_contador := g_contador + 1;
	end sp_crearorden_det;

    /*
    PK_JDE_COMPRAS_WS.SP_CREARORDEN();
    */
    PROCEDURE SP_CREARORDEN AS 
    BEGIN 
        IF(G_TRAMA IS NULL) THEN 
             raise_application_error(-20000,'No existe trama XML');
        END IF;
        SP_XMLFINALIZAR('processPurchaseOrder');       
        SELECT  VALOR INTO G_URL  FROM T_CORP_UDC WHERE ID_CABECERA='JDE_WS' AND ID_TABLA ='5'; 
        -- LLAMA WEB SERVICE
        apex_web_service.g_request_headers(1).name := 'Content-Type';  
        apex_web_service.g_request_headers(1).value := 'application/xml';  
        apex_web_service.g_request_headers(2).name := 'BSSV';  
        apex_web_service.g_request_headers(2).value := 'ProcurementManager';  
        apex_web_service.g_request_headers(3).name := 'BSSVrequest';  
        apex_web_service.g_request_headers(3).value := 'http://oracle.e1.bssv.JP430000/ProcurementManager/processPurchaseOrderRequest';  

        G_RESULTADO := apex_web_service.make_rest_request(
          p_url => G_URL,
          p_http_method => 'POST'
          ,p_body =>G_TRAMA
        );
         PK_CORP_DEBUG.INFO(G_MODULO,'PK_JDE_COMPRAS_WS.SP_CREARORDEN',' V_RESULTADO '||G_RESULTADO);
        apex_json.parse (G_RESULTADO);
        IF apex_json.get_varchar2 ('exito')='true' THEN
            G_TRAMA := apex_json.get_varchar2 ('resultado');   
            G_NUMERO := PK_JDE_COMPRAS_WS.F_EXTRAEVALOR_TAG(G_TRAMA,'documentNumber');
            G_TIPO := PK_JDE_COMPRAS_WS.F_EXTRAEVALOR_TAG(G_TRAMA,'documentTypeCode');
        ELSE 
            -- no se ejecuto ws BSSV
             raise_application_error(-20000,'Error EN BSSV');
        END IF;

    END;                             
END PK_JDE_COMPRAS_WS;