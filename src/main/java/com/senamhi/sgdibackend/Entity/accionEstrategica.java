package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name="MVD_ACCION_ESTRATEGICA")
public class accionEstrategica {
    @Id
    @Column(name = "ID_ACCION_ESTRATEGICA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_ACC_ESTRA", sequenceName = "SEQ_INS_ACC_ESTRA", allocationSize = 1)
    private Integer idAccionEstrategica;

    @Column(name = "ID_ACCION_ESTRA")
    private Integer idAccion;

    @Column(name = "ID_PLAZA")
    private Integer idPlaza;

    @Column(name = "V_COD_ACCEST")
    private String codAccionEst;

    @Column(name = "V_NOM_INDIC")
    private String indicador;



    @Column(name = "C_DES_ESTADO")
    private String estado;

    @Column(name = "C_FLG_FICHA")
    private boolean ficha;

    @Column(name = "V_NOM_ACC_EST")
    private String nomAccEst;

    public accionEstrategica(){

    }

    public accionEstrategica(Integer idAccionEstrategica, Integer idAccion, Integer idPlaza, String codAccionEst, String indicador, String estado, boolean ficha, String nomAccEst) {
        this.idAccionEstrategica = idAccionEstrategica;
        this.idAccion = idAccion;
        this.idPlaza = idPlaza;
        this.codAccionEst = codAccionEst;
        this.indicador = indicador;
        this.estado = estado;
        this.ficha = ficha;
        this.nomAccEst = nomAccEst;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getCodAccionEst() {
        return codAccionEst;
    }

    public void setCodAccionEst(String codAccionEst) {
        this.codAccionEst = codAccionEst;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public String getNomAccEst() {
        return nomAccEst;
    }

    public void setNomAccEst(String nomAccEst) {
        this.nomAccEst = nomAccEst;
    }
}
