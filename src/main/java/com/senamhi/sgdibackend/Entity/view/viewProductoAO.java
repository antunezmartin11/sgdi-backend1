package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_PRODUCTO_AO")
public class viewProductoAO {
    @Id
    @Column(name = "ID_PRODUCTO_AO", updatable = false, insertable = false)
    private Integer idProductoAO;

    @Column(name = "ID_ACTIVIDAD_OP_UNID", updatable = false, insertable = false)
    private Integer idActividadOPUnidad;

    @Column(name = "V_NOM_PRODUCTO", insertable = false, updatable = false)
    private String nombreProducto;

    @Column(name = "ID_PRODUCTO", updatable = false, insertable = false)
    private Integer idProducto;

    @Column(name = "N_NUM_PESO", insertable = false, updatable = false)
    private Double peso;

    @Column(name = "V_IND_ESTANDAR", insertable = false, updatable = false)
    private String estandar;

    @Column(name = "V_IND_FORMULA", insertable = false, updatable = false)
    private String formula;

    @Column(name = "V_MET_META", insertable = false, updatable = false)
    private Double meta;

    @Column(name = "V_TIP_EVIDENCIA", insertable = false, updatable = false)
    private String evidencia;

    @Column(name = "V_NOM_UNI", insertable = false, updatable = false)
    private String nombreUnidad;

    @Column(name = "ID_ACTIVIDAD_OPERATIVA", insertable = false, updatable = false)
    private Integer idActividadOperativa;

    @Column(name = "V_NOM_DIRECCION", insertable = false, updatable = false)
    private String nombreDireccion;

    @Column(name = "V_NOM_ACT_OPE", insertable = false, updatable = false)
    private String nombreActividadOperativa;

    @Column(name = "ID_UNIDAD", insertable = false, updatable = false)
    private Integer idUnidad;

    @Column(name = "V_COD_UNID", insertable = false, updatable = false)
    private String codigoUnidad;

    @Column(name = "V_NOM_ACC_ESTR", insertable = false, updatable = false)
    private String nombreAE;

    @Column(name = "ID_ACCION_ESTRATEGICA", insertable = false, updatable = false)
    private Integer idAccionEstrategica;


    public viewProductoAO() {
    }

    public viewProductoAO(Integer idProductoAO, Integer idActividadOPUnidad, String nombreProducto, Integer idProducto, Double peso, String estandar, String formula, Double meta, String evidencia, String nombreUnidad, Integer idActividadOperativa, String nombreDireccion, String nombreActividadOperativa, Integer idUnidad, String codigoUnidad, String nombreAE, Integer idAccionEstrategica) {
        this.idProductoAO = idProductoAO;
        this.idActividadOPUnidad = idActividadOPUnidad;
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.peso = peso;
        this.estandar = estandar;
        this.formula = formula;
        this.meta = meta;
        this.evidencia = evidencia;
        this.nombreUnidad = nombreUnidad;
        this.idActividadOperativa = idActividadOperativa;
        this.nombreDireccion = nombreDireccion;
        this.nombreActividadOperativa = nombreActividadOperativa;
        this.idUnidad = idUnidad;
        this.codigoUnidad = codigoUnidad;
        this.nombreAE = nombreAE;
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public Integer getIdProductoAO() {
        return idProductoAO;
    }

    public Integer getIdActividadOPUnidad() {
        return idActividadOPUnidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public Double getPeso() {
        return peso;
    }

    public String getEstandar() {
        return estandar;
    }

    public String getFormula() {
        return formula;
    }

    public Double getMeta() {
        return meta;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public Integer getIdActividadOperativa() {
        return idActividadOperativa;
    }

    public String getNombreDireccion() {
        return nombreDireccion;
    }

    public String getNombreActividadOperativa() {
        return nombreActividadOperativa;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public String getCodigoUnidad() {
        return codigoUnidad;
    }

    public void setIdProductoAO(Integer idProductoAO) {
        this.idProductoAO = idProductoAO;
    }

    public void setIdActividadOPUnidad(Integer idActividadOPUnidad) {
        this.idActividadOPUnidad = idActividadOPUnidad;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public void setIdActividadOperativa(Integer idActividadOperativa) {
        this.idActividadOperativa = idActividadOperativa;
    }

    public void setNombreDireccion(String nombreDireccion) {
        this.nombreDireccion = nombreDireccion;
    }

    public void setNombreActividadOperativa(String nombreActividadOperativa) {
        this.nombreActividadOperativa = nombreActividadOperativa;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public void setCodigoUnidad(String codigoUnidad) {
        this.codigoUnidad = codigoUnidad;
    }

    public String getNombreAE() {
        return nombreAE;
    }

    public void setNombreAE(String nombreAE) {
        this.nombreAE = nombreAE;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }
}
