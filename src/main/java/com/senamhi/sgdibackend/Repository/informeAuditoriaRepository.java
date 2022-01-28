package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.informeAuditoria;
import com.senamhi.sgdibackend.Entity.listaInformeAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface informeAuditoriaRepository extends JpaRepository<informeAuditoria, Integer> {


    List<informeAuditoria> findTopByOrderByIdInformeAuditoriaDesc();

}
