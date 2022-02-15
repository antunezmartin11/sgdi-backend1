package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_PRODUCTO_ACC_ESTR")
public class productoAccionEstrategica {

    @Id
    @Column(name = "ID_PRO_ACC_ESTR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_PRO_AE", sequenceName = "SEQ_INS_PRO_AE", initialValue = 1)
    private Integer idProductoAE;

    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "V_DES_FORMULA")
    private String formula;

    @Column(name = "V_MED_VERIFICACION")
    private String  medioVerificacion;

    @Column(name = "ID_AE_DIRECCION")
    private Integer idAEDireccion;

    @Column(name = "N_NUM_CONTRIBUCION")
    private Double contribucion;

    @Column(name = "V_NOM_PRODUCTO")
    private String nomProducto;

    public productoAccionEstrategica(){}

    public productoAccionEstrategica(Integer idProductoAE, Integer idProducto, Double peso, String formula, String medioVerificacion, Integer idAEDireccion, Double contribucion, String nomProducto) {
        this.idProductoAE = idProductoAE;
        this.idProducto = idProducto;
        this.peso = peso;
        this.formula = formula;
        this.medioVerificacion = medioVerificacion;
        this.idAEDireccion = idAEDireccion;
        this.contribucion = contribucion;
        this.nomProducto = nomProducto;
    }

    public Integer getIdProductoAE() {
        return idProductoAE;
    }

    public void setIdProductoAE(Integer idProductoAE) {
        this.idProductoAE = idProductoAE;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }
}
