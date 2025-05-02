package com.jaimes.back_obra.classes.tipo.dto.output;

public class TipoAllOutDTO {

    private Long id;
    private String nameTipo;

    public TipoAllOutDTO() {
    }

    public TipoAllOutDTO(Long id, String nameTipo) {
        this.id = id;
        this.nameTipo = nameTipo;
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
}
