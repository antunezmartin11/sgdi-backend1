package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.tipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoDocumentoRepository extends JpaRepository<tipoDocumento, Integer> {

        tipoDocumento findByIdTipoDocumento(Integer id);

}
