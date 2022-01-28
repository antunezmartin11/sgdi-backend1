package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name="MVD_HITO_VINCULADO")
public class hitoVinculado {
    @Id
    @Column(name = "ID_HITO_VINCULADO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_HITO_VINCULADO",sequenceName="SEQ_INS_HITO_VINCULADO", allocationSize=1)
    private Integer idHitoVinculado;

    @Column(name="N_CODIGO")
    private String cod;

    @Column(name = "V_NOM_RESPONSABLE")
    private String nomResponsable;

    @Column(name = "ID_HITO")
    private Integer idHito;

    public hitoVinculado(){}

    public hitoVinculado(Integer idHitoVinculado, String cod, String nomResponsable, Integer idHito) {
        this.idHitoVinculado = idHitoVinculado;
        this.cod = cod;
        this.nomResponsable = nomResponsable;
        this.idHito = idHito;
    }

    public Integer getIdHitoVinculado() {
        return idHitoVinculado;
    }

    public void setIdHitoVinculado(Integer idHitoVinculado) {
        this.idHitoVinculado = idHitoVinculado;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    public Integer getIdHito() {
        return idHito;
    }

    public void setIdHito(Integer idHito) {
        this.idHito = idHito;
    }
}
