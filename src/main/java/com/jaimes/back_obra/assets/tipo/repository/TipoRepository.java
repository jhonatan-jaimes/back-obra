package com.jaimes.back_obra.assets.tipo.repository;

import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
