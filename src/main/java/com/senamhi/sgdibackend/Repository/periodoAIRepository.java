package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodoAI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface periodoAIRepository extends JpaRepository<periodoAI, Integer> {
}
