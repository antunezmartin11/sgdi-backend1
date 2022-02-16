package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewActividadOperativaUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface viewActividadOperativaUnidadRepository extends JpaRepository<viewActividadOperativaUnidad, Integer> {

    List<viewActividadOperativaUnidad> findByNomDireccionOrderByIdAOUnidadAsc(String nombreUnidad);
}
