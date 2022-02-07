package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodoAE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface periodoAERepository extends JpaRepository<periodoAE, Integer > {
}
