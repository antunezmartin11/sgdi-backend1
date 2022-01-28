package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "VIEW_HITOVINCULADO")
public class viewHitoVinculado {
    @Id
    @Column(name = "ID_HITO_VINCULADO", insertable = false, updatable = false)
    private Integer hitoVinculado;

    @Column(name = "N_CODIGO")
    private String codigo;

    @Column(name = "V_NOM_RESPONSABLE", insertable = false, updatable = false)
    private String nomResponsable;

    @Column(name = "V_NOM_UNIDAD", insertable = false, updatable = false)
    private String nomUnidad;

    @Column(name = "ID_HITO", insertable = false, updatable = false)
    private Integer idHito;

    @Column(name = "N_NUM_TIPO", insertable = false, updatable = false)
    private Integer tipo;

    @Column(name = "D_FEC_INICIO", insertable = false, updatable = false)
    private Date fecInicio;

    @Column(name = "D_FEC_FIN", insertable = false, updatable = false)
    private Date fecFin;

    public viewHitoVinculado() {
    }

    public viewHitoVinculado(Integer hitoVinculado, String codigo, String nomResponsable, String nomUnidad, Integer idHito, Integer tipo, Date fecInicio, Date fecFin) {
        this.hitoVinculado = hitoVinculado;
        this.codigo = codigo;
        this.nomResponsable = nomResponsable;
        this.nomUnidad = nomUnidad;
        this.idHito = idHito;
        this.tipo = tipo;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
    }

    public Integer getHitoVinculado() {
        return hitoVinculado;
    }

    public void setHitoVinculado(Integer hitoVinculado) {
        this.hitoVinculado = hitoVinculado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public void setNomUnidad(String nomUnidad) {
        this.nomUnidad = nomUnidad;
    }

    public Integer getIdHito() {
        return idHito;
    }

    public void setIdHito(Integer idHito) {
        this.idHito = idHito;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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
}
