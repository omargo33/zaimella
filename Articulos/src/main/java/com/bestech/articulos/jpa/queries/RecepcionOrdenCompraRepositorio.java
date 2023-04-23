package com.bestech.articulos.jpa.queries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestech.articulos.jpa.model.RecepcionOrdenCompra;

/**
 * Query para el objeto RecepcionOrdenCompra
 * 
 * @author Bestech [Ov]
 * @created 2023-04-11
 * 
 */
public interface RecepcionOrdenCompraRepositorio extends JpaRepository<RecepcionOrdenCompra, Long>{
    
}
