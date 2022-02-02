package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface productoActividadOperativaActividadRepository extends JpaRepository<productoActividadOperativaActividad, Integer > {

    List<productoActividadOperativaActividad> findByIdActividadServidor(Integer id);

    List<productoActividadOperativaActividad> findByIdProAIAct(Integer id);

    @Query("update productoActividadOperativaActividad c set c.contribucion = :contribucion, c.meta = :meta WHERE c.idProAIAct = :id")
    void setCustomerName(@Param("contribucion") Double id, @Param("meta") Double meta, @Param("id") Integer idProAIAct);
}
