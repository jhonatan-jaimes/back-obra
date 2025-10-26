package com.jaimes.back_obra.assets.materiales.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.materiales.dosificacion.Dosificacion;
import com.jaimes.back_obra.assets.materiales.pisos.Pisos;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String materialTipo;

    @OneToOne(mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
    private Dosificacion dosificacion;

    @OneToOne(mappedBy = "material", cascade = CascadeType.ALL, orphanRemoval = true)
    private Pisos pisos;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Material() {
    }

    public Material(Long id, String materialTipo, Dosificacion dosificacion, Pisos pisos, Tipo tipo) {
        this.id = id;
        this.materialTipo = materialTipo;
        this.dosificacion = dosificacion;
        this.pisos = pisos;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialTipo() {
        return materialTipo;
    }

    public void setMaterialTipo(String materialTipo) {
        this.materialTipo = materialTipo;
    }

    public Dosificacion getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(Dosificacion dosificacion) {
        this.dosificacion = dosificacion;
    }

    public Pisos getPisos() {
        return pisos;
    }

    public void setPisos(Pisos pisos) {
        this.pisos = pisos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
