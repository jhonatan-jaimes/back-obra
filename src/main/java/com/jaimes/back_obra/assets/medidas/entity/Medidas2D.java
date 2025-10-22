package com.jaimes.back_obra.assets.medidas.entity;


import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.Basic;

public class Medidas2D extends Medidas{

    @Basic
    private Double largo;
    private Double ancho;

    public Medidas2D() {
    }

    public Medidas2D(Long id, String medidasTipo, Tipo tipo, Double largo, Double ancho) {
        super(id, medidasTipo, tipo);
        this.largo = largo;
        this.ancho = ancho;
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
}
