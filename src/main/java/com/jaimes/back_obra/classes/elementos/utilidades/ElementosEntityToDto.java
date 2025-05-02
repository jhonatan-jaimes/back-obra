package com.jaimes.back_obra.classes.elementos.utilidades;

import com.jaimes.back_obra.classes.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;

import java.util.ArrayList;
import java.util.List;

public class ElementosEntityToDto {

    public static ElementoOutDTO elementoOutDTO(Elementos elementos){
        ElementoOutDTO elementoOutDTO = new ElementoOutDTO();
        elementoOutDTO.setId(elementos.getId());
        elementoOutDTO.setNameElemento(elementos.getNameElemento());
        List<Tipo3dOutDTO> listaTipo3DOneOutDTOS = new ArrayList<>();
        for(Tipo tipo : elementos.getTipos()){
            Tipo3dOutDTO dto = new Tipo3dOutDTO();
            dto.setId(tipo.getId());
            dto.setNameTipo(tipo.getNameTipo());
            dto.setCantidad(tipo.getCantidad());
            dto.setLargo(tipo.getMedidas3D().getLargo());
            dto.setAncho(tipo.getMedidas3D().getAncho());
            dto.setAlto(tipo.getMedidas3D().getAlto());
            dto.setAreaUnidad(tipo.getAreas().getAreaUnidad());
            dto.setAreaTotal(tipo.getAreas().getAreaTotal());
            listaTipo3DOneOutDTOS.add(dto);
        }
        elementoOutDTO.setTipo(listaTipo3DOneOutDTOS);
        return elementoOutDTO;
    }

}
