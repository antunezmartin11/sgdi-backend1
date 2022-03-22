package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_PRODUCTO_AE")
public class viewProductoAE {
    @Id
    @Column(name = "IDPRODUCTOAE", insertable = false, updatable = false)
    private Integer idproductoAE;

    @Column(name = "PESOAE", insertable = false, updatable = false)
    private Double pesoAE;

    @Column(name = "PRODUCTO", insertable = false, updatable = false)
    private String nombreProducto;

    @Column(name = "IDPRODUCTO", insertable = false, updatable = false)
    private Integer idProducto;

    @Column(name = "CONTRIBUCIONPRODUCTO", insertable = false, updatable = false)
    private Double contribucionProducto;

    @Column(name = "FORMULA", insertable = false, updatable = false)
    private String formula;

    @Column(name = "MEDIOVERIFICACION", insertable = false, updatable = false)
    private String medioVerificacion;

    @Column(name = "IDAEDIRECCION", insertable = false, updatable = false)
    private Integer idAEDireccion;

    @Column(name = "NOMBREDIRECCION", insertable = false, updatable = false)
    private String nombreDireccion;

    @Column(name = "IDOBJETIVO", insertable = false, updatable = false)
    private Integer idObjetivo;

    @Column(name = "NOMBREOBJETIVO", insertable = false, updatable = false)
    private String nombreObjetivo;

    @Column(name = "NOMBRERESPONSABLE", insertable = false, updatable = false)
    private String nombreResponsable;

    @Column(name = "CONTRIBUCIONDIRECCION", insertable = false, updatable = false)
    private Double contribucionDireccion;

    @Column(name = "IDDIRECCION", insertable = false, updatable = false)
    private Integer idDireccion;

    @Column(name = "IDA", insertable = false, updatable = false)
    private Integer idAE;

    @Column(name = "IDACCIONESTRATEGICA", insertable = false, updatable = false)
    private Integer idAccionEstrategica;

    @Column(name = "NOMBREACCIONESTRATEGICA", insertable = false, updatable = false)
    private String nombreAE;

    @Column(name = "CODIGOACCIONESTRATEGICA", insertable = false, updatable = false)
    private String codigoAE;

    @Column(name = "INDICADORAE", insertable = false, updatable = false)
    private String indicadorAE;

    public viewProductoAE() {
    }

    public viewProductoAE(Integer idproductoAE, Double pesoAE, String nombreProducto, Integer idProducto, Double contribucionProducto, String formula, String medioVerificacion, Integer idAEDireccion, String nombreDireccion, Integer idObjetivo, String nombreObjetivo, String nombreResponsable, Double contribucionDireccion, Integer idDireccion, Integer idAE, Integer idAccionEstrategica, String nombreAE, String codigoAE, String indicadorAE) {
        this.idproductoAE = idproductoAE;
        this.pesoAE = pesoAE;
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.contribucionProducto = contribucionProducto;
        this.formula = formula;
        this.medioVerificacion = medioVerificacion;
        this.idAEDireccion = idAEDireccion;
        this.nombreDireccion = nombreDireccion;
        this.idObjetivo = idObjetivo;
        this.nombreObjetivo = nombreObjetivo;
        this.nombreResponsable = nombreResponsable;
        this.contribucionDireccion = contribucionDireccion;
        this.idDireccion = idDireccion;
        this.idAE = idAE;
        this.idAccionEstrategica = idAccionEstrategica;
        this.nombreAE = nombreAE;
        this.codigoAE = codigoAE;
        this.indicadorAE = indicadorAE;
    }

    public Integer getIdproductoAE() {
        return idproductoAE;
    }

    public void setIdproductoAE(Integer idproductoAE) {
        this.idproductoAE = idproductoAE;
    }

    public Double getPesoAE() {
        return pesoAE;
    }

    public void setPesoAE(Double pesoAE) {
        this.pesoAE = pesoAE;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Double getContribucionProducto() {
        return contribucionProducto;
    }

    public void setContribucionProducto(Double contribucionProducto) {
        this.contribucionProducto = contribucionProducto;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getMedioVerificacion() {
        return medioVerificacion;
    }

    public void setMedioVerificacion(String medioVerificacion) {
        this.medioVerificacion = medioVerificacion;
    }

    public Integer getIdAEDireccion() {
        return idAEDireccion;
    }

    public void setIdAEDireccion(Integer idAEDireccion) {
        this.idAEDireccion = idAEDireccion;
    }

    public String getNombreDireccion() {
        return nombreDireccion;
    }

    public void setNombreDireccion(String nombreDireccion) {
        this.nombreDireccion = nombreDireccion;
    }

    public Integer getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(Integer idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public String getNombreObjetivo() {
        return nombreObjetivo;
    }

    public void setNombreObjetivo(String nombreObjetivo) {
        this.nombreObjetivo = nombreObjetivo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public Double getContribucionDireccion() {
        return contribucionDireccion;
    }

    public void setContribucionDireccion(Double contribucionDireccion) {
        this.contribucionDireccion = contribucionDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdAE() {
        return idAE;
    }

    public void setIdAE(Integer idAE) {
        this.idAE = idAE;
    }

    public Integer getIdAccionEstrategica() {
        return idAccionEstrategica;
    }

    public void setIdAccionEstrategica(Integer idAccionEstrategica) {
        this.idAccionEstrategica = idAccionEstrategica;
    }

    public String getNombreAE() {
        return nombreAE;
    }

    public void setNombreAE(String nombreAE) {
        this.nombreAE = nombreAE;
    }

    public String getCodigoAE() {
        return codigoAE;
    }

    public void setCodigoAE(String codigoAE) {
        this.codigoAE = codigoAE;
    }

    public String getIndicadorAE() {
        return indicadorAE;
    }

    public void setIndicadorAE(String indicadorAE) {
        this.indicadorAE = indicadorAE;
    }
}
