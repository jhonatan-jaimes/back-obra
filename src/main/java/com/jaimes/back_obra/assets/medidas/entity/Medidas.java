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
    private Double largo;
    private Double ancho;
    private Double alto;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Medidas() {
    }

    public Medidas(Long id, String medidasTipo, Double largo, Double ancho, Double alto, Tipo tipo) {
        this.id = id;
        this.medidasTipo = medidasTipo;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
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

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
