package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodoActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface periodoActividadRepository extends JpaRepository<periodoActividad, Integer> {

    @Query("SELECT COUNT(u) FROM periodoActividad u WHERE u.idProductoAO_Actividad=?1")
    Integer contarPeriodoServidor(Integer id);
}
