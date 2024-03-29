-- "DATA".T_BT01_ARTICULO definition

CREATE TABLE "DATA"."T_BT01_ARTICULO" 
   (	"ID" NUMBER(38,0) NOT NULL ENABLE, 
	"USUARIO" VARCHAR2(256) NOT NULL ENABLE, 
	"USUARIOFECHA" TIMESTAMP (6) NOT NULL ENABLE, 
	"VALORTEXTO" VARCHAR2(256), 
	"VALORNUMERO" NUMBER(38,0), 
	"MODO" VARCHAR2(8), 
	"CODIGOITEM" VARCHAR2(32), 
	"NOMBREITEM" VARCHAR2(256), 
	"DESCRIPCIONITEM" VARCHAR2(32), 
	"UNIDADMEDIDA" VARCHAR2(8), 
	"CLASIFICACION" VARCHAR2(8), 
	"CLASIFICACION2" VARCHAR2(8), 
	"ALMACEN" VARCHAR2(32), 
	"COSTO" NUMBER(16,4) NOT NULL ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "APEX_DATA" ;

COMMENT ON TABLE "DATA".T_BT01_ARTICULO IS 'Tabla para el ingreso y actualizacion de datos de articulos';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.ID IS 'Identificador secuencial único';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.USUARIO IS 'Usuario que ingresa el registro';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.USUARIOFECHA IS 'Fecha del usuario';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.VALORTEXTO IS 'Valor de pivot para elementos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.VALORNUMERO IS 'Valor de pivot para elmentos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.MODO IS 'H: herramientas, R: respuestas';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.CODIGOITEM IS 'LITM 2nd Item Number';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.NOMBREITEM IS 'Descripcion Item';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.DESCRIPCIONITEM IS 'Descripcion Item';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.UNIDADMEDIDA IS 'Abreviatura de la unidad de medida';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.CLASIFICACION IS 'Clasificacion repuesto herramienta';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.CLASIFICACION2 IS 'Clasificacion repuesto herramienta';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.ALMACEN IS 'Unidad de negocio almacen';
COMMENT ON COLUMN "DATA".T_BT01_ARTICULO.COSTO IS 'Costo';