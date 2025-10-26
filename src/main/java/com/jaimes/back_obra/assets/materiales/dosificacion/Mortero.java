package com.jaimes.back_obra.assets.materiales.dosificacion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.entity.Material;
import jakarta.persistence.*;

@Entity
public class Mortero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String tipo;
    private Double cemento;
    private Double arena;
    private Double agua;

    @OneToOne
    @JoinColumn(name = "dosificacion_id")
    @JsonIgnore
    private Dosificacion dosificacion;

    public Mortero() {
    }

    public Mortero(Long id, String tipo, Double cemento, Double arena, Double agua, Dosificacion dosificacion) {
        this.id = id;
        this.tipo = tipo;
        this.cemento = cemento;
        this.arena = arena;
        this.agua = agua;
        this.dosificacion = dosificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getCemento() {
        return cemento;
    }

    public void setCemento(Double cemento) {
        this.cemento = cemento;
    }

    public Double getArena() {
        return arena;
    }

    public void setArena(Double arena) {
        this.arena = arena;
    }

    public Double getAgua() {
        return agua;
    }

    public void setAgua(Double agua) {
        this.agua = agua;
    }

    public Dosificacion getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(Dosificacion dosificacion) {
        this.dosificacion = dosificacion;
    }
}
