package com.senamhi.sgdibackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MVD_PERIODO_AO")
public class periodoAO {

    @Id
    @Column(name = "ID_PERIODO_AO")
    private Integer idPeriodoAO;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "ID_ACTIVIDAD_OPERATIVA")
    private Integer idActividadOperativa;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    public periodoAO(){}

    public periodoAO(Integer idPeriodoAO, Double peso, Integer idActividadOperativa, Integer idPeriodo) {
        this.idPeriodoAO = idPeriodoAO;
        this.peso = peso;
        this.idActividadOperativa = idActividadOperativa;
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdPeriodoAO() {
        return idPeriodoAO;
    }

    public void setIdPeriodoAO(Integer idPeriodoAO) {
        this.idPeriodoAO = idPeriodoAO;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdActividadOperativa() {
        return idActividadOperativa;
    }

    public void setIdActividadOperativa(Integer idActividadOperativa) {
        this.idActividadOperativa = idActividadOperativa;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
}
