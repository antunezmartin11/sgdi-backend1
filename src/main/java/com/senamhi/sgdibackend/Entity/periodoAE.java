package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "MVD_AE_PERIODO")
public class periodoAE {

    @Id
    @Column(name = "ID_AE_PERIODO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_PERIODO_AE", sequenceName = "SYSTEM", allocationSize = 1)
    private Integer idPeriodoAE;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    @Column(name = "ID_AE_DIRECCION")
    private Integer idAEDireccion;

    public periodoAE(){

    }

    public periodoAE(Integer idPeriodoAE, Double peso, Integer idPeriodo, Integer idAEDireccion) {
        this.idPeriodoAE = idPeriodoAE;
        this.peso = peso;
        this.idPeriodo = idPeriodo;
        this.idAEDireccion = idAEDireccion;
    }

    public Integer getIdPeriodoAE() {
        return idPeriodoAE;
    }

    public void setIdPeriodoAE(Integer idPeriodoAE) {
        this.idPeriodoAE = idPeriodoAE;
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

    public Integer getIdAEDireccion() {
        return idAEDireccion;
    }

    public void setIdAEDireccion(Integer idAEDireccion) {
        this.idAEDireccion = idAEDireccion;
    }
}
