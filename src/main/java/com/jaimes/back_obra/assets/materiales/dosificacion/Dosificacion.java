package com.jaimes.back_obra.assets.materiales.dosificacion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.entity.Materiales;
import jakarta.persistence.*;

@Entity
public class Dosificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String psi;
    private Double cementoOne;
    private Double arenaOne;
    private Double gravaOne;
    private Double aguaOne;
    private Double cementoAll;
    private Double arenaAll;
    private Double gravaAll;
    private Double aguaAll;

    @OneToOne
    @JoinColumn(name = "material_id")
    @JsonIgnore
    private Materiales material;

    public Dosificacion() {
    }

    public Dosificacion(Long id, String psi, Double cementoOne, Double arenaOne, Double gravaOne, Double aguaOne, Double cementoAll, Double arenaAll, Double gravaAll, Double aguaAll, Materiales material) {
        this.id = id;
        this.psi = psi;
        this.cementoOne = cementoOne;
        this.arenaOne = arenaOne;
        this.gravaOne = gravaOne;
        this.aguaOne = aguaOne;
        this.cementoAll = cementoAll;
        this.arenaAll = arenaAll;
        this.gravaAll = gravaAll;
        this.aguaAll = aguaAll;
        this.material = material;
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

    public Double getCementoOne() {
        return cementoOne;
    }

    public void setCementoOne(Double cementoOne) {
        this.cementoOne = cementoOne;
    }

    public Double getArenaOne() {
        return arenaOne;
    }

    public void setArenaOne(Double arenaOne) {
        this.arenaOne = arenaOne;
    }

    public Double getGravaOne() {
        return gravaOne;
    }

    public void setGravaOne(Double gravaOne) {
        this.gravaOne = gravaOne;
    }

    public Double getAguaOne() {
        return aguaOne;
    }

    public void setAguaOne(Double aguaOne) {
        this.aguaOne = aguaOne;
    }

    public Double getCementoAll() {
        return cementoAll;
    }

    public void setCementoAll(Double cementoAll) {
        this.cementoAll = cementoAll;
    }

    public Double getArenaAll() {
        return arenaAll;
    }

    public void setArenaAll(Double arenaAll) {
        this.arenaAll = arenaAll;
    }

    public Double getGravaAll() {
        return gravaAll;
    }

    public void setGravaAll(Double gravaAll) {
        this.gravaAll = gravaAll;
    }

    public Double getAguaAll() {
        return aguaAll;
    }

    public void setAguaAll(Double aguaAll) {
        this.aguaAll = aguaAll;
    }

    public Materiales getMaterial() {
        return material;
    }

    public void setMaterial(Materiales material) {
        this.material = material;
    }
}
