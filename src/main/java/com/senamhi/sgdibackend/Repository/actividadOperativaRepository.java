package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface actividadOperativaRepository extends JpaRepository<actividadOperativa, Integer> {

    List<actividadOperativa> findTopByOrderByIdActividadOperativaDesc();

    @Query("SELECT COUNT(u) FROM actividadOperativa u WHERE u.idActividadOp=?1")
    Integer contarAO(Integer id);

    @Transactional
    @Modifying
    @Query("update actividadOperativa c set c.estado= 1 where c.idActividadOperativa=?1")
    void updateEstadoSubDirectivo(Integer id);
}
