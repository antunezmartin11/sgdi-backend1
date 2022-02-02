package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_SER_ACT_PRO")
public class viewServidorProducto {
    @Id
    @Column(name = "ID_PRO_AO_ACT", updatable = false, insertable = false)
    private Integer idProductoAOActividad;

    @Column(name = "V_NOM_NOMBRE_ACTIVIDAD",  updatable = false, insertable = false)
    private String nomActividad;

    @Column(name = "ID_ACTIVIDAD",  updatable = false, insertable = false)
    private  Integer idActividad;

    @Column(name = "N_NUM_SECUENCIA",  updatable = false, insertable = false)
    private Integer secuencia;

    @Column(name = "V_DES_ESTANDAR", updatable = false, insertable = false )
    private String estandar;

    @Column(name = "V_DES_UNIDAD_MEDIDA", updatable = false, insertable = false)
    private String unidadMedida;

    @Column(name = "V_NOM_EVIDENCIA", updatable = false, insertable = false)
    private String evidencia;

    @Column(name = "N_NUM_PESO", updatable = false, insertable = false)
    private Double peso;

    @Column(name = "N_NUM_META",  updatable = false, insertable = false)
    private Double meta;

    @Column(name = "N_NUM_CONTRIBUCION", updatable = false, insertable = false)
    private Double contribucion;

    @Column(name = "ID_OBJETIVO", updatable = false, insertable = false)
    private Integer idObjetivo;

    @Column(name = "V_NOM_OBJETIVO", updatable = false, insertable = false)
    private String nomObjetivo;

    @Column(name = "ID_ACTIVIDAD_SERVIDOR",  updatable = false, insertable = false)
    private Integer idActividadServidor;

    @Column(name = "ID_PRODUCTO", updatable = false, insertable = false)
    private Integer idProducto;


    @Column(name="V_NOM_PRODUCTO", updatable = false, insertable = false)
    private String nomProducto;

    @Column(name = "V_NOM_CODIGO", updatable = false, insertable = false)
    private String codigo;

    public viewServidorProducto() {
    }

    public viewServidorProducto(Integer idProductoAOActividad, String nomActividad, Integer idActividad, Integer secuencia, String estandar, String unidadMedida, String evidencia, Double peso, Double meta, Double contribucion, boolean estado, Integer idObjetivo, String nomObjetivo, Integer idActividadServidor, Integer idProducto, String nomProducto, String codigo) {
        this.idProductoAOActividad = idProductoAOActividad;
        this.nomActividad = nomActividad;
        this.idActividad = idActividad;
        this.secuencia = secuencia;
        this.estandar = estandar;
        this.unidadMedida = unidadMedida;
        this.evidencia = evidencia;
        this.peso = peso;
        this.meta = meta;
        this.contribucion = contribucion;
        this.idObjetivo = idObjetivo;
        this.nomObjetivo = nomObjetivo;
        this.idActividadServidor = idActividadServidor;
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.codigo = codigo;
    }

    public Integer getIdProductoAOActividad() {
        return idProductoAOActividad;
    }

    public String getNomActividad() {
        return nomActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public String getEstandar() {
        return estandar;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getMeta() {
        return meta;
    }

    public Integer getIdObjetivo() {
        return idObjetivo;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public String getNomObjetivo() {
        return nomObjetivo;
    }

    public Integer getIdActividadServidor() {
        return idActividadServidor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public String getCodigo() {
        return codigo;
    }
}
