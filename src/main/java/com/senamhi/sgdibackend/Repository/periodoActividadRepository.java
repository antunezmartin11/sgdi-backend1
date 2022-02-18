package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodoActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface periodoActividadRepository extends JpaRepository<periodoActividad, Integer> {

    @Query("SELECT COUNT(u) FROM periodoActividad u WHERE u.idProductoAO_Actividad=?1")
    Integer contarPeriodoServidor(Integer id);


    @Query("SELECT u FROM periodoActividad u WHERE u.idProductoAO_Actividad=?1")
    List<periodoActividad> listaxId(Integer id);


}
