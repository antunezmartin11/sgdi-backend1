package com.senamhi.sgdibackend.Entity.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_ACC_EST_DIR")
public class viewAccionEstrategicaDireccion {

    @Id
    @Column(name = "ID_ACCION_ESTRATEGICA", insertable = false, updatable = false)
    private Integer IdaccionEstregica;

    @Column(name = "V_COD_ACCEST", insertable = false, updatable = false)
    private String codAccionEstra;

    @Column(name = "ID_ACCION_ESTRA", insertable = false, updatable = false)
    private Integer idAccionE;

    @Column(name = "V_NOM_ACC_EST")
    private String nomAccionEstrategica;

    @Column(name = "ID_AE_DIRECCION")
    private Integer idAEDireccion;

    @Column(name = "ID_DIRECCION")
    private Integer idDireccion;

    @Column(name = "V_NOM_DIRECCION")
    private String nomDireccion;

    @Column(name = "C_DES_ESTADO")
    private String estado;

    public viewAccionEstrategicaDireccion() {
    }

    public Integer getIdaccionEstregica() {
        return IdaccionEstregica;
    }

    public String getCodAccionEstra() {
        return codAccionEstra;
    }

    public Integer getIdAccionE() {
        return idAccionE;
    }

    public String getNomAccionEstrategica() {
        return nomAccionEstrategica;
    }

    public Integer getIdAEDireccion() {
        return idAEDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public String getNomDireccion() {
        return nomDireccion;
    }

    public String getEstado() {
        return estado;
    }
}
