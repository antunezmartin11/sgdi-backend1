package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.listaProductoPriorizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface listaProductoPriorizadoRepository extends JpaRepository<listaProductoPriorizado, Integer> {


}
