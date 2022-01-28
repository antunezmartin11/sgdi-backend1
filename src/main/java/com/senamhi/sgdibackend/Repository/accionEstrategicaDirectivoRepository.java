package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.accionEstrategicaDireccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface accionEstrategicaDirectivoRepository extends JpaRepository<accionEstrategicaDireccion, Integer> {

    List<accionEstrategicaDireccion> findByIdAccionEstrategica(Integer id);
}
