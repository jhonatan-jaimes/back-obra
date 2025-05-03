package com.jaimes.back_obra.classes.elementos.dto.output;

import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;

import java.util.List;

public class Elemento3dOutDTO {

    private Long id;
    private String nameElemento;
    private List<Tipo3dOutDTO> tipo3d;

    public Elemento3dOutDTO() {
    }

    public Elemento3dOutDTO(Long id, String nameElemento, List<Tipo3dOutDTO> tipo3d) {
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

    public List<Tipo3dOutDTO> getTipo3d() {
        return tipo3d;
    }

    public void setTipo3d(List<Tipo3dOutDTO> tipo3d) {
        this.tipo3d = tipo3d;
    }

}
