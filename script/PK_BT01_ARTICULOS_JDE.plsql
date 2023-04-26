CREATE OR REPLACE PACKAGE BODY PK_BT01_ARTICULOS_JDE AS
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
    END SP_INSERTAR_HERRAMIENTA;
END PK_BT01_ARTICULOS_JDE;