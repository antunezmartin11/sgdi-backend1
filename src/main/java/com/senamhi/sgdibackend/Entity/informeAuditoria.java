package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MVD_INFORME_AUDITORIA")
public class informeAuditoria {

    @Id
    @Column(name = "ID_INFORME_AUDITORIA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_INFORME_AUDITORIA",sequenceName="SEQ_INS_INFORME_AUDITORIA", allocationSize=1)
    private Integer idInformeAuditoria;

    @Column(name = "ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "V_NOM_DOCUMENTO")
    private String nombreDocumento;

    @Column(name = "V_NUM_DOCUMENTO")
    private String numDocumento;

    @Column(name = "V_NUM_INFORME")
    private String numInforme;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "D_FEC_RECEPCION")
    private Date fecRecepcion;

    @Column(name = "V_DES_TIPO_CONTROL")
    private String tipoControl;

    @Column(name = "V_NOM_INFORME")
    private String nomInforme;



    public informeAuditoria(){}

    public informeAuditoria(Integer idInformeAuditoria, Integer idTipoDocumento, String numDocumento, String numInforme, Double contribucion, Date fecRecepcion, String tipoControl, String nomInforme, String nombreDocumento) {
        this.idInformeAuditoria = idInformeAuditoria;
        this.idTipoDocumento = idTipoDocumento;
        this.numDocumento = numDocumento;
        this.numInforme = numInforme;
        this.contribucion = contribucion;
        this.fecRecepcion = fecRecepcion;
        this.tipoControl = tipoControl;
        this.nomInforme=nomInforme;
        this.nombreDocumento= nombreDocumento;
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
