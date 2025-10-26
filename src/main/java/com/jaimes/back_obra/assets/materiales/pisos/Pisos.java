package com.jaimes.back_obra.assets.materiales.pisos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.entity.Material;
import jakarta.persistence.*;

@Entity
public class Pisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private Double areaBaldosa;
    private Double allBaldosas;

    @OneToOne
    @JoinColumn(name = "material_id")
    @JsonIgnore
    private Material material;

    public Pisos() {
    }

    public Pisos(Long id, Double areaBaldosa, Double allBaldosas, Material material) {
        this.id = id;
        this.areaBaldosa = areaBaldosa;
        this.allBaldosas = allBaldosas;
        this.material = material;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAreaBaldosa() {
        return areaBaldosa;
    }

    public void setAreaBaldosa(Double areaBaldosa) {
        this.areaBaldosa = areaBaldosa;
    }

    public Double getAllBaldosas() {
        return allBaldosas;
    }

    public void setAllBaldosas(Double allBaldosas) {
        this.allBaldosas = allBaldosas;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
