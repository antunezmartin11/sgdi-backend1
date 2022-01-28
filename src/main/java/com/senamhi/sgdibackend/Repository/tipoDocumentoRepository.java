package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.tipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tipoDocumentoRepository extends JpaRepository<tipoDocumento, Integer> {

        tipoDocumento findByIdTipoDocumento(Integer id);

}
