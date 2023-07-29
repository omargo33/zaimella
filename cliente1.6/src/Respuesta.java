//TODO: poner el paquete
/**
 * Respuesta para el JSON
 *
 * { 
    "id": 270,
        "usuario": "AdminMP123",
        "valorTexto": null,
        "valorNumero": 0,
        "modo": "R",
        "compania": "44",
        "tipoDocumentoCompra": "33",
        "numeroOrdenCompra": 0,
        "fecha": "2023-04-26 03:15:28",
        "codigoProveedor": 0,
        "nombreProveedor": "4",
        "moneda": "DL",
        "bodegaRecepcion": "REPUESTOS PRINCIPAL",
        "centroCosto": "16509",
        "motivo": "1",
        "linea": 0,
        "codigoItem": 0,
        "indiceItem": "8",
        "unidadMedida": "99",
        "categoria": "737006006",
        "cantidadRecibida": 33.1234,
        "costoUnidad": 170.5,
        "recepcionOrdenDetalle": [
            {
                "id": 8,
                "idRecepcionOrdenCompra": 270,
                "estado": "Ok",
                "descripcion": "Se inicia el proceso de recepcion de orden de compra",
                "fecha": "2023-04-26 03:15:29"
            },
            {
                "id": 9,
                "idRecepcionOrdenCompra": 270,
                "estado": "Error",
                "descripcion": "Error ORA-20001: No se pudo encontrar el usuario para: AdminMP123 al ejecutar el procedimiento almacenado ",
                "fecha": "2023-04-26 03:15:29"
            }
        ]
    }
 * 
 * @author omargo33@gmail.com
 * @since 2023-07-23
 */
public class Respuesta {

    private Long id;
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
    public Respuesta() {
        // Datos por default
        this.id = 0L;
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
    public Respuesta(long id, String usuario, String modo, String compania, String tipoDocumentoCompra,
            long numeroOrdenCompra,
            String fecha, long codigoProveedor, String nombreProveedor, String moneda, String bodegaRecepcion,
            String centroCosto, String motivo, long linea, long codigoItem, String indiceItem, String unidadMedida,
            String categoria, Double cantidadRecibida, Double costoUnidad) {
        this.id = id;
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


    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    /**
     * Metodo para leer el JSON
     * 
     * @param json
     */
    public void leerJson(String json) {
        json = json.replace("{", "");
        json = json.replace("}", "");
        json = json.replace(",", ", ");
        json = json.replace("\"", " ");
        String[] jsonSplit = json.split(",");
        for (int i = 0; i < jsonSplit.length; i++) {

            jsonSplit[i] = jsonSplit[i].replaceFirst(":", "#");
            String[] jsonSplit2 = jsonSplit[i].split("#");

            if (jsonSplit2[0].trim().compareTo("id") == 0) {
                this.id = Long.parseLong(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("usuario") == 0) {
                this.usuario = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("modo") == 0) {
                this.modo = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("compania") == 0) {
                this.compania = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("tipoDocumentoCompra") == 0) {
                this.tipoDocumentoCompra = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("numeroOrdenCompra") == 0) {
                this.numeroOrdenCompra = Long.parseLong(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("fecha") == 0) {
                this.fecha = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("codigoProveedor") == 0) {
                this.codigoProveedor = Long.parseLong(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("nombreProveedor") == 0) {
                this.nombreProveedor = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("moneda") == 0) {
                this.moneda = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("bodegaRecepcion") == 0) {
                this.bodegaRecepcion = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("centroCosto") == 0) {
                this.centroCosto = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("motivo") == 0) {
                this.motivo = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("linea") == 0) {
                this.linea = Long.parseLong(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("codigoItem") == 0) {
                this.codigoItem = Long.parseLong(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("indiceItem") == 0) {
                this.indiceItem = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("unidadMedida") == 0) {
                this.unidadMedida = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("categoria") == 0) {
                this.categoria = jsonSplit2[1].trim();
            }
            if (jsonSplit2[0].trim().compareTo("cantidadRecibida") == 0) {
                this.cantidadRecibida = Double.parseDouble(jsonSplit2[1].trim());
            }
            if (jsonSplit2[0].trim().compareTo("costoUnidad") == 0) {
                this.costoUnidad = Double.parseDouble(jsonSplit2[1].trim());
            }
        }
    }

    @Override
    public String toString() {
        return "Respuesta " + "id=" + id + ", usuario=" + usuario + ", modo=" + modo + ", compania=" + compania
                + ", tipoDocumentoCompra=" + tipoDocumentoCompra + ", numeroOrdenCompra=" + numeroOrdenCompra
                + ", fecha=" + fecha + ", codigoProveedor=" + codigoProveedor + ", nombreProveedor=" + nombreProveedor
                + ", moneda=" + moneda + ", bodegaRecepcion=" + bodegaRecepcion + ", centroCosto=" + centroCosto
                + ", motivo=" + motivo + ", linea=" + linea + ", codigoItem=" + codigoItem + ", indiceItem="
                + indiceItem + ", unidadMedida=" + unidadMedida + ", categoria=" + categoria + ", cantidadRecibida="
                + cantidadRecibida + ", costoUnidad=" + costoUnidad;
    }
}