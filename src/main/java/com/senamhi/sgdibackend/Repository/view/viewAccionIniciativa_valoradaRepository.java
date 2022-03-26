package com.senamhi.sgdibackend.Repository.view;

import com.senamhi.sgdibackend.Entity.view.viewAccionIniciativa_valorada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface viewAccionIniciativa_valoradaRepository extends JpaRepository<viewAccionIniciativa_valorada, Integer> {
}
