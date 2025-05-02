package com.jaimes.back_obra.classes.elementos.repository;

import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementosRepository extends JpaRepository<Elementos, Long> {
}
