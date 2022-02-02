package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface actividadOperativaRepository extends JpaRepository<actividadOperativa, Integer> {

    List<actividadOperativa> findTopByOrderByIdActividadOperativaDesc();

    @Query("SELECT COUNT(u) FROM actividadOperativa u WHERE u.idActividadOp=?1")
    Integer contarAO(Integer id);
}
