package com.bestech.articulos.jpa.queries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bestech.articulos.jpa.model.Almacen;

/**
 * Query para el objeto Almacen
 * 
 * @author Bestech [Ov]
 * @created 2023-05-18
 * 
 */
public interface AlmacenRepositorio extends JpaRepository<Almacen, Long> {

    /**
     * Buscar lista por codigoItem y orderar por id con query nativo.
     */
    @Query(value = "SELECT id, usuario, usuariofecha, valortexto, valornumero, modo, codigoitem, almacen FROM t_bt01_articulo WHERE codigoitem = ?1 ORDER BY id DESC ", nativeQuery = true)
    public List<Almacen> findByCodigoItem(String codigoItem);

}
