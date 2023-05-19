package com.bestech.articulos.jpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * Mapeo JPA para la consulta de detalle de articulos SQL "SELECT id,
 * idarticulo, estado, descripcion, fecha FROM t_bt01_articulo_detalle;"
 * 
 * 
 * Con secuenca para el ID en SQ_BT01_ARTICULO_DETALLE
 * 
 * @author Bestech [Ov]
 * @since 2023-05-19
 * 
 */
@Entity
@Table(name = "t_bt01_articulo_detalle", schema = "data")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({ "usuarioFecha" })
public class ArticuloDetalle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BT01_ARTICULO_DETALLE")
    @SequenceGenerator(name = "SQ_BT01_ARTICULO_DETALLE", sequenceName = "SQ_BT01_ARTICULO_DETALLE", allocationSize = 1)
    @Column(name = "id")
    private Long id;


    @NotNull(message = "{not.null}")
    @Column(name = "idarticulo")
    private Long idArticulo;


    @NotNull(message = "{not.null}")
    @Column(name = "estado", length = 8)
    private String estado;


    @NotNull(message = "{not.null}")
    @Column(name = "descripcion", length = 512)
    private String descripcion;


    @NotNull(message = "{not.null}")
    @Column(name = "fecha", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha;

}
