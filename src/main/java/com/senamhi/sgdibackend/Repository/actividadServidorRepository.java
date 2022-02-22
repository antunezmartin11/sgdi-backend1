package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadServidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface actividadServidorRepository extends JpaRepository<actividadServidor, Integer> {

    @Query("SELECT COUNT(u) FROM actividadServidor u WHERE u.codigo=?1")
    Integer contarRegistro(String codigo);

    List<actividadServidor> findByNomUnidad(String nomUnidad);

    @Transactional
    @Modifying
    @Query("update actividadServidor c set c.flag= ?1 where c.idActividadServidor=?2")
    void updateEstadoServidor(Integer flag, Integer id);

    List<actividadServidor> findByCodigo(String codigo);

}
