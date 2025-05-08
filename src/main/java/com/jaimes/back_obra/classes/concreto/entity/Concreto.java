package com.jaimes.back_obra.classes.concreto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import jakarta.persistence.*;

public class Concreto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String psi;
    private Double cemento;
    private Double arena;
    private Double grava;
    private Double agua;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Concreto() {
    }

    public Concreto(Long id, String psi, Double cemento, Double arena, Double grava, Double agua, Tipo tipo) {
        this.id = id;
        this.psi = psi;
        this.cemento = cemento;
        this.arena = arena;
        this.grava = grava;
        this.agua = agua;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
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

    public Double getGrava() {
        return grava;
    }

    public void setGrava(Double grava) {
        this.grava = grava;
    }

    public Double getAgua() {
        return agua;
    }

    public void setAgua(Double agua) {
        this.agua = agua;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
