package com.bestech.articulos.http.request;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.dao.DataIntegrityViolationException;

import com.bestech.articulos.http.request.common.ComonControlador;
import com.bestech.articulos.jpa.model.Articulo;
import com.bestech.articulos.servicio.ArticuloServicios;
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
@RequestMapping(value = "/articulos")
public class ArticuloControlador extends ComonControlador {

    @Autowired
    private ArticuloServicios articuloServicios;

    @Autowired
    private ProcesosServicios procesosServicios;

    @GetMapping(value = "/")
    public List<Articulo> getArticulo() {
        return articuloServicios.findAll();
    }

    /**
     * Metodo para crear un Articulo.
     * 
     * @param Articulo
     * @return
     */
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public Articulo createArticulo(@Valid @RequestBody  Articulo articulo) {
        articulo = articuloServicios.insertarArticulo(articulo);
        
        articuloServicios.crearIniciarDetalle(articulo.getId());

        String respuesta = procesosServicios.procesarArticulo(articulo.getId());

        if (respuesta.compareTo("ok") != 0) {
            articuloServicios.crearErrorDetalle(articulo.getId(), respuesta);
            throw new DataIntegrityViolationException(respuesta);
        }

        articuloServicios.crearFinalizarDetalle(articulo.getId());

        return articulo;
    }

    
}
