package com.senamhi.sgdibackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MVC_ROL")
public class rol {
    @Id
    @Column(name = "ID_ROL")
    private Integer idRol;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public rol() {
    }

    public rol(Integer idRol, String descripcion) {
        this.idRol = idRol;
        this.descripcion = descripcion;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
