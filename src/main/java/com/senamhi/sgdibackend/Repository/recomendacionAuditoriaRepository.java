package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.recomendacionAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface recomendacionAuditoriaRepository extends JpaRepository<recomendacionAuditoria, Integer> {

    List<recomendacionAuditoria> findByIdInformeAuditoria (Integer id);
}
