package com.jaimes.back_obra.assets.medidas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Medidas2D {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private Double largo;
    private Double ancho;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Medidas2D() {
    }

    public Medidas2D(Long id, Double largo, Double ancho, Tipo tipo) {
        this.id = id;
        this.largo = largo;
        this.ancho = ancho;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
