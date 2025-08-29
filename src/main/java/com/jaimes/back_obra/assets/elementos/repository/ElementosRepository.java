package com.jaimes.back_obra.assets.elementos.repository;

import com.jaimes.back_obra.assets.elementos.entity.Elementos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementosRepository extends JpaRepository<Elementos, Long> {
}
