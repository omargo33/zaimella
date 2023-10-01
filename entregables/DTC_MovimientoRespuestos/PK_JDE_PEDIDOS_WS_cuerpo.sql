CREATE OR REPLACE PACKAGE BODY "DATA"."PK_JDE_PEDIDOS_WS" AS
 --
 -- autor:  Bestch
 -- fecha:  2023-05-28
 --
 -- Package header
 -- Procesar pedidos al servicio de jde.
    PROCEDURE SP_CREAR_ORDEN_VENTA (
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
    ) AS
 -- Contenido del xml
        V_BODEGA               VARCHAR2(128);
        V_CODIGOMONEDA         VARCHAR2(128);
        V_FECHAORDEN           VARCHAR2(32);
        V_FECHAPEDIDO          VARCHAR2(32);
        V_TIPOPROCESAMIENTO    VARCHAR2(8);
        V_VERSIONPROCESAMIENTO VARCHAR2(64);
        V_VENDIDOID            VARCHAR2(16);
        V_SHIPTO               VARCHAR2(16);
        V_ITEM_ID              VARCHAR2(16);
 -- variables
        V_URL                  VARCHAR2(512);
        V_XML_PETICION         XMLTYPE;
        V_XML_RESPUESTA        XMLTYPE;
        V_TIME_OUT             NUMBER DEFAULT 1500;
        V_RESPUEST1            VARCHAR2(1000);
        V_RESPUEST2            VARCHAR2(1000);
 -- Contenido del xml
        V_SEGURIDADES          VARCHAR2(4096);
        V_BODY                 CLOB;
        V_DETALLE              CLOB;
    BEGIN
 -- Inicializa el encabezado del xml
        SP_XMLINICIAR('http://oracle.e1.bssv.JP420000/', P_ENCABEZADO => V_SEGURIDADES, P_MENSAJE => P_MENSAJE );
        IF ( P_MENSAJE IS NOT NULL ) THEN
            RETURN;
        END IF;
        IF P_MODO = 'R' THEN
 -- Consulta Loop detalles
            FOR R_MOVIMIENTOS IN C_MOVIMIENTOS_REPUESTOS(P_ID) LOOP
                BEGIN
 -- Obtiene los datos del encabezado
                    IF R_MOVIMIENTOS.NUMEROLINEA = 1 THEN
                        V_BODEGA := R_MOVIMIENTOS.BODEGA;
                        V_CODIGOMONEDA := R_MOVIMIENTOS.MONEDA;
                        V_FECHAORDEN := TO_CHAR( R_MOVIMIENTOS.FECHATRANSACCION, 'YYYY-MM-DD' );
                        V_FECHAPEDIDO := TO_CHAR( R_MOVIMIENTOS.FECHATRANSACCION, 'YYYY-MM-DD' );
                        V_TIPOPROCESAMIENTO := 'A';
                        V_VERSIONPROCESAMIENTO := 'ERP0004';
                        V_VENDIDOID := R_MOVIMIENTOS.SOLDTO;
                        V_SHIPTO := R_MOVIMIENTOS.SHIPTO;
                    END IF;
 --
 -- Obtiene el dato del item ID
                    BEGIN
                        << IDENTIFICA_ITEM_ID >>
                        SELECT
                            IMITM INTO V_ITEM_ID
                        FROM
                            MPZML_REP.CAT_REPUESTOS
                            LEFT JOIN F4101@JDEDTADL
                            ON TRIM(CVE_CAT_REPUESTOS) = TRIM(IMLITM)
                        WHERE
                            TRIM(CVE_CAT_REPUESTOS) = R_MOVIMIENTOS.CODIGOREPUESTO;
                    EXCEPTION
                        WHEN OTHERS THEN
                            P_MENSAJE := 'No se pudo encontrar item id al identificar el item ID';
 --RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
                            RETURN;
                    END IDENTIFICA_ITEM_ID;
 -- Obtiene los datos del detalle
                    V_DETALLE := V_DETALLE
                                                                  || FN_REMPLAZO_MULTIPLE( G_DETALLE_BODY_CREAR, NEW ARREGLO_TEXTO( '?unidadNegocio', '?itemId', '?cantidadOrden', '?enviarId' ), NEW ARREGLO_TEXTO( R_MOVIMIENTOS.BODEGA, V_ITEM_ID, R_MOVIMIENTOS.CANTIDADORDENADA, R_MOVIMIENTOS.SHIPTO ) );
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
 -- user does not have attribute,continue loop to next record.
                        GOTO FIN_LOOP;
                END;
                << FIN_LOOP >>
                NULL;
            END LOOP;
        ELSE
 -- Consulta Loop detalles
            FOR R_MOVIMIENTOS IN C_MOVIMIENTOS_HERRAMIENTAS(P_ID) LOOP
                BEGIN
 -- Obtiene los datos del encabezado
                    IF R_MOVIMIENTOS.NUMEROLINEA = 1 THEN
                        V_BODEGA := R_MOVIMIENTOS.BODEGA;
                        V_CODIGOMONEDA := R_MOVIMIENTOS.MONEDA;
                        V_FECHAORDEN := TO_CHAR( R_MOVIMIENTOS.FECHATRANSACCION, 'YYYY-MM-DD' );
                        V_FECHAPEDIDO := TO_CHAR( R_MOVIMIENTOS.FECHATRANSACCION, 'YYYY-MM-DD' );
                        V_TIPOPROCESAMIENTO := 'A';
                        V_VERSIONPROCESAMIENTO := 'ERP0004';
                        V_VENDIDOID := R_MOVIMIENTOS.SOLDTO;
                    END IF;
 -- Obtiene los datos del detalle
                    V_DETALLE := V_DETALLE
                                                                  || FN_REMPLAZO_MULTIPLE( G_DETALLE_BODY_CREAR, NEW ARREGLO_TEXTO( '?unidadNegocio', '?itemId', '?cantidadOrden', '?enviarId' ), NEW ARREGLO_TEXTO( R_MOVIMIENTOS.BODEGA, R_MOVIMIENTOS.CODIGOREPUESTO, R_MOVIMIENTOS.CANTIDADORDENADA, R_MOVIMIENTOS.SHIPTO ) );
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
 -- user does not have attribute,continue loop to next record.
                        GOTO FIN_LOOP;
                END;
                << FIN_LOOP >>
                NULL;
            END LOOP;
        END IF;
 -- Inicializa el body del xml
        V_BODY := V_SEGURIDADES
                                                || FN_REMPLAZO_MULTIPLE( G_BODY_CREAR_1, NEW ARREGLO_TEXTO( '?unidadNegocio', '?codigoMoneda', '?fechaOrden', '?fechaPedido' ), NEW ARREGLO_TEXTO( V_BODEGA, V_CODIGOMONEDA, V_FECHAORDEN, V_FECHAPEDIDO ) )
                                                   || V_DETALLE
                                                   || FN_REMPLAZO_MULTIPLE( G_BODY_CREAR_2, NEW ARREGLO_TEXTO( '?tipoProcesamiento', '?versionProcesamiento', '?enviarId', '?vendidoId' ), NEW ARREGLO_TEXTO( V_TIPOPROCESAMIENTO, V_VERSIONPROCESAMIENTO, V_SHIPTO, V_VENDIDOID ) );
 -- busca la valor con la url de la tabla t_corp_udc
        BEGIN
            << BUSCAR_URL >>
            SELECT
                VALOR INTO V_URL
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 7;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la url para la cabecera : JDE_WS';
 --RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
                RETURN;
        END BUSCAR_URL;
 -- Ejecuta el servicio
        BEGIN
            << EJECUTAR_SERVICIO >>
 -- Configura header
            V_XML_PETICION := XMLTYPE.CREATEXML(V_BODY);
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).NAME := 'Content-Type';
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).VALUE := 'text/xml;charset=UTF-8';
 -- llama al servicio
            INSERT INTO T_BT01_XML_TEMP (
                ID,
                XML,
                PASO
            ) VALUES (
                P_ID,
                V_BODY,
                1
            );
            V_XML_RESPUESTA := APEX_WEB_SERVICE.MAKE_REQUEST( P_URL => V_URL, P_ENVELOPE => V_BODY, P_TRANSFER_TIMEOUT => V_TIME_OUT );
            INSERT INTO T_BT01_XML_TEMP (
                ID,
                XML,
                PASO
            ) VALUES (
                P_ID,
                V_XML_RESPUESTA.GETCLOBVAL(),
                2
            );
            PK_CORP_DEBUG.INFO( 'JDE', 'PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA', 'V_XML_RESPUESTA '
                                                                                 || V_XML_RESPUESTA.GETCLOBVAL() );
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
            << VERIFICAR_ERROR >>
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//faultcode/text()' ).GETSTRINGVAL(),
                EXTRACT( V_XML_RESPUESTA, '//faultstring/text()' ).GETSTRINGVAL() INTO V_RESPUEST1,
                V_RESPUEST2
            FROM
                DUAL;
            IF V_RESPUEST1 IS NOT NULL THEN
                P_MENSAJE := 'Error del servicio '
                             || V_RESPUEST1
                             || ' '
                             || V_RESPUEST2;
 --RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
                RETURN;
            END IF;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al procesar la respuesta del servicio '
                             || V_RESPUEST1
                             || ' '
                             || V_RESPUEST2;
 --RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
        END VERIFICAR_ERROR;
 -- Toma los datos de la respuesta correcta
        BEGIN
            << VERIFICAR_RESPUESTA_VALIDA >>
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/dates/orderDate/text()' ).GETSTRINGVAL() INTO P_FECHAORDENOUT
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/detail/product/item/itemCatalog/text()' ).GETSTRINGVAL() INTO P_ITEMCATALOGO
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/detail/product/item/itemProduct/text()' ).GETSTRINGVAL() INTO P_ITEMPRODUCTO
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/detail/shipTo/entityTaxId/text()' ).GETSTRINGVAL() INTO P_ENVIARTAXID
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/salesOrderKey/documentCompany/text()' ).GETSTRINGVAL() INTO P_DOCUMENTCOMPANY
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/salesOrderKey/documentNumber/text()' ).GETSTRINGVAL() INTO P_DOCUMENTNUMERO
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/salesOrderKey/documentTypeCode/text()' ).GETSTRINGVAL() INTO P_DOCUMENTTIPO
            FROM
                DUAL;
            SELECT
                TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/addressLine1/text()' ).GETSTRINGVAL() )
                || ' '
                || TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/addressLine2/text()' ).GETSTRINGVAL() )
                   || ' '
                   || TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/addressLine3/text()' ).GETSTRINGVAL() )
                      || ' '
                      || TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/addressLine4/text()' ).GETSTRINGVAL() ) INTO P_ENVIARDIRECCION
            FROM
                DUAL;
            SELECT
                TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/city/text()' ).GETSTRINGVAL() )
                || ' '
                || TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/countryCode/text()' ).GETSTRINGVAL() )
                   || ' '
                   || TRIM(EXTRACT( V_XML_RESPUESTA, '//header/shipTo/countyCode/text()' ).GETSTRINGVAL() ) INTO P_ENVIARCIUDAD
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//header/shipTo/mailingName/text()' ).GETSTRINGVAL() INTO P_DESTINATARIO
            FROM
                DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al leer una respuesta valida del servicio ';
 --RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
        END VERIFICAR_RESPUESTA_VALIDA;
    END SP_CREAR_ORDEN_VENTA; --
 -- Procesar confirmacion del pedido
    PROCEDURE SP_CONFIRMA_ORDEN_VENTA (
        P_ID IN NUMBER,
        P_DOCUMENTOID IN VARCHAR2,
        P_DOCUMENTONUMERO IN VARCHAR2,
        P_DOCUMENTOTIPO IN VARCHAR2,
        P_ITEM OUT VARCHAR2,
        P_EVENT_POINT OUT VARCHAR2,
        P_MENSAJE OUT VARCHAR2
    ) AS
 -- variables
        V_URL           VARCHAR2(512);
        V_XML_PETICION  XMLTYPE;
        V_XML_RESPUESTA XMLTYPE;
        V_TIME_OUT      NUMBER DEFAULT 1500;
        V_RESPUEST1     VARCHAR2(1024);
        V_RESPUEST2     VARCHAR2(1024);
 -- Contenido del xml
        V_SEGURIDADES   VARCHAR2(4096);
        V_BODY          CLOB;
    BEGIN
 -- Inicializa el encabezado del xml
        SP_XMLINICIAR('http://oracle.e1.bssv.JP594205/', P_ENCABEZADO => V_SEGURIDADES, P_MENSAJE => P_MENSAJE );
        IF ( P_MENSAJE IS NOT NULL ) THEN
            RETURN;
        END IF;
 -- Inicializa el body del xml
        V_BODY := V_SEGURIDADES
                                                || FN_REMPLAZO_MULTIPLE( G_BODY_CONFIRMAR, NEW ARREGLO_TEXTO( '?documentoId', '?documentoNumero', '?documentoTipo' ), NEW ARREGLO_TEXTO(P_DOCUMENTOID, P_DOCUMENTONUMERO, P_DOCUMENTOTIPO ) );
 -- busca la valor con la url de la tabla t_corp_udc
        BEGIN
            << BUSCAR_URL >>
            SELECT
                VALOR INTO V_URL
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 8;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la url para la cabecera : JDE_WS';
 -- RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
                RETURN;
        END BUSCAR_URL;
 -- Ejecuta el servicio
        BEGIN
            << EJECUTAR_SERVICIO >>
 -- Configura header
            V_XML_PETICION := XMLTYPE.CREATEXML(V_BODY);
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).NAME := 'Content-Type';
            APEX_WEB_SERVICE.G_REQUEST_HEADERS(1).VALUE := 'text/xml;charset=UTF-8';
 -- llama al servicio
            INSERT INTO T_BT01_XML_TEMP (
                ID,
                XML,
                PASO
            ) VALUES (
                P_ID,
                V_BODY,
                3
            );
            V_XML_RESPUESTA := APEX_WEB_SERVICE.MAKE_REQUEST( P_URL => V_URL, P_ENVELOPE => V_BODY, P_TRANSFER_TIMEOUT => V_TIME_OUT );
            PK_CORP_DEBUG.INFO( 'JDE', 'PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA', 'V_XML_RESPUESTA '
                                                                                 || V_XML_RESPUESTA.GETCLOBVAL() );
            INSERT INTO T_BT01_XML_TEMP (
                ID,
                XML,
                PASO
            ) VALUES (
                P_ID,
                V_XML_RESPUESTA.GETCLOBVAL(),
                4
            );
 --Verifica error del servicio
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al llamar al servicio '
                             || V_URL;
                RETURN;
        END EJECUTAR_SERVICIO;
 -- Toma los datos de la respuesta correcta
        BEGIN
            << VERIFICAR_RESPUESTA_VALIDA >>
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//PikingConfirmationResponse/text()' ).GETSTRINGVAL() INTO P_ITEM
            FROM
                DUAL;
            SELECT
                EXTRACT( V_XML_RESPUESTA, '//status/text()' ).GETSTRINGVAL() INTO P_EVENT_POINT
            FROM
                DUAL;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'Error al leer una respuesta valida del servicio ';
 -- RAISE_APPLICATION_ERROR(-20001,P_MENSAJE);
        END VERIFICAR_RESPUESTA_VALIDA;
 -- Verifica que la respuesta este correcta.
        IF P_EVENT_POINT = NULL THEN
            P_MENSAJE := 'Error al leer una respuesta valida del servicio '
                         || V_URL;
            RETURN;
        END IF;
        IF P_EVENT_POINT = 'N' THEN
            P_MENSAJE := 'Error FAlSE al leer una respuesta valida del servicio  '
                         || V_URL;
            RETURN;
        END IF;
        IF P_EVENT_POINT = 'Y' THEN
            P_MENSAJE := NULL;
            RETURN;
        END IF;
    END SP_CONFIRMA_ORDEN_VENTA; --
 -- Proceso para inizializar el encabezado del xml
    PROCEDURE SP_XMLINICIAR (
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
            << BUSCAR_CREDENCIALES >>
            SELECT
                VALOR,
                VALOR2 INTO V_VALOR,
                V_VALOR2
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 1;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar las credenciales para la cabecera : JDE_WS';
                RAISE_APPLICATION_ERROR( -20001, P_MENSAJE );
                RETURN;
        END BUSCAR_CREDENCIALES;
 --
 -- Carga las credenciales en las seguridades del XML
        P_ENCABEZADO := FN_REMPLAZO_MULTIPLE( G_SEGURIDADES, NEW ARREGLO_TEXTO( '?BSSV', '?usuario', '?clave' ), NEW ARREGLO_TEXTO( P_BSSV, V_VALOR, V_VALOR2 ) );
    END SP_XMLINICIAR; --
 --
 -- Proceso para ejecutar de manera programada en envio de pedidos
    PROCEDURE SP_ENVIARPEDIDOS (
        P_DATE IN DATE
    ) AS
 -- Indice pedido
        V_ID_PEDIDO            NUMBER;
 -- variables del sistema primer paso
        V_FECHAORDENOUT        VARCHAR2(32);
        V_ITEMCATALOGO         VARCHAR2(512);
        V_ITEMPRODUCTO         VARCHAR2(512);
        V_ENVIARTAXID          VARCHAR2(512);
        V_DOCUMENTCOMPANY      VARCHAR2(512);
        V_DOCUMENTNUMERO       VARCHAR2(512);
        V_DOCUMENTTIPO         VARCHAR2(512);
        V_ENVIARDIRECCION      VARCHAR2(512);
        V_ENVIARCIUDAD         VARCHAR2(512);
        V_DESTINATARIO         VARCHAR2(512);
 -- variables del sistema segundo paso
        V_ITEM                 VARCHAR(512);
        V_EVENT_POINT          VARCHAR(512);
 -- mensajes de los pasos de la ejecucion.
        V_RESULTADO_CORREO     BOOLEAN;
        V_ESTADO_CORREO        VARCHAR2(16);
        V_MENSAJE_ORDEN        VARCHAR2(4096);
        V_MENSAJE_CONFIRMACION VARCHAR2(4096);
    BEGIN
 --Consulta loop movimientos pendientes
        FOR R_HERRAMIENTAS IN C_MOVIMIENTOS_PENDIENTES_HER LOOP
            BEGIN
 -- Obtiene los datos del encabezado para crear el pedido
                PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA( R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO, 'H', V_FECHAORDENOUT, V_ITEMCATALOGO, V_ITEMPRODUCTO, V_ENVIARTAXID, V_DOCUMENTCOMPANY, V_DOCUMENTNUMERO, V_DOCUMENTTIPO, V_ENVIARDIRECCION, V_ENVIARCIUDAD, V_DESTINATARIO, V_MENSAJE_ORDEN );
                IF ( V_MENSAJE_ORDEN IS NULL ) THEN
 -- Obtiene los datos de confirmacion del pedido
                    V_MENSAJE_ORDEN := 'ok';
                    PK_JDE_PEDIDOS_WS.SP_CONFIRMA_ORDEN_VENTA(R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO, V_DOCUMENTCOMPANY, V_DOCUMENTNUMERO, V_DOCUMENTTIPO, V_ITEM, V_EVENT_POINT, V_MENSAJE_CONFIRMACION );
                    IF V_MENSAJE_CONFIRMACION IS NULL THEN
                        V_MENSAJE_CONFIRMACION := 'ok';
                        SP_ENVIAR_CORREO_EXITO( R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO, 'H', V_DOCUMENTNUMERO, V_RESULTADO_CORREO );
                    ELSE
                        SP_ENVIAR_CORREO_ERROR( R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO, 'H', V_MENSAJE_CONFIRMACION, V_RESULTADO_CORREO);
                    END IF;
                ELSE
                    SP_ENVIAR_CORREO_ERROR( R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO, 'H', V_MENSAJE_CONFIRMACION, V_RESULTADO_CORREO);
                END IF;
 --
 -- Valida estado correo
                IF V_RESULTADO_CORREO THEN
                    V_ESTADO_CORREO := 'OK';
                ELSE
                    V_ESTADO_CORREO := 'ERROR';
                END IF;
 -- Secuencia
                SELECT
                    SQ_BT01_PEDIDO.NEXTVAL INTO V_ID_PEDIDO
                FROM
                    DUAL;
 -- Se crea entrada a la tabla para evitar una sobre consulta.
                INSERT INTO "DATA".T_BT01_PEDIDO (
                    ID,
                    USUARIOFECHA,
                    VALORTEXTO,
                    VALORNUMERO,
                    MODO,
                    ID_MOVIMIENTOS_INVENTARIO,
                    CREAR_ORDEN,
                    CONFIR_ORDEN,
                    ENVIO_CORREO,
                    NO_ORDEN
                ) VALUES (
                    V_ID_PEDIDO,
                    SYSDATE,
                    '',
                    0,
                    'H',
                    R_HERRAMIENTAS.ID_MOVIMIENTOS_INVENTARIO,
                    V_MENSAJE_ORDEN,
                    V_MENSAJE_CONFIRMACION,
                    V_ESTADO_CORREO,
                    V_DOCUMENTNUMERO
                );
                COMMIT;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    GOTO FIN_LOOP_HERRAMIENTAS;
            END;
            << FIN_LOOP_HERRAMIENTAS >>
            NULL;
        END LOOP;
 --Consulta loop movimientos pendientes
        FOR R_REPUESTOS IN C_MOVIMIENTOS_PENDIENTES_REP LOOP
            BEGIN
 -- Obtiene los datos del encabezado para crear el pedido
                PK_JDE_PEDIDOS_WS.SP_CREAR_ORDEN_VENTA( R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO, 'R', V_FECHAORDENOUT, V_ITEMCATALOGO, V_ITEMPRODUCTO, V_ENVIARTAXID, V_DOCUMENTCOMPANY, V_DOCUMENTNUMERO, V_DOCUMENTTIPO, V_ENVIARDIRECCION, V_ENVIARCIUDAD, V_DESTINATARIO, V_MENSAJE_ORDEN );
                IF ( V_MENSAJE_ORDEN IS NULL ) THEN
 -- Obtiene los datos de confirmacion del pedido
                    V_MENSAJE_ORDEN := 'ok';
                    DBMS_SESSION.SLEEP(7);
                    PK_JDE_PEDIDOS_WS.SP_CONFIRMA_ORDEN_VENTA(R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO, V_DOCUMENTCOMPANY, V_DOCUMENTNUMERO, V_DOCUMENTTIPO, V_ITEM, V_EVENT_POINT, V_MENSAJE_CONFIRMACION );
                    IF V_MENSAJE_CONFIRMACION IS NULL THEN
                        V_MENSAJE_CONFIRMACION := 'ok';
                        SP_ENVIAR_CORREO_EXITO( R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO, 'R', V_DOCUMENTNUMERO, V_RESULTADO_CORREO );
                    ELSE
                        SP_ENVIAR_CORREO_ERROR( R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO, 'R', V_MENSAJE_CONFIRMACION, V_RESULTADO_CORREO);
                    END IF;
                ELSE
                    SP_ENVIAR_CORREO_ERROR( R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO, 'R', V_MENSAJE_CONFIRMACION, V_RESULTADO_CORREO);
                END IF;
                IF V_RESULTADO_CORREO THEN
                    V_ESTADO_CORREO := 'OK';
                ELSE
                    V_ESTADO_CORREO := 'ERROR';
                END IF;
 -- Secuencia
                SELECT
                    SQ_BT01_PEDIDO.NEXTVAL INTO V_ID_PEDIDO
                FROM
                    DUAL;
 -- Se crea entrada a la tabla para evitar una sobre consulta.
                INSERT INTO "DATA".T_BT01_PEDIDO (
                    ID,
                    USUARIOFECHA,
                    VALORTEXTO,
                    VALORNUMERO,
                    MODO,
                    ID_MOVIMIENTOS_INVENTARIO,
                    CREAR_ORDEN,
                    CONFIR_ORDEN,
                    ENVIO_CORREO,
                    NO_ORDEN
                ) VALUES (
                    V_ID_PEDIDO,
                    SYSDATE,
                    '',
                    0,
                    'R',
                    R_REPUESTOS.ID_MOVIMIENTOS_INVENTARIO,
                    V_MENSAJE_ORDEN,
                    V_MENSAJE_CONFIRMACION,
                    V_ESTADO_CORREO,
                    V_DOCUMENTNUMERO
                );
                COMMIT;
            EXCEPTION
                WHEN NO_DATA_FOUND THEN
                    GOTO FIN_LOOP_REPUESTOS;
            END;
            << FIN_LOOP_REPUESTOS >>
            NULL;
        END LOOP;
    END; --
 -- Proceso para enviar correo exitoso
    PROCEDURE SP_ENVIAR_CORREO_EXITO(
        P_ID IN NUMBER,
        P_MODO IN VARCHAR2,
        P_DOCUMENTNUMERO IN VARCHAR2,
        P_RESULTADO_CORREO OUT BOOLEAN
    ) AS
        V_MAIL_ORIGEN         VARCHAR2(128);
        V_MAIL_DESTINO        VARCHAR2(128);
        V_NOMBRE_DESTINO      VARCHAR2(128);
        V_TIPO                VARCHAR2(64);
        V_DETALLE             CLOB;
        V_DESCRIPCION_DETALLE VARCHAR2(256);
        V_VALE                VARCHAR(32);
        V_HTML                CLOB;
    BEGIN
 --
 -- Correo origen
        BEGIN
            << BUSCAR_MAIL_ORIGEN >>
            SELECT
                VALOR INTO V_MAIL_ORIGEN
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 10;
        EXCEPTION
            WHEN OTHERS THEN
                P_RESULTADO_CORREO := FALSE;
                RETURN;
        END BUSCAR_MAIL_ORIGEN;
 --
 -- Correo destino
        BEGIN
            << BUSCAR_MAIL_DESTINO >>
            SELECT
                VALOR,
                VALOR2 INTO V_MAIL_DESTINO,
                V_NOMBRE_DESTINO
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 11;
        EXCEPTION
            WHEN OTHERS THEN
                P_RESULTADO_CORREO := FALSE;
                RETURN;
        END BUSCAR_MAIL_DESTINO;
        IF P_MODO = 'R' THEN
            V_TIPO := 'Repuestos';
 --
 -- Info de vale
            SELECT
                VALECAB.FOLIO INTO V_VALE
            FROM
                MPZML_REP.MOVIMIENTOS_INVENTARIO CABECERA
                LEFT JOIN MPZML_REP.DETALLE_MOVTOS_INVENT DETALLE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_REP.SALIDAS_VALES_MP SALIDASVALE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_REP.VALE VALECAB
                ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            WHERE
                CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
                AND ROWNUM = 1;
 -- Consulta Loop detalles
            FOR R_MOVIMIENTOS IN C_MOVIMIENTOS_REPUESTOS(P_ID) LOOP
                BEGIN
                    SELECT
                        DESC_CAT_REPUESTOS INTO V_DESCRIPCION_DETALLE
                    FROM
                        MPZML_REP.CAT_REPUESTOS
                    WHERE
                        CVE_CAT_REPUESTOS = R_MOVIMIENTOS.CODIGOREPUESTO;
 --
                    V_DETALLE := V_DETALLE
                                    || FN_REMPLAZO_MULTIPLE( G_MAIL_DETALLE, NEW ARREGLO_TEXTO( '?repuesto', '?descripcion', '?cantidad' ), NEW ARREGLO_TEXTO( R_MOVIMIENTOS.CODIGOREPUESTO, V_DESCRIPCION_DETALLE, R_MOVIMIENTOS.CANTIDADORDENADA ));
 --
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
 -- user does not have attribute,continue loop to next record.
                        GOTO FIN_LOOP;
                END;
                << FIN_LOOP >>
                NULL;
            END LOOP;
        ELSE
            V_TIPO := 'Herramientas';
 --
 -- Info de vale
            SELECT
                VALECAB.FOLIO INTO V_VALE
            FROM
                MPZML_HER.MOVIMIENTOS_INVENTARIO CABECERA
                LEFT JOIN MPZML_HER.DETALLE_MOVTOS_INVENT DETALLE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_HER.SALIDAS_VALES_MP SALIDASVALE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_HER.VALE VALECAB
                ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            WHERE
                CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
                AND ROWNUM = 1;
 -- Consulta Loop detalles
            FOR R_MOVIMIENTOS IN C_MOVIMIENTOS_HERRAMIENTAS(P_ID) LOOP
                BEGIN
                    SELECT
                        DESC_CAT_HERRAMIENTAS INTO V_DESCRIPCION_DETALLE
                    FROM
                        MPZML_HER.CAT_HERRAMIENTAS
                    WHERE
                        CVE_CAT_HERRAMIENTAS = R_MOVIMIENTOS.CODIGOREPUESTO;
 --
 --
                    V_DETALLE := V_DETALLE
                                       || FN_REMPLAZO_MULTIPLE( G_MAIL_DETALLE, NEW ARREGLO_TEXTO( '?repuesto', '?descripcion', '?cantidad' ), NEW ARREGLO_TEXTO( R_MOVIMIENTOS.CODIGOREPUESTO, V_DESCRIPCION_DETALLE, R_MOVIMIENTOS.CANTIDADORDENADA ));
 --
                EXCEPTION
                    WHEN NO_DATA_FOUND THEN
 -- user does not have attribute,continue loop to next record.
                        GOTO FIN_LOOP;
                END;
                << FIN_LOOP >>
                NULL;
            END LOOP;
        END IF;
 --
        V_HTML := FN_REMPLAZO_MULTIPLE( G_MAIL_EXITO_INCIO, NEW ARREGLO_TEXTO( '?nombreUsuario', '?tipo', '?documento' ), NEW ARREGLO_TEXTO( V_NOMBRE_DESTINO, V_TIPO, P_DOCUMENTNUMERO))
                     || V_DETALLE
                     || G_MAIL_EXITO_FIN;
        PK_CORP_CORREO.SP_ENVIO( 'MP10', V_MAIL_DESTINO, V_MAIL_ORIGEN, 'Salida de '
                                                                        || V_TIPO
                                                                        || ' desde MP10, Vale # '
                                                                        || V_VALE, V_HTML, P_RESULTADO_CORREO );
    END SP_ENVIAR_CORREO_EXITO; --
 -- Proceso para enviar el correo fallido
    PROCEDURE SP_ENVIAR_CORREO_ERROR(
        P_ID IN NUMBER,
        P_MODO IN VARCHAR2,
        P_ERROR IN CLOB,
        P_RESULTADO_CORREO OUT BOOLEAN
    ) AS
        V_MAIL_ORIGEN    VARCHAR2(128);
        V_MAIL_DESTINO   VARCHAR2(128);
        V_NOMBRE_DESTINO VARCHAR2(128);
        V_TIPO           VARCHAR2(64);
        V_VALE           VARCHAR(32);
        V_HTML           CLOB;
    BEGIN
 --
 -- Correo origen
        BEGIN
            << BUSCAR_MAIL_ORIGEN >>
            SELECT
                VALOR INTO V_MAIL_ORIGEN
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 10;
        EXCEPTION
            WHEN OTHERS THEN
                P_RESULTADO_CORREO := FALSE;
                RETURN;
        END BUSCAR_MAIL_ORIGEN;
 --
 -- Correo destino
        BEGIN
            << BUSCAR_MAIL_DESTINO >>
            SELECT
                VALOR,
                VALOR2 INTO V_MAIL_DESTINO,
                V_NOMBRE_DESTINO
            FROM
                T_CORP_UDC
            WHERE
                ID_CABECERA = 'JDE_WS'
                AND ID_TABLA = 11;
        EXCEPTION
            WHEN OTHERS THEN
                P_RESULTADO_CORREO := FALSE;
                RETURN;
        END BUSCAR_MAIL_DESTINO;
 --
 -- Envia el correo
        IF P_MODO = 'H' THEN
            V_TIPO := 'Herramientas';
 --
 -- Info de vale
            SELECT
                VALECAB.FOLIO INTO V_VALE
            FROM
                MPZML_HER.MOVIMIENTOS_INVENTARIO CABECERA
                LEFT JOIN MPZML_HER.DETALLE_MOVTOS_INVENT DETALLE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_HER.SALIDAS_VALES_MP SALIDASVALE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_HER.VALE VALECAB
                ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            WHERE
                CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
                AND ROWNUM = 1;
        ELSE
            V_TIPO := 'Repuestos';
 --
 -- Info de vale
            SELECT
                VALECAB.FOLIO INTO V_VALE
            FROM
                MPZML_REP.MOVIMIENTOS_INVENTARIO CABECERA
                LEFT JOIN MPZML_REP.DETALLE_MOVTOS_INVENT DETALLE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = DETALLE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_REP.SALIDAS_VALES_MP SALIDASVALE
                ON CABECERA.ID_MOVIMIENTOS_INVENTARIO = SALIDASVALE.ID_MOVIMIENTOS_INVENTARIO
                LEFT JOIN MPZML_REP.VALE VALECAB
                ON SALIDASVALE.ID_VALE = VALECAB.ID_VALE
            WHERE
                CABECERA.ID_MOVIMIENTOS_INVENTARIO = P_ID
                AND ROWNUM = 1;
        END IF;
 --
 --
        V_HTML := FN_REMPLAZO_MULTIPLE( G_MAIL_ERROR_INCIO, NEW ARREGLO_TEXTO( '?nombreUsuario', '?tipo' ), NEW ARREGLO_TEXTO( V_NOMBRE_DESTINO, V_TIPO))
                        || P_ERROR
                        || G_MAIL_ERROR_FIN;
        PK_CORP_CORREO.SP_ENVIO( 'MP10', V_MAIL_DESTINO, V_MAIL_ORIGEN, 'Salida erronea de '
                                                                        || V_TIPO
                                                                        || ' desde MP10, Vale # '
                                                                        || V_VALE, V_HTML, P_RESULTADO_CORREO );
    END SP_ENVIAR_CORREO_ERROR; --
 -- Funcion para remplazo multimple de variables
    FUNCTION FN_REMPLAZO_MULTIPLE (
        P_CADENA IN CLOB,
        P_VARIABLES IN ARREGLO_TEXTO,
        P_VALORES IN ARREGLO_TEXTO
    ) RETURN CLOB AS
        V_RESPUESTA CLOB;
    BEGIN
        IF ( P_VARIABLES.COUNT <> P_VALORES.COUNT ) THEN
            RETURN P_CADENA;
        END IF;
        V_RESPUESTA := P_CADENA;
 --
 -- Rempazo de variables en loop
        FOR I IN 1..P_VARIABLES.COUNT LOOP
            V_RESPUESTA := REPLACE( V_RESPUESTA, P_VARIABLES(I), P_VALORES(I) );
        END LOOP;
        RETURN V_RESPUESTA;
    END FN_REMPLAZO_MULTIPLE; --
 --
END PK_JDE_PEDIDOS_WS;