package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;


@Entity
@Table(name = "MVD_PRO_AO_ACT")
public class productoActividadOperativaActividad {

    @Id
    @Column(name = "ID_PRO_AO_ACT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_VINCULAR_SERVIDOR", sequenceName = "SYSTEM")
    private Integer idProAIAct;

    @Column(name = "V_NOM_NOMBRE_ACTIVIDAD")
    private String nomActividad;

    @Column(name = "ID_ACTIVIDAD")
    private Integer idActividad;

    @Column(name = "N_NUM_SECUENCIA")
    private Integer secuencia;

    @Column(name = "V_DES_ESTANDAR")
    private String estandar;

    @Column(name = "V_DES_UNIDAD_MEDIDA")
    private String unidadMedida;

    @Column(name = "ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "N_NUM_META")
    private Double meta;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "C_EST_ESTADO")
    private Boolean estado;

    @Column(name = "C_FLG_FICHA")
    private Boolean ficha;

    @Column(name = "ID_PLAZA")
    private Integer idUsuario;

    @Column(name = "ID_HITO")
    private Integer idHito;

    public productoActividadOperativaActividad(){}

    public productoActividadOperativaActividad(Integer idProAIAct, String nomActividad, Integer idActividad, Integer secuencia, String estandar, String unidadMedida, Integer idTipoDocumento, Double peso, Double meta, Double contribucion, Boolean estado, Boolean ficha, Integer idUsuario, Integer idHito) {
        this.idProAIAct = idProAIAct;
        this.nomActividad = nomActividad;
        this.idActividad = idActividad;
        this.secuencia = secuencia;
        this.estandar = estandar;
        this.unidadMedida = unidadMedida;
        this.idTipoDocumento = idTipoDocumento;
        this.peso = peso;
        this.meta = meta;
        this.contribucion = contribucion;
        this.estado = estado;
        this.ficha = ficha;
        this.idUsuario = idUsuario;
        this.idHito = idHito;
    }

    public Integer getIdProAIAct() {
        return idProAIAct;
    }

    public void setIdProAIAct(Integer idProAIAct) {
        this.idProAIAct = idProAIAct;
    }

    public String getNomActividad() {
        return nomActividad;
    }

    public void setNomActividad(String nomActividad) {
        this.nomActividad = nomActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getMeta() {
        return meta;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getFicha() {
        return ficha;
    }

    public void setFicha(Boolean ficha) {
        this.ficha = ficha;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdHito() {
        return idHito;
    }

    public void setIdHito(Integer idHito) {
        this.idHito = idHito;
    }
}
