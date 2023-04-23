package com.bestech.articulos.servicio;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestech.articulos.jpa.model.RecepcionOrdenCompra;
import com.bestech.articulos.jpa.queries.RecepcionOrdenCompraRepositorio;

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
}
