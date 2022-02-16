package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_ACT_OPE_UNI")
public class viewActividadOperativaUnidad {
    @Id
    @Column(name = "ID_ACTIVIDAD_OP_UNID", updatable = false, insertable = false)
    private Integer idAOUnidad;

    @Column(name = "ID_OBJETIVO", updatable = false, insertable = false)
    private Integer idObjetivo;

    @Column(name = "ID_UNIDAD", insertable = false, updatable = false)
    private Integer idUnidad;

    @Column(name = "V_COD_UNID", insertable = false, updatable = false)
    private String codUnidad;

    @Column(name = "V_NOM_OBJETIVO", insertable = false, updatable = false)
    private String nomObjetivo;

    @Column(name = "V_NOM_UNI", insertable = false, updatable = false)
    private String nomUnidad;

    @Column(name = "ID_ACTIVIDAD_OPERATIVA", insertable = false, updatable = false)
    private Integer idActividadOperativa;

    @Column(name = "ID_ACCION_ESTRATEGICA", insertable = false, updatable = false)
    private Integer idAccionEstrategica;

    @Column(name = "V_NOM_ACC_ESTR", insertable = false, updatable = false)
    private String nomAccionEstrategica;

    @Column(name = "V_NOM_ACT_OPE", insertable = false, updatable = false)
    private String nomActividadOperativa;

    @Column(name = "V_NOM_DIRECCION", insertable = false, updatable = false)
    private String nomDireccion;

    public viewActividadOperativaUnidad() {
    }

    public viewActividadOperativaUnidad(Integer idAOUnidad, Integer idObjetivo, Integer idUnidad, String codUnidad, String nomObjetivo, String nomUnidad, Integer idActividadOperativa, Integer idAccionEstrategica, String nomAccionEstrategica, String nomActividadOperativa) {
        this.idAOUnidad = idAOUnidad;
        this.idObjetivo = idObjetivo;
        this.idUnidad = idUnidad;
        this.codUnidad = codUnidad;
        this.nomObjetivo = nomObjetivo;
        this.nomUnidad = nomUnidad;
        this.idActividadOperativa = idActividadOperativa;
        this.idAccionEstrategica = idAccionEstrategica;
        this.nomAccionEstrategica = nomAccionEstrategica;
        this.nomActividadOperativa = nomActividadOperativa;
    }

    public Integer getIdAOUnidad() {
        return idAOUnidad;
    }

    public Integer getIdObjetivo() {
        return idObjetivo;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public String getNomObjetivo() {
        return nomObjetivo;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public Integer getIdActividadOperativa() {
        return idActividadOperativa;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public String getNomAccionEstrategica() {
        return nomAccionEstrategica;
    }

    public String getNomActividadOperativa() {
        return nomActividadOperativa;
    }
}
