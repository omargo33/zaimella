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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Mapeo JPA para la consulta de recepcion de orden de compra con el SQL "SELECT
 * id, usuario, usuariofecha, valortexto, valornumero, modo, compania,
 * tipodocumentocompra, numeroordencompra, fecha, codigoproveedor,
 * nombreproveedor, moneda, bodegarecepcion, centrocosto, motivo, linea,
 * codigoitem, indiceitem, unidadmedida, cantidadrecibida, herramienta FROM
 * t_bt01_recepcion_orden_compra"
 * 
 * Con secuenca para el ID en SQ_BT01_RECEPCION_ORDEN_ID
 * 
 * @author Bestech [Ov]
 */
@Entity
@Table(name = "t_bt01_recepcion_orden_compra", schema = "data")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({ "usuarioFecha" })
public class RecepcionOrdenCompra implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BT01_RECEPCION_ORDEN_ID")
    @SequenceGenerator(name = "SQ_BT01_RECEPCION_ORDEN_ID", sequenceName = "SQ_BT01_RECEPCION_ORDEN_ID", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @NotNull(message = "{not.null}")
    @Column(name = "usuario", length = 256)
    private String usuario;

    @Column(name = "usuariofecha", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date usuarioFecha;

    @Column(name = "valortexto", length = 256)
    private String valorTexto;

    @Column(name = "valornumero")
    private long valorNumero;

    @NotNull(message = "{not.null}")
    @Column(name = "modo", length = 8)
    private String modo;

    @NotNull(message = "{not.null}")
    @Column(name = "compania", length = 8)
    private String compania;

    @NotNull(message = "{not.null}")
    @Column(name = "tipodocumentocompra", length = 8)
    private String tipoDocumentoCompra;

    @NotNull(message = "{not.null}")
    @Column(name = "numeroordencompra")
    private long numeroOrdenCompra;

    @Column(name = "fecha", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha;

    @NotNull(message = "{not.null}")
    @Column(name = "codigoproveedor")
    private long codigoProveedor;

    @NotNull(message = "{not.null}")
    @Column(name = "nombreproveedor", length = 256)
    private String nombreProveedor;

    @NotNull(message = "{not.null}")
    @Column(name = "moneda", length = 8)
    private String moneda;

    @NotNull(message = "{not.null}")
    @Column(name = "bodegarecepcion", length = 32)
    private String bodegaRecepcion;

    @NotNull(message = "{not.null}")
    @Column(name = "centrocosto", length = 32)
    private String centroCosto;

    @NotNull(message = "{not.null}")
    @Column(name = "motivo", length = 64)
    private String motivo;

    @NotNull(message = "{not.null}")
    @Column(name = "linea")
    private long linea;

    @NotNull(message = "{not.null}")
    @Column(name = "codigoitem")
    private long codigoItem;

    @NotNull(message = "{not.null}")
    @Column(name = "indiceitem", length = 32)
    private String indiceItem;

    @NotNull(message = "{not.null}")
    @Column(name = "unidadmedida", length = 8)
    private String unidadMedida;

    @NotNull(message = "{not.null}")
    @Column(name = "categoria", length = 32)
    private String categoria;

    @NotNull(message = "{not.null}")
    @Column(name = "cantidadrecibida")
    private Double cantidadRecibida;

    @NotNull(message = "{not.null}")
    @Column(name = "costounidad")
    private Double costoUnidad;

    @OneToMany(targetEntity = RecepcionOrdenDetalle.class)
    @JoinColumn(name = "idrecepcionordencompra", referencedColumnName = "id")
    private List<RecepcionOrdenDetalle> recepcionOrdenDetalle;
}
