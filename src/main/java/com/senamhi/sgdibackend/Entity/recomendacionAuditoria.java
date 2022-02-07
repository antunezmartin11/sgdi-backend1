package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_RECOMENDACION_AUDITORIA")
public class recomendacionAuditoria {

    @Id
    @Column(name = "ID_RECOMENDACION_AUDITORIA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_RECOMENDACIONAUDITORIA", sequenceName = "SEQ_RECOMENDACIONAUDITORIA", allocationSize = 1)
    private Integer idRecomendacionAuditoria;

    @Column(name = "ID_UNIDAD")
    private Integer idUnidad;

    @Column(name = "ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "V_NOM_RECOMENDACION")
    private String recomendacion;

    @Column(name = "ID_INFORME_AUDITORIA")
    private Integer idInformeAuditoria;

    @Column(name = "V_NOM_UNIDAD")
    private String nomUnidad;

    public recomendacionAuditoria(){}

    public recomendacionAuditoria(Integer idRecomendacionAuditoria,
                                  Integer idUnidad, Integer idTipoDocumento,
                                  String recomendacion,
                                  Integer idInformeAuditoria,
                                  String nomUnidad) {
        this.idRecomendacionAuditoria = idRecomendacionAuditoria;
        this.idUnidad = idUnidad;
        this.idTipoDocumento = idTipoDocumento;
        this.recomendacion = recomendacion;
        this.idInformeAuditoria = idInformeAuditoria;
        this.nomUnidad = nomUnidad;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public void setNomUnidad(String nomUnidad) {
        this.nomUnidad = nomUnidad;
    }

    public Integer getIdRecomendacionAuditoria() {
        return idRecomendacionAuditoria;
    }

    public void setIdRecomendacionAuditoria(Integer idRecomendacionAuditoria) {
        this.idRecomendacionAuditoria = idRecomendacionAuditoria;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Integer getIdInformeAuditoria() {
        return idInformeAuditoria;
    }

    public void setIdInformeAuditoria(Integer idInformeAuditoria) {
        this.idInformeAuditoria = idInformeAuditoria;
    }
}
