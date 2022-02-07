package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productoActividadOperativaActividadRepository extends JpaRepository<productoActividadOperativaActividad, Integer > {

    List<productoActividadOperativaActividad> findByIdActividadServidor(Integer id);

    List<productoActividadOperativaActividad> findByIdProAIAct(Integer id);

    @Modifying(clearAutomatically = true)
    @Query("update productoActividadOperativaActividad c set c.contribucion = ?1, c.meta = ?2 WHERE c.idProAIAct = ?3")
    void updateProducto(Double contribucion, Double meta, Integer id);
}
