package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativaUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface actividadOperativaUnidadRepository extends JpaRepository<actividadOperativaUnidad, Integer> {

    List<actividadOperativaUnidad> findByNombreUnidad(String nombre);
}
