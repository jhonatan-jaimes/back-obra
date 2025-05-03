package com.jaimes.back_obra.classes.elementos.dto.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ElementoInDTO {

    private Long id;

    @NotBlank(message = "El nombre del elemento no puede estar vacio")
    private String nameElemento;

    public ElementoInDTO() {
    }

    public ElementoInDTO(Long id, String nameElemento) {
        this.id = id;
        this.nameElemento = nameElemento;
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
}
