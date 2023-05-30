CREATE OR REPLACE PACKAGE BODY "DATA".PK_JDE_PEDIDOS_WS AS
 --
 -- autor:  Bestch
 -- fecha:  2023-05-28
 --
 -- Package header
 -- Procesar pedidos al servicio de jde.
    PROCEDURE SP_CREAR_ORDEN_VENTA(
        P_UNIDADNEGOCIO IN VARCHAR2,
        P_CODIGOMONEDA IN VARCHAR2,
        P_FECHAORDEN IN DATE,
        P_FECHAPEDIDO IN DATE,
        P_ITEMID IN VARCHAR2,
        P_CATIDADORDEN IN NUMBER,
        P_ENVIARID IN VARCHAR2,
        P_TIPOPROCESAMIENTO IN VARCHAR2,
        P_VERSIONPROCESAMIENTO IN VARCHAR2,
        P_VENDIDOID IN VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    ) AS
 -- variables
        V_URL           VARCHAR2(512);
        V_XML_PETICION  XMLTYPE;
        V_XML_RESPUESTA XMLTYPE;
        V_TIME_OUT      NUMBER DEFAULT 1500;
        V_RESPUEST1     VARCHAR2(1000);
        V_RESPUEST2     VARCHAR2(1000);
 -- Contenido del xml
        V_SEGURIDADES   VARCHAR2(4000);
        V_BODY          CLOB;
    BEGIN
 -- Inicializa el encabezado del xml
        SP_XMLINICIAR('http://oracle.e1.bssv.JP420000/', P_ENCABEZADO => V_SEGURIDADES, P_MENSAJE=>P_MENSAJE);
        IF (P_MENSAJE IS NOT NULL) THEN
            RETURN;
        END IF;
 -- Inicializa el body del xml
        V_BODY:=V_SEGURIDADES
            || FN_REMPLAZO_MULTIPLE(G_BODY_CREAR, NEW ARREGLO_TEXTO('?unidadNegocio', '?codigoMoneda', '?fechaOrden', '?fechaPedido', '?itemId', '?cantidadOrden', '?enviarId', '?tipoProcesamiento', '?versionProcesamiento', '?vendidoId'), NEW ARREGLO_TEXTO(P_UNIDADNEGOCIO, P_CODIGOMONEDA, P_FECHAORDEN, P_FECHAPEDIDO, P_ITEMID, P_CATIDADORDEN, P_ENVIARID, P_TIPOPROCESAMIENTO, P_VERSIONPROCESAMIENTO, P_VENDIDOID));
 -- busca la valor con la url de la tabla t_corp_udc
        BEGIN
            <<BUSCAR_URL>>
            SELECT
                VALOR INTO V_URL
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA='JDE_WS'
                AND ID_TABLA = 7;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la url para la cabecera : JDE_WS';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_URL;
 -- Ejecuta el servicio
        BEGIN
            <<EJECUTAR_SERVICIO>>
 -- Configura header
            V_XML_PETICION := XMLTYPE.CREATEXML(V_BODY);
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).NAME := 'Content-Type';
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).VALUE := 'text/xml;charset=UTF-8';
 -- llama al servicio
            V_XML_RESPUESTA:= APEX_WEB_SERVICE.MAKE_REQUEST( P_URL => V_URL, P_ENVELOPE => V_BODY, P_TRANSFER_TIMEOUT => V_TIME_OUT );
            PK_CORP_DEBUG.INFO('JDE', 'PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA', 'V_XML_RESPUESTA '
                ||V_XML_RESPUESTA.GETCLOBVAL());
 --Verifica error del servicio
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al llamar al servicio '
                    || V_URL;
                RETURN;
        END EJECUTAR_SERVICIO;
 --
 -- Verifica si el servicio respondio con error
        BEGIN
            <<VERIFICAR_ERROR>>
            SELECT
                EXTRACT(V_XML_RESPUESTA,
                '//faultcode/text()').GETSTRINGVAL(),
                EXTRACT(V_XML_RESPUESTA,
                '//faultstring/text()').GETSTRINGVAL() INTO V_RESPUEST1,
                V_RESPUEST2
            FROM
                DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al procesar la respuesta del servicio '
                    || V_RESPUEST1
                    ||' '
                    || V_RESPUEST2;
                DBMS_OUTPUT.PUT_LINE(P_MENSAJE);
        END VERIFICAR_ERROR;
 -- Toma los datos de la respuesta correcta

 /*
Problema con el sitio que redirige a un servidor SSL que hay que verificar.
https://oracle-base.com/articles/misc/utl_http-and-ssl
*/
    END SP_CREAR_ORDEN_VENTA; --
 -- Procesar confirmacion del pedido
    PROCEDURE SP_CONFIRMA_ORDEN_VENTA(
        P_DOCUMENTOID IN VARCHAR2,
        P_DOCUMENTONUMERO IN VARCHAR2,
        P_DOCUMENTOTIPO IN VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    )AS
 -- variables
        V_URL           VARCHAR2(512);
        V_XML_PETICION  XMLTYPE;
        V_XML_RESPUESTA XMLTYPE;
        V_TIME_OUT      NUMBER DEFAULT 1500;
        V_RESPUEST1     VARCHAR2(1000);
        V_RESPUEST2     VARCHAR2(1000);
 -- Contenido del xml
        V_SEGURIDADES   VARCHAR2(4000);
        V_BODY          CLOB;
    BEGIN
 -- Inicializa el encabezado del xml
        SP_XMLINICIAR('http://oracle.e1.bssv.JP594205/', P_ENCABEZADO => V_SEGURIDADES, P_MENSAJE=>P_MENSAJE);
        IF (P_MENSAJE IS NOT NULL) THEN
            RETURN;
        END IF;
 -- Inicializa el body del xml
        V_BODY:=V_SEGURIDADES
            || FN_REMPLAZO_MULTIPLE(G_BODY_CONFIRMAR, NEW ARREGLO_TEXTO('?documentoId', '?documentoNumero', '?documentoTipo'), NEW ARREGLO_TEXTO(P_DOCUMENTOID, P_DOCUMENTONUMERO, P_DOCUMENTOTIPO));
 -- busca la valor con la url de la tabla t_corp_udc
        BEGIN
            <<BUSCAR_URL>>
            SELECT
                VALOR INTO V_URL
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA='JDE_WS'
                AND ID_TABLA = 8;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la url para la cabecera : JDE_WS';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_URL;
 -- Ejecuta el servicio
        BEGIN
            <<EJECUTAR_SERVICIO>>
 -- Configura header
            V_XML_PETICION := XMLTYPE.CREATEXML(V_BODY);
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).NAME := 'Content-Type';
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).VALUE := 'text/xml;charset=UTF-8';
 -- llama al servicio
            V_XML_RESPUESTA:= APEX_WEB_SERVICE.MAKE_REQUEST( P_URL => V_URL, P_ENVELOPE => V_BODY, P_TRANSFER_TIMEOUT => V_TIME_OUT );
            PK_CORP_DEBUG.INFO('JDE', 'PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA', 'V_XML_RESPUESTA '
                ||V_XML_RESPUESTA.GETCLOBVAL());
 --Verifica error del servicio
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al llamar al servicio '
                    || V_URL;
                RETURN;
        END EJECUTAR_SERVICIO;
 --
 -- Verifica si el servicio respondio con error
        BEGIN
            <<VERIFICAR_ERROR>>
            SELECT
                EXTRACT(V_XML_RESPUESTA,
                '//faultcode/text()').GETSTRINGVAL(),
                EXTRACT(V_XML_RESPUESTA,
                '//faultstring/text()').GETSTRINGVAL() INTO V_RESPUEST1,
                V_RESPUEST2
            FROM
                DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al procesar la respuesta del servicio '
                    || V_RESPUEST1
                    ||' '
                    || V_RESPUEST2;
                DBMS_OUTPUT.PUT_LINE(P_MENSAJE);
        END VERIFICAR_ERROR;
 -- Toma los datos de la respuesta correcta

 /*
Problema con el sitio que redirige a un servidor SSL que hay que verificar.
https://oracle-base.com/articles/misc/utl_http-and-ssl
*/
    END SP_CONFIRMA_ORDEN_VENTA; --
 -- Proceso para inizializar el encabezado del xml
    PROCEDURE SP_XMLINICIAR(
        P_BSSV IN VARCHAR2,
        P_ENCABEZADO OUT VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    ) AS
 --Valores de usuario
        V_VALOR  VARCHAR2(256);
        V_VALOR2 VARCHAR2(256);
    BEGIN
 -- Busca las credenciales para el servicio en la tabla de t_corp_udc
        BEGIN
            <<BUSCAR_CREDENCIALES>>
            SELECT
                VALOR,
                VALOR2 INTO V_VALOR,
                V_VALOR2
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA='JDE_WS'
                AND ID_TABLA = 1;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar las credenciales para la cabecera : JDE_WS';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CREDENCIALES;
 --
 -- Carga las credenciales en las seguridades del XML
        P_ENCABEZADO := FN_REMPLAZO_MULTIPLE(G_SEGURIDADES, NEW ARREGLO_TEXTO('?BSSV', '?usuario', '?clave'), NEW ARREGLO_TEXTO(P_BSSV, V_VALOR, V_VALOR2) );
    END SP_XMLINICIAR; --
 -- Funcion para remplazo multimple de variables
    FUNCTION FN_REMPLAZO_MULTIPLE(
        P_CADENA IN CLOB,
        P_VARIABLES IN ARREGLO_TEXTO,
        P_VALORES IN ARREGLO_TEXTO
    ) RETURN CLOB AS
        V_RESPUESTA CLOB;
    BEGIN
        IF(P_VARIABLES.COUNT<>P_VALORES.COUNT) THEN
            RETURN P_CADENA;
        END IF;
        V_RESPUESTA := P_CADENA;
 --
 -- Rempazo de variables en loop
        FOR I IN 1..P_VARIABLES.COUNT LOOP
            V_RESPUESTA := REPLACE(V_RESPUESTA, P_VARIABLES(I), P_VALORES(I));
        END LOOP;
        RETURN V_RESPUESTA;
    END FN_REMPLAZO_MULTIPLE; --
 --
END PK_JDE_PEDIDOS_WS;