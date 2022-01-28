package com.senamhi.sgdibackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "MVD_PERIODO_AI")
public class periodoAI {
    @Id
    @Column(name = "ID_PERIODO_AI")
    private Integer idPeriodoAI;

    @Column(name = "D_FEC_INICIO")
    private Date fecInicio;

    @Column(name = "D_FEC_FIN")
    private Date fecFin;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    @Column(name = "ID_ACCION_INICIATIVA")
    private Integer idAccionIniciativa;

    public periodoAI(){}

    public periodoAI(Integer idPeriodoAI, Date fecInicio, Date fecFin, Integer idPeriodo, Integer idAccionIniciativa) {
        this.idPeriodoAI = idPeriodoAI;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.idPeriodo = idPeriodo;
        this.idAccionIniciativa = idAccionIniciativa;
    }

    public Integer getIdPeriodoAI() {
        return idPeriodoAI;
    }

    public void setIdPeriodoAI(Integer idPeriodoAI) {
        this.idPeriodoAI = idPeriodoAI;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdAccionIniciativa() {
        return idAccionIniciativa;
    }

    public void setIdAccionIniciativa(Integer idAccionIniciativa) {
        this.idAccionIniciativa = idAccionIniciativa;
    }
}
