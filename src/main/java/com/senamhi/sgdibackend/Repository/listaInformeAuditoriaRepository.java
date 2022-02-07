package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.listaInformeAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface listaInformeAuditoriaRepository extends JpaRepository<listaInformeAuditoria, Integer> {


}
