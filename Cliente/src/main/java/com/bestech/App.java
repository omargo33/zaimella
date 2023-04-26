package com.bestech;

import java.util.Date;

import com.bestech.cliente.Consumo;
import com.bestech.cliente.estructura.OrdenCompra;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {

    private static String urlStringPrueba =  "http://pruebas.zaimella.com:8081/bestech/v1/";
    //private static String urlStringPrueba = "http://localhost:8080/bestech/v1/";

    public static void main(String[] args) {
        boolean respuesta = false;

        Consumo consumo = new Consumo();
        OrdenCompra ordenCompra = new OrdenCompra();
        ordenCompra.setUsuario("AdminMP");
        ordenCompra.setNombreProveedor("4");
        ordenCompra.setCentroCosto("16509");
        ordenCompra.setMotivo("1");
        ordenCompra.setIndiceItem("8");
        ordenCompra.setTipoDocumentoCompra("33");
        ordenCompra.setCompania("44");
        ordenCompra.setUnidadMedida("99");
        ordenCompra.setMoneda("DL");
        ordenCompra.setBodegaRecepcion("REPUESTOS PRINCIPAL");
        ordenCompra.setCantidadRecibida(33.1234);
        ordenCompra.setModo("R");
        ordenCompra.setFecha(new Date());
        ordenCompra.setCostoUnidad(170.50);
        ordenCompra.setCategoria("737006006");

        consumo.setOrdenCompra(ordenCompra);

        respuesta = consumo.load(null,
                null,
                null, null,
                urlStringPrueba, null, null, 30000);

        if (respuesta) {
            log.info(String.valueOf(consumo.getOrdenCompraRespuesta().getId()));
            log.info(consumo.getOrdenCompraRespuesta().toString());
        } else {
            log.error(consumo.getErrorRespuesta());
        }
    }
}
