package com.senamhi.sgdibackend.Repository;
import com.senamhi.sgdibackend.Entity.ciclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface cicloRepository extends JpaRepository<ciclo, Integer> {



}
