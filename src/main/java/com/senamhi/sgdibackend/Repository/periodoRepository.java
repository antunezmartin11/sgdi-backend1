package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface periodoRepository extends JpaRepository<periodo, Integer> {
}
