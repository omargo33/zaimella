CREATE OR REPLACE PACKAGE BODY PK_BT01_ARTICULOS_JDE AS
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
        V_VALORTEXTO          VARCHAR2(256);
        V_VALORNUMERO         NUMBER;
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
        V_CANTIDADRECIBIDA    NUMBER;
        V_COSTOUNIDAD         NUMBER;
    BEGIN
        BEGIN
            <<BUSCAR_INFO_WS>>
 --
 -- consulta encabezado e realiza into a variables de la tabla
            SELECT
                ID,
                USUARIO,
                USUARIOFECHA,
                VALORTEXTO,
                VALORNUMERO,
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
                COSTOUNIDAD INTO V_ID,
                V_USUARIO,
                V_USUARIOFECHA,
                V_VALORTEXTO,
                V_VALORNUMERO,
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
                V_COSTOUNIDAD
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
            SP_INSERTARMOVIMIENTOREPUESTO( V_BODEGARECEPCION, V_CENTROCOSTO, V_MONEDA, V_USUARIO, V_NUMEROORDENCOMPRA, V_FECHA, V_MOTIVO, V_CODIGOPROVEEDOR, V_NOMBREPROVEEDOR, V_CANTIDADRECIBIDA, V_COSTOUNIDAD, P_MENSAJE => P_MENSAJE );
            IF (P_MENSAJE IS NOT NULL) THEN
                RETURN;
            END IF;
        END INSERTAR_MOVIMIENTO;
    END SP_PROCESARORDENCOMPRA; --
 --
 -- Proceso para insertar el movimiento de inventario de repuestos
    PROCEDURE SP_INSERTARMOVIMIENTOREPUESTO(
        P_BODEGARECEPCION IN VARCHAR2,
        P_CENTROCOSTO IN VARCHAR2,
        P_MONEDA IN VARCHAR2,
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
        V_IDCATALMACENES       NUMBER;
        V_IDCATCENTROCOSTO     NUMBER;
        V_IDCATDIVISAS         NUMBER;
        V_IDUSUARIOS           NUMBER;
        V_TIPOCAMBIOMOVIMIENTO NUMBER;
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
                0,
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
                P_MENSAJE := 'No se pudo insertar el movimiento: ';
                RAISE_APPLICATION_ERROR(-20001, P_MENSAJE);
                RETURN;
        END INSERTAR_MOVIMIENTO;
    END SP_INSERTARMOVIMIENTOREPUESTO;
END PK_BT01_ARTICULOS_JDE;