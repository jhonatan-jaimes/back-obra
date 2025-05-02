package com.jaimes.back_obra.classes.mortero.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Mortero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private Double cemento;
    private Double arena;
    private Double agua;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;
}
