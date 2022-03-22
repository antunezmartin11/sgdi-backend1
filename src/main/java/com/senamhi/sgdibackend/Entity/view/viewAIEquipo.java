package com.senamhi.sgdibackend.Entity.view;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "VIEW_AI_EQUIPO")
public class viewAIEquipo {
    @Id
    @Column(name = "ID_EQUIPO", insertable = false, updatable = false)
    private Integer idEquipo;

    @Column(name = "ID_ACCION_INICIATIVA", insertable = false, updatable = false)
    private Integer idAI;

    @Column(name = "ID_PLAZA", insertable = false, updatable = false)
    private String idPlaza;

    @Column(name = "N_NUM_CONTRIBUCION", insertable = false, updatable = false)
    private Double contribucion;

    @Column(name = "V_NOM_UNIDAD", insertable = false, updatable = false)
    private String nombreUnidad;

    @Column(name = "ID_ROL", insertable = false, updatable = false)
    private Integer idRol;

    @Column(name = "V_NOM_CARGO", insertable = false, updatable = false)
    private String cargo;

    @Column(name = "V_NOM_SERVIDOR", insertable = false, updatable = false)
    private String nombreServidor;

    @Column(name = "ID_UNIDAD", insertable = false, updatable = false)
    private Integer idUnidad;

    @Column(name = "V_MED_VERIFICACION", insertable = false, updatable = false)
    private String medioVerificacion;

    @Column(name = "D_FEC_INICIO", insertable = false, updatable = false)
    private Date fecInicio;

    @Column(name = "D_FEC_FIN", insertable = false, updatable = false)
    private Date fecFin;

    @Column(name = "V_DES_DESCRIPCION", insertable = false, updatable = false)
    private String descripcion;

    @Column(name = "V_NOM_ACC", insertable = false, updatable = false)
    private String nombreAccionIniciativa;

    @Column(name = "V_TIP_PRIORITARIO", insertable = false, updatable = false)
    private String prioritario;

    @Column(name = "V_TIP_PROCESO", insertable = false, updatable = false)
    private String tipoProceso;

    @Column(name = "ID_VALORAR_ACCION_INICIATIVA", insertable = false, updatable = false)
    private Integer idValorarAI;

    @Column(name = "N_NUM_VALORACION", insertable = false, updatable = false)
    private Double valoracion;

    public viewAIEquipo() {
    }

    public viewAIEquipo(Integer idEquipo, Integer idAI, String idPlaza, Double contribucion, String nombreUnidad, Integer idRol, String cargo, String nombreServidor, Integer idUnidad, String medioVerificacion, Date fecInicio, Date fecFin, String descripcion, String nombreAccionIniciativa, String prioritario, String tipoProceso, Integer idValorarAI, Double valoracion) {
        this.idEquipo = idEquipo;
        this.idAI = idAI;
        this.idPlaza = idPlaza;
        this.contribucion = contribucion;
        this.nombreUnidad = nombreUnidad;
        this.idRol = idRol;
        this.cargo = cargo;
        this.nombreServidor = nombreServidor;
        this.idUnidad = idUnidad;
        this.medioVerificacion = medioVerificacion;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.descripcion = descripcion;
        this.nombreAccionIniciativa = nombreAccionIniciativa;
        this.prioritario = prioritario;
        this.tipoProceso = tipoProceso;
        this.idValorarAI = idValorarAI;
        this.valoracion = valoracion;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Integer getIdAI() {
        return idAI;
    }

    public void setIdAI(Integer idAI) {
        this.idAI = idAI;
    }

    public String getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Double getContribucion() {
        return contribucion;
    }

    public void setContribucion(Double contribucion) {
        this.contribucion = contribucion;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreServidor() {
        return nombreServidor;
    }

    public void setNombreServidor(String nombreServidor) {
        this.nombreServidor = nombreServidor;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getMedioVerificacion() {
        return medioVerificacion;
    }

    public void setMedioVerificacion(String medioVerificacion) {
        this.medioVerificacion = medioVerificacion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreAccionIniciativa() {
        return nombreAccionIniciativa;
    }

    public void setNombreAccionIniciativa(String nombreAccionIniciativa) {
        this.nombreAccionIniciativa = nombreAccionIniciativa;
    }

    public String getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public Integer getIdValorarAI() {
        return idValorarAI;
    }

    public void setIdValorarAI(Integer idValorarAI) {
        this.idValorarAI = idValorarAI;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }
}
