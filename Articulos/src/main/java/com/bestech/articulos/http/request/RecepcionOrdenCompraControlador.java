package com.bestech.articulos.http.request;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestech.articulos.http.request.common.ComonControlador;
import com.bestech.articulos.jpa.model.RecepcionOrdenCompra;
import com.bestech.articulos.servicio.ProcesosServicios;
import com.bestech.articulos.servicio.RecepcionOrdenCompraServicio;

/**
 * Objeto para dar soporte a servicio REST de Ordenes de Compra.
 * 
 * @author Bestech [Ov]
 * @date 2020-09-11
 * 
 */
@RestController
@RequestMapping(value = "/ordenes-compra")
public class RecepcionOrdenCompraControlador extends ComonControlador {

    @Autowired
    private RecepcionOrdenCompraServicio recepcionOrdenCompraServicio;

    @Autowired
    private ProcesosServicios procesosServicios;

    @GetMapping(value = "/")
    public List<RecepcionOrdenCompra> getRecepcionOrdenCompra() {
        return recepcionOrdenCompraServicio.findAll();
    }

    /**
     * Metodo para crear un Menu.
     * 
     * @param Menu
     * @return
     */
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public RecepcionOrdenCompra createMonitor(@Valid @RequestBody RecepcionOrdenCompra recepcionOrdenCompra,
            HttpServletRequest request) {
        recepcionOrdenCompra = recepcionOrdenCompraServicio.insertarRecepcionOrdenCompra(recepcionOrdenCompra);

        recepcionOrdenCompraServicio.crearIniciarDetalle(recepcionOrdenCompra.getId());

        String respuesta = procesosServicios.procesarRecepcionOrdenCompra(recepcionOrdenCompra.getId());

        if (respuesta.compareTo("ok") != 0) {
            recepcionOrdenCompraServicio.crearErrorDetalle(recepcionOrdenCompra.getId(), respuesta);
            throw new DataIntegrityViolationException(respuesta);
        }

        recepcionOrdenCompraServicio.crearFinalizarDetalle(recepcionOrdenCompra.getId());
        return recepcionOrdenCompra;
    }

}