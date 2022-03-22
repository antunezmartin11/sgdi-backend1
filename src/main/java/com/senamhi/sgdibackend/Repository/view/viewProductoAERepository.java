package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewProductoAE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface viewProductoAERepository extends JpaRepository<viewProductoAE, Integer> {

    List<viewProductoAE> findByNombreDireccion(String nombreDireccion);
}
