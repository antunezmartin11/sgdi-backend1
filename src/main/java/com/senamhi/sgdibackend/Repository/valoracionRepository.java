package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.valoracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface valoracionRepository extends JpaRepository<valoracion, Integer> {

    @Query("SELECT COUNT(u) FROM valoracion u WHERE u.idAccionIniciativa=?1")
    Integer contarValoracion(Integer id);

}
