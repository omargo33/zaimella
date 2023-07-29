
//TODO: poner el paquete
/**
 * Solicitud para el JSON
 * {
 * "usuario": "string",
 * "modo": "string",
 * "compania": "string",
 * "tipoDocumentoCompra": "string",
 * "numeroOrdenCompra": 0,
 * "fecha": "2023-07-23T21:30:31.210Z",
 * "codigoProveedor": 0,
 * "nombreProveedor": "string",
 * "moneda": "string",
 * "bodegaRecepcion": "string",
 * "centroCosto": "string",
 * "motivo": "string",
 * "linea": 0,
 * "codigoItem": 0,
 * "indiceItem": "string",
 * "unidadMedida": "string",
 * "categoria": "string",
 * "cantidadRecibida": 0,
 * "costoUnidad": 0
 * }
 * 
 * 
 * @author omargo33@gmail.com
 * @since 2023-07-23
 * 
 */
public class Solicitud {
    // private Long id;
    private String usuario;
    private String modo;
    private String compania;
    private String tipoDocumentoCompra;
    private long numeroOrdenCompra;
    private String fecha;
    private long codigoProveedor;
    private String nombreProveedor;
    private String moneda;
    private String bodegaRecepcion;
    private String centroCosto;
    private String motivo;
    private long linea;
    private long codigoItem;
    private String indiceItem;
    private String unidadMedida;
    private String categoria;
    private Double cantidadRecibida;
    private Double costoUnidad;

    /**
     * Metodo para crear la clase
     */
    public Solicitud() {
        // Datos por default
        this.usuario = "";
        this.modo = "";
        this.compania = "";
        this.tipoDocumentoCompra = "";
        this.numeroOrdenCompra = 0;
        this.fecha = "";
        this.codigoProveedor = 0;
        this.nombreProveedor = "";
        this.moneda = "";
        this.bodegaRecepcion = "";
        this.centroCosto = "";
        this.motivo = "";
        this.linea = 0;
        this.codigoItem = 0;
        this.indiceItem = "";
        this.unidadMedida = "";
        this.categoria = "";
        this.cantidadRecibida = 0.01;
        this.costoUnidad = 0.01;

    }

    /**
     * Metodo para crear la clase con parametros
     * 
     * @return
     */
    public Solicitud(String usuario, String modo, String compania, String tipoDocumentoCompra, long numeroOrdenCompra,
            String fecha, long codigoProveedor, String nombreProveedor, String moneda, String bodegaRecepcion,
            String centroCosto, String motivo, long linea, long codigoItem, String indiceItem, String unidadMedida,
            String categoria, Double cantidadRecibida, Double costoUnidad) {
        this.usuario = usuario;
        this.modo = modo;
        this.compania = compania;
        this.tipoDocumentoCompra = tipoDocumentoCompra;
        this.numeroOrdenCompra = numeroOrdenCompra;
        this.fecha = fecha;
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.moneda = moneda;
        this.bodegaRecepcion = bodegaRecepcion;
        this.centroCosto = centroCosto;
        this.motivo = motivo;
        this.linea = linea;
        this.codigoItem = codigoItem;
        this.indiceItem = indiceItem;
        this.unidadMedida = unidadMedida;
        this.categoria = categoria;
        this.cantidadRecibida = cantidadRecibida;
        this.costoUnidad = costoUnidad;
    }

    //Getter and Setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getTipoDocumentoCompra() {
        return tipoDocumentoCompra;
    }

    public void setTipoDocumentoCompra(String tipoDocumentoCompra) {
        this.tipoDocumentoCompra = tipoDocumentoCompra;
    }

    public long getNumeroOrdenCompra() {
        return numeroOrdenCompra;
    }

    public void setNumeroOrdenCompra(long numeroOrdenCompra) {
        this.numeroOrdenCompra = numeroOrdenCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(long codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getBodegaRecepcion() {
        return bodegaRecepcion;
    }

    public void setBodegaRecepcion(String bodegaRecepcion) {
        this.bodegaRecepcion = bodegaRecepcion;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public long getLinea() {
        return linea;
    }

    public void setLinea(long linea) {
        this.linea = linea;
    }

    public long getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(long codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getIndiceItem() {
        return indiceItem;
    }

    public void setIndiceItem(String indiceItem) {
        this.indiceItem = indiceItem;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(Double cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public Double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(Double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public String generarJSON() {
        return "{" +
                "\"usuario\": \"" + usuario + "\"," +
                "\"modo\": \"" + modo + "\"," +
                "\"compania\": \"" + compania + "\"," +
                "\"tipoDocumentoCompra\": \"" + tipoDocumentoCompra + "\"," +
                "\"numeroOrdenCompra\": " + numeroOrdenCompra + "," +
                "\"fecha\": \"" + fecha + "\"," +
                "\"codigoProveedor\": " + codigoProveedor + "," +
                "\"nombreProveedor\": \"" + nombreProveedor + "\"," +
                "\"moneda\": \"" + moneda + "\"," +
                "\"bodegaRecepcion\": \"" + bodegaRecepcion + "\"," +
                "\"centroCosto\": \"" + centroCosto + "\"," +
                "\"motivo\": \"" + motivo + "\"," +
                "\"linea\": " + linea + "," +
                "\"codigoItem\": " + codigoItem + "," +
                "\"indiceItem\": \"" + indiceItem + "\"," +
                "\"unidadMedida\": \"" + unidadMedida + "\"," +
                "\"categoria\": \"" + categoria + "\"," +
                "\"cantidadRecibida\": " + cantidadRecibida + "," +
                "\"costoUnidad\": " + costoUnidad +
                "}";
    }

    @Override
    public String toString() {
        return "Solicitud " + "usuario=" + usuario + ", modo=" + modo + ", compania=" + compania
                + ", tipoDocumentoCompra=" + tipoDocumentoCompra + ", numeroOrdenCompra=" + numeroOrdenCompra
                + ", fecha=" + fecha + ", codigoProveedor=" + codigoProveedor + ", nombreProveedor=" + nombreProveedor
                + ", moneda=" + moneda + ", bodegaRecepcion=" + bodegaRecepcion + ", centroCosto=" + centroCosto
                + ", motivo=" + motivo + ", linea=" + linea + ", codigoItem=" + codigoItem + ", indiceItem="
                + indiceItem + ", unidadMedida=" + unidadMedida + ", categoria=" + categoria + ", cantidadRecibida="
                + cantidadRecibida + ", costoUnidad=" + costoUnidad;
    }

}
