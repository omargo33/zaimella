package com.bestech.cliente.estructura;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase que representa la estructura de la Orden de Compra.
 * 
 * @author Bestech [Ov]
 * @date 2023-04-09
 */
@Getter
@Setter
@ToString
@Data
public class OrdenCompra {

    private Long id;

    private String usuario;

    private Date usuarioFecha;

    private String valorTexto;

    private long valorNumero;

    private String modo;

    private String compania;

    private String tipoDocumentoCompra;

    private long numeroOrdenCompra;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fecha;

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

}
