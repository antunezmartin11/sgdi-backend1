package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.accionEstrategica;
import com.senamhi.sgdibackend.Entity.informeAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface accionEstrategicaRepository extends JpaRepository<accionEstrategica, Integer> {

    List<accionEstrategica> findTopByOrderByIdAccionEstrategicaDesc();

    @Transactional
    @Modifying
    @Query("update accionEstrategica c set c.estado= 1 where c.idAccionEstrategica=?1")
    void updateEstadoDirectivo(Integer id);
}
