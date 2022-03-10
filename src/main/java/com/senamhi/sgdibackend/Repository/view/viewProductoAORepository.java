package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewProductoAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface viewProductoAORepository extends JpaRepository<viewProductoAO, Integer> {

    List<viewProductoAO> findByNombreUnidad(String nombreUnidad);
}
