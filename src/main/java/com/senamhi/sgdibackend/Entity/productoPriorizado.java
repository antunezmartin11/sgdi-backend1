package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MVD_PRODUCTO_PRIORIZADO")
public class productoPriorizado {

    @Id
    @Column(name = "ID_PRODUCTO_PRIORIZADO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_PROD_PRIO",sequenceName="SEQ_INS_PROD_PRIO", allocationSize=1)
    private Integer idProductoPriorizado;

    @Column(name = "V_NOM_PRODUCTO")
    private String nombreProducto;

    @Column(name = "V_NOM_RIESGO_PRIORIZADO")
    private String riesgoPriorizado;

    @Column(name = "V_NOM_MEDIDA_CONTROL")
    private String medidaControl;

    @Column(name = "D_FEC_INICIO")
    private Date fecInicio;

    @Column(name = "D_FEC_FIN")
    private Date fecFin;

    @Column(name = "ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column(name = "ID_ORGANO")
    private Integer organo;

    @Column(name = "V_OBS_OBSERVACION")
    private String observacion;

    @Column(name = "V_NOM_ORGANO")
    private String nombreOrgano;
    public productoPriorizado(){}

    public productoPriorizado(Integer idProductoPriorizado, String nombreProducto, String riesgoPriorizado, String medidaControl, Date fecInicio, Date fecFin, Integer idTipoDocumento, Integer organo, String observacion, String nombreOrgano) {
        this.idProductoPriorizado = idProductoPriorizado;
        this.nombreProducto = nombreProducto;
        this.riesgoPriorizado = riesgoPriorizado;
        this.medidaControl = medidaControl;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.idTipoDocumento = idTipoDocumento;
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

    public String getNombreOrgano() {
        return nombreOrgano;
    }

    public void setNombreOrgano(String nombreOrgano) {
        this.nombreOrgano = nombreOrgano;
    }
}
