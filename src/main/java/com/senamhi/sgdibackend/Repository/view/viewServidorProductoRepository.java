package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewServidorProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface viewServidorProductoRepository extends JpaRepository<viewServidorProducto,Integer > {

    List<viewServidorProducto> findByCodigo(String codigo);


}
