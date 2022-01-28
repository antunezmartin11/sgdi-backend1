package com.senamhi.sgdibackend.Entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "LISTAINFORMEAUDITORIA")
@Immutable
public class listaInformeAuditoria {

    @Id
    @Column(name = "ID_INFORME_AUDITORIA", insertable = false, updatable = false)
    private Integer idInformeAuditoria;

    @Column(name="ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "V_NOM_DOCUMENTO", insertable = false, updatable = false)
    private String nombreDocumento;

    @Column(name = "V_NUM_DOCUMENTO", insertable = false, updatable = false)
    private String numDocumento;

    @Column(name = "V_NUM_INFORME", insertable = false, updatable = false)
    private String numInforme;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "D_FEC_RECEPCION", insertable = false, updatable = false)
    private Date fecRecepcion;

    @Column(name = "V_DES_TIPO_CONTROL", insertable = false, updatable = false)
    private String tipoControl;

    @Column(name = "V_NOM_INFORME", insertable = false, updatable = false)
    private String nomInforme;



    public listaInformeAuditoria(){}

    public listaInformeAuditoria(Integer idInformeAuditoria, Integer idTipoDocumento, String nombreDocumento, String numDocumento, String numInforme, Double contribucion, Date fecRecepcion, String tipoControl, String nomInforme) {
        this.idInformeAuditoria = idInformeAuditoria;
        this.idTipoDocumento = idTipoDocumento;
        this.nombreDocumento = nombreDocumento;
        this.numDocumento = numDocumento;
        this.numInforme = numInforme;
        this.contribucion = contribucion;
        this.fecRecepcion = fecRecepcion;
        this.tipoControl = tipoControl;
        this.nomInforme = nomInforme;
    }

    public Integer getIdInformeAuditoria() {
        return idInformeAuditoria;
    }

    public void setIdInformeAuditoria(Integer idInformeAuditoria) {
        this.idInformeAuditoria = idInformeAuditoria;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNumInforme() {
        return numInforme;
    }

    public void setNumInforme(String numInforme) {
        this.numInforme = numInforme;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    public Date getFecRecepcion() {
        return fecRecepcion;
    }

    public void setFecRecepcion(Date fecRecepcion) {
        this.fecRecepcion = fecRecepcion;
    }

    public String getTipoControl() {
        return tipoControl;
    }

    public void setTipoControl(String tipoControl) {
        this.tipoControl = tipoControl;
    }

    public String getNomInforme() {
        return nomInforme;
    }

    public void setNomInforme(String nomInforme) {
        this.nomInforme = nomInforme;
    }
}
