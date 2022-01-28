package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MVD_HITO")
public class hito {
    @Id
    @Column(name = "ID_HITO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_HITO",sequenceName="SYSTEM", allocationSize=1)
    private Integer idHito;

    @Column(name = "ID_CICLO")
    private Integer idCiclo;

    @Column(name = "D_FEC_INICIO")
    private Date fecInicio;

    @Column(name = "D_FEC_FIN")
    private Date fecFin;

    @Column(name = "V_NOM_USUARIO_REG")
    private String usuReg;

    @Column(name = "D_FEC_REG")
    private Date fecReg;

    @Column(name = "V_NOM_USUARIO_MOD")
    private String usuMod;

    @Column(name = "D_FEC_MOD")
    private Date fecMod;

    @Column(name = "N_NUM_TIPO")
    private Integer tipo;

    public hito() { }

    public hito(Integer idHito, Integer idCiclo, Date fecInicio, Date fecFin, String usuReg, Date fecReg, String usuMod, Date fecMod, Integer tipo) {
        this.idHito = idHito;
        this.idCiclo = idCiclo;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.usuReg = usuReg;
        this.fecReg = fecReg;
        this.usuMod = usuMod;
        this.fecMod = fecMod;
        this.tipo = tipo;
    }

    public Integer getIdHito() {
        return idHito;
    }

    public void setIdHito(Integer idHito) {
        this.idHito = idHito;
    }

    public Integer getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
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

    public String getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(String usuReg) {
        this.usuReg = usuReg;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getUsuMod() {
        return usuMod;
    }

    public void setUsuMod(String usuMod) {
        this.usuMod = usuMod;
    }

    public Date getFecMod() {
        return fecMod;
    }

    public void setFecMod(Date fecMod) {
        this.fecMod = fecMod;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
