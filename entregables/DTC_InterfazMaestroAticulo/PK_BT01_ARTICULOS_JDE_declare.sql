CREATE OR REPLACE PACKAGE "DATA"."PK_BT01_ARTICULOS_JDE" AS
 --
 -- autor:  Bestch
 -- fecha:  2023-04-17
 --
 -- Package header
 -- procesar orden de compra desde la lectura de la tabla T_BT01_RECEPCION_ORDEN_COMPRA desde el ID
    PROCEDURE SP_PROCESARORDENCOMPRA(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Insertar movimiento de inventario de repuestos
 -- de la tabla es select id_movimientos_inventario, id_cat_almacenes, fol_movimientos_inventario, id_sis_tipos_movimiento, id_cat_centros_costo, id_cat_divisas, id_usuarios, fecha_movimientos_inventario, ref_movimientos_inventario, origen_movimientos_inventario, destino_movimientos_inventario, tipo_cambio_movimiento_inv, monto_divisa_movimiento, monto_nacional_movimiento, escanc_movimientos_inventario from mpzml_rep.movimientos_inventario;
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
    );
 --
 -- Insertar movimiento de inventario de herramientas
 -- de la tabla es select id_movimientos_inventario, id_cat_almacenes, fol_movimientos_inventario, id_sis_tipos_movimiento, id_cat_centros_costo, id_cat_divisas, id_usuarios, fecha_movimientos_inventario, ref_movimientos_inventario, origen_movimientos_inventario, destino_movimientos_inventario, tipo_cambio_movimiento_inv, monto_divisa_movimiento, monto_nacional_movimiento, escanc_movimientos_inventario from mpzml_rep.movimientos_inventario;
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
    );
 --
 -- procesar orden el ingreso de articulo de la tabla T_BT01_ARTICULO desde el ID
    PROCEDURE SP_PROCESARARTICULO(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    );
 --
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
        P_MENSAJE OUT VARCHAR2,
        P_ID_REPUESTO OUT NUMBER
    );
 --
 -- Procesar los articulos para repuestos
    PROCEDURE SP_PROCESA_ARTICULO_HER(
        P_CODIGOITEM IN VARCHAR2,
        P_NOMBREITEM IN VARCHAR2,
        P_DESCRIPCIONITEM IN VARCHAR2,
        P_UNIDADMEDIDA IN VARCHAR2,
        P_CLASIFICACION IN VARCHAR2,
        P_CLASIFICACION2 IN VARCHAR2,
        P_ALMACEN IN VARCHAR2,
        P_COSTO IN NUMBER,
        P_MENSAJE OUT VARCHAR2,
        P_ID_HERRAMIENTA OUT NUMBER
    );
 --
 -- procesar orden el ingreso de almacen del articulo de la tabla T_BT01_ARTICULO desde el ID
    PROCEDURE SP_PROCESARALMACEN(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Procesar la creacion de almacenes para herramientas
PROCEDURE SP_PROCESA_ALMACEN_HER(
        P_CODIGOITEM IN VARCHAR2,
        P_ALMACEN IN VARCHAR2,
        P_COSTO IN NUMBER,
        P_MENSAJE OUT VARCHAR2,
        P_ID_HERRAMIENTA OUT NUMBER
    );
 --
 -- Procesar la creacion de almacenes para repuestos
    PROCEDURE SP_PROCESA_ALMACEN_REP(
        P_CODIGOITEM IN VARCHAR2,
        P_ALMACEN IN VARCHAR2,
        P_COSTO IN NUMBER,
        P_MENSAJE OUT VARCHAR2,
        P_ID_REPUESTO OUT NUMBER
    );
END PK_BT01_ARTICULOS_JDE;