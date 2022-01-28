package com.senamhi.sgdibackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MVD_AE__PERIODO")
public class actividadOperativaPeriodo {

    @Id
    @Column(name = "ID_AE_PERIODO")
    private Integer idAEP;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    @Column(name = "ID_ACCION_ESTRATEGICA")
    private Integer idAccionEstrategica;

    public actividadOperativaPeriodo(){}

    public actividadOperativaPeriodo(Integer idAEP, Double peso, Integer idPeriodo, Integer idAccionEstrategica) {
        this.idAEP = idAEP;
        this.peso = peso;
        this.idPeriodo = idPeriodo;
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public Integer getIdAEP() {
        return idAEP;
    }

    public void setIdAEP(Integer idAEP) {
        this.idAEP = idAEP;
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

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }
}

