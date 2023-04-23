CREATE OR REPLACE PACKAGE PK_BT01_ARTICULOS_JDE AS
 --
 -- Package header
 -- procesar orden de compra desde la lectura de la tabla T_BT01_RECEPCION_ORDEN_COMPRA desde el ID
    PROCEDURE SP_PROCESARORDENCOMPRA(
        P_ID IN NUMBER,
        P_MENSAJE OUT VARCHAR2
    );
 --
 -- Insertar movimiento de inventario de repuestos
 -- de la tabla es  select     id_movimientos_inventario,    id_cat_almacenes,    fol_movimientos_inventario,    id_sis_tipos_movimiento,    id_cat_centros_costo,    id_cat_divisas,    id_usuarios,    fecha_movimientos_inventario,    ref_movimientos_inventario,    origen_movimientos_inventario,    destino_movimientos_inventario,    tipo_cambio_movimiento_inv,    monto_divisa_movimiento,    monto_nacional_movimiento,    escanc_movimientos_inventario from mpzml_rep.movimientos_inventario;
    PROCEDURE SP_INSERTARMOVIMIENTOREPUESTO(
        P_BODEGARECEPCION IN VARCHAR2,
        P_CENTROCOSTO IN VARCHAR2,
        P_MONEDA IN VARCHAR2,
        P_USUARIO IN VARCHAR2,
        p_NUMEROORDENCOMPRA IN VARCHAR2,
        P_FECHA IN DATE,
        P_MOTIVO IN VARCHAR2,

        p_codigoproveedor in VARCHAR2,
        p_nombreproveedor in varchar2,

        P_CANTIDADRECIBIDA IN NUMBER,
        P_COSTOUNIDAD IN NUMBER,

        P_MENSAJE OUT VARCHAR2
    );
END PK_BT01_ARTICULOS_JDE;