package com.jaimes.back_obra.assets.medidas.entity;

import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
public class Medidas3D extends Medidas2D{

    @Basic
    private Double alto;

    public Medidas3D() {
    }

    public Medidas3D(Long id, String medidasTipo, Tipo tipo, Double largo, Double ancho, Double alto) {
        super(id, medidasTipo, tipo, largo, ancho);
        this.alto = alto;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }
}
