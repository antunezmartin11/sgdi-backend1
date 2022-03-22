package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewAIEquipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface viewAIEquipoRepository extends JpaRepository<viewAIEquipo, Integer> {

    List<viewAIEquipo> findByIdPlaza(String codigo);
}
