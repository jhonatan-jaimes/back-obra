package com.jaimes.back_obra.classes.elementos.repository;

public class ConcretoPsi {

    private Long id;
    private String name;

    public ConcretoPsi() {
    }

    public ConcretoPsi(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePsi() {
        return name;
    }

    public void setNamePsi(String name) {
        this.name = name;
    }
}
