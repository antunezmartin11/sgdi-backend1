package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_ACTIVIDAD_OP_UNIDAD")
public class actividadOperativaUnidad {

    @Id
    @Column(name = "ID_ACTIVIDAD_OP_UNID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_AO_UNIDAD", sequenceName = "SEQ_INS_AO_UNIDAD", initialValue = 1)
    private Integer idAOUnidad;

    @Column(name = "ID_UNIDAD")
    private Integer idUnidad;

    @Column(name = "V_NOM_UNI")
    private String nombreUnidad;

    @Column(name = "V_COD_UNID")
    private String codUnidad;

    @Column(name = "ID_OBJETIVO")
    private Integer idObjetivo;

    @Column(name = "V_NOM_OBJETIVO")
    private String nomObjetivo;

    @Column(name = "ID_ACTIVIDAD_OPERATIVA")
    private Integer idActividadOperativa;

    @Column(name = "V_NOM_ACT_OPE")
    private String nomActividadOperativa;

    @Column(name = "V_NOM_DIRECCION")
    private String nomDireccion;

    @Column(name = "C_FLG_ESTADO")
    private String estado;

    public actividadOperativaUnidad() {
    }

    public actividadOperativaUnidad(Integer idAOUnidad, Integer idUnidad, String nombreUnidad, String codUnidad, Integer idObjetivo, String nomObjetivo, Integer idActividadOperativa, String nomActividadOperativa, String nomDireccion, String estado) {
        this.idAOUnidad = idAOUnidad;
        this.idUnidad = idUnidad;
        this.nombreUnidad = nombreUnidad;
        this.codUnidad = codUnidad;
        this.idObjetivo = idObjetivo;
        this.nomObjetivo = nomObjetivo;
        this.idActividadOperativa = idActividadOperativa;
        this.nomActividadOperativa = nomActividadOperativa;
        this.nomDireccion = nomDireccion;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdAOUnidad() {
        return idAOUnidad;
    }

    public void setIdAOUnidad(Integer idAOUnidad) {
        this.idAOUnidad = idAOUnidad;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public Integer getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(Integer idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public String getNomObjetivo() {
        return nomObjetivo;
    }

    public void setNomObjetivo(String nomObjetivo) {
        this.nomObjetivo = nomObjetivo;
    }

    public Integer getIdActividadOperativa() {
        return idActividadOperativa;
    }

    public void setIdActividadOperativa(Integer idActividadOperativa) {
        this.idActividadOperativa = idActividadOperativa;
    }

    public String getNomActividadOperativa() {
        return nomActividadOperativa;
    }

    public void setNomActividadOperativa(String nomActividadOperativa) {
        this.nomActividadOperativa = nomActividadOperativa;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public void setNomDireccion(String nomDireccion) {
        this.nomDireccion = nomDireccion;
    }
}
