package com.jaimes.back_obra.assets.medidas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Medidas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String medidasTipo;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Medidas() {
    }

    public Medidas(Long id, String medidasTipo, Tipo tipo) {
        this.id = id;
        this.medidasTipo = medidasTipo;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedidasTipo() {
        return medidasTipo;
    }

    public void setMedidasTipo(String medidasTipo) {
        this.medidasTipo = medidasTipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
