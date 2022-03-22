package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.informeAuditoria;
import com.senamhi.sgdibackend.Entity.listaInformeAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Repository
public interface informeAuditoriaRepository extends JpaRepository<informeAuditoria, Integer> {


    List<informeAuditoria> findTopByOrderByIdInformeAuditoriaDesc();

    @Transactional
    @Modifying
    @Query("update informeAuditoria c set c.nombreDocumento=?1, c.nomInforme=?2, " +
            "c.numDocumento=?3, c.numInforme=?4,  c.fecRecepcion=?5 where c.idInformeAuditoria=?6")
    void updateInformeAuditoria(String nombreDocumento, String nomInforme,
                                  String numDocumento, String numInforme, Date fecRecepcion, Integer id);
}
