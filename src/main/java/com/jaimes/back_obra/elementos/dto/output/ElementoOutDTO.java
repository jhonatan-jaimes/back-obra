package com.jaimes.back_obra.elementos.dto.output;

import com.jaimes.back_obra.tipo.dto.output.Tipo3dOneOutDTO;

import java.util.List;

public class ElementoOutDTO {

    private Long id;
    private String nameElemento;
    private List<Tipo3dOneOutDTO> tipo;

    public ElementoOutDTO() {
    }

    public ElementoOutDTO(Long id, String nameElemento, List<Tipo3dOneOutDTO> tipo) {
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

    public List<Tipo3dOneOutDTO> getTipo() {
        return tipo;
    }

    public void setTipo(List<Tipo3dOneOutDTO> tipo) {
        this.tipo = tipo;
    }
}
