-- "DATA".T_BT01_RECEPCION_ORDEN_COMPRA definition

CREATE TABLE "DATA"."T_BT01_RECEPCION_ORDEN_COMPRA" 
   (	"ID" NUMBER(38,0) NOT NULL ENABLE, 
	"USUARIO" VARCHAR2(256) NOT NULL ENABLE, 
	"USUARIOFECHA" TIMESTAMP (6) NOT NULL ENABLE, 
	"VALORTEXTO" VARCHAR2(256), 
	"VALORNUMERO" NUMBER(12,0), 
	"MODO" VARCHAR2(8), 
	"COMPANIA" VARCHAR2(8), 
	"TIPODOCUMENTOCOMPRA" VARCHAR2(8), 
	"NUMEROORDENCOMPRA" NUMBER(38,0), 
	"FECHA" TIMESTAMP (6), 
	"CODIGOPROVEEDOR" NUMBER(8,0), 
	"NOMBREPROVEEDOR" VARCHAR2(256), 
	"MONEDA" VARCHAR2(8), 
	"BODEGARECEPCION" VARCHAR2(32), 
	"CENTROCOSTO" VARCHAR2(32), 
	"MOTIVO" VARCHAR2(64), 
	"LINEA" NUMBER(8,0), 
	"CODIGOITEM" NUMBER(8,0), 
	"INDICEITEM" VARCHAR2(32), 
	"UNIDADMEDIDA" VARCHAR2(8), 
	"CANTIDADRECIBIDA" NUMBER(12,4), 
	"COSTOUNIDAD" NUMBER(12,4), 
	"CATEGORIA" VARCHAR2(32), 
	 CONSTRAINT "PK_BT01_RECEPCION_ORDEN" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "APEX_DATA"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA_LAYER" ;

CREATE UNIQUE INDEX "DATA"."PK_BT01_RECEPCION_ORDEN" ON "DATA"."T_BT01_RECEPCION_ORDEN_COMPRA" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "APEX_DATA" ;

COMMENT ON TABLE "DATA".T_BT01_RECEPCION_ORDEN_COMPRA IS 'Recepcion de la orden de compra desde JDE.
@author bestech';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.ID IS 'Identificador secuencial único';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.USUARIO IS 'Usuario que ingresa el registro';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.USUARIOFECHA IS 'Fecha del usuario';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.VALORTEXTO IS 'Valor de pivot para elementos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.VALORNUMERO IS 'Valor de pivot para elmentos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.MODO IS 'H: herramientas, R: respuestas';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.COMPANIA IS 'Identificacion de la compania';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.TIPODOCUMENTOCOMPRA IS 'Tipo documento compra';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.NUMEROORDENCOMPRA IS 'Numero de orden de compra JDE';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.FECHA IS 'Fecha del registro';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.CODIGOPROVEEDOR IS 'Codigo del proveedor';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.NOMBREPROVEEDOR IS 'Nombre o descripcion del proveedor';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.MONEDA IS 'Abreviatura de la moneda';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.BODEGARECEPCION IS 'Identificacion de la bodega de recepcion';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.CENTROCOSTO IS 'Identificacion de la central de costos';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.MOTIVO IS 'Motivo';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.LINEA IS 'Linea';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.CODIGOITEM IS 'Codigo del Item';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.INDICEITEM IS 'Indice del item de forma de codigo texto';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.UNIDADMEDIDA IS 'Abreviatura de la unidad de medida';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.CANTIDADRECIBIDA IS 'Cantidad de items ingresado';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.COSTOUNIDAD IS 'Costo unitario';
COMMENT ON COLUMN "DATA".T_BT01_RECEPCION_ORDEN_COMPRA.CATEGORIA IS 'Categoria de la herramienta y repuesto';