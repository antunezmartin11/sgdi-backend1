package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productoActividadOperativaActividadRepository extends JpaRepository<productoActividadOperativaActividad, Integer > {

    List<productoActividadOperativaActividad> findByIdActividadServidor(Integer id);
}
