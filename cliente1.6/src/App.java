import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase para consumir el servicio web de Libro de Direcciones.
 * 
 * Este es solo el ejemplo de ejecucion que puede ser usado en cualquier momento para testear el servicio rest.
 * 
 * @Author omargo33@gamil.com
 * @since 2023-07-23
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {

        Solicitud solicitud = new Solicitud();
        solicitud.setUsuario("AdminMP");
        solicitud.setModo("R");
        solicitud.setCompania("44");
        solicitud.setTipoDocumentoCompra("33");
        solicitud.setNumeroOrdenCompra(0);
        
        Date fecha= new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        
        solicitud.setFecha(formatoFecha.format(fecha));
        solicitud.setCodigoProveedor(0);
        solicitud.setNombreProveedor("4");
        solicitud.setMoneda("DL");
        solicitud.setBodegaRecepcion("REPUESTOS PRINCIPAL");
        solicitud.setCentroCosto("16509");
        solicitud.setMotivo("1");
        solicitud.setLinea(0);
        solicitud.setCodigoItem(0);
        solicitud.setIndiceItem("8");
        solicitud.setUnidadMedida("99");
        solicitud.setCategoria("737006006");
        solicitud.setCantidadRecibida(33.1234);
        solicitud.setCostoUnidad(12.90);
        

        ConsumoOrdenCompra consumo = new ConsumoOrdenCompra();
        consumo.setContexto("http://pruebas.zaimella.com:8081/GestionArticulos/v1/ordenes-compra/");
        consumo.setSolicitud(solicitud);

        System.out.println(solicitud.toString());

        if (consumo.load(20000)) {
            System.out.println("Ok:");
            System.out.println("Id: " + consumo.getRespuesta().getId());
            System.out.println("Modo: " + consumo.getRespuesta().getModo());
            System.out.println("Compania: " + consumo.getRespuesta().getCompania());
            System.out.println("TipoDocumentoCompra: " + consumo.getRespuesta().getTipoDocumentoCompra());
            System.out.println("NumeroOrdenCompra: " + consumo.getRespuesta().getNumeroOrdenCompra());
            System.out.println("Fecha: " + consumo.getRespuesta().getFecha());
            System.out.println("CodigoProveedor: " + consumo.getRespuesta().getCodigoProveedor());
            System.out.println("NombreProveedor: " + consumo.getRespuesta().getNombreProveedor());
            System.out.println("Moneda: " + consumo.getRespuesta().getMoneda());
            System.out.println("BodegaRecepcion: " + consumo.getRespuesta().getBodegaRecepcion());
            System.out.println("CentroCosto: " + consumo.getRespuesta().getCentroCosto());
            System.out.println("Motivo: " + consumo.getRespuesta().getMotivo());
            System.out.println("Linea: " + consumo.getRespuesta().getLinea());
            System.out.println("CodigoItem: " + consumo.getRespuesta().getCodigoItem());
            System.out.println("IndiceItem: " + consumo.getRespuesta().getIndiceItem());
            System.out.println("UnidadMedida: " + consumo.getRespuesta().getUnidadMedida());
            System.out.println("Categoria: " + consumo.getRespuesta().getCategoria());
            System.out.println("CantidadRecibida: " + consumo.getRespuesta().getCantidadRecibida());
            System.out.println("CostoUnidad: " + consumo.getRespuesta().getCostoUnidad());
            
        } else {
            System.out.println("Error:");
            System.out.println("Timestamp: " + consumo.getRespuestaError().getTimestamp());
            System.out.println("Status: " + consumo.getRespuestaError().getStatus());
            System.out.println("Error: " + consumo.getRespuestaError().getError());
            System.out.println("Path: " + consumo.getRespuestaError().getPath());
        }
    }
}
