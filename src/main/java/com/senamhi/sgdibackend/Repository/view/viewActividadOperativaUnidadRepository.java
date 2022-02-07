package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewActividadOperativaUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface viewActividadOperativaUnidadRepository extends JpaRepository<viewActividadOperativaUnidad, Integer> {

}
