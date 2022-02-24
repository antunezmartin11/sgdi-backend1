package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_ACTIVIDAD_OPERATIVA")
public class actividadOperativa {

    @Id
    @Column(name = "ID_ACTIVIDAD_OPERATIVA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_ACTIVIDAD_OPERATIVA", sequenceName = "SEQ_INS_ACTIVIDAD_OPERATIVA")
    private Integer idActividadOperativa;

    @Column(name = "ID_ACCION_ESTRATEGICA")
    private Integer idAccionEstrategica;

    @Column(name = "ID_ACTI_OPE")
    private Integer idActividadOp;

    @Column(name = "V_NOM_RESPONSABLE")
    private String nombreResponsable;

    @Column(name = "V_COD_PLAZA")
    private String codigoPlaza;


    @Column(name = "C_EST_ESTADO")
    private String estado;

    @Column(name = "C_FLG_FICHA")
    private boolean ficha;

    @Column(name = "V_NOM_ACC_ESTR")
    private String nomAccEstra;

    @Column(name = "N_DNI_RESPONSABLE")
    private Integer dniReponsable;

    @Column(name = "V_NOM_CARGO")
    private String nombreCargo;

    @Column(name = "V_NOM_DIRECCION")
    private String nomDireccion;

    public actividadOperativa() {
    }

    public actividadOperativa(Integer idActividadOperativa, Integer idAccionEstrategica, Integer idActividadOp, String nombreResponsable, String codigoPlaza, String estado, boolean ficha, String nomAccEstra, Integer dniReponsable, String nombreCargo, String nomDireccion) {
        this.idActividadOperativa = idActividadOperativa;
        this.idAccionEstrategica = idAccionEstrategica;
        this.idActividadOp = idActividadOp;
        this.nombreResponsable = nombreResponsable;
        this.codigoPlaza = codigoPlaza;
        this.estado = estado;
        this.ficha = ficha;
        this.nomAccEstra = nomAccEstra;
        this.dniReponsable = dniReponsable;
        this.nombreCargo = nombreCargo;
        this.nomDireccion = nomDireccion;
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

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getCodigoPlaza() {
        return codigoPlaza;
    }

    public void setCodigoPlaza(String codigoPlaza) {
        this.codigoPlaza = codigoPlaza;
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

    public Integer getDniReponsable() {
        return dniReponsable;
    }

    public void setDniReponsable(Integer dniReponsable) {
        this.dniReponsable = dniReponsable;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public void setNomDireccion(String nomDireccion) {
        this.nomDireccion = nomDireccion;
    }
}
