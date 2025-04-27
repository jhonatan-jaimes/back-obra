package com.jaimes.back_obra.elementos.dto.output;

import com.jaimes.back_obra.tipo.dto.output.TipoOutDTO;

import java.util.List;

public class ElementoOutDTO {

    private Long id;
    private String nameElemento;
    private List<TipoOutDTO> tipo;

    public ElementoOutDTO() {
    }

    public ElementoOutDTO(Long id, String nameElemento, List<TipoOutDTO> tipo) {
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

    public List<TipoOutDTO> getTipo() {
        return tipo;
    }

    public void setTipo(List<TipoOutDTO> tipo) {
        this.tipo = tipo;
    }
}
