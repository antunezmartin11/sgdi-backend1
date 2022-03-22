package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_EQUIPO")
public class equipo {

    @Id
    @Column(name = "ID_EQUIPO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "INS_SEQ_EQUIPO", sequenceName = "INS_SEQ_EQUIPO")
    private Integer idEquipo;

    @Column(name = "ID_ACCION_INICIATIVA")
    private Integer idAccionIniciativa;

    @Column(name = "ID_UNIDAD")
    private Integer idUnidad;

    @Column(name = "ID_PLAZA")
    private String idPlaza;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "ID_ROL")
    private Integer idRol;

    @Column(name = "V_NOM_SERVIDOR")
    private String nomServidor;

    @Column(name = "V_NOM_UNIDAD")
    private String nomUnidad;

    @Column(name = "V_NOM_CARGO")
    private String cargo;

    public equipo (){}

    public equipo(Integer idEquipo, Integer idAccionIniciativa, Integer idUnidad, String idPlaza, Double contribucion, Integer idRol, String nomServidor, String nomUnidad, String cargo) {
        this.idEquipo = idEquipo;
        this.idAccionIniciativa = idAccionIniciativa;
        this.idUnidad = idUnidad;
        this.idPlaza = idPlaza;
        this.contribucion = contribucion;
        this.idRol = idRol;
        this.nomServidor = nomServidor;
        this.nomUnidad = nomUnidad;
        this.cargo = cargo;
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

    public String getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNomServidor() {
        return nomServidor;
    }

    public void setNomServidor(String nomServidor) {
        this.nomServidor = nomServidor;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public void setNomUnidad(String nomUnidad) {
        this.nomUnidad = nomUnidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
