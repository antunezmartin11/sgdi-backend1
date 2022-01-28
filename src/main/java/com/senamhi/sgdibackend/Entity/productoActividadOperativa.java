package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_PRODUCTO_AO")
public class productoActividadOperativa {

    @Id
    @Column(name = "ID_PRODUCTO_AO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_PRO_AO", sequenceName = "SYSTEM", allocationSize = 1)
    private Integer idProductoAO;

    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;

    @Column(name = "N_NUM_PESO")
    private Double peso;

    @Column(name = "ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "V_IND_ESTANDAR")
    private String estandar;

    @Column(name = "V_IND_FORMULA")
    private String formula;

    @Column(name = "V_MET_META")
    private Double meta;

    @Column(name = "V_NOM_PRODUCTO")
    private String nomProducto;

    @Column(name = "ID_ACTIVIDAD_OP_UNID")
    private Integer idAOUnidad;



    public productoActividadOperativa(){}

    public productoActividadOperativa(Integer idProductoAO, Integer idProducto, Double peso, Integer idTipoDocumento, String estandar, String formula, Double meta, String nomProducto, Integer idAOUnidad) {
        this.idProductoAO = idProductoAO;
        this.idProducto = idProducto;
        this.peso = peso;
        this.idTipoDocumento = idTipoDocumento;
        this.estandar = estandar;
        this.formula = formula;
        this.meta = meta;
        this.nomProducto = nomProducto;
        this.idAOUnidad = idAOUnidad;
    }

    public Integer getIdProductoAO() {
        return idProductoAO;
    }

    public void setIdProductoAO(Integer idProductoAO) {
        this.idProductoAO = idProductoAO;
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

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Double getMeta() {
        return meta;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public Integer getIdAOUnidad() {
        return idAOUnidad;
    }

    public void setIdAOUnidad(Integer idAOUnidad) {
        this.idAOUnidad = idAOUnidad;
    }
}
