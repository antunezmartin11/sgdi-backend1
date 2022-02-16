package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.actividadServidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface actividadServidorRepository extends JpaRepository<actividadServidor, Integer> {

    @Query("SELECT COUNT(u) FROM actividadServidor u WHERE u.codigo=?1")
    Integer contarRegistro(String codigo);

    List<actividadServidor> findByNomUnidad(String nomUnidad);

}
