package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface actividadOperativaRepository extends JpaRepository<actividadOperativa, Integer> {

    List<actividadOperativa> findTopByOrderByIdActividadOperativaDesc();

}
