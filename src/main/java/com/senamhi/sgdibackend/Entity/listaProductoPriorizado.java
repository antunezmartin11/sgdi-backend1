package com.senamhi.sgdibackend.Entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "VIEW_PRODUCTOPRIORIZADO")
@Immutable
public class listaProductoPriorizado {
    @Id
    @Column(name = "ID_PRODUCTO_PRIORIZADO", insertable = false, nullable = false)
    private Integer idProductoPriorizado;

    @Column(name = "V_NOM_PRODUCTO", insertable = false, nullable = false)
    private String nombreProducto;

    @Column(name = "V_NOM_RIESGO_PRIORIZADO", insertable = false, nullable = false)
    private String riesgoPriorizado;

    @Column(name = "V_NOM_MEDIDA_CONTROL", insertable = false, nullable = false)
    private String medidaControl;

    @Column(name = "MEDIDACONTROL", insertable = false, nullable = false)
    private String nombreMedidaControl;

    @Column(name = "D_FEC_INICIO", insertable = false, nullable = false)
    private Date fecInicio;

    @Column(name = "D_FEC_FIN", insertable = false, nullable = false)
    private Date fecFin;

    @Column(name = "ID_TIPO_DOCUMENTO", insertable = false, nullable = false)
    private Integer idTipoDocumento;


    @Column(name = "V_NOM_DOCUMENTO", insertable = false, nullable = false)
    private String nombreDocumento;

    @Column(name = "ID_ORGANO", insertable = false, nullable = false)
    private Integer organo;

    @Column(name = "V_OBS_OBSERVACION", insertable = false, nullable = false)
    private String observacion;

    @Column(name = "V_NOM_ORGANO", insertable = false, updatable = false)
    private String nombreOrgano;

    public listaProductoPriorizado(){}

    public listaProductoPriorizado(Integer idProductoPriorizado, String nombreProducto, String riesgoPriorizado, String medidaControl, String nombreMedidaControl, Date fecInicio, Date fecFin, Integer idTipoDocumento, String nombreDocumento, Integer organo, String observacion, String nombreOrgano) {
        this.idProductoPriorizado = idProductoPriorizado;
        this.nombreProducto = nombreProducto;
        this.riesgoPriorizado = riesgoPriorizado;
        this.medidaControl = medidaControl;
        this.nombreMedidaControl = nombreMedidaControl;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.idTipoDocumento = idTipoDocumento;
        this.nombreDocumento = nombreDocumento;
        this.organo = organo;
        this.observacion = observacion;
        this.nombreOrgano = nombreOrgano;
    }

    public Integer getIdProductoPriorizado() {
        return idProductoPriorizado;
    }

    public void setIdProductoPriorizado(Integer idProductoPriorizado) {
        this.idProductoPriorizado = idProductoPriorizado;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getRiesgoPriorizado() {
        return riesgoPriorizado;
    }

    public void setRiesgoPriorizado(String riesgoPriorizado) {
        this.riesgoPriorizado = riesgoPriorizado;
    }

    public String getMedidaControl() {
        return medidaControl;
    }

    public void setMedidaControl(String medidaControl) {
        this.medidaControl = medidaControl;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public Integer getOrgano() {
        return organo;
    }

    public void setOrgano(Integer organo) {
        this.organo = organo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNombreMedidaControl() {
        return nombreMedidaControl;
    }

    public void setNombreMedidaControl(String nombreMedidaControl) {
        this.nombreMedidaControl = nombreMedidaControl;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getNombreOrgano() {
        return nombreOrgano;
    }

    public void setNombreOrgano(String nombreOrgano) {
        this.nombreOrgano = nombreOrgano;
    }
}
