package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodoAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface periodoAORepository extends JpaRepository<periodoAO, Integer> {
}
