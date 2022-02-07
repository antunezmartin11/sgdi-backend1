package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoAccionEstrategica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productoAccionEstrategicaRepository extends JpaRepository<productoAccionEstrategica, Integer> {

    List<productoAccionEstrategica> findByIdAEDireccion (Integer id);
}
