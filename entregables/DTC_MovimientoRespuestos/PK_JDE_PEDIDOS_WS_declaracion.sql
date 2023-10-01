CREATE OR REPLACE PACKAGE "DATA"."PK_JDE_PEDIDOS_WS" AS
 --
 -- autor:  Bestch
 -- fecha:  2023-05-28
 --
 -- Package header
 --
 -- Variables globales
 --
 -- xml header
    G_SEGURIDADES        CLOB := '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:orac="?BSSV">
    <soapenv:Header>
        <wsse:Security soapenv:mustUnderstand="0"
            xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
            <wsse:UsernameToken wsu:Id="UsernameToken-8"
                xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
                <wsse:Username>?usuario</wsse:Username>
                <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">?clave</wsse:Password>
            </wsse:UsernameToken>
        </wsse:Security>
    </soapenv:Header>';
 --
 -- xml body crear orden
    G_BODY_CREAR_1       CLOB:='<soapenv:Body>
        <orac:processSalesOrder>
            <header>
                <businessUnit>?unidadNegocio</businessUnit>
                <company></company>
                <currencyCodeTo>?codigoMoneda</currencyCodeTo>
                <dateOrdered>?fechaOrden</dateOrdered>
                <dateRequested>?fechaPedido</dateRequested>
                <dateScheduledPick></dateScheduledPick>
                <deliverTo>
                    <entityId></entityId>
                    <entityLongId></entityLongId>
                    <entityTaxId></entityTaxId>
                </deliverTo>';
    G_BODY_CREAR_2       CLOB:= '<forwardedTo>
                    <entityId></entityId>
                    <entityLongId></entityLongId>
                    <entityTaxId></entityTaxId>
                </forwardedTo>
                <holdOrderCode></holdOrderCode>
                <invoicedTo>
                    <entityId></entityId>
                    <entityLongId></entityLongId>
                    <entityTaxId></entityTaxId>
                </invoicedTo>
                <orderTakenBy></orderTakenBy>
                <orderedBy></orderedBy>
                <processing>
                    <actionType>?tipoProcesamiento</actionType>
                    <processingVersion>?versionProcesamiento</processingVersion>
                </processing>
                <rateExchange></rateExchange>

                <shipTo>
                    <customer>                        
                    <entityId>?enviarId</entityId>                        
                    </customer>
                </shipTo>

                <soldTo>
                    <customer>
                        <entityId>?vendidoId</entityId>
                    </customer>
                </soldTo>
            </header>
        </orac:processSalesOrder>
    </soapenv:Body>
    </soapenv:Envelope>';
 --
 -- xml detalle de body gear
    G_DETALLE_BODY_CREAR CLOB:='<detail>
                    <agreementId></agreementId>
                    <agreementSupplement></agreementSupplement>
                    <businessUnit>?unidadNegocio</businessUnit>
                    <businessUnitDestination></businessUnitDestination>
                    <processing>
                        <actionType></actionType>
                        <useConfigurationRule></useConfigurationRule>
                    </processing>
                    <product>
                        <configuration></configuration>
                        <description1></description1>
                        <description2></description2>
                        <item>
                            <itemCatalog></itemCatalog>
                            <itemCustomer></itemCustomer>
                            <itemFreeForm></itemFreeForm>
                            <itemId>?itemId</itemId>
                            <itemProduct></itemProduct>
                        </item>
                    </product>
                    <quantityBackOrdered></quantityBackOrdered>
                    <quantityCanceled></quantityCanceled>
                    <quantityOrdered>?cantidadOrden</quantityOrdered>
                    <quantityShippable></quantityShippable>
                    <reference></reference>
                    <relatedOrder>
                        <documentLineNumber></documentLineNumber>
                        <relatedOrderKey>
                            <documentCompany></documentCompany>
                            <documentNumber></documentNumber>
                            <documentTypeCode></documentTypeCode>
                        </relatedOrderKey>
                    </relatedOrder>
                    <shipTo>
                        <entityId>?enviarId</entityId>
                        <entityLongId></entityLongId>
                        <entityTaxId></entityTaxId>
                    </shipTo>

                    <statusCodeLast></statusCodeLast>
                    <statusCodeNext></statusCodeNext>
                    <supplier>
                        <entityId></entityId>
                        <entityLongId></entityLongId>
                        <entityTaxId></entityTaxId>
                    </supplier>
                    <timePromisedDelivery></timePromisedDelivery>
                    <timePromisedOriginal></timePromisedOriginal>
                    <timePromisedShip></timePromisedShip>
                    <timeRequested></timeRequested>
                    <timeScheduledPick></timeScheduledPick>
                    <unitOfMeasureCodeTransaction></unitOfMeasureCodeTransaction>
                    </detail>';
 --
 -- xml body confirmar orden
    G_BODY_CONFIRMAR     CLOB:='<soapenv:Body>
      <orac:PikingConfirmation>         
         <documentOrderNoInvoiceetc>?documentoNumero</documentOrderNoInvoiceetc>         
         <orderCompanyOrderNumber>?documentoId</orderCompanyOrderNumber>         
         <orderType>?documentoTipo</orderType>         
         <versionHistory1>ERP0002</versionHistory1>         
         <versionHistory2>ERP0004</versionHistory2>
      </orac:PikingConfirmation>
   </soapenv:Body>
   </soapenv:Envelope>';
    G_MAIL_ERROR_INCIO   CLOB:='Estimado(a)<br/><br/><strong>?nombreUsuario</strong>,
    <br/><br/><p>La solicitud de salida de ?tipo NO ha sido enviada con éxito a JDE, por el error:</p><br/><br/>';
    G_MAIL_ERROR_FIN     CLOB:='<br/><br/>Gracias por su atencion';
    G_MAIL_EXITO_INCIO   CLOB:='Estimado(a)<br/><br/><strong>?nombreUsuario</strong>,
    <br/><br/><p>La solicitud de salida de ?tipo ha sido enviada con éxito a JDE.</p>
    <br/><p>Orden Número: ?documento</p>
    <br/>
    <table><tbody>
	<tr><td><strong>Repuesto</strong></td><td><strong>Descripción</strong></td><td><strong>Cantidad</strong></td></tr>';
    G_MAIL_DETALLE       CLOB:='<tr><td style="padding-right:10px">?repuesto</td><td style="padding-right:10px">?descripcion</td><td align="right">?cantidad</td></tr>';
    G_MAIL_EXITO_FIN     CLOB := '</tbody></table><br/><br/>Gracias por su atención';
 --
 -- Tipos de datos
    TYPE ARREGLO_TEXTO IS
        TABLE OF VARCHAR2(4096);
 --
 -- Cursor de consulta de movimientos repuestos
    CURSOR C_MOVIMIENTOS_REPUESTOS(P_ID NUMBER) IS
        SELECT
            CABECERA.ID_MOVIMIENTOS_INVENTARIO,
            CABECERA.ID_SIS_TIPOS_MOVIMIENTO         AS TIPOMOVIMIENTO,
            '00001'                                  COMPANIA,
            CABECERA.FECHA_MOVIMIENTOS_INVENTARIO    AS FECHATRANSACCION,
            TRIM(SUBSTR(VALECAB.CONCATENA_MO, 1, 5)) AS SOLDTO,
            VALEDET.CC                               AS SHIPTO,
            REPUESTO.CVE_CAT_REPUESTOS               AS CODIGOREPUESTO,
            CANTIDAD_DETALLE_MOVTO_INV               AS CANTIDADORDENADA,
            UNI.DESC_CAT_UNIDADES_RPTOS_HERR         AS UNIDAD,
            VALECAB.CVE_CAT_ALMACENES                AS BODEGA,
            MONEDA.ABREVIATURA_CAT_DIVISAS           AS MONEDA,
            VALECAB.FOLIO                            AS FOLIO,
            ROWNUM                                   AS NUMEROLINEA
        FROM
            MPZML_REP.MOVIMIENTOS_INVENTARIO  CABECERA
            LEFT JOIN MPZML_REP.DETALLE_MOVTOS_INVENT DETALLE
            ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
            LEFT JOIN MPZML_REP.CAT_REPUESTOS REPUESTO
            ON DETALLE.ID_CAT_RPTOS_HERR = REPUESTO.ID_CAT_REPUESTOS
            LEFT JOIN MPZML_REP.SALIDAS_VALES_MP SALIDASVALE
            ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
            LEFT JOIN MPZML_REP.VALE VALECAB
            ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            LEFT JOIN MPZML_REP.VALE_DET VALEDET
            ON VALECAB.ID_VALE = VALEDET.ID_VALE
            AND DETALLE.ID_CAT_RPTOS_HERR = VALEDET.ID_CAT_REPUESTOS
            LEFT JOIN MPZML_REP.CAT_UNIDADES_RPTOS_HERR UNI
            ON REPUESTO.ID_CAT_UNIDADES_RPTOS_HERR = UNI.ID_CAT_UNIDADES_RPTOS_HERR
            LEFT JOIN MPZML_REP.CAT_DIVISAS MONEDA
            ON CABECERA.ID_CAT_DIVISAS = MONEDA.ID_CAT_DIVISAS
        WHERE
            CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
            AND CABECERA.ID_SIS_TIPOS_MOVIMIENTO IN (3, 7);
 --
 -- Cursor de consulta de movimientos repuestos
    CURSOR C_MOVIMIENTOS_HERRAMIENTAS(P_ID NUMBER) IS
        SELECT
            CABECERA.ID_SIS_TIPOS_MOVIMIENTO         AS TIPOMOVIMIENTO,
            '00001'                                  COMPANIA,
            CABECERA.FECHA_MOVIMIENTOS_INVENTARIO    AS FECHATRANSACCION,
            TRIM(SUBSTR(VALECAB.CONCATENA_MO, 1, 5)) AS SOLDTO,
            VALEDET.CC                               AS SHIPTO,
            REPUESTO.CVE_CAT_REPUESTOS               AS CODIGOREPUESTO,
            CANTIDAD_DETALLE_MOVTO_INV               AS CANTIDADORDENADA,
            UNI.DESC_CAT_UNIDADES_RPTOS_HERR         AS UNIDAD,
            VALECAB.CVE_CAT_ALMACENES                AS BODEGA,
            MONEDA.ABREVIATURA_CAT_DIVISAS           AS MONEDA,
            VALECAB.FOLIO                            AS FOLIO,
            ROWNUM                                   AS NUMEROLINEA
        FROM
            MPZML_HER.MOVIMIENTOS_INVENTARIO  CABECERA
            LEFT JOIN MPZML_HER.DETALLE_MOVTOS_INVENT DETALLE
            ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
            LEFT JOIN MPZML_HER.CAT_REPUESTOS REPUESTO
            ON DETALLE.ID_CAT_RPTOS_HERR = REPUESTO.ID_CAT_REPUESTOS
            LEFT JOIN MPZML_HER.SALIDAS_VALES_MP SALIDASVALE
            ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
            LEFT JOIN MPZML_HER.VALE VALECAB
            ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            LEFT JOIN MPZML_HER.VALE_DET VALEDET
            ON VALECAB.ID_VALE = VALEDET.ID_VALE
            AND DETALLE.ID_CAT_RPTOS_HERR = VALEDET.ID_CAT_REPUESTOS
            LEFT JOIN MPZML_HER.CAT_UNIDADES_RPTOS_HERR UNI
            ON REPUESTO.ID_CAT_UNIDADES_RPTOS_HERR = UNI.ID_CAT_UNIDADES_RPTOS_HERR
            LEFT JOIN MPZML_HER.CAT_DIVISAS MONEDA
            ON CABECERA.ID_CAT_DIVISAS = MONEDA.ID_CAT_DIVISAS
        WHERE
            CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
            AND CABECERA.ID_SIS_TIPOS_MOVIMIENTO IN (3, 7);
 --
 -- Cursor para verificar inventario de herramientas
    CURSOR C_MOVIMIENTOS_PENDIENTES_HER IS
        SELECT
            ID_MOVIMIENTOS_INVENTARIO
        FROM
            MPZML_HER.MOVIMIENTOS_INVENTARIO T1
        WHERE
            T1.ID_MOVIMIENTOS_INVENTARIO NOT IN(
                SELECT
                    ID_MOVIMIENTOS_INVENTARIO
                FROM
                    DATA.T_BT01_PEDIDO
                WHERE
                    MODO = 'H'
            )
 --AND T1.FECHA_MOVIMIENTOS_INVENTARIO < (SYSDATE - (1/24))
            AND T1.ID_SIS_TIPOS_MOVIMIENTO IN (3, 7);
 --
 -- Cursor para verificar inventario de repuestos
    CURSOR C_MOVIMIENTOS_PENDIENTES_REP IS
        SELECT
            ID_MOVIMIENTOS_INVENTARIO
        FROM
            MPZML_REP.MOVIMIENTOS_INVENTARIO T1
        WHERE
            T1.ID_MOVIMIENTOS_INVENTARIO NOT IN(
                SELECT
                    ID_MOVIMIENTOS_INVENTARIO
                FROM
                    DATA.T_BT01_PEDIDO
                WHERE
                    MODO = 'R'
            )
 -- AND T1.FECHA_MOVIMIENTOS_INVENTARIO < (SYSDATE - (1/24))
            AND T1.ID_SIS_TIPOS_MOVIMIENTO IN (3, 7);
 --
 -- Procesar pedidos al servicio de jde.
    PROCEDURE SP_CREAR_ORDEN_VENTA(
        P_ID IN NUMBER,
        P_MODO IN VARCHAR2,
        P_FECHAORDENOUT OUT VARCHAR2,
        P_ITEMCATALOGO OUT VARCHAR2,
        P_ITEMPRODUCTO OUT VARCHAR2,
        P_ENVIARTAXID OUT VARCHAR2,
        P_DOCUMENTCOMPANY OUT VARCHAR2,
        P_DOCUMENTNUMERO OUT VARCHAR2,
        P_DOCUMENTTIPO OUT VARCHAR2,
        P_ENVIARDIRECCION OUT VARCHAR2,
        P_ENVIARCIUDAD OUT VARCHAR2,
        P_DESTINATARIO OUT VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Procesar confirmacion del pedido
    PROCEDURE SP_CONFIRMA_ORDEN_VENTA(
        P_ID IN NUMBER,
        P_DOCUMENTOID IN VARCHAR2,
        P_DOCUMENTONUMERO IN VARCHAR2,
        P_DOCUMENTOTIPO IN VARCHAR2,
        P_ITEM OUT VARCHAR2,
        P_EVENT_POINT OUT VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Proceso para inizializar el encabezado del xml
    PROCEDURE SP_XMLINICIAR(
        P_BSSV IN VARCHAR2,
        P_ENCABEZADO OUT VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Proceso para ejecutar de manera programada en envio de pedidos
    PROCEDURE SP_ENVIARPEDIDOS(
        P_DATE IN DATE
    );
 --
 -- Proceso para enviar correo exitoso
    PROCEDURE SP_ENVIAR_CORREO_EXITO(
        P_ID IN NUMBER,
        P_MODO IN VARCHAR2,
        P_DOCUMENTNUMERO IN VARCHAR2,
        P_RESULTADO_CORREO OUT BOOLEAN
    );
 --
 -- Proceso para enviar el correo fallido
    PROCEDURE SP_ENVIAR_CORREO_ERROR(
        P_ID IN NUMBER,
        P_MODO IN VARCHAR2,
        P_ERROR IN CLOB,
        P_RESULTADO_CORREO OUT BOOLEAN
    );
 --
 -- Funcion para remplazo multimple de variables
    FUNCTION FN_REMPLAZO_MULTIPLE(
        P_CADENA IN CLOB,
        P_VARIABLES IN ARREGLO_TEXTO,
        P_VALORES IN ARREGLO_TEXTO
    ) RETURN CLOB;
END PK_JDE_PEDIDOS_WS;