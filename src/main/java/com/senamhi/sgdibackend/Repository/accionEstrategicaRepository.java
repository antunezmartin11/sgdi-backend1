package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.accionEstrategica;
import com.senamhi.sgdibackend.Entity.informeAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface accionEstrategicaRepository extends JpaRepository<accionEstrategica, Integer> {

    List<accionEstrategica> findTopByOrderByIdAccionEstrategicaDesc();

}
