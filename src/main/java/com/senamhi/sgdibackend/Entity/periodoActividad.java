package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_PERIODO_ACTIVIDAD")
public class periodoActividad {

    @Id
    @Column(name = "ID_PERIODO_ACTIVIDAD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_PERIODO_ACTI", sequenceName = "SEQ_INS_PERIODO_ACTI", allocationSize = 1)
    private Integer idPeriodoActividad;

    @Column(name = "D_NUM_PESO")
    private Double peso;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    @Column(name = "ID_PRO_AO_ACT")
    private Integer idProductoAO_Actividad;

    public periodoActividad(){}

    public periodoActividad(Integer idPeriodoActividad, Double peso, Integer idPeriodo, Integer idProductoAO_Actividad) {
        this.idPeriodoActividad = idPeriodoActividad;
        this.peso = peso;
        this.idPeriodo = idPeriodo;
        this.idProductoAO_Actividad = idProductoAO_Actividad;
    }

    public Integer getIdPeriodoActividad() {
        return idPeriodoActividad;
    }

    public void setIdPeriodoActividad(Integer idPeriodoActividad) {
        this.idPeriodoActividad = idPeriodoActividad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdProductoAO_Actividad() {
        return idProductoAO_Actividad;
    }

    public void setIdProductoAO_Actividad(Integer idProductoAO_Actividad) {
        this.idProductoAO_Actividad = idProductoAO_Actividad;
    }
}
