package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.hito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface hitoRepository extends JpaRepository<hito, Integer> {

    List<hito> findByTipoOrderByIdHitoDesc(Integer tipo);

    List<hito> findTopByOrderByIdHitoDesc();

}
