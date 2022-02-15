package com.senamhi.sgdibackend.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MVD_VALORAR_ACC_INI")
public class valoracion {
    @Id
    @Column(name = "ID_VALORAR_ACCION_INICIATIVA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_INS_VALORACION", sequenceName = "SEQ_INS_vALORACION", initialValue = 1)
    private Integer idValoracion;

    @Column(name = "N_NUM_IMPACTO")
    private Double impacto;

    @Column(name = "N_NUM_COMPLEJIDAD")
    private Double complejidad;

    @Column(name = "N_NUM_VALORACION")
    private Double valoracion;

    @Column(name = "ID_ACCION_INICIATIVA")
    private Integer idAccionIniciativa;

    public valoracion() {

    }
    public valoracion(Integer idValoracion, Double impacto, Double complejidad, Double valoracion, Integer idAccionIniciativa) {
        this.idValoracion = idValoracion;
        this.impacto = impacto;
        this.complejidad = complejidad;
        this.valoracion = valoracion;
        this.idAccionIniciativa = idAccionIniciativa;
    }

    public Integer getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(Integer idValoracion) {
        this.idValoracion = idValoracion;
    }

    public Double getImpacto() {
        return impacto;
    }

    public void setImpacto(Double impacto) {
        this.impacto = impacto;
    }

    public Double getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(Double complejidad) {
        this.complejidad = complejidad;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getIdAccionIniciativa() {
        return idAccionIniciativa;
    }

    public void setIdAccionIniciativa(Integer idAccionIniciativa) {
        this.idAccionIniciativa = idAccionIniciativa;
    }
}
