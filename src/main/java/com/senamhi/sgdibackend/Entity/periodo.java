package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MAP_PERIODO")
public class periodo {

    @Id
    @Column(name = "ID_PERIODO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_PERIODO",sequenceName="SEQ_INS_PERIODO", allocationSize=1)
    private Integer idPeriodo;

    @Column(name = "V_NOM_PERIODO")
    private String periodo;

    @Column(name = "D_FEC_REGISTRO")
    private Date fecReg;

    @Column(name = "V_NOM_USUARIO_REG")
    private String usuReg;

    @Column(name = "D_FEC_MODIFICA")
    private Date fecMod;

    @Column(name = "V_NOM_USUARIO_MOD")
    private String usuMod;


    public periodo(){}

    public periodo(Integer idPeriodo, String periodo, Date fecReg, String usuReg, Date fecMod, String usuMod) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
        this.fecReg = fecReg;
        this.usuReg = usuReg;
        this.fecMod = fecMod;
        this.usuMod = usuMod;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }

    public String getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(String usuReg) {
        this.usuReg = usuReg;
    }

    public Date getFecMod() {
        return fecMod;
    }

    public void setFecMod(Date fecMod) {
        this.fecMod = fecMod;
    }

    public String getUsuMod() {
        return usuMod;
    }

    public void setUsuMod(String usuMod) {
        this.usuMod = usuMod;
    }
}
