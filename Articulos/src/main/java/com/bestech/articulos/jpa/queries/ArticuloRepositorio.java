package com.bestech.articulos.jpa.queries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bestech.articulos.jpa.model.Articulo;

/**
 * Query para el objeto Articulo
 * 
 * @author Bestech [Ov]
 * @created 2023-05-18
 * 
 */
public interface ArticuloRepositorio extends JpaRepository<Articulo, Long>{
    
}
