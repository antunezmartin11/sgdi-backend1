package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import com.senamhi.sgdibackend.Entity.actividadServidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface productoActividadOperativaActividadRepository extends JpaRepository<productoActividadOperativaActividad, Integer > {

    List<productoActividadOperativaActividad> findByIdActividadServidor(Integer id);

    List<productoActividadOperativaActividad> findByIdProAIAct(Integer id);



    @Query("select c from productoActividadOperativaActividad c " +
            "inner join actividadServidor a on a.idActividadServidor=c.idActividadServidor where a.codigo=?1")
    List<productoActividadOperativaActividad> listaProductos(String codigo);

    @Modifying(clearAutomatically = true)
    @Query("update productoActividadOperativaActividad c set c.contribucion = ?1, c.meta = ?2 WHERE c.idProAIAct = ?3")
    void updateProducto(Double contribucion, Double meta, Integer id);

    @Transactional
    @Modifying
    @Query("update productoActividadOperativaActividad c set c.flag= ?1 where c.idProAIAct=?2")
    void updateEstado(Integer flag, Integer id);

    @Transactional
    @Modifying
    @Query("update productoActividadOperativaActividad c set c.secuencia=?1, c.estandar=?2, c.evidencia=?3, c.unidadMedida=?4, c.peso=?5 where c.idProAIAct=?6")
    void updateProductos(Integer secuencia, String standar, String evidencia, String unidadMedida, Double peso,  Integer id);
}
