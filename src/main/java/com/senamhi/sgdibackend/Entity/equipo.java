package com.senamhi.sgdibackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MVD_EQUIPO")
public class equipo {

    @Id
    @Column(name = "ID_EQUIPO")
    private Integer idEquipo;

    @Column(name = "ID_ACCION_INICIATIVA")
    private Integer idAccionIniciativa;

    @Column(name = "ID_UNIDAD")
    private Integer idUnidad;

    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @Column(name = "ID_PERIODO_AI")
    private Integer idPeriodoAI;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    public equipo (){}

    public equipo(Integer idEquipo, Integer idAccionIniciativa, Integer idUnidad, Integer idUsuario, Integer idPeriodoAI, Double contribucion) {
        this.idEquipo = idEquipo;
        this.idAccionIniciativa = idAccionIniciativa;
        this.idUnidad = idUnidad;
        this.idUsuario = idUsuario;
        this.idPeriodoAI = idPeriodoAI;
        this.contribucion = contribucion;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Integer getIdAccionIniciativa() {
        return idAccionIniciativa;
    }

    public void setIdAccionIniciativa(Integer idAccionIniciativa) {
        this.idAccionIniciativa = idAccionIniciativa;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdPeriodoAI() {
        return idPeriodoAI;
    }

    public void setIdPeriodoAI(Integer idPeriodoAI) {
        this.idPeriodoAI = idPeriodoAI;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }
}
