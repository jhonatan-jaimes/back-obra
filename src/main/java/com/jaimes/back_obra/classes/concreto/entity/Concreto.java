package com.jaimes.back_obra.classes.concreto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Concreto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String psi;
    private Double cementoUnidad;
    private Double cementoTotal;
    private Double arenaUnidad;
    private Double arenaTotal;
    private Double gravaUnidad;
    private Double gravaTotal;
    private Double aguaUnidad;
    private Double aguaTotal;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Concreto() {
    }

    public Concreto(Long id, String psi, Double cementoUnidad, Double cementoTotal, Double arenaUnidad, Double arenaTotal, Double gravaUnidad, Double gravaTotal, Double aguaUnidad, Double aguaTotal, Tipo tipo) {
        this.id = id;
        this.psi = psi;
        this.cementoUnidad = cementoUnidad;
        this.cementoTotal = cementoTotal;
        this.arenaUnidad = arenaUnidad;
        this.arenaTotal = arenaTotal;
        this.gravaUnidad = gravaUnidad;
        this.gravaTotal = gravaTotal;
        this.aguaUnidad = aguaUnidad;
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

    public Double getCementoTotal() {
        return cementoTotal;
    }

    public void setCementoTotal(Double cementoTotal) {
        this.cementoTotal = cementoTotal;
    }

    public Double getArenaUnidad() {
        return arenaUnidad;
    }

    public void setArenaUnidad(Double arenaUnidad) {
        this.arenaUnidad = arenaUnidad;
    }

    public Double getArenaTotal() {
        return arenaTotal;
    }

    public void setArenaTotal(Double arenaTotal) {
        this.arenaTotal = arenaTotal;
    }

    public Double getGravaUnidad() {
        return gravaUnidad;
    }

    public void setGravaUnidad(Double gravaUnidad) {
        this.gravaUnidad = gravaUnidad;
    }

    public Double getGravaTotal() {
        return gravaTotal;
    }

    public void setGravaTotal(Double gravaTotal) {
        this.gravaTotal = gravaTotal;
    }

    public Double getAguaUnidad() {
        return aguaUnidad;
    }

    public void setAguaUnidad(Double aguaUnidad) {
        this.aguaUnidad = aguaUnidad;
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
