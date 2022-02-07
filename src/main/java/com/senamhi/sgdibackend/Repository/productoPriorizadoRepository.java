package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoPriorizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoPriorizadoRepository extends JpaRepository<productoPriorizado, Integer> {
}
