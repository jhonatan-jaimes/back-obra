package com.jaimes.back_obra.classes.elementos.entity;

import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Elementos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nameElemento;

    @OneToMany(mappedBy = "elemento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tipo> tipos;

    public Elementos() {
    }

    public Elementos(Long id, String nameElemento, List<Tipo> tipos) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.tipos = tipos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameElemento() {
        return nameElemento;
    }

    public void setNameElemento(String nameElemento) {
        this.nameElemento = nameElemento;
    }

    public List<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(List<Tipo> tipos) {
        this.tipos = tipos;
    }
}
