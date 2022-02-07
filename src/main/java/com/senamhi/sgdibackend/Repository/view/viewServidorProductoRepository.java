package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewServidorProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface viewServidorProductoRepository extends JpaRepository<viewServidorProducto,Integer > {

    List<viewServidorProducto> findByCodigo(String codigo);


}
