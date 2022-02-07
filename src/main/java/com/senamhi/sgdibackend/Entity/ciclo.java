package com.senamhi.sgdibackend.Entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MVC_CICLO")
public class ciclo {

    @Id
    @Column(name = "ID_CICLO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @SequenceGenerator(name="SEQ_INS_CICLO",sequenceName="SEQ_INS_CICLO", allocationSize=1)

    private Integer idCiclo;

    @Column(name = "D_FEC_INICIO")
    private Date fecInicio;

    @Column(name = "D_FEC_FIN")
    private Date fecFin;

    @Column(name = "V_NOM_USUARIO_REG")
    private String usuarioReg;

    @Column(name = "D_FEC_REGISTRO")
    private Date fecReg;

    @Column(name = "V_NOM_USUARIO_MOD")
    private String usuMod;

    @Column(name = "D_FEC_MOD")
    private Date fecMod;

    public ciclo (){

    }

    public ciclo(Integer idCiclo, Date fecInicio, Date fecFin, String usuarioReg, Date fecReg, String usuMod, Date fecMod) {
        this.idCiclo = idCiclo;
        this.fecInicio = fecInicio;
        this.fecFin = fecFin;
        this.usuarioReg = usuarioReg;
        this.fecReg = fecReg;
        this.usuMod = usuMod;
        this.fecMod = fecMod;
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

    public String getUsuarioReg() {
        return usuarioReg;
    }

    public void setUsuarioReg(String usuarioReg) {
        this.usuarioReg = usuarioReg;
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
}
