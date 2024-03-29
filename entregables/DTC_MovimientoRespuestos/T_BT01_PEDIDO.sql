-- "DATA".T_BT01_PEDIDO definition

CREATE TABLE "DATA"."T_BT01_PEDIDO" 
   (	"ID" NUMBER(38,0) NOT NULL ENABLE, 
	"USUARIOFECHA" TIMESTAMP (6) NOT NULL ENABLE, 
	"VALORTEXTO" VARCHAR2(256), 
	"VALORNUMERO" NUMBER(38,0), 
	"MODO" VARCHAR2(8), 
	"ID_MOVIMIENTOS_INVENTARIO" NUMBER, 
	"CREAR_ORDEN" VARCHAR2(1024), 
	"CONFIR_ORDEN" VARCHAR2(1024), 
	"ENVIO_CORREO" VARCHAR2(16) NOT NULL ENABLE, 
	"NO_ORDEN" VARCHAR2(16)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "APEX_DATA" ;

CREATE INDEX "DATA"."T_BT01_PEDIDO_ID_IDX" ON "DATA"."T_BT01_PEDIDO" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "APEX_DATA" ;

COMMENT ON TABLE "DATA".T_BT01_PEDIDO IS 'Tabla validar el uso de movimientos en repuestos y herramientas';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.ID IS 'Identificador secuencial único';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.USUARIOFECHA IS 'Fecha del usuario';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.VALORTEXTO IS 'Valor de pivot para elementos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.VALORNUMERO IS 'Valor de pivot para elmentos no esperados';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.MODO IS 'H: herramientas, R: respuestas';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.ID_MOVIMIENTOS_INVENTARIO IS 'Id de la tabla que ha sido movilizado';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.CREAR_ORDEN IS 'Estado del servicio de crear orden';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.CONFIR_ORDEN IS 'Estado del servicio de confirmar orden';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.ENVIO_CORREO IS 'Estado del servicio de envio de correo';
COMMENT ON COLUMN "DATA".T_BT01_PEDIDO.NO_ORDEN IS 'Numero de Orden de pedido';