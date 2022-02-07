package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MVD_ACCION_INICIATIVA")
public class accionIniciativa {
    @Id
    @Column(name = "ID_ACCION_INICIATIVA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_ACCION_INICIATIVA",sequenceName="SEQ_INS_ACCION_INICIATIVA", allocationSize=1)
    private Integer idAccionIniciativa;

    @Column(name = "V_TIP_PROCESO")
    private String tipoProceso;

    @Column(name = "V_DES_DESCRIPCION")
    private String descripcion;

    @Column(name = "ID_UNIDAD")
    private Integer idUnidad;

    @Column(name = "ID_PERIODO")
    private Integer idPeriodo;

    @Column(name = "V_TIP_PRIORITARIO")
    private String tipoPrioritario;

    @Column(name = "ID_INFORME_AUDITORIA")
    private Integer idInformeAuditoria;

    @Column(name = "ID_PRODUCTO_PRIORIZADO")
    private Integer idProductoPriorizado;

    @Column(name = "V_NOM_ACC")
    private String accionIniciativa;

    @Column(name = "V_NOM_UNIDAD")
    private String nomUnidad;

    @Column(name = "V_MED_VERIFICACION")
    private String medioVerificacion;

    @Column(name = "D_FEC_INICIO")
    private Date fecInicio;

    @Column(name = "D_FEC_FIN")
    private Date fecFin;

    public accionIniciativa(){}

    public accionIniciativa(Integer idAccionIniciativa, String tipoProceso, String descripcion, Integer idUnidad, Integer idPeriodo, String tipoPrioritario, Integer idInformeAuditoria, Integer idProductoPriorizado, String accionIniciativa, String nomUnidad, String medioVerificacion, Date fecInici, Date fecFin) {
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

    public void setFecInici(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }
}
