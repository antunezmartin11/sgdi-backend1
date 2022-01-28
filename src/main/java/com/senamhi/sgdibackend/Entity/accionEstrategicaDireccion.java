package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_AE_DIRECCION")
public class accionEstrategicaDireccion {
    @Id
    @Column(name = "ID_AE_DIRECCION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_AE_DIRECTIVO", sequenceName = "SEQ_INS_AE_DIRECTIVO", initialValue = 1)
    private Integer idAEDireccion;

    @Column(name = "ID_ACCION_ESTRATEGICA")
    private Integer idAccionEstrategica;

    @Column(name = "ID_DIRECCION")
    private Integer idDireccion;

    @Column(name = "V_NOM_DIRECCION")
    private String nomDireccion;

    @Column(name = "ID_PLAZA")
    private Integer idPlaza;

    @Column(name = "V_NOM_RESPONSABLE")
    private String nomResponsable;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "ID_OBJETIVO")
    private Integer idObjetivo;

    @Column(name = "V_NOM_OBJETIVO")
    private String nomObjetivo;

    public accionEstrategicaDireccion() {
    }

    public accionEstrategicaDireccion(Integer idAEDireccion, Integer idAccionEstrategica, Integer idDireccion, String nomDireccion, Integer idPlaza, String nomResponsable, Double contribucion, Integer idObjetivo, String nomObjetivo) {
        this.idAEDireccion = idAEDireccion;
        this.idAccionEstrategica = idAccionEstrategica;
        this.idDireccion = idDireccion;
        this.nomDireccion = nomDireccion;
        this.idPlaza = idPlaza;
        this.nomResponsable = nomResponsable;
        this.contribucion = contribucion;
        this.idObjetivo = idObjetivo;
        this.nomObjetivo = nomObjetivo;
    }

    public Integer getIdAEDireccion() {
        return idAEDireccion;
    }

    public void setIdAEDireccion(Integer idAEDireccion) {
        this.idAEDireccion = idAEDireccion;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public void setNomDireccion(String nomDireccion) {
        this.nomDireccion = nomDireccion;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
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
}
