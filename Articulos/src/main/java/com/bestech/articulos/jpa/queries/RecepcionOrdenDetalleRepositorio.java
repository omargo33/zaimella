package com.bestech.articulos.jpa.queries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestech.articulos.jpa.model.RecepcionOrdenDetalle;

/**
 * Query para el objeto RecepcionOrdenCompra
 * 
 * @author Bestech [Ov]
 * @since 2023-04-11
 * 
 */
public interface RecepcionOrdenDetalleRepositorio extends JpaRepository<RecepcionOrdenDetalle, Long>{
    
}
