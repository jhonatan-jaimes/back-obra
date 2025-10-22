package com.jaimes.back_obra.assets.tipo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.materiales.entity.Materiales;
import com.jaimes.back_obra.assets.medidas.entity.Medidas;
import com.jaimes.back_obra.assets.elementos.entity.Elementos;

import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import jakarta.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nameTipo;
    private Integer cantidad;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medidas2D medidas2D;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medidas3D medidas3D;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Areas areas;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Materiales material;

    @ManyToOne
    @JoinColumn(name = "elemento_id")
    @JsonIgnore
    private Elementos elemento;

    public Tipo() {
    }

    public Tipo(Long id, String nameTipo, Integer cantidad, Medidas2D medidas2D, Medidas3D medidas3D, Areas areas, Materiales material, Elementos elemento) {
        this.id = id;
        this.nameTipo = nameTipo;
        this.cantidad = cantidad;
        this.medidas2D = medidas2D;
        this.medidas3D = medidas3D;
        this.areas = areas;
        this.material = material;
        this.elemento = elemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTipo() {
        return nameTipo;
    }

    public void setNameTipo(String nameTipo) {
        this.nameTipo = nameTipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Medidas2D getMedidas2D() {
        return medidas2D;
    }

    public void setMedidas2D(Medidas2D medidas2D) {
        this.medidas2D = medidas2D;
    }

    public Medidas3D getMedidas3D() {
        return medidas3D;
    }

    public void setMedidas3D(Medidas3D medidas3D) {
        this.medidas3D = medidas3D;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }

    public Materiales getMaterial() {
        return material;
    }

    public void setMaterial(Materiales material) {
        this.material = material;
    }

    public Elementos getElemento() {
        return elemento;
    }

    public void setElemento(Elementos elemento) {
        this.elemento = elemento;
    }
}
