package com.jaimes.back_obra.assets.materiales.pisos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Valdosas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String tipo;
    private Double areaValdosa;
    private Double valdosas;

    @OneToOne
    @JoinColumn(name = "piso_id")
    @JsonIgnore
    private Pisos piso;
}
