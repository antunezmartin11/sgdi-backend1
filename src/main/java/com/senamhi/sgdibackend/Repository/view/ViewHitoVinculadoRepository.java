package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewHitoVinculado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ViewHitoVinculadoRepository extends JpaRepository<viewHitoVinculado, Integer> {

    List<viewHitoVinculado> findByTipoAndIdHito(Integer tipo, Integer idHito);
}
