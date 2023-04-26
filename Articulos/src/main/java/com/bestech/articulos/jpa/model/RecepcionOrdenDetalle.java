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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Mapeo JPA para la consulta de detalle de recepcion de orden de compra con el
 * SQL "SELECT ID, IDRECEPCIONORDENCOMPRA, ESTADO, DESCRIPCION, FECHA FROM
 * "DATA".T_BT01_RECEPCION_ORDEN_DETALLE;
 *
 * Con secuenca para el ID en SQ_BT01_ORDEN_DETALLE_ID
 * 
 * @author Bestech [Ov]
 * 
 */
@Entity
@Table(name = "t_bt01_recepcion_orden_detalle", schema = "data")
@Getter
@Setter
@ToString
public class RecepcionOrdenDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BT01_ORDEN_DETALLE_ID")
    @SequenceGenerator(name = "SQ_BT01_ORDEN_DETALLE_ID", sequenceName = "SQ_BT01_ORDEN_DETALLE_ID", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "idrecepcionordencompra")
    private Long idRecepcionOrdenCompra;

    @Column(name = "estado")
    private String estado;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha;
}