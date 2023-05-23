package com.bestech.articulos.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestech.articulos.jpa.model.Articulo;
import com.bestech.articulos.jpa.model.ArticuloDetalle;
import com.bestech.articulos.jpa.queries.ArticuloDetalleRepositorio;
import com.bestech.articulos.jpa.queries.ArticuloRepositorio;

import java.util.Date;

import lombok.RequiredArgsConstructor;


/**
 * Servicio para el objeto RecepcionOrdenCompra
 * 
 * @author Bestech [Ov]
 * @created 2023-04-06
 * 
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ArticuloServicios {
    
    @Autowired
    private ArticuloRepositorio articuloRepositorio;

    @Autowired
    private ArticuloDetalleRepositorio articuloDetalleRepositorio;


    /**
     * Metodo para listar todos los articulos.
     * 
     * @return
     */
    public List<Articulo> findAll() {
        return articuloRepositorio.findAll();
    }

    /**
     * Inserta un registro en la tabla t_bt01_articulo.
     * 
     * @param articulo
     * @return
     */
    public Articulo insertarArticulo(Articulo articulo) {
        articulo.setUsuarioFecha(new Date());
        articuloRepositorio.save(articulo);
        return articulo;
    }

    /**
     * Crea un registro en la tabla t_bt01_articulo_detalle.
     * 
     * @param idPadre
     */
    public  void crearIniciarDetalle(long idPadre) {
        ArticuloDetalle articuloDetalle = new ArticuloDetalle();
        articuloDetalle.setIdArticulo(idPadre);
        articuloDetalle.setDescripcion("Se inicia el proceso de creacion de articulo");
        articuloDetalle.setEstado("Ok");
        articuloDetalle.setFecha(new Date());
        articuloDetalleRepositorio.save(articuloDetalle);
    }

    /**
     * Crea un registro en la tabla t_bt01_articulo_detalle para los mensajes de error.
     * 
     * 
     * @param idPadre
     * @param mensaje
     */
    public void crearErrorDetalle(long idPadre, String mensaje) {
        if(mensaje == null || mensaje.trim().length() == 0|| mensaje.isEmpty()){
            mensaje = "<No Aplica>";
        }

        if (mensaje.length() > 512){
            mensaje = mensaje.substring(0, 512);
        }

        ArticuloDetalle articuloDetalle = new ArticuloDetalle();
        articuloDetalle.setIdArticulo(idPadre);
        articuloDetalle.setDescripcion(mensaje);
        articuloDetalle.setEstado("Error");
        articuloDetalle.setFecha(new Date());
        articuloDetalleRepositorio.save(articuloDetalle);
    }

    /**
     * Crea un registro en la tabla t_bt01_articulo_detalle para los mensajes de error.
     * 
     * 
     * @param idPadre
     * @param mensaje
     */
    public void crearFinalizarDetalle(long idPadre) {
        ArticuloDetalle articuloDetalle = new ArticuloDetalle();
        articuloDetalle.setIdArticulo(idPadre);
        articuloDetalle.setDescripcion("Se finaliza el proceso de creacion de articulo");
        articuloDetalle.setEstado("Ok");
        articuloDetalle.setFecha(new Date());
        articuloDetalleRepositorio.save(articuloDetalle);
    }
}
