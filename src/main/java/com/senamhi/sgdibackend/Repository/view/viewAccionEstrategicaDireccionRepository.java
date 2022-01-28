package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewAccionEstrategicaDireccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface viewAccionEstrategicaDireccionRepository extends JpaRepository<viewAccionEstrategicaDireccion, Integer> {
    List<viewAccionEstrategicaDireccion> findByNomDireccion(String nombre);
}
