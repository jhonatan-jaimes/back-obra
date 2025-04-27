package com.jaimes.back_obra.areas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private Double areaUnidad;
    private Double areaTotal;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Areas() {
    }

    public Areas(Long id, Double areaUnidad, Double areaTotal, Tipo tipo) {
        this.id = id;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAreaUnidad() {
        return areaUnidad;
    }

    public void setAreaUnidad(Double areaUnidad) {
        this.areaUnidad = areaUnidad;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
