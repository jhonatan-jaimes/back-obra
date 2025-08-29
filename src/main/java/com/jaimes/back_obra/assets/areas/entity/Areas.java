package com.jaimes.back_obra.assets.areas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;
import jakarta.persistence.*;

@Entity
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private Double areaOne;
    private Double areaAll;

    @OneToOne
    @JoinColumn(name = "tipo_id")
    @JsonIgnore
    private Tipo tipo;

    public Areas() {
    }

    public Areas(Long id, Double areaOne, Double areaAll, Tipo tipo) {
        this.id = id;
        this.areaOne = areaOne;
        this.areaAll = areaAll;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAreaOne() {
        return areaOne;
    }

    public void setAreaOne(Double areaOne) {
        this.areaOne = areaOne;
    }

    public Double getAreaAll() {
        return areaAll;
    }

    public void setAreaAll(Double areaAll) {
        this.areaAll = areaAll;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
