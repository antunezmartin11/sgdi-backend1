package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.accionIniciativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accionIniciativaRepository extends JpaRepository<accionIniciativa, Integer> {
}
