package com.jaimes.back_obra.assets.elementos.dto.output;

import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

import java.util.List;

public class Elemento3dOutDTO {

    private Long id;
    private String nameElemento;
    private List<TipoOutDTO> tipo3d;

    public Elemento3dOutDTO() {
    }

    public Elemento3dOutDTO(Long id, String nameElemento, List<TipoOutDTO> tipo3d) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.tipo3d = tipo3d;
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

    public List<TipoOutDTO> getTipo3d() {
        return tipo3d;
    }

    public void setTipo3d(List<TipoOutDTO> tipo3d) {
        this.tipo3d = tipo3d;
    }

}
