package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface equipoRepository extends JpaRepository<equipo, Integer> {
}
