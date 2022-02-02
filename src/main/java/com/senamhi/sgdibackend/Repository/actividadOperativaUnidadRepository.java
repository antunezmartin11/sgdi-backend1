package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativaUnidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface actividadOperativaUnidadRepository extends JpaRepository<actividadOperativaUnidad, Integer> {

    List<actividadOperativaUnidad> findByNombreUnidad(String nombre);
}
