package com.jaimes.back_obra.assets.materiales.dosificacion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.entity.Material;
import jakarta.persistence.*;

@Entity
public class Dosificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String dosificacion;

    @OneToOne(mappedBy = "dosificacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Mortero morteroOne;

    @OneToOne(mappedBy = "dosificacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Mortero morteroAll;

    @OneToOne(mappedBy = "dosificacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Concreto concretoOne;

    @OneToOne(mappedBy = "dosificacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Concreto concretoAll;

    @OneToOne
    @JoinColumn(name = "material_id")
    @JsonIgnore
    private Material material;

    public Dosificacion() {
    }

    public Dosificacion(Long id, String dosificacion, Mortero morteroOne, Mortero morteroAll, Concreto concretoOne, Concreto concretoAll, Material material) {
        this.id = id;
        this.dosificacion = dosificacion;
        this.morteroOne = morteroOne;
        this.morteroAll = morteroAll;
        this.concretoOne = concretoOne;
        this.concretoAll = concretoAll;
        this.material = material;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(String dosificacion) {
        this.dosificacion = dosificacion;
    }

    public Mortero getMorteroOne() {
        return morteroOne;
    }

    public void setMorteroOne(Mortero morteroOne) {
        this.morteroOne = morteroOne;
    }

    public Mortero getMorteroAll() {
        return morteroAll;
    }

    public void setMorteroAll(Mortero morteroAll) {
        this.morteroAll = morteroAll;
    }

    public Concreto getConcretoOne() {
        return concretoOne;
    }

    public void setConcretoOne(Concreto concretoOne) {
        this.concretoOne = concretoOne;
    }

    public Concreto getConcretoAll() {
        return concretoAll;
    }

    public void setConcretoAll(Concreto concretoAll) {
        this.concretoAll = concretoAll;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
