--
-- Bloque anonimo para crear datos en la tabla t_corp_udc con la consulta SELECT ID, ID_CABECERA, ID_TABLA, DESCRIPCION, VALOR, VALOR2, ACTIVO, DESCRIPCION2, CODIGOCOMPANIA, VIGENCIADESDE, VIGENCIAHASTA, DESCRIPCION3, VALOR3 FROM "DATA".T_CORP_UDC;
-- y con el indice en la secuencia sq_corp_udc para el campo ID
DECLARE
    V_ID             NUMBER;
    V_ID_CABECERA    VARCHAR2(100);
    V_ID_TABLA       NUMBER;
    V_DESCRIPCION    VARCHAR2(100);
    V_VALOR          VARCHAR2(100);
    V_VALOR2         VARCHAR2(100);
    V_ACTIVO         VARCHAR2(1);
    V_DESCRIPCION2   VARCHAR2(100);
    V_CODIGOCOMPANIA NUMBER;
    V_VIGENCIADESDE  DATE;
    V_VIGENCIAHASTA  DATE;
    V_DESCRIPCION3   VARCHAR2(100);
    V_VALOR3         VARCHAR2(100);
BEGIN
 -- Valores fijos
    V_ID_CABECERA := 'JDE_WS';
    V_DESCRIPCION3 :='PARAMETROS JDE WEB SERVICES';
    V_VALOR2 :=NULL;
    V_ACTIVO :=1;
    V_DESCRIPCION2 :=NULL;
    V_CODIGOCOMPANIA :='00001';
    V_VIGENCIADESDE :=NULL;
    V_VIGENCIAHASTA :=NULL;
    V_VALOR3 :=NULL;
 --
 -- Valores variables para crear orden venta
    V_ID_TABLA := '7';
    V_DESCRIPCION := 'URL Order Managager processSalesOrder';
    V_VALOR := 'http://192.168.5.111:8081/DV900/SalesOrderManager?WSDL';
 --
 -- buscar secuencia sq_corp_udc
    SELECT
        SQ_CORP_UDC.NEXTVAL INTO V_ID
    FROM
        DUAL;
 --
 -- insertar registro en la tabla t_corp_udc desde las variables enunciadas
    INSERT INTO T_CORP_UDC (
        ID,
        ID_CABECERA,
        ID_TABLA,
        DESCRIPCION,
        VALOR,
        VALOR2,
        ACTIVO,
        DESCRIPCION2,
        CODIGOCOMPANIA,
        VIGENCIADESDE,
        VIGENCIAHASTA,
        DESCRIPCION3,
        VALOR3
    ) VALUES (
        V_ID,
        V_ID_CABECERA,
        V_ID_TABLA,
        V_DESCRIPCION,
        V_VALOR,
        V_VALOR2,
        V_ACTIVO,
        V_DESCRIPCION2,
        V_CODIGOCOMPANIA,
        V_VIGENCIADESDE,
        V_VIGENCIAHASTA,
        V_DESCRIPCION3,
        V_VALOR3
    );
 --
 -- Valores variables para confirmar orden venta
    V_ID_TABLA := '8';
    V_DESCRIPCION := 'URL Confirmar orden venta ShippingConfirmation';
    V_VALOR := 'http://192.168.5.111:8081/DV900/ShippingConfirmation?WSDL';
 --
 -- buscar secuencia sq_corp_udc
    SELECT
        SQ_CORP_UDC.NEXTVAL INTO V_ID
    FROM
        DUAL;
 --
 -- insertar registro en la tabla t_corp_udc desde las variables enunciadas
    INSERT INTO T_CORP_UDC (
        ID,
        ID_CABECERA,
        ID_TABLA,
        DESCRIPCION,
        VALOR,
        VALOR2,
        ACTIVO,
        DESCRIPCION2,
        CODIGOCOMPANIA,
        VIGENCIADESDE,
        VIGENCIAHASTA,
        DESCRIPCION3,
        VALOR3
    ) VALUES (
        V_ID,
        V_ID_CABECERA,
        V_ID_TABLA,
        V_DESCRIPCION,
        V_VALOR,
        V_VALOR2,
        V_ACTIVO,
        V_DESCRIPCION2,
        V_CODIGOCOMPANIA,
        V_VIGENCIADESDE,
        V_VIGENCIAHASTA,
        V_DESCRIPCION3,
        V_VALOR3
    );
 --
 -- Commit
    COMMIT;
END;