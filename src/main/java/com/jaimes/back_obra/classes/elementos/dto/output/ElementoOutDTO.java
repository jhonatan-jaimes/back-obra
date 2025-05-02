package com.jaimes.back_obra.classes.elementos.dto.output;

import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;

import java.util.List;

public class ElementoOutDTO {

    private Long id;
    private String nameElemento;
    private List<Tipo3dOutDTO> tipo;

    public ElementoOutDTO() {
    }

    public ElementoOutDTO(Long id, String nameElemento, List<Tipo3dOutDTO> tipo) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.tipo = tipo;
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

    public List<Tipo3dOutDTO> getTipo() {
        return tipo;
    }

    public void setTipo(List<Tipo3dOutDTO> tipo) {
        this.tipo = tipo;
    }
}
