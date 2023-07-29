
//TODO: poner el paquete
/**
 * Solicitud para el JSON
 {
    "modo": "H",
    "compania": "2",
    "tipoDocumentoCompra": "3",
    "numeroOrdenCompra": "4",
    "fecha": "2023-04-06 07:11:11",
    "codigoProveedor": "3",
    "nombreProveedor": "4",
    "moneda": "4",
    "bodegaRecepcion": "1",
    "centroCosto": "1",
    "motivo": "67",
    "linea": "88",
    "indiceItem": 8,
    "unidadMedida": "8",
    "categoria": "0001",
    "costoUnidad": 0,
    "usuario": "jdeuser",
    "cantidadRecibida": 12345678.12345,
}
 * 
 * @author omargo33@gmail.com
 * @since 2023-07-23
 * 
 */
public class Solicitud {



    public String generarJSON() {
        return "{\n" +
                "\"indice\": " + indice + ",\n" +
                "\"indiceSecundario\": \"" + indiceSecundario + "\",\n" +
                "\"identificacionFiscal\": \"" + identificacionFiscal + "\",\n" +
                "\"nombre\": \"" + nombre + "\",\n" +
                "\"tipo\": \"" + tipo + "\",\n" +
                "\"estado\": \"" + estado + "\"\n" +
                "}";
    }

    @Override
    public String toString() {
        return "Solicitud: \n" +
                "indice: " + indice + "\n" +
                "indiceSecundario: " + indiceSecundario + "\n" +
                "identificacionFiscal: " + identificacionFiscal + "\n" +
                "nombre: " + nombre + "\n" +
                "tipo: " + tipo + "\n" +
                "estado: " + estado + "\n";
    }
}
