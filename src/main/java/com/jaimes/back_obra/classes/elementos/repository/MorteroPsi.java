package com.jaimes.back_obra.classes.elementos.repository;

public class MorteroPsi {

    private Long id;
    private String name;

    public MorteroPsi() {
    }

    public MorteroPsi(Long id, String name) {
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
