package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewHitoVinculado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewHitoVinculadoRepository extends JpaRepository<viewHitoVinculado, Integer> {

    List<viewHitoVinculado> findByTipoAndIdHito(Integer tipo, Integer idHito);
}
