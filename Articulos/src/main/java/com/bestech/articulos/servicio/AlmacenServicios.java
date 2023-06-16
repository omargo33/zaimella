package com.bestech.articulos.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestech.articulos.jpa.model.Almacen;
import com.bestech.articulos.jpa.model.ArticuloDetalle;
import com.bestech.articulos.jpa.queries.AlmacenRepositorio;
import com.bestech.articulos.jpa.queries.ArticuloDetalleRepositorio;

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
public class AlmacenServicios {
    
    @Autowired
    private AlmacenRepositorio almacenRepositorio;

    @Autowired
    private ArticuloDetalleRepositorio articuloDetalleRepositorio;


    /**
     * Metodo para listar todos los articulos.
     * 
     * @return
     */
    public List<Almacen> findAll() {
        return almacenRepositorio.findAll();
    }
    

    /**
     * Metodo para buscar por indice del almacen
     * @param id
     * @return
     */
    public Almacen findById(Long id) {
        return almacenRepositorio.findById(id).get();
    }

    public List<Almacen> findByCodigoItem(String codigoItem) {
        return almacenRepositorio.findByCodigoItem(codigoItem);
    }

    /**
     * Inserta un registro en la tabla t_bt01_almacen.
     * 
     * @param almacen
     * @return
     */
    public Almacen insertarAlmacen(Almacen almacen) {
        almacen.setUsuarioFecha(new Date());
        almacenRepositorio.save(almacen);
        return almacen;
    }

    /**
     * Crea un registro en la tabla t_bt01_almacen_detalle.
     * 
     * @param idPadre
     */
    public  void crearIniciarDetalle(long idPadre) {
        ArticuloDetalle articuloDetalle = new ArticuloDetalle();
        articuloDetalle.setIdArticulo(idPadre);
        articuloDetalle.setDescripcion("Se inicia el proceso de creacion de almacen");
        articuloDetalle.setEstado("Ok");
        articuloDetalle.setFecha(new Date());
        articuloDetalleRepositorio.save(articuloDetalle);
    }

    /**
     * Crea un registro en la tabla t_bt01_almacen_detalle para los mensajes de error.
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
     * Crea un registro en la tabla t_bt01_almacen_detalle para los mensajes de error.
     * 
     * 
     * @param idPadre
     * @param mensaje
     */
    public void crearFinalizarDetalle(long idPadre) {
        ArticuloDetalle articuloDetalle = new ArticuloDetalle();
        articuloDetalle.setIdArticulo(idPadre);
        articuloDetalle.setDescripcion("Se finaliza el proceso de creacion de almacen");
        articuloDetalle.setEstado("Ok");
        articuloDetalle.setFecha(new Date());
        articuloDetalleRepositorio.save(articuloDetalle);
    }
}
