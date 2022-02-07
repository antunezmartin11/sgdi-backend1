package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewAccionEstrategicaDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface viewAccionEstrategicaDireccionRepository extends JpaRepository<viewAccionEstrategicaDireccion, Integer> {
    List<viewAccionEstrategicaDireccion> findByNomDireccion(String nombre);
}
