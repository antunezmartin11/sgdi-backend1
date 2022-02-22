package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_ACTIVIDAD_SERVIDOR")
public class actividadServidor {
    @Id
    @Column(name = "ID_ACTIVIDAD_SERVIDOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_ACT_SERV", sequenceName = "SEQ_INS_ACT_SERV", initialValue = 1)
    private Integer idActividadServidor;

    @Column(name = "V_NOM_SERVIDOR")
    private String nomServidor;

    @Column(name = "ID_PLAZA")
    private Integer idPlaza;

    @Column(name = "V_NOM_CODIGO")
    private String codigo;

    @Column(name = "V_NOM_CARGO")
    private String cargo;

    @Column(name = "V_NOM_DIRECCION")
    private String nomDireccion;

    @Column(name = "V_NOM_UNIDAD")
    private String nomUnidad;

    @Column(name = "C_FLAG")
    private Integer flag;

    public actividadServidor() {
    }

    public actividadServidor(Integer idActividadServidor, String nomServidor, Integer idPlaza, String codigo, String cargo, String nomDireccion, String nomUnidad, Integer flag) {
        this.idActividadServidor = idActividadServidor;
        this.nomServidor = nomServidor;
        this.idPlaza = idPlaza;
        this.codigo = codigo;
        this.cargo = cargo;
        this.nomDireccion = nomDireccion;
        this.nomUnidad = nomUnidad;
        this.flag = flag;
    }

    public Integer getIdActividadServidor() {
        return idActividadServidor;
    }

    public void setIdActividadServidor(Integer idActividadServidor) {
        this.idActividadServidor = idActividadServidor;
    }

    public String getNomServidor() {
        return nomServidor;
    }

    public void setNomServidor(String nomServidor) {
        this.nomServidor = nomServidor;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public void setNomDireccion(String nomDireccion) {
        this.nomDireccion = nomDireccion;
    }

    public String getNomUnidad() {
        return nomUnidad;
    }

    public void setNomUnidad(String nomUnidad) {
        this.nomUnidad = nomUnidad;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
