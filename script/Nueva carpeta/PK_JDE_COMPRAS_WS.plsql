CREATE OR REPLACE package "DATA".pk_jde_compras_ws as
	/*
		Paquete para llamar lo web service estandar de JDE ProcurementManager, PurchaseOrderReceiptManager
		@fecha 21/04/2021 
		@author jbalcazar
	*/

	g_trama						clob;
	g_xml						xmltype;
	g_numero					number;
	g_tipo						varchar(2);
	g_modulo					varchar(4) :='JDE';
	g_resultado					clob;
	g_contador					number;
	g_url						varchar(500);
	g_usuario					varchar(100);
	g_contrasena				varchar(100);
	g_recepcionorden			varchar(500) := 'processPurchaseOrderReceipt';
	g_crearorden				varchar(500) := 'processPurchaseOrder';
	g_orderreceipt_ws			varchar(500) := 'PurchaseOrderReceiptManager';
	g_orderreceipt_bssv			varchar(500) := 'http://oracle.e1.bssv.JP43A000/';
	g_ordencrear_bssv			varchar(500) := 'http://oracle.e1.bssv.JP430000/';
	g_ordencancelar_bssv		varchar(500) := 'http://oracle.e1.bssv.JP430000/';
	g_orderreceipt_process_r	varchar(500) := 'processPurchaseOrderReceiptRequest';

	v_log_app	varchar2(100);		--- Nombre de la aplicacion/procedimiento
	v_log_ern 	number;				--- Número del error lanzado
	v_log_men 	varchar2(1000);		--- Mensaje de error lanzado
    v_log_dsc 	varchar2(1000);		--- Mensaje de error lanzado
	v_log_rct 	number;				--- Número de lineas
	v_log_usr	varchar2(100);
	v_log_msg	varchar2(1000);
	v_log_dps	varchar2(1000);

	function f_extraevalor_tag(
		p_cadena in clob
		, p_etiqueta in varchar2
	) return varchar2;

	procedure sp_recepcionordenv2(
		p_version in varchar
		, p_numero number
		, p_tipo varchar
		, p_linea number
		, p_cantidad number
		, p_compania varchar
	);

	procedure sp_recepcionorden(p_usuario in varchar);

	procedure sp_recepcionorden_cab_xml(
		p_version in varchar default null
		, p_numero in number
		, p_tipo in varchar
		, p_compania in varchar
	);

	procedure sp_recepcionorden_det_xml(
		p_numero in number
		, p_tipo in varchar
		, p_linea in number default null
		, p_valor in number default null
		, p_bodega in varchar default null
		, p_localidad in varchar default null
		, p_lote in varchar default null
		, p_lotefecha in date default null
		, p_compania in varchar
	);

	procedure sp_crearorden;

	procedure sp_cancelaorden;

	procedure sp_cancelaorden_cab(
		p_compania varchar
		, p_documento number
		, p_tipodocumento varchar
	);

	procedure sp_cancelaorden_det(
		p_compania varchar
		, p_bodega varchar
		, p_codigocorto number
		, p_lineaorden number
	);

	procedure sp_crearorden_cab(
		p_compania varchar
		, p_version varchar
		, P_BODEGA VARCHAR
		, p_comprador number
		, p_envia number
		, p_proveedor number
		, p_fechaprometida date
	);

	procedure sp_crearorden_det(
		p_compania varchar
		, p_codigocorto number
		, p_cantidad number
		, p_um varchar
		, p_preciounitario number
		, p_reqnumero number default null
		, p_reqtipo varchar default null
		, p_usuario varchar default null
		, p_linea number default null
	);
end pk_jde_compras_ws;