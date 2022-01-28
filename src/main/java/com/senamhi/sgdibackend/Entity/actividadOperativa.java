package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_ACTIVIDAD_OPERATIVA")
public class actividadOperativa {

    @Id
    @Column(name = "ID_ACTIVIDAD_OPERATIVA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_ACTIVIDAD_OPERATIVA")
    private Integer idActividadOperativa;

    @Column(name = "ID_ACCION_ESTRATEGICA")
    private Integer idAccionEstrategica;

    @Column(name = "ID_ACTI_OPE")
    private Integer idActividadOp;

    @Column(name = "ID_CICLO")
    private Integer idCiclo;

    @Column(name = "ID_PLAZA")
    private Integer idPlaza;


    @Column(name = "C_EST_ESTADO")
    private String estado;

    @Column(name = "C_FLG_FICHA")
    private boolean ficha;

    @Column(name = "V_NOM_ACC_ESTR")
    private String nomAccEstra;

    public actividadOperativa() {
    }

    public actividadOperativa(Integer idActividadOperativa, Integer idAccionEstrategica, Integer idActividadOp, Integer idCiclo, Integer idPlaza, String estado, boolean ficha, String nomAccEstra) {
        this.idActividadOperativa = idActividadOperativa;
        this.idAccionEstrategica = idAccionEstrategica;
        this.idActividadOp = idActividadOp;
        this.idCiclo = idCiclo;
        this.idPlaza = idPlaza;
        this.estado = estado;
        this.ficha = ficha;
        this.nomAccEstra = nomAccEstra;
    }

    public Integer getIdActividadOperativa() {
        return idActividadOperativa;
    }

    public void setIdActividadOperativa(Integer idActividadOperativa) {
        this.idActividadOperativa = idActividadOperativa;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public Integer getIdActividadOp() {
        return idActividadOp;
    }

    public void setIdActividadOp(Integer idActividadOp) {
        this.idActividadOp = idActividadOp;
    }

    public Integer getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
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

    public String getNomAccEstra() {
        return nomAccEstra;
    }

    public void setNomAccEstra(String nomAccEstra) {
        this.nomAccEstra = nomAccEstra;
    }
}
