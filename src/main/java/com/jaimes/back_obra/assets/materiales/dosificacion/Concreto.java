package com.jaimes.back_obra.assets.materiales.dosificacion;

import com.jaimes.back_obra.assets.materiales.entity.Material;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
public class Concreto extends Mortero{

    @Basic
    private Double grava;

    public Concreto() {
    }

    public Concreto(Long id, String tipo, Double cemento, Double arena, Double agua, Dosificacion dosificacion, Double grava) {
        super(id, tipo, cemento, arena, agua, dosificacion);
        this.grava = grava;
    }

    public Double getGrava() {
        return grava;
    }

    public void setGrava(Double grava) {
        this.grava = grava;
    }
}
