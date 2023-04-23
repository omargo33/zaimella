package com.bestech.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Clase para realizar solicitudes REST a un web services.
 *
 * @author Bestech [Ov]
 * @date 2023-04-09
 * 
 */
public class SolicitaRESTURL {

    private int timeOut;
    private int HTTPEstado = 0;

    private String ipProxy;
    private String puertoProxy;
    private String pathCertificado;
    private String claveCertificado;

    private String JSONConsulta;
    private String URLConsulta;
    private String JSONRespuesta;
    private String errorRespuesta;

    private final Date fechaInicio;
    private Date fechaFin;

    /**
     * Metodo para crear el objeto.
     *
     */
    public SolicitaRESTURL() {
        super();
        timeOut = 0;
        HTTPEstado = 0;
        JSONConsulta = "";
        URLConsulta = "";
        JSONRespuesta = "";
        ipProxy = "";
        puertoProxy = "";
        pathCertificado = "";
        claveCertificado = "";
        fechaInicio = new Date();
        fechaFin = new Date();
    }

    /**
     * Metodo para ejecutar una solicitud SOAP a un web services.
     *
     * Proceso el ingreso a sitios SSL. Inicializa mensajes de error Inicializa
     * datos para la conexion. Prepara a la conexion para enviar, recibir datos
     * y tiempos de espera en conexion y de escritura. Abre el puerto output y
     * envia el xml a ser consultado y cierra el puerto. Pregunta el estado de
     * la respuesta. Si la respuesta es HTTP_OK estado html 200 "respuesta ok
     * del servidor consultado" Lee el contendio del imputStream Caso contrario
     * Lee el contenido del imputStream de Error
     *
     * Consume el contenido del imputStream y pasa a un respuestaSOAP Cierra la
     * conexion al servidor.
     *
     * Si existio un error en el servidor lo notifica Devuelve el valor de la
     * consulta al web service.
     *
     * @throws Exception
     *
     */
    public void ejecutarConsultaWebService() throws Exception {
        String responseString = "";
        String respuesta = "";
        InputStream inputStream = null;

        eludirSSL();
        enviarPorProxy();
        agregarCertificadoSSL();

        HttpURLConnection connection = generarConexion();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setConnectTimeout(getTimeOut());
        connection.setReadTimeout(getTimeOut());

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
        outputStreamWriter.write(JSONConsulta);
        outputStreamWriter.close();

        HTTPEstado = ((HttpURLConnection) connection).getResponseCode();

        if (getHTTPEstado() != HttpURLConnection.HTTP_OK) {
            inputStream = ((HttpURLConnection) connection).getErrorStream();
        } else {
            inputStream = connection.getInputStream();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        while ((responseString = bufferedReader.readLine()) != null) {
            respuesta = respuesta + responseString;
        }

        bufferedReader.close();
        fechaFin = new Date();
        limpiarProxy();

        if (getHTTPEstado() != HttpURLConnection.HTTP_OK) {
            errorRespuesta = respuesta;
            throw new Exception(String.valueOf(getHTTPEstado()));
        }

        JSONRespuesta = respuesta;
    }

    /**
     * Metodo para crear una nueva conexion.
     *
     * Se la puede sobrecargar.
     *
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    public HttpURLConnection generarConexion() throws MalformedURLException, IOException {
        URL url = new URL(this.URLConsulta);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return connection;
    }

    /**
     * Metodo para hacer la solicitud por un proxy
     *
     */
    private void enviarPorProxy() {
        if (ipProxy != null && !ipProxy.isEmpty()) {
            System.setProperty("http.proxyHost", ipProxy);
            System.setProperty("https.proxyHost", ipProxy);
            if (puertoProxy != null && !puertoProxy.isEmpty()) {
                System.setProperty("http.proxyPort", puertoProxy);
                System.setProperty("https.proxyPort", puertoProxy);
            }
        }
    }

    /**
     * Metodo para agregar certificado SSL.
     *
     */
    private void agregarCertificadoSSL() {
        if (pathCertificado != null && !pathCertificado.isEmpty()) {
            System.setProperty("javax.net.ssl.trustStoore", pathCertificado);
            if (claveCertificado != null && !claveCertificado.isEmpty()) {
                System.setProperty("javax.net.ssl.keyStorePassword", claveCertificado);
            }
        }
    }

    /**
     * Metodo para limpiar el proxy.
     */
    private void limpiarProxy() {
        if (ipProxy != null && !ipProxy.isEmpty()) {
            System.clearProperty("http.proxyHost");
            System.clearProperty("https.proxyHost");
        }
    }

    /**
     * Metodo para no comprobar el SSL de un servidor.
     *
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws Exception
     */
    private void eludirSSL() throws Exception {
        TrustManager[] trustAllCerts;
        trustAllCerts = new TrustManager[]{new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }
        };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }

    /**
     * @return
     */
    public int getTimeOut() {
        return (timeOut == 0) ? 15000 : timeOut;
    }

    /**
     * @param timeOut
     */
    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return
     */
    public int getHTTPEstado() {
        return HTTPEstado;
    }

    /**
     * @param URLConsulta
     */
    public void setURLConsulta(String URLConsulta) {
        this.URLConsulta = URLConsulta;
    }

    /**
     *
     * @return
     */
    public String getURLConsulta() {
        return this.URLConsulta;
    }

    /**
     * @return
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @return
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @return the errorRespuesta
     */
    public String getErrorRespuesta() {
        return errorRespuesta;
    }

    public void setErrorRespuesta(String errorRespuesta) {
        this.errorRespuesta = errorRespuesta;
    }

    /**
     * @param JSONConsulta the JSONConsulta to set
     */
    public void setJSONConsulta(String JSONConsulta) {
        this.JSONConsulta = JSONConsulta;
    }

    /**
     * @return the JSONRespuesta
     */
    public String getJSONRespuesta() {
        //Log.escribir(JSONRespuesta.toString());
        return JSONRespuesta;
    }

    /**
     * @param ipProxy the ipProxy to set
     */
    public void setIpProxy(String ipProxy) {
        this.ipProxy = ipProxy;
    }

    /**
     * @param puertoProxy the puertoProxy to set
     */
    public void setPuertoProxy(String puertoProxy) {
        this.puertoProxy = puertoProxy;
    }

    /**
     * @param pathCertificado the pathCertificado to set
     */
    public void setPathCertificado(String pathCertificado) {
        this.pathCertificado = pathCertificado;
    }

    /**
     * @param claveCertificado the claveCertificado to set
     */
    public void setClaveCertificado(String claveCertificado) {
        this.claveCertificado = claveCertificado;
    }
}
