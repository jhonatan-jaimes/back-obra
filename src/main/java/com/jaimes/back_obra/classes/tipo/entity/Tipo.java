package com.jaimes.back_obra.classes.tipo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jaimes.back_obra.classes.areas.entity.Areas;
import com.jaimes.back_obra.classes.concreto.entity.Concreto;
import com.jaimes.back_obra.classes.medidas.Medidas2D;
import com.jaimes.back_obra.classes.medidas.Medidas3D;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.mortero.entity.Mortero;
import jakarta.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nameTipo;
    private String nameMaterial;
    private Integer cantidad;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medidas3D medidas3D;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medidas2D medidas2D;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Areas areas;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Mortero mortero;

    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Concreto concreto;

    @ManyToOne
    @JoinColumn(name = "elemento_id")
    @JsonIgnore
    private Elementos elemento;

    public Tipo() {
    }

    public Tipo(Long id, String nameTipo, String nameMaterial, Integer cantidad, Medidas3D medidas3D, Medidas2D medidas2D, Areas areas, Mortero mortero, Concreto concreto, Elementos elemento) {
        this.id = id;
        this.nameTipo = nameTipo;
        this.nameMaterial = nameMaterial;
        this.cantidad = cantidad;
        this.medidas3D = medidas3D;
        this.medidas2D = medidas2D;
        this.areas = areas;
        this.mortero = mortero;
        this.concreto = concreto;
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

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Medidas3D getMedidas3D() {
        return medidas3D;
    }

    public void setMedidas3D(Medidas3D medidas3D) {
        this.medidas3D = medidas3D;
    }

    public Medidas2D getMedidas2D() {
        return medidas2D;
    }

    public void setMedidas2D(Medidas2D medidas2D) {
        this.medidas2D = medidas2D;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }

    public Mortero getMortero() {
        return mortero;
    }

    public void setMortero(Mortero mortero) {
        this.mortero = mortero;
    }

    public Concreto getConcreto() {
        return concreto;
    }

    public void setConcreto(Concreto concreto) {
        this.concreto = concreto;
    }

    public Elementos getElemento() {
        return elemento;
    }

    public void setElemento(Elementos elemento) {
        this.elemento = elemento;
    }
}
