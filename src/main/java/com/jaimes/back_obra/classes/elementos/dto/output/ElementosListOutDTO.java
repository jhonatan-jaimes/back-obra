package com.jaimes.back_obra.classes.elementos.dto.output;

public class ElementosListOutDTO {

    private Long id;
    private String nameElemento;

    public ElementosListOutDTO() {
    }

    public ElementosListOutDTO(Long id, String nameElemento) {
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
