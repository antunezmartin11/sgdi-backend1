package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadOperativaUnidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface actividadOperativaUnidadRepository extends JpaRepository<actividadOperativaUnidad, Integer> {

    List<actividadOperativaUnidad> findByNombreUnidad(String nombre);

    @Transactional
    @Modifying
    @Query("update actividadOperativaUnidad c set c.estado=?1 where c.idAOUnidad=?2")
    void updateEstadoAOUnidad(String estado, Integer id);
}
