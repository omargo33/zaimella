CREATE OR REPLACE PACKAGE BODY "DATA".PK_BT01_ARTICULOS_JDE AS
 --
 -- autor: Bestch
 -- fecha: 2023-04-17
 --
 -- Package body
 -- procesar orden de compra desde la lectura de la tabla T_BT01_RECEPCION_ORDEN_COMPRA desde el ID
    PROCEDURE SP_PROCESARORDENCOMPRA(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    ) AS
        V_ID                  NUMBER;
        V_USUARIO             VARCHAR2(256);
        V_USUARIOFECHA        DATE;
        V_MODO                VARCHAR2(256);
        V_COMPANIA            VARCHAR2(256);
        V_TIPODOCUMENTOCOMPRA VARCHAR2(256);
        V_NUMEROORDENCOMPRA   VARCHAR2(256);
        V_FECHA               DATE;
        V_CODIGOPROVEEDOR     VARCHAR2(256);
        V_NOMBREPROVEEDOR     VARCHAR2(256);
        V_MONEDA              VARCHAR2(256);
        V_BODEGARECEPCION     VARCHAR2(256);
        V_CENTROCOSTO         VARCHAR2(256);
        V_MOTIVO              VARCHAR2(256);
        V_LINEA               VARCHAR2(256);
        V_CODIGOITEM          VARCHAR2(256);
        V_INDICEITEM          VARCHAR2(256);
        V_UNIDADMEDIDA        VARCHAR2(256);
        V_CATEGORIA           VARCHAR2(256);
        V_CANTIDADRECIBIDA    NUMBER;
        V_COSTOUNIDAD         NUMBER;
    BEGIN
        BEGIN
            <<BUSCAR_INFO_WS>>
 --
 -- Consulta encabezado e realiza into a variables de la tabla
            SELECT
                ID,
                USUARIO,
                USUARIOFECHA,
                MODO,
                COMPANIA,
                TIPODOCUMENTOCOMPRA,
                NUMEROORDENCOMPRA,
                FECHA,
                CODIGOPROVEEDOR,
                NOMBREPROVEEDOR,
                MONEDA,
                BODEGARECEPCION,
                CENTROCOSTO,
                MOTIVO,
                LINEA,
                CODIGOITEM,
                INDICEITEM,
                UNIDADMEDIDA,
                CANTIDADRECIBIDA,
                COSTOUNIDAD,
                CATEGORIA INTO V_ID,
                V_USUARIO,
                V_USUARIOFECHA,
                V_MODO,
                V_COMPANIA,
                V_TIPODOCUMENTOCOMPRA,
                V_NUMEROORDENCOMPRA,
                V_FECHA,
                V_CODIGOPROVEEDOR,
                V_NOMBREPROVEEDOR,
                V_MONEDA,
                V_BODEGARECEPCION,
                V_CENTROCOSTO,
                V_MOTIVO,
                V_LINEA,
                V_CODIGOITEM,
                V_INDICEITEM,
                V_UNIDADMEDIDA,
                V_CANTIDADRECIBIDA,
                V_COSTOUNIDAD,
                V_CATEGORIA
            FROM
                DATA.T_BT01_RECEPCION_ORDEN_COMPRA
            WHERE
                ID = P_ID;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la orden de compra con el ID: '
                    || P_ID;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_INFO_WS;
 --
 -- Insertar movimiento.
        BEGIN
            <<INSERTAR_MOVIMIENTO>>
 --
 -- insertar movimiento de repuesto
            IF V_MODO = 'R' THEN
                SP_INSERTAR_REPUESTO( V_BODEGARECEPCION, V_CENTROCOSTO, V_MONEDA, V_CATEGORIA, V_USUARIO, V_NUMEROORDENCOMPRA, V_FECHA, V_MOTIVO, V_CODIGOPROVEEDOR, V_NOMBREPROVEEDOR, V_CANTIDADRECIBIDA, V_COSTOUNIDAD, P_MENSAJE => P_MENSAJE );
                IF (P_MENSAJE IS NOT NULL) THEN
                    RETURN;
                END IF;
            ELSE
 --
 -- insertar movimiento de herramienta
                IF V_MODO = 'H' THEN
                    SP_INSERTAR_HERRAMIENTA( V_BODEGARECEPCION, V_CENTROCOSTO, V_MONEDA, V_CATEGORIA, V_USUARIO, V_NUMEROORDENCOMPRA, V_FECHA, V_MOTIVO, V_CODIGOPROVEEDOR, V_NOMBREPROVEEDOR, V_CANTIDADRECIBIDA, V_COSTOUNIDAD, P_MENSAJE => P_MENSAJE );
                    IF (P_MENSAJE IS NOT NULL) THEN
                        RETURN;
                    END IF;
                ELSE
                    P_MENSAJE := 'No se pudo encontrar el modo: '
                        || V_MODO;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
                END IF;
            END IF;
        END INSERTAR_MOVIMIENTO;
    END SP_PROCESARORDENCOMPRA; --
 --
 --
 -- Proceso para insertar el movimiento de inventario de repuestos
    PROCEDURE SP_INSERTAR_REPUESTO(
        P_BODEGARECEPCION IN VARCHAR2,
        P_CENTROCOSTO IN VARCHAR2,
        P_MONEDA IN VARCHAR2,
        P_CATEGORIA IN VARCHAR2,
        P_USUARIO IN VARCHAR2,
        P_NUMEROORDENCOMPRA IN VARCHAR2,
        P_FECHA IN DATE,
        P_MOTIVO IN VARCHAR2,
        P_CODIGOPROVEEDOR IN VARCHAR2,
        P_NOMBREPROVEEDOR IN VARCHAR2,
        P_CANTIDADRECIBIDA IN NUMBER,
        P_COSTOUNIDAD IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    ) AS
 --Secuencias
        V_IDMOVIMIENTOSINVENTARIO NUMBER;
        V_IDDETALLEMOVTOSENTRADA  NUMBER;
        V_IDDETALLEMOVTOSINVENT   NUMBER;
 --Variables
        V_IDCATALMACENES          NUMBER;
        V_IDCATCENTROCOSTO        NUMBER;
        V_IDCATDIVISAS            NUMBER;
        V_IDCATREPUESTOS          NUMBER;
        V_IDUSUARIOS              NUMBER;
        V_TIPOCAMBIOMOVIMIENTO    NUMBER;
    BEGIN
 --
 -- Busca los datos de catalogos
        BEGIN
            <<BUSCAR_BODEGA>>
            SELECT
                ID_CAT_ALMACENES INTO V_IDCATALMACENES
            FROM
                MPZML_REP.CAT_ALMACENES
            WHERE
                CVE_CAT_ALMACENES = P_BODEGARECEPCION;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el almacen para: '
                    || P_BODEGARECEPCION;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_BODEGA;
 --
 -- Buscar catalogo de centro de costos
        BEGIN
            <<BUSCAR_CENTRO_COSTO>>
            SELECT
                ID_CAT_CENTROS_COSTO INTO V_IDCATCENTROCOSTO
            FROM
                MPZML_REP.CAT_CENTROS_COSTO
            WHERE
                CLAVE_CAT_CENTROS_COSTO = P_CENTROCOSTO;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el centro de costos para: '
                    || P_CENTROCOSTO;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CENTRO_COSTOAR_BODEGA;
 --
 -- Buscar catalogo de divisas
        BEGIN
            <<BUSCAR_DIVISA>>
            SELECT
                ID_CAT_DIVISAS INTO V_IDCATDIVISAS
            FROM
                MPZML_REP.CAT_DIVISAS
            WHERE
                ABREVIATURA_CAT_DIVISAS = P_MONEDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la divisa para: '
                    || P_MONEDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_DIVISA;
 --
 -- Buscar tipo cambio movimiento
        BEGIN
            <<BUSCAR_TIPO_CAMBIO>>
            SELECT
                TIPO_CAMBIO_CAT_DIVISAS INTO V_TIPOCAMBIOMOVIMIENTO
            FROM
                MPZML_REP.CAT_DIVISAS
            WHERE
                ABREVIATURA_CAT_DIVISAS = P_MONEDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la divisa para: '
                    || P_MONEDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_TIPO_CAMBIO;
 --
 -- Buscar categoria repuestos
        BEGIN
            <<BUSCAR_CAT_REPUESTO>>
            SELECT
                ID_CAT_REPUESTOS INTO V_IDCATREPUESTOS
            FROM
                MPZML_REP.CAT_REPUESTOS
            WHERE
                CVE_CAT_REPUESTOS = P_CATEGORIA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la categoria de repuestos: '
                    || P_CATEGORIA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CAT_REPUESTO;
 --
 -- Buscar id usuario
        BEGIN
            <<BUSCAR_USUARIO>>
            SELECT
                ID_USUARIOS INTO V_IDUSUARIOS
            FROM
                MPZML_REP.USUARIOS
            WHERE
                NOMBRE_USUARIOS = P_USUARIO;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el usuario para: '
                    || P_USUARIO;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_USUARIO;
 --
 -- Insertar movimiento inventario.
        BEGIN
            <<INSERTAR_MOVIMIENTO>>
 --
 -- Buscar el siguiente id de movimiento de inventario
            SELECT
                NVL(MAX(ID_MOVIMIENTOS_INVENTARIO),
                0) + 1 INTO V_IDMOVIMIENTOSINVENTARIO
            FROM
                MPZML_REP.MOVIMIENTOS_INVENTARIO;
 --
 -- Insergar movimiento de inventario
            INSERT INTO MPZML_REP.MOVIMIENTOS_INVENTARIO(
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                FOL_MOVIMIENTOS_INVENTARIO,
                ID_CAT_CENTROS_COSTO,
                ID_CAT_DIVISAS,
                ID_USUARIOS,
                FECHA_MOVIMIENTOS_INVENTARIO,
                REF_MOVIMIENTOS_INVENTARIO,
                ORIGEN_MOVIMIENTOS_INVENTARIO,
                DESTINO_MOVIMIENTOS_INVENTARIO,
                TIPO_CAMBIO_MOVIMIENTO_INV,
                MONTO_DIVISA_MOVIMIENTO,
                MONTO_NACIONAL_MOVIMIENTO,
                ESCANC_MOVIMIENTOS_INVENTARIO
            )VALUES (
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                P_NUMEROORDENCOMPRA,
                V_IDCATCENTROCOSTO,
                V_IDCATDIVISAS,
                V_IDUSUARIOS,
                P_FECHA,
                P_MOTIVO,
                P_CODIGOPROVEEDOR
                    || ' '
                    || P_NOMBREPROVEEDOR,
                NULL,
                V_TIPOCAMBIOMOVIMIENTO,
                P_CANTIDADRECIBIDA* V_TIPOCAMBIOMOVIMIENTO*P_COSTOUNIDAD,
                P_CANTIDADRECIBIDA*P_COSTOUNIDAD,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimiento de inventario';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_MOVIMIENTO;
 --
 -- Insertar detalle de movimiento de inventario
        BEGIN
            <<INSERTAR_DETALLE_MOVIMIENTO>>
 --
 --Buscar el siguiente id de detalle de movimiento de inventario
            SELECT
                NVL(MAX(ID_DETALLE_MOVTOS_ENTRADA),
                0) + 1 INTO V_IDDETALLEMOVTOSENTRADA
            FROM
                MPZML_REP.DETALLE_MOVTOS_ENTRADA;
 --
 -- insertar detalle del movimiento
            INSERT INTO MPZML_REP.DETALLE_MOVTOS_ENTRADA (
                ID_DETALLE_MOVTOS_ENTRADA,
                ID_DETALLE_MOVTOS_INVENT,
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                CANTIDAD_DET_MOVTO_ENTRADA,
                COSTO_UNITA_DET_MOVTO_ENTRADA,
                EXIST_PEPS_DET_MOVTO_ENTRADA,
                EXIST_UEPS_DET_MOVTO_ENTRADA,
                EXIST_PROM_DET_MOVTO_ENTRADA,
                ORDEN_DET_MOVTO_ENTRADA
            ) VALUES(
                V_IDDETALLEMOVTOSENTRADA,
                1,
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                P_CANTIDADRECIBIDA,
                P_COSTOUNIDAD,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimientos de entrada';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_DETALLE_MOVIMIENTO;
 --
 -- Insertar detalle de movimiento de inventario
        BEGIN
            <<INSERTAR_DET_INVENTARIO>>
            SELECT
                NVL(MAX(ID_DETALLE_MOVTOS_INVENT),
                0) + 1 INTO V_IDDETALLEMOVTOSINVENT
            FROM
                MPZML_REP.DETALLE_MOVTOS_INVENT;
 --
            INSERT INTO MPZML_REP.DETALLE_MOVTOS_INVENT (
                ID_DETALLE_MOVTOS_INVENT,
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                ID_CAT_RPTOS_HERR,
                TIPO_CATALOGO,
                ID_PAD_DET_MOVTOS_INVENT,
                CANTIDAD_DETALLE_MOVTO_INV,
                COSTO_TOTAL_DETALLE_MOVTO_INV
            ) VALUES(
                V_IDDETALLEMOVTOSINVENT,
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                V_IDCATREPUESTOS,
                'R',
                NULL,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA*P_COSTOUNIDAD
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimientos de inventario repuestos';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_DET_INVENTARIO;
    END SP_INSERTAR_REPUESTO; --
 --
 -- Proceso para insertar el movimiento de inventario de HERRAMIENTAs
    PROCEDURE SP_INSERTAR_HERRAMIENTA(
        P_BODEGARECEPCION IN VARCHAR2,
        P_CENTROCOSTO IN VARCHAR2,
        P_MONEDA IN VARCHAR2,
        P_CATEGORIA IN VARCHAR2,
        P_USUARIO IN VARCHAR2,
        P_NUMEROORDENCOMPRA IN VARCHAR2,
        P_FECHA IN DATE,
        P_MOTIVO IN VARCHAR2,
        P_CODIGOPROVEEDOR IN VARCHAR2,
        P_NOMBREPROVEEDOR IN VARCHAR2,
        P_CANTIDADRECIBIDA IN NUMBER,
        P_COSTOUNIDAD IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    ) AS
 --Secuencias
        V_IDMOVIMIENTOSINVENTARIO NUMBER;
        V_IDDETALLEMOVTOSENTRADA  NUMBER;
        V_IDDETALLEMOVTOSINVENT   NUMBER;
 --Variables
        V_IDCATALMACENES          NUMBER;
        V_IDCATCENTROCOSTO        NUMBER;
        V_IDCATDIVISAS            NUMBER;
        V_IDCATHERRAMIENTAS       NUMBER;
        V_IDUSUARIOS              NUMBER;
        V_TIPOCAMBIOMOVIMIENTO    NUMBER;
    BEGIN
 --
 -- Busca los datos de catalogos
        BEGIN
            <<BUSCAR_BODEGA>>
            SELECT
                ID_CAT_ALMACENES INTO V_IDCATALMACENES
            FROM
                MPZML_HER.CAT_ALMACENES
            WHERE
                CVE_CAT_ALMACENES = P_BODEGARECEPCION;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el almacen para: '
                    || P_BODEGARECEPCION;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_BODEGA;
 --
 -- Buscar catalogo de centro de costos
        BEGIN
            <<BUSCAR_CENTRO_COSTO>>
            SELECT
                ID_CAT_CENTROS_COSTO INTO V_IDCATCENTROCOSTO
            FROM
                MPZML_HER.CAT_CENTROS_COSTO
            WHERE
                CLAVE_CAT_CENTROS_COSTO = P_CENTROCOSTO;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el centro de costos para: '
                    || P_CENTROCOSTO;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CENTRO_COSTOAR_BODEGA;
 --
 -- Buscar catalogo de divisas
        BEGIN
            <<BUSCAR_DIVISA>>
            SELECT
                ID_CAT_DIVISAS INTO V_IDCATDIVISAS
            FROM
                MPZML_HER.CAT_DIVISAS
            WHERE
                ABREVIATURA_CAT_DIVISAS = P_MONEDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la divisa para: '
                    || P_MONEDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_DIVISA;
 --
 -- Buscar tipo cambio movimiento
        BEGIN
            <<BUSCAR_TIPO_CAMBIO>>
            SELECT
                TIPO_CAMBIO_CAT_DIVISAS INTO V_TIPOCAMBIOMOVIMIENTO
            FROM
                MPZML_HER.CAT_DIVISAS
            WHERE
                ABREVIATURA_CAT_DIVISAS = P_MONEDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la divisa para: '
                    || P_MONEDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_TIPO_CAMBIO;
 --
 -- Buscar id usuario
        BEGIN
            <<BUSCAR_USUARIO>>
            SELECT
                ID_USUARIOS INTO V_IDUSUARIOS
            FROM
                MPZML_HER.USUARIOS
            WHERE
                NOMBRE_USUARIOS = P_USUARIO;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el usuario para: '
                    || P_USUARIO;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_USUARIO;
 --
 -- Buscar categoria herramienta
        BEGIN
            <<BUSCAR_CAT_HERRAMIENTA>>
            SELECT
                ID_CAT_HERRAMIENTAS INTO V_IDCATHERRAMIENTAS
            FROM
                MPZML_HER.CAT_HERRAMIENTAS
            WHERE
                CVE_CAT_HERRAMIENTAS = P_CATEGORIA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la categoria de herramienta: '
                    || P_CATEGORIA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CAT_HERRAMIENTA;
 --
 -- Insertar movimiento inventario.
        BEGIN
            <<INSERTAR_MOVIMIENTO>>
 --
 -- Buscar el siguiente id de movimiento de inventario
            SELECT
                NVL(MAX(ID_MOVIMIENTOS_INVENTARIO),
                0) + 1 INTO V_IDMOVIMIENTOSINVENTARIO
            FROM
                MPZML_HER.MOVIMIENTOS_INVENTARIO;
 --
 -- Insergar movimiento de inventario
            INSERT INTO MPZML_HER.MOVIMIENTOS_INVENTARIO(
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                FOL_MOVIMIENTOS_INVENTARIO,
                ID_CAT_CENTROS_COSTO,
                ID_CAT_DIVISAS,
                ID_USUARIOS,
                FECHA_MOVIMIENTOS_INVENTARIO,
                REF_MOVIMIENTOS_INVENTARIO,
                ORIGEN_MOVIMIENTOS_INVENTARIO,
                DESTINO_MOVIMIENTOS_INVENTARIO,
                TIPO_CAMBIO_MOVIMIENTO_INV,
                MONTO_DIVISA_MOVIMIENTO,
                MONTO_NACIONAL_MOVIMIENTO,
                ESCANC_MOVIMIENTOS_INVENTARIO
            )VALUES (
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                P_NUMEROORDENCOMPRA,
                V_IDCATCENTROCOSTO,
                V_IDCATDIVISAS,
                V_IDUSUARIOS,
                P_FECHA,
                P_MOTIVO,
                P_CODIGOPROVEEDOR
                    || ' '
                    || P_NOMBREPROVEEDOR,
                NULL,
                V_TIPOCAMBIOMOVIMIENTO,
                P_CANTIDADRECIBIDA* V_TIPOCAMBIOMOVIMIENTO*P_COSTOUNIDAD,
                P_CANTIDADRECIBIDA*P_COSTOUNIDAD,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimiento de inventario';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_MOVIMIENTO;
 --
 -- Insertar detalle de movimiento de inventario
        BEGIN
            <<INSERTAR_DETALLE_MOVIMIENTO>>
 --
 --Buscar el siguiente id de detalle de movimiento de inventario
            SELECT
                NVL(MAX(ID_DETALLE_MOVTOS_ENTRADA),
                0) + 1 INTO V_IDDETALLEMOVTOSENTRADA
            FROM
                MPZML_HER.DETALLE_MOVTOS_ENTRADA;
 --
 -- insertar detalle del movimiento
            INSERT INTO MPZML_HER.DETALLE_MOVTOS_ENTRADA (
                ID_DETALLE_MOVTOS_ENTRADA,
                ID_DETALLE_MOVTOS_INVENT,
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                CANTIDAD_DET_MOVTO_ENTRADA,
                COSTO_UNITA_DET_MOVTO_ENTRADA,
                EXIST_PEPS_DET_MOVTO_ENTRADA,
                EXIST_UEPS_DET_MOVTO_ENTRADA,
                EXIST_PROM_DET_MOVTO_ENTRADA,
                ORDEN_DET_MOVTO_ENTRADA
            ) VALUES(
                V_IDDETALLEMOVTOSENTRADA,
                1,
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                P_CANTIDADRECIBIDA,
                P_COSTOUNIDAD,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimientos de entrada';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_DETALLE_MOVIMIENTO;
 --
 -- Insertar detalle de movimiento de inventario
        BEGIN
            <<INSERTAR_DET_INVENTARIO>>
            SELECT
                NVL(MAX(ID_DETALLE_MOVTOS_INVENT),
                0) + 1 INTO V_IDDETALLEMOVTOSINVENT
            FROM
                MPZML_HER.DETALLE_MOVTOS_INVENT;
 --
            INSERT INTO MPZML_HER.DETALLE_MOVTOS_INVENT (
                ID_DETALLE_MOVTOS_INVENT,
                ID_MOVIMIENTOS_INVENTARIO,
                ID_CAT_ALMACENES,
                ID_CAT_RPTOS_HERR,
                TIPO_CATALOGO,
                ID_PAD_DET_MOVTOS_INVENT,
                CANTIDAD_DETALLE_MOVTO_INV,
                COSTO_TOTAL_DETALLE_MOVTO_INV
            ) VALUES(
                V_IDDETALLEMOVTOSINVENT,
                V_IDMOVIMIENTOSINVENTARIO,
                V_IDCATALMACENES,
                V_IDCATHERRAMIENTAS,
                'H',
                NULL,
                P_CANTIDADRECIBIDA,
                P_CANTIDADRECIBIDA*P_COSTOUNIDAD
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el movimientos de inventario herramienta';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_DET_INVENTARIO;
    END SP_INSERTAR_HERRAMIENTA; --
 --
 -- procesar articulos T_BT01_ARTICULO desde el ID
    PROCEDURE SP_PROCESARARTICULO(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    ) AS
 -- crear variables para la consulta sql SELECT ID, USUARIO, USUARIOFECHA, VALORTEXTO, VALORNUMERO, MODO, CODIGOITEM, NOMBREITEM, DESCRIPCIONITEM, UNIDADMEDIDA, CLASIFICACION, CLASIFICACION2, ALMACEN, COSTO FROM "DATA".T_BT01_ARTICULO;
        V_MODO            VARCHAR2(8);
        V_CODIGOITEM      VARCHAR2(32);
        V_NOMBREITEM      VARCHAR2(256);
        V_DESCRIPCIONITEM VARCHAR2(32);
        V_UNIDADMEDIDA    VARCHAR2(8);
        V_CLASIFICACION   VARCHAR2(8);
        V_CLASIFICACION2  VARCHAR2(8);
        V_ALMACEN         VARCHAR2(32);
        V_COSTO           NUMBER;
    BEGIN
        BEGIN
            <<BUSCAR_INFO_WS>>
            SELECT
                MODO,
                CODIGOITEM,
                NOMBREITEM,
                DESCRIPCIONITEM,
                UNIDADMEDIDA,
                CLASIFICACION,
                CLASIFICACION2,
                ALMACEN,
                COSTO INTO V_MODO,
                V_CODIGOITEM,
                V_NOMBREITEM,
                V_DESCRIPCIONITEM,
                V_UNIDADMEDIDA,
                V_CLASIFICACION,
                V_CLASIFICACION2,
                V_ALMACEN,
                V_COSTO
            FROM
                DATA.T_BT01_ARTICULO
            WHERE
                ID = P_ID;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el articulo con el ID: '
                    || P_ID;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_INFO_WS;
 --
 -- Procesa articulos.
        BEGIN
            <<PROCESA_ARTICULOS>>
 --
 -- procesa repuesto
            IF V_MODO = 'R' THEN
                SP_PROCESA_ARTICULO_REP( V_CODIGOITEM, V_NOMBREITEM, V_DESCRIPCIONITEM, V_UNIDADMEDIDA, V_CLASIFICACION, V_CLASIFICACION2, V_ALMACEN, V_COSTO, P_MENSAJE => P_MENSAJE );
                NULL;
                IF (P_MENSAJE IS NOT NULL) THEN
                    RETURN;
                END IF;
            ELSE
 --
 -- procesa herramienta
                IF V_MODO = 'H' THEN
                    SP_PROCESA_ARTICULO_HER( V_CODIGOITEM, V_NOMBREITEM, V_DESCRIPCIONITEM, V_UNIDADMEDIDA, V_CLASIFICACION, V_CLASIFICACION2, V_ALMACEN, V_COSTO, P_MENSAJE => P_MENSAJE );
                    NULL;
                    IF (P_MENSAJE IS NOT NULL) THEN
                        RETURN;
                    END IF;
                ELSE
                    P_MENSAJE := 'No se pudo encontrar el modo: '
                        || V_MODO;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
                END IF;
            END IF;
        END PROCESA_ARTICULOS;
    END SP_PROCESARARTICULO; --
 -- Procesar los articulos para repuestos
    PROCEDURE SP_PROCESA_ARTICULO_REP(
        P_CODIGOITEM IN VARCHAR2,
        P_NOMBREITEM IN VARCHAR2,
        P_DESCRIPCIONITEM IN VARCHAR2,
        P_UNIDADMEDIDA IN VARCHAR2,
        P_CLASIFICACION IN VARCHAR2,
        P_CLASIFICACION2 IN VARCHAR2,
        P_ALMACEN IN VARCHAR2,
        P_COSTO IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    )AS
 -- Secuencias
        V_ID_CAT_REPUESTOS           NUMBER;
        V_ID_KARDEX_RPTOS_HERR       NUMBER;
 -- Variables
        V_ID_CAT_UNIDADES_RPTOS_HERR NUMBER;
        V_ID_CAT_CLASIF1_REPUESTOS   NUMBER;
        V_ID_CAT_CLASIF2_REPUESTOS   NUMBER;
        V_ID_CAT_ALMACENES           NUMBER;
    BEGIN
 --
 -- Validaciones
 --
 -- Buscar unidad medida
        BEGIN
            <<BUSCAR_UNIDAD_MEDIDA>>
            SELECT
                ID_CAT_UNIDADES_RPTOS_HERR INTO V_ID_CAT_UNIDADES_RPTOS_HERR
            FROM
                MPZML_REP.CAT_UNIDADES_RPTOS_HERR
            WHERE
                DESC_CAT_UNIDADES_RPTOS_HERR = P_UNIDADMEDIDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la unidad de medida para: '
                    || P_UNIDADMEDIDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_UNIDAD_MEDIDA;
 --
 -- buscar clasificacion 1
        BEGIN
            <<BUSCAR_CLASIFICACION1>>
            SELECT
                ID_CAT_CLASIF1_REPUESTOS INTO V_ID_CAT_CLASIF1_REPUESTOS
            FROM
                MPZML_REP.CAT_CLASIF1_REPUESTOS
            WHERE
                CODIGO = P_CLASIFICACION;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la clasificacion 1 para: '
                    || P_CLASIFICACION;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CLASIFICACION1;
 -- buscar clasificacion 2
        BEGIN
            <<BUSCAR_CLASIFICACION2>>
            SELECT
                ID_CAT_CLASIF2_REPUESTOS INTO V_ID_CAT_CLASIF2_REPUESTOS
            FROM
                MPZML_REP.CAT_CLASIF2_REPUESTOS
            WHERE
                CODIGO = P_CLASIFICACION2;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la clasificacion 2 para: '
                    || P_CLASIFICACION2;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CLASIFICACION2;
 --
 -- buscar almacenes
        BEGIN
            <<BUSCAR_ALMACEN>>
            SELECT
                ID_CAT_ALMACENES INTO V_ID_CAT_ALMACENES
            FROM
                MPZML_REP.CAT_ALMACENES
            WHERE
                CVE_CAT_ALMACENES = P_ALMACEN;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el almacen para: '
                    || P_ALMACEN;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_ALMACEN;
 --
 -- buscar categoria repuestos.
        BEGIN
            <<BUSCAR_REPUESTO>>
            SELECT
                ID_CAT_REPUESTOS INTO V_ID_CAT_REPUESTOS
            FROM
                MPZML_REP.CAT_REPUESTOS
            WHERE
                CVE_CAT_REPUESTOS = P_CODIGOITEM;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                V_ID_CAT_REPUESTOS := NULL;
        END BUSCAR_REPUESTO;
 --
 -- Si el repuesto existe, actualizarlo
        IF V_ID_CAT_REPUESTOS IS NOT NULL THEN
            BEGIN
                <<ACTUALIZAR_REPUESTO>>
                UPDATE MPZML_REP.CAT_REPUESTOS
                SET
                    DESC_CAT_REPUESTOS=SUBSTR(
                        P_NOMBREITEM
                            || ' '
                            || P_DESCRIPCIONITEM,
                        140
                    ),
                    ID_CAT_UNIDADES_RPTOS_HERR=V_ID_CAT_UNIDADES_RPTOS_HERR,
                    ID_CAT_CLASIF1_REPUESTOS=V_ID_CAT_CLASIF1_REPUESTOS,
                    ID_CAT_CLASIF2_REPUESTOS= V_ID_CAT_CLASIF2_REPUESTOS
                WHERE
                    ID_CAT_REPUESTOS = V_ID_CAT_REPUESTOS;
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo actualizar el repuesto: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END ACTUALIZAR_REPUESTO;
        ELSE
 --
 -- Obtiene el indice de repuestos para elementos nuevos
            BEGIN
                <<MAXIMO_CAT_REPUESTOS>>
                SELECT
                    NVL(MAX(ID_CAT_REPUESTOS),
                    0)+1 INTO V_ID_CAT_REPUESTOS
                FROM
                    MPZML_REP.CAT_REPUESTOS;
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo obtener el indice de repuestos: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END MAXIMO_CAT_REPUESTOS;
 --
 --inserta el repuesto
            BEGIN
                <<INSERTAR_REPUESTO>>
                INSERT INTO MPZML_REP.CAT_REPUESTOS (
                    ID_CAT_REPUESTOS,
                    CVE_CAT_REPUESTOS,
                    DESC_CAT_REPUESTOS,
                    ID_LNG_ESPECIFIC_REPUESTOS,
                    ID_SIS_TIPOS_COSTO,
                    ID_CAT_UNIDADES_RPTOS_HERR,
                    ID_CAT_CLASIF1_REPUESTOS,
                    ID_CAT_CLASIF2_REPUESTOS,
                    CVE_EXT_CAT_REPUESTOS,
                    ID_SIS_ESTADOS_REPTO_HERR,
                    FECHA_INICIO,
                    USA_SERIE_CAT_REPUESTOS,
                    USA_FECHA_CAD_REPUESTO,
                    TIPO_CAT_REPUESTOS
                ) VALUES(
                    V_ID_CAT_REPUESTOS,
                    P_CODIGOITEM,
                    SUBSTR(P_NOMBREITEM
                        || ' '
                        || P_DESCRIPCIONITEM, 1, 140),
                    0,
                    1,
                    V_ID_CAT_UNIDADES_RPTOS_HERR,
                    V_ID_CAT_CLASIF1_REPUESTOS,
                    V_ID_CAT_CLASIF2_REPUESTOS,
                    NULL,
                    1,
                    SYSDATE(),
                    0,
                    0,
                    NULL
                );
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo insertar el repuesto: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END INSERTAR_REPUESTO;
        END IF;
 --
 -- Insertar niveles inversion repuestos
        BEGIN
            <<INSERTAR_NIVEL_INVERSION>>
            INSERT INTO MPZML_REP.NIVELES_INV_RPTOS_HERR (
                ID_CAT_ALMACENES,
                ID_CAT_RPTOS_HERR,
                TIPO_CATALOGO,
                MIN_NIVELES_INV_RPTOS_HERR,
                OPT_NIVELES_INV_RPTOS_HERR,
                MAX_NIVELES_INV_RPTOS_HERR,
                ROT_NIVELES_INV_RPTOS_HERR,
                PEDIDO_NIVELES_INV_RPTOS_HERR,
                MIN_MANUAL_AUTO,
                MAX_MANUAL_AUTO,
                OPT_MANUAL_AUTO,
                ROT_MANUAL_AUTO,
                MIN_DT_ACTUALIZADO,
                MAX_DT_ACTUALIZADO,
                OPT_DT_ACTUALIZADO,
                ROT_DT_ACTUALIZADO,
                MESES_UTILIZADOS_CALC,
                DIAS_PROCURAMIENTO_RPTOS,
                PROC_MANUAL_AUTO,
                PROC_DT_ACTUALIZADO,
                PROC_MESES_UTILIZADOS_CALC,
                METODO_CALC_COBERT
            ) VALUES(
                V_ID_CAT_ALMACENES,
                V_ID_CAT_REPUESTOS,
                'R',
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                1,
                1,
                SYSDATE(),
                SYSDATE(),
                SYSDATE(),
                SYSDATE(),
                0,
                0,
                1,
                SYSDATE(),
                0,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el nivel de inversion: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_NIVEL_INVERSION;
 --
 -- Secuencia del kardex de repuestos
        BEGIN
            <<MAXIMO_KARDEX>>
            SELECT
                NVL(MAX(ID_KARDEX_RPTOS_HERR),
                0)+1 INTO V_ID_KARDEX_RPTOS_HERR
            FROM
                MPZML_REP.KARDEX_RPTOS_HERR;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo obtener la secuencia del kardex: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END MAXIMO_KARDEX;
 --
 -- Insertar Kardex repuestos herramientas
        BEGIN
            <<INSERTAR_KARDEX>>
            INSERT INTO MPZML_REP.KARDEX_RPTOS_HERR (
                ID_KARDEX_RPTOS_HERR,
                ID_CAT_RPTOS_HERR,
                ID_CAT_ALMACENES,
                EXISTENCIA_INICIAL,
                FECHA_INICIAL,
                CANTIDAD_ENTRADA,
                COSTOT_ENTRADA,
                CANTIDAD_SALIDA,
                COSTOT_SAL_PROM,
                COSTOT_SAL_PEPS,
                COSTOT_SAL_UEPS,
                EXISTENCIA_ACTUAL,
                FECHA_FINAL,
                REPUESTO_INICIALIZADO,
                DESC_LOCALIZACION,
                TIPO_CATALOGO
            ) VALUES(
                V_ID_KARDEX_RPTOS_HERR,
                V_ID_CAT_REPUESTOS,
                V_ID_CAT_ALMACENES,
                0,
                SYSDATE(),
                0,
                P_COSTO,
                0,
                0,
                0,
                0,
                0,
                NULL,
                1,
                NULL,
                'R'
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el kardex: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_KARDEX;
    END SP_PROCESA_ARTICULO_REP; --
 --
 -- Procesar los articulos para Herramientas
    PROCEDURE SP_PROCESA_ARTICULO_HER(
        P_CODIGOITEM IN VARCHAR2,
        P_NOMBREITEM IN VARCHAR2,
        P_DESCRIPCIONITEM IN VARCHAR2,
        P_UNIDADMEDIDA IN VARCHAR2,
        P_CLASIFICACION IN VARCHAR2,
        P_CLASIFICACION2 IN VARCHAR2,
        P_ALMACEN IN VARCHAR2,
        P_COSTO IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    )AS
 --Secuencias
        V_ID_CAT_HERRAMIENTAS         NUMBER;
        V_ID_KARDEX_RPTOS_HERR        NUMBER;
 --Variables
        V_ID_CAT_UNIDADES_RPTOS_HERR  NUMBER;
        V_ID_CAT_CLASIF1_HERRAMIENTAS NUMBER;
        V_ID_CAT_CLASIF2_HERRAMIENTAS NUMBER;
        V_ID_CAT_ALMACENES            NUMBER;
    BEGIN
 --
 -- Validaciones
 --
 -- buscar unidad de medida
        BEGIN
            <<BUSCAR_UNIDAD_MEDIDA>>
            SELECT
                ID_CAT_UNIDADES_RPTOS_HERR INTO V_ID_CAT_UNIDADES_RPTOS_HERR
            FROM
                MPZML_HER.CAT_UNIDADES_RPTOS_HERR
            WHERE
                DESC_CAT_UNIDADES_RPTOS_HERR = P_UNIDADMEDIDA;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la unidad de medida para: '
                    || P_UNIDADMEDIDA;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_UNIDAD_MEDIDA;
 --
 -- Buscar calsificaicon 1 herramientas
        BEGIN
            <<BUSCAR_CLASIFICACION1>>
            SELECT
                ID_CAT_CLASIF1_HERRAMIENTAS INTO V_ID_CAT_CLASIF1_HERRAMIENTAS
            FROM
                MPZML_HER.CAT_CLASIF1_HERRAMIENTAS
            WHERE
                DESC_CAT_CLASIF1_HERRAMIENTAS = P_CLASIFICACION2;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la clasificacion 1 para: '
                    || P_CLASIFICACION;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CLASIFICACION1;
 --
 -- Buscar calsificaicon 2 herramientas
        BEGIN
            <<BUSCAR_CLASIFICACION2>>
            SELECT
                ID_CAT_CLASIF2_HERRAMIENTAS INTO V_ID_CAT_CLASIF2_HERRAMIENTAS
            FROM
                MPZML_HER.CAT_CLASIF2_HERRAMIENTAS
            WHERE
                DESC_CAT_CLASIF2_HERRAMIENTAS = P_CLASIFICACION2;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar la clasificacion 2 para: '
                    || P_CLASIFICACION2;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_CLASIFICACION2;
 --
 -- Buscar almacenes
        BEGIN
            <<BUSCAR_ALMACEN>>
            SELECT
                ID_CAT_ALMACENES INTO V_ID_CAT_ALMACENES
            FROM
                MPZML_HER.CAT_ALMACENES
            WHERE
                CVE_CAT_ALMACENES = P_ALMACEN;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo encontrar el almacen para: '
                    || P_ALMACEN;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END BUSCAR_ALMACEN;
 --
 --Busca categora herramientas.
        BEGIN
            <<BUSCAR_HERRAMIENTA>>
            SELECT
                ID_CAT_HERRAMIENTAS INTO V_ID_CAT_HERRAMIENTAS
            FROM
                MPZML_HER.CAT_HERRAMIENTAS
            WHERE
                CVE_CAT_HERRAMIENTAS = P_CODIGOITEM;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                V_ID_CAT_HERRAMIENTAS:=NULL;
        END BUSCAR_HERRAMIENTA;
        IF V_ID_CAT_HERRAMIENTAS IS NOT NULL THEN
            BEGIN
                <<ACTUALIZAR_HERRAMIENTA>>
                UPDATE MPZML_HER.CAT_HERRAMIENTAS
                SET
                    DESC_CAT_HERRAMIENTAS=SUBSTR(
                        P_NOMBREITEM
                            || ' '
                            || P_DESCRIPCIONITEM,
                        140
                    ),
                    ID_CAT_UNIDADES_RPTOS_HERR=V_ID_CAT_UNIDADES_RPTOS_HERR,
                    ID_CAT_CLASIF1_HERRAMIENTAS=V_ID_CAT_CLASIF1_HERRAMIENTAS,
                    ID_CAT_CLASIF2_HERRAMIENTAS=V_ID_CAT_CLASIF2_HERRAMIENTAS
                WHERE
                    ID_CAT_HERRAMIENTAS=0;
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo actualizar la herramienta: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END ACTUALIZAR_HERRAMIENTA;
        ELSE
 --
 -- Obtiene el indice de herramientas para elementos nuevos
            BEGIN
                <<MAXIMO_CAT_HERRAMIENTAS>>
                SELECT
                    NVL(MAX(ID_CAT_HERRAMIENTAS),
                    0) + 1 INTO V_ID_CAT_HERRAMIENTAS
                FROM
                    MPZML_HER.CAT_HERRAMIENTAS;
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo obtener el indice de herramientas: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END MAXIMO_CAT_HERRAMIENTAS;
 --
 -- Insertar herramienta
            BEGIN
                <<INSERTAR_HERRAMIENTA>>
                INSERT INTO MPZML_HER.CAT_HERRAMIENTAS (
                    ID_CAT_HERRAMIENTAS,
                    CVE_CAT_HERRAMIENTAS,
                    DESC_CAT_HERRAMIENTAS,
                    ID_LNG_ESPECIFICACIONES_HERR,
                    ID_SIS_TIPOS_COSTO,
                    ID_CAT_UNIDADES_RPTOS_HERR,
                    ID_CAT_CLASIF1_HERRAMIENTAS,
                    ID_CAT_CLASIF2_HERRAMIENTAS,
                    CVE_EXT_CAT_HERRAMIENTAS,
                    ID_SIS_ESTADOS_REPTO_HERR,
                    FECHA_INICIO,
                    USA_SERIE_CAT_HERRAMIENTAS
                ) VALUES(
                    V_ID_CAT_HERRAMIENTAS,
                    P_CODIGOITEM,
                    SUBSTR(P_NOMBREITEM
                        || ' '
                        || P_DESCRIPCIONITEM, 1, 140),
                    0,
                    1,
                    V_ID_CAT_UNIDADES_RPTOS_HERR,
                    V_ID_CAT_CLASIF1_HERRAMIENTAS,
                    V_ID_CAT_CLASIF2_HERRAMIENTAS,
                    NULL,
                    1,
                    SYSDATE(),
                    0
                );
            EXCEPTION
                WHEN OTHERS THEN
                    P_MENSAJE := 'No se pudo insertar la herramienta: '
                        || P_CODIGOITEM;
                    RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                    RETURN;
            END INSERTAR_HERRAMIENTA;
        END IF;
 --
 -- Insertar niveles de inversion herramientas
        BEGIN
            <<INSERTAR_NIVEL_INVERSION>>
            INSERT INTO MPZML_HER.NIVELES_INV_RPTOS_HERR (
                ID_CAT_ALMACENES,
                ID_CAT_RPTOS_HERR,
                TIPO_CATALOGO,
                MIN_NIVELES_INV_RPTOS_HERR,
                OPT_NIVELES_INV_RPTOS_HERR,
                MAX_NIVELES_INV_RPTOS_HERR,
                ROT_NIVELES_INV_RPTOS_HERR,
                PEDIDO_NIVELES_INV_RPTOS_HERR,
                MIN_MANUAL_AUTO,
                MAX_MANUAL_AUTO,
                OPT_MANUAL_AUTO,
                ROT_MANUAL_AUTO,
                MIN_DT_ACTUALIZADO,
                MAX_DT_ACTUALIZADO,
                OPT_DT_ACTUALIZADO,
                ROT_DT_ACTUALIZADO,
                MESES_UTILIZADOS_CALC,
                DIAS_PROCURAMIENTO_RPTOS,
                PROC_MANUAL_AUTO,
                PROC_DT_ACTUALIZADO,
                PROC_MESES_UTILIZADOS_CALC,
                METODO_CALC_COBERT
            ) VALUES(
                V_ID_CAT_ALMACENES,
                V_ID_CAT_HERRAMIENTAS,
                'R',
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                1,
                1,
                SYSDATE(),
                SYSDATE(),
                SYSDATE(),
                SYSDATE(),
                0,
                0,
                1,
                SYSDATE(),
                0,
                0
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el nivel de inversion: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_NIVEL_INVERSION;
 --
 --Secuencia de kardex de herramientas
        BEGIN
            <<MAXIMO_KARDEX>>
            SELECT
                NVL(MAX(ID_KARDEX_RPTOS_HERR),
                0) + 1 INTO V_ID_KARDEX_RPTOS_HERR
            FROM
                MPZML_HER.KARDEX_RPTOS_HERR;
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo obtener la secuencia del kardex: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END MAXIMO_KARDEX;
 --
 -- Insertar Kardex repuestos herramientas
        BEGIN
            <<INSERTAR_KARDEX>>
            INSERT INTO MPZML_HER.KARDEX_RPTOS_HERR (
                ID_KARDEX_RPTOS_HERR,
                ID_CAT_RPTOS_HERR,
                ID_CAT_ALMACENES,
                EXISTENCIA_INICIAL,
                FECHA_INICIAL,
                CANTIDAD_ENTRADA,
                COSTOT_ENTRADA,
                CANTIDAD_SALIDA,
                COSTOT_SAL_PROM,
                COSTOT_SAL_PEPS,
                COSTOT_SAL_UEPS,
                EXISTENCIA_ACTUAL,
                FECHA_FINAL,
                REPUESTO_INICIALIZADO,
                DESC_LOCALIZACION,
                TIPO_CATALOGO
            ) VALUES(
                V_ID_KARDEX_RPTOS_HERR,
                V_ID_CAT_HERRAMIENTAS,
                V_ID_CAT_ALMACENES,
                0,
                SYSDATE(),
                0,
                P_COSTO,
                0,
                0,
                0,
                0,
                0,
                NULL,
                1,
                NULL,
                'R'
            );
        EXCEPTION
            WHEN OTHERS THEN
                P_MENSAJE := 'No se pudo insertar el kardex: '
                    || P_CODIGOITEM;
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_KARDEX;
    END SP_PROCESA_ARTICULO_HER;
END PK_BT01_ARTICULOS_JDE;