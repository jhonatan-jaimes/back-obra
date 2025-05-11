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
    private String psi;
    private Double cementoUnidad;
    private Double arenaUnidad;
    private Double aguaUnidad;
    private Double cementoTotal;
    private Double arenaTotal;
    private Double aguaTotal;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Mortero() {
    }

    public Mortero(Long id, String psi, Double cementoUnidad, Double arenaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double aguaTotal, Tipo tipo) {
        this.id = id;
        this.psi = psi;
        this.cementoUnidad = cementoUnidad;
        this.arenaUnidad = arenaUnidad;
        this.aguaUnidad = aguaUnidad;
        this.cementoTotal = cementoTotal;
        this.arenaTotal = arenaTotal;
        this.aguaTotal = aguaTotal;
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

    public Double getCementoUnidad() {
        return cementoUnidad;
    }

    public void setCementoUnidad(Double cementoUnidad) {
        this.cementoUnidad = cementoUnidad;
    }

    public Double getArenaUnidad() {
        return arenaUnidad;
    }

    public void setArenaUnidad(Double arenaUnidad) {
        this.arenaUnidad = arenaUnidad;
    }

    public Double getAguaUnidad() {
        return aguaUnidad;
    }

    public void setAguaUnidad(Double aguaUnidad) {
        this.aguaUnidad = aguaUnidad;
    }

    public Double getCementoTotal() {
        return cementoTotal;
    }

    public void setCementoTotal(Double cementoTotal) {
        this.cementoTotal = cementoTotal;
    }

    public Double getArenaTotal() {
        return arenaTotal;
    }

    public void setArenaTotal(Double arenaTotal) {
        this.arenaTotal = arenaTotal;
    }

    public Double getAguaTotal() {
        return aguaTotal;
    }

    public void setAguaTotal(Double aguaTotal) {
        this.aguaTotal = aguaTotal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
