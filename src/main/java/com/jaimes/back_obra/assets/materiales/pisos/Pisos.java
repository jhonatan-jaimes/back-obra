package com.jaimes.back_obra.assets.materiales.pisos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.entity.Material;
import jakarta.persistence.*;

@Entity
public class Pisos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "piso", cascade = CascadeType.ALL, orphanRemoval = true)
    private Valdosas valdosas;

    @OneToOne
    @JoinColumn(name = "material_id")
    @JsonIgnore
    private Material material;

    public Pisos() {
    }

    public Pisos(Long id, Valdosas valdosas, Material material) {
        this.id = id;
        this.valdosas = valdosas;
        this.material = material;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Valdosas getValdosas() {
        return valdosas;
    }

    public void setValdosas(Valdosas valdosas) {
        this.valdosas = valdosas;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
