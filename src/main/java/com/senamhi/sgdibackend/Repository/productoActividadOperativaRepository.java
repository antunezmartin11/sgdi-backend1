package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productoActividadOperativaRepository extends JpaRepository<productoActividadOperativa, Integer> {
    List<productoActividadOperativa> findByIdAOUnidadOrderByIdAOUnidadDesc(Integer id);


}
