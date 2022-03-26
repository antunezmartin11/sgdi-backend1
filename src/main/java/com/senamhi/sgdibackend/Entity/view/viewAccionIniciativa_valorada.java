package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "VIEW_ACCION_INICIATIVA_VALORADA")
public class viewAccionIniciativa_valorada {
    @Id
    @Column(name = "ID_ACCION_INICIATIVA", insertable = false, updatable = false)
    private Integer idAccionIniciativa;

    @Column(name = "V_TIP_PROCESO", insertable = false, updatable = false)
    private String tipoProceso;

    @Column(name = "V_DES_DESCRIPCION", updatable = false, insertable = false)
    private String descripcion;

    @Column(name = "ID_UNIDAD", updatable = false, insertable = false)
    private Integer idUnidad;

    @Column(name = "ID_PERIODO", updatable = false, insertable = false)
    private Integer idPeriodo;

    @Column(name = "V_TIP_PRIORITARIO", insertable = false, updatable = false)
    private String tipoPrioritario;

    @Column(name = "ID_INFORME_AUDITORIA", insertable = false, updatable = false)
    private Integer idInformeAuditoria;

    @Column(name = "ID_PRODUCTO_PRIORIZADO", insertable = false, updatable = false)
    private Integer idProductoPriorizado;

    @Column(name = "V_NOM_ACC", updatable = false, insertable = false)
    private String accionIniciativa;

    @Column(name = "V_NOM_UNIDAD", insertable = false, updatable = false)
    private String nomUnidad;

    @Column(name = "V_MED_VERIFICACION", insertable = false, updatable = false)
    private String medioVerificacion;

    @Column(name = "D_FEC_INICIO", insertable = false, updatable = false)
    private Date fecInicio;

    @Column(name = "D_FEC_FIN", updatable = false, insertable = false)
    private Date fecFin;

    @Column(name = "C_FLG_ESTADO", updatable = false, insertable = false)
    private String flagEstado;

    @Column(name = "ID_VALORAR_ACCION_INICIATIVA", insertable = false, updatable = false)
    private Integer idValoracion;

    @Column(name = "N_NUM_IMPACTO", insertable = false, updatable = false)
    private Double impacto;

    @Column(name = "N_NUM_COMPLEJIDAD", insertable = false, updatable = false)
    private Double complejidad;

    @Column(name = "N_NUM_VALORACION", insertable = false, updatable = false)
    private Double valoracion;

    public viewAccionIniciativa_valorada() {
    }

    public viewAccionIniciativa_valorada(Integer idAccionIniciativa, String tipoProceso, String descripcion, Integer idUnidad, Integer idPeriodo, String tipoPrioritario, Integer idInformeAuditoria, Integer idProductoPriorizado, String accionIniciativa, String nomUnidad, String medioVerificacion, Date fecInicio, Date fecFin, String flagEstado, Integer idValoracion, Double impacto, Double complejidad, Double valoracion) {
        this.idAccionIniciativa = idAccionIniciativa;
        this.tipoProceso = tipoProceso;
        this.descripcion = descripcion;
        this.idUnidad = idUnidad;
        this.idPeriodo = idPeriodo;
        this.tipoPrioritario = tipoPrioritario;
        this.idInformeAuditoria = idInformeAuditoria;
        this.idProductoPriorizado = idProductoPriorizado;
        this.accionIniciativa = accionIniciativa;
        this.nomUnidad = nomUnidad;
        this.medioVerificacion = medioVerificacion;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.flagEstado = flagEstado;
        this.idValoracion = idValoracion;
        this.impacto = impacto;
        this.complejidad = complejidad;
        this.valoracion = valoracion;
    }

    public Integer getIdAccionIniciativa() {
        return idAccionIniciativa;
    }

    public void setIdAccionIniciativa(Integer idAccionIniciativa) {
        this.idAccionIniciativa = idAccionIniciativa;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getTipoPrioritario() {
        return tipoPrioritario;
    }

    public void setTipoPrioritario(String tipoPrioritario) {
        this.tipoPrioritario = tipoPrioritario;
    }

    public Integer getIdInformeAuditoria() {
        return idInformeAuditoria;
    }

    public void setIdInformeAuditoria(Integer idInformeAuditoria) {
        this.idInformeAuditoria = idInformeAuditoria;
    }

    public Integer getIdProductoPriorizado() {
        return idProductoPriorizado;
    }

    public void setIdProductoPriorizado(Integer idProductoPriorizado) {
        this.idProductoPriorizado = idProductoPriorizado;
    }

    public String getAccionIniciativa() {
        return accionIniciativa;
    }

    public void setAccionIniciativa(String accionIniciativa) {
        this.accionIniciativa = accionIniciativa;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public void setNomUnidad(String nomUnidad) {
        this.nomUnidad = nomUnidad;
    }

    public String getMedioVerificacion() {
        return medioVerificacion;
    }

    public void setMedioVerificacion(String medioVerificacion) {
        this.medioVerificacion = medioVerificacion;
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

    public String getFlagEstado() {
        return flagEstado;
    }

    public void setFlagEstado(String flagEstado) {
        this.flagEstado = flagEstado;
    }

    public Integer getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(Integer idValoracion) {
        this.idValoracion = idValoracion;
    }

    public Double getImpacto() {
        return impacto;
    }

    public void setImpacto(Double impacto) {
        this.impacto = impacto;
    }

    public Double getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(Double complejidad) {
        this.complejidad = complejidad;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }
}
