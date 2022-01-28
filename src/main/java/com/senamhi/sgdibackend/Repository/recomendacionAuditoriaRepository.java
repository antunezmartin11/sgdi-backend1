package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.recomendacionAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface recomendacionAuditoriaRepository extends JpaRepository<recomendacionAuditoria, Integer> {

    List<recomendacionAuditoria> findByIdInformeAuditoria (Integer id);
}
