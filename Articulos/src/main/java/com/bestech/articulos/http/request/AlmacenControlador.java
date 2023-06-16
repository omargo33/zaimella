package com.bestech.articulos.http.request;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestech.articulos.jpa.model.Almacen;
import com.bestech.articulos.servicio.AlmacenServicios;
import com.bestech.articulos.servicio.ProcesosServicios;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * Objeto para dar soporte a servicio REST de Articulos.
 * 
 * @author Bestech [Ov]
 * @date 2023-05-22
 * 
 */
@RestController
@RequestMapping(value = "/almacenes")
public class AlmacenControlador {
    
  @Autowired
    private AlmacenServicios almacenServicios;

    @Autowired
    private ProcesosServicios procesosServicios;

    /**
     * Metodo para crear un almacen.
     * 
     * @param almacen
     * @return
     */
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Almacen createAlmacen(@Valid @RequestBody  Almacen almacen) {
        almacen = almacenServicios.insertarAlmacen(almacen);
        
        almacenServicios.crearIniciarDetalle(almacen.getId());

        String respuesta = procesosServicios.procesarAlmacen(almacen.getId());

        if (respuesta.compareTo("ok") != 0) {
            almacenServicios.crearErrorDetalle(almacen.getId(), respuesta);
            throw new DataIntegrityViolationException(respuesta);
        }

        almacenServicios.crearFinalizarDetalle(almacen.getId());

        Long id=almacen.getId();

        almacen = almacenServicios.findById(id);

        return almacen;
    }    
}
