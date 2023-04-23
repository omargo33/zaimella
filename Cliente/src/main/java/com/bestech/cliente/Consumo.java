package com.bestech.cliente;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.bestech.cliente.estructura.OrdenCompra;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Clase para realizar solicitudes REST a un web services.
 *
 * @auth or Bestech [Ov]
 * @created 2023-04-09
 * 
 */
@Slf4j
public class Consumo extends SolicitaRESTURL {

    private static final String END_POINT_ORDEN_COMPRA = "ordenes-compra/";

    private OrdenCompra ordenCompra;
    @Getter
    private OrdenCompra ordenCompraRespuesta;
    @Setter
    private String contexto;

    /**
     * Metodo para cargar el Json solicitado.
     * 
     * @param pathCertificado
     * @param claveCertificado
     * @param ipProxy
     * @param puertoProxy
     * @param urlContexto
     * @param timeOut
     * @return
     */
    public boolean load(String pathCertificado, String claveCertificado, String ipProxy, String puertoProxy,
            String urlContexto, String usuario, String clave, int timeOut) {

        setPathCertificado(pathCertificado);
        setClaveCertificado(claveCertificado);
        setIpProxy(ipProxy);
        setPuertoProxy(puertoProxy);
        setTimeOut(timeOut);
        setContexto(urlContexto);

        return ejecutarOrdenCompra();
    }

    /**
     * Metodo para sobrecargar la conexion.
     *
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    @Override
    public HttpURLConnection generarConexion() throws MalformedURLException, IOException {
        URL url = new URL(getURLConsulta());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        return connection;
    }

    /**
     * Metodo para ejecutar la consulta.
     *
     * Metodo para ejecutar el certificado.
     *
     * @return
     */
    private boolean ejecutarOrdenCompra() {
        setJSONConsulta(getOrdenCompra());
        setURLConsulta(this.contexto + END_POINT_ORDEN_COMPRA);
        try {
            ejecutarConsultaWebService();
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
        if (getHTTPEstado() == 200) {
            if (isRespuestaOrdenCompra(getJSONRespuesta())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para conocer
     *
     * @param json
     * @return
     */
    private boolean isRespuestaOrdenCompra(String json) {
        try {
            ordenCompraRespuesta = new OrdenCompra();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            ordenCompraRespuesta = objectMapper.readValue(json, OrdenCompra.class);
        } catch (JsonProcessingException ex) {
            log.error(ex.getMessage());
            return false;
        }
        return true;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    /**
     * Metodo para obtener el json de la orden de compra.
     * 
     * @return
     */
    public String getOrdenCompra() {
        String json = "";
        try {
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(this.ordenCompra);
        } catch (JsonProcessingException e) {
            log.error(e.toString());
        }
        return json;
    }
}