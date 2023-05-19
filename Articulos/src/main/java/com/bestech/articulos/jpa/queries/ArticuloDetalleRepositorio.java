package com.bestech.articulos.jpa.queries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestech.articulos.jpa.model.ArticuloDetalle;

/**
 * Query para el objeto ArticuloDetalle
 * 
 * @author Bestech [Ov]
 * @since 2023-05-20
 * 
 */
public interface ArticuloDetalleRepositorio extends JpaRepository<ArticuloDetalle, Long>{
    
}
