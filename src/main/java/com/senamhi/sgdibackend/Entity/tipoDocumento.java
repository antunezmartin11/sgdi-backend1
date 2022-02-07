package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "MAP_TIPO_DOCUMENTO")
public class tipoDocumento {

    @Id
    @Column(name = "ID_TIPO_DOCUMENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SEQ_INS_TDOCUMENTO",sequenceName="SEQ_INS_TDOCUMENTO", allocationSize=1)
    private Integer idTipoDocumento;

    @Column(name = "V_NOM_DOCUMENTO")
    private String nombreDocumento;

    @Column(name = "V_NOM_USUARIO")
    private String usuario;

    @Column(name = "D_FEC_REGISTRO")
    private Date fecReg;

    public tipoDocumento(){

    }

    public tipoDocumento(Integer idTipoDocumento, String nombreDocumento, String usuario, Date fecReg) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombreDocumento = nombreDocumento;
        this.usuario = usuario;
        this.fecReg = fecReg;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecReg() {
        return fecReg;
    }

    public void setFecReg(Date fecReg) {
        this.fecReg = fecReg;
    }
}
