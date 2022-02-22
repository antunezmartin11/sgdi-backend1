package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;


@Entity
@Table(name = "MVD_PRO_AO_ACT")
public class productoActividadOperativaActividad {

    @Id
    @Column(name = "ID_PRO_AO_ACT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_VINCULAR_SERVIDOR", sequenceName = "SEQ_INS_VINCULAR_SERVIDOR")
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

    @Column(name = "V_NOM_EVIDENCIA")
    private String evidencia;

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

    @Column(name = "ID_OBJETIVO")
    private Integer idObjetivo;

    @Column(name = "V_NOM_OBJETIVO")
    private String nomObjetivo;

    @Column(name = "ID_ACTIVIDAD_SERVIDOR")
    private Integer idActividadServidor;

    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;

    @Column(name = "V_NOM_PRODUCTO")
    private String nomProducto;

    @Column(name = "C_FLAG")
    private Integer flag;

    public productoActividadOperativaActividad(){}

    public productoActividadOperativaActividad(Integer idProAIAct, String nomActividad, Integer idActividad, Integer secuencia, String estandar, String unidadMedida, String evidencia, Double peso, Double meta, Double contribucion, Boolean estado, Boolean ficha, Integer idObjetivo, String nomObjetivo, Integer idActividadServidor, Integer idProducto, String nomProducto, Integer flag) {
        this.idProAIAct = idProAIAct;
        this.nomActividad = nomActividad;
        this.idActividad = idActividad;
        this.secuencia = secuencia;
        this.estandar = estandar;
        this.unidadMedida = unidadMedida;
        this.evidencia = evidencia;
        this.peso = peso;
        this.meta = meta;
        this.contribucion = contribucion;
        this.estado = estado;
        this.ficha = ficha;
        this.idObjetivo = idObjetivo;
        this.nomObjetivo = nomObjetivo;
        this.idActividadServidor = idActividadServidor;
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.flag = flag;
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

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
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

    public Integer getIdActividadServidor() {
        return idActividadServidor;
    }

    public void setIdActividadServidor(Integer idActividadServidor) {
        this.idActividadServidor = idActividadServidor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
