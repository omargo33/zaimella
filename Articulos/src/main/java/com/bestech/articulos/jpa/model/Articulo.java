package com.bestech.articulos.jpa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
 * Mapeo JPA para la consulta de recepcion de orden de compra con el SQL "SELECT
 * id, usuario, usuariofecha, valortexto, valornumero, modo, codigoitem,
 * nombreitem, descripcionitem, unidadmedida, clasificacion, clasificacion2,
 * almacen, costo FROM t_bt01_articulo;"
 * 
 * 
 * Con secuenca para el ID en SQ_BT01_ARTICULO
 * 
 * @author Bestech [Ov]
 * @since 2023-05-19
 * 
 */
@Entity
@Table(name = "t_bt01_articulo", schema = "data")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"usuarioFecha" })
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BT01_ARTICULO")
    @SequenceGenerator(name = "SQ_BT01_ARTICULO", sequenceName = "SQ_BT01_ARTICULO", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "{not.null}")
    @Column(name = "usuario", length = 256)
    private String usuario;

    @Column(name = "usuariofecha", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date usuarioFecha;

    @NotNull(message = "{not.null}")
    @Column(name = "valortexto", length = 256)
    private String valorTexto;

    @NotNull(message = "{not.null}")
    @Column(name = "valornumero")
    private Long valorNumero;

    @NotNull(message = "{not.null}")
    @Column(name = "modo", length = 8)
    private String modo;

    @NotNull(message = "{not.null}")
    @Column(name = "codigoitem", length = 32)
    private String codigoItem;

    @NotNull(message = "{not.null}")
    @Column(name = "nombreitem", length = 32)
    private String nombreItem;

    @NotNull(message = "{not.null}")
    @Column(name = "descripcionitem", length = 32)
    private String descripcionItem;

    @NotNull(message = "{not.null}")
    @Column(name = "unidadmedida", length = 8)
    private String unidadMedida;

    @NotNull(message = "{not.null}")
    @Column(name = "clasificacion", length = 8)
    private String clasificacion;

    @NotNull(message = "{not.null}")
    @Column(name = "clasificacion2", length = 8)
    private String clasificacion2;

    @NotNull(message = "{not.null}")
    @Column(name = "almacen", length = 32)
    private String almacen;

    @NotNull(message = "{not.null}")
    @Column(name = "costo")
    private Double costo;

    @OneToMany(targetEntity = ArticuloDetalle.class)
    @JoinColumn(name = "idarticulo", referencedColumnName = "id")
    private List<ArticuloDetalle> articuloDetalle;
}