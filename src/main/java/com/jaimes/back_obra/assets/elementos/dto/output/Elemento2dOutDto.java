package com.jaimes.back_obra.assets.elementos.dto.output;

import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

import java.util.List;

public class Elemento2dOutDto {

    private Long id;
    private String nameElemento;
    private List<TipoOutDTO> tipo2d;

    public Elemento2dOutDto() {
    }

    public Elemento2dOutDto(Long id, String nameElemento, List<TipoOutDTO> tipo2d) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.tipo2d = tipo2d;
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

    public List<TipoOutDTO> getTipo2d() {
        return tipo2d;
    }

    public void setTipo2d(List<TipoOutDTO> tipo2d) {
        this.tipo2d = tipo2d;
    }
}
