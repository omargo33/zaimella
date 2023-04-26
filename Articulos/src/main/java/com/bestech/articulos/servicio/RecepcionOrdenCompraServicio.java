package com.bestech.articulos.servicio;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestech.articulos.jpa.model.RecepcionOrdenCompra;
import com.bestech.articulos.jpa.model.RecepcionOrdenDetalle;
import com.bestech.articulos.jpa.queries.RecepcionOrdenCompraRepositorio;
import com.bestech.articulos.jpa.queries.RecepcionOrdenDetalleRepositorio;

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
public class RecepcionOrdenCompraServicio {

    @Autowired
    private RecepcionOrdenCompraRepositorio recepcionOrdenCompraRepositorio;

    @Autowired
    private RecepcionOrdenDetalleRepositorio recepcionOrdenDetalleRepositorio;
    
    public List<RecepcionOrdenCompra> findAll() {
        return recepcionOrdenCompraRepositorio.findAll();
    }

    /**
     * Inserta un registro en la tabla t_bt01_recepcion_orden_compra
     * y procesar un storage procedure para ejecutar el proceso de recepcion de
     * orden de compra
     * 
     * @param recepcionOrdenCompra
     * @return
     */
    public RecepcionOrdenCompra insertarRecepcionOrdenCompra(RecepcionOrdenCompra recepcionOrdenCompra) {
        recepcionOrdenCompra.setUsuarioFecha(new Date());
        recepcionOrdenCompraRepositorio.save(recepcionOrdenCompra);
        return recepcionOrdenCompra;
    }

    /**
     * Crea un registro en la tabla t_bt01_recepcion_orden_detalle
     * 
     * @param idPadre
     */
    public void crearIniciarDetalle(long idPadre) {
        RecepcionOrdenDetalle recepcionOrdenDetalle = new RecepcionOrdenDetalle();
        recepcionOrdenDetalle.setIdRecepcionOrdenCompra(idPadre);
        recepcionOrdenDetalle.setDescripcion("Se inicia el proceso de recepcion de orden de compra");
        recepcionOrdenDetalle.setEstado("Ok");
        recepcionOrdenDetalle.setFecha(new Date());
        recepcionOrdenDetalleRepositorio.save(recepcionOrdenDetalle);
    }

    /**
     * Crea un registro en la tabla t_bt01_recepcion_orden_detalle
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
        RecepcionOrdenDetalle recepcionOrdenDetalle = new RecepcionOrdenDetalle();
        recepcionOrdenDetalle.setIdRecepcionOrdenCompra(idPadre);
        recepcionOrdenDetalle.setDescripcion(mensaje);
        recepcionOrdenDetalle.setEstado("Error");
        recepcionOrdenDetalle.setFecha(new Date());
        recepcionOrdenDetalleRepositorio.save(recepcionOrdenDetalle);
    }

    /**
     * Crea un registro en la tabla t_bt01_recepcion_orden_detalle
     * 
     * @param idPadre
     */
    public void crearFinalizarDetalle(long idPadre) {
        RecepcionOrdenDetalle recepcionOrdenDetalle = new RecepcionOrdenDetalle();
        recepcionOrdenDetalle.setIdRecepcionOrdenCompra(idPadre);
        recepcionOrdenDetalle.setDescripcion("Se finaliza el proceso de recepcion de orden de compra");
        recepcionOrdenDetalle.setEstado("Ok");
        recepcionOrdenDetalle.setFecha(new Date());
        recepcionOrdenDetalleRepositorio.save(recepcionOrdenDetalle);        
    }
}