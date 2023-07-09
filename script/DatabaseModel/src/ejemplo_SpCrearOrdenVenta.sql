DECLARE
    p_unidadnegocio          VARCHAR2(200);
    p_codigomoneda           VARCHAR2(200);
    p_fechaorden             VARCHAR2(200);
    p_fechapedido            VARCHAR2(200);
    p_itemid                 VARCHAR2(200);
    p_catidadorden           NUMBER;
    p_enviarid               VARCHAR2(200);
    p_tipoprocesamiento      VARCHAR2(200);
    p_versionprocesamiento   VARCHAR2(200);
    p_vendidoid              VARCHAR2(200);
    p_fechaordenout          VARCHAR2(200);
    p_itemcatalogo           VARCHAR2(200);
    p_itemproducto           VARCHAR2(200);
    p_enviartaxid            VARCHAR2(200);
    p_documentcompany        VARCHAR2(200);
    p_documentnumero         VARCHAR2(200);
    p_documenttipo           VARCHAR2(200);
    p_enviardireccion        VARCHAR2(200);
    p_enviarciudad           VARCHAR2(200);
    p_destinatario           VARCHAR2(200);
    p_mensaje                VARCHAR2(200);
BEGIN
    p_unidadnegocio := '17007';
    p_codigomoneda := 'USD';
    p_fechaorden := '2023-05-19';
    p_fechapedido := '2023-05-19';
    p_itemid := '869030';
    p_catidadorden := 2;
    p_enviarid := '16505';
    p_tipoprocesamiento := 'A';
    p_versionprocesamiento := 'ERP0004';
    p_vendidoid := '11347';
    p_fechaordenout := NULL;
    p_itemcatalogo := NULL;
    p_itemproducto := NULL;
    p_enviartaxid := NULL;
    p_documentcompany := NULL;
    p_documentnumero := NULL;
    p_documenttipo := NULL;
    p_enviardireccion := NULL;
    p_enviarciudad := NULL;
    p_destinatario := NULL;
    p_mensaje := NULL;
    pk_jde_pedidos_ws.sp_crear_orden_venta(
        p_unidadnegocio          => p_unidadnegocio,
        p_codigomoneda           => p_codigomoneda,
        p_fechaorden             => p_fechaorden,
        p_fechapedido            => p_fechapedido,
        p_itemid                 => p_itemid,
        p_catidadorden           => p_catidadorden,
        p_enviarid               => p_enviarid,
        p_tipoprocesamiento      => p_tipoprocesamiento,
        p_versionprocesamiento   => p_versionprocesamiento,
        p_vendidoid              => p_vendidoid,
        p_fechaordenout          => p_fechaordenout,
        p_itemcatalogo           => p_itemcatalogo,
        p_itemproducto           => p_itemproducto,
        p_enviartaxid            => p_enviartaxid,
        p_documentcompany        => p_documentcompany,
        p_documentnumero         => p_documentnumero,
        p_documenttipo           => p_documenttipo,
        p_enviardireccion        => p_enviardireccion,
        p_enviarciudad           => p_enviarciudad,
        p_destinatario           => p_destinatario,
        p_mensaje                => p_mensaje
    );

    dbms_output.put_line('p_fechaordenout ' || p_fechaordenout);
    dbms_output.put_line('p_itemcatalogo ' || p_itemcatalogo);
    dbms_output.put_line('p_itemproducto ' || p_itemproducto);
    dbms_output.put_line('p_enviartaxid ' || p_enviartaxid);
    dbms_output.put_line('p_documentcompany ' || p_documentcompany);
    dbms_output.put_line('p_documentnumero ' || p_documentnumero);
    dbms_output.put_line('p_documenttipo ' || p_documenttipo);
    dbms_output.put_line('p_enviardireccion ' || p_enviardireccion);
    dbms_output.put_line(' p_enviarciudad ' || p_enviarciudad);
    dbms_output.put_line('p_destinatario ' || p_destinatario);
    dbms_output.put_line('mensaje ' || p_mensaje);
END;


DECLARE
    p_documentoid       VARCHAR2(200);
    p_documentonumero   VARCHAR2(200);
    p_documentotipo     VARCHAR2(200);
    p_item              VARCHAR2(200);
    p_event_point       VARCHAR2(200);
    p_mensaje           VARCHAR2(200);
BEGIN
    p_documentoid := NULL;
    p_documentonumero := NULL;
    p_documentotipo := NULL;
    p_item := NULL;
    p_event_point := NULL;
    p_mensaje := NULL;
    pk_jde_pedidos_ws.sp_confirma_orden_venta(
        p_documentoid       => p_documentoid,
        p_documentonumero   => p_documentonumero,
        p_documentotipo     => p_documentotipo,
        p_item              => p_item,
        p_event_point       => p_event_point,
        p_mensaje           => p_mensaje
    );

    dbms_output.put_line(' p_item ' || p_item);
    dbms_output.put_line('p_event_point ' || p_event_point);
    dbms_output.put_line('mensaje ' || p_mensaje);
END;