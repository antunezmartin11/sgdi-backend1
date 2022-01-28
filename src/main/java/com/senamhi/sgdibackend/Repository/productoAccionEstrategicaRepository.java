package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoAccionEstrategica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productoAccionEstrategicaRepository extends JpaRepository<productoAccionEstrategica, Integer> {

    List<productoAccionEstrategica> findByIdAEDireccion (Integer id);
}
