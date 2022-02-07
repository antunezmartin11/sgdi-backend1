package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.accionEstrategicaDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accionEstrategicaDirectivoRepository extends JpaRepository<accionEstrategicaDireccion, Integer> {

    List<accionEstrategicaDireccion> findByIdAccionEstrategica(Integer id);
}
