package com.jaimes.back_obra.elementos.utilidades;

import com.jaimes.back_obra.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.elementos.entity.Elementos;
import com.jaimes.back_obra.tipo.dto.output.TipoOutDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

import java.util.ArrayList;
import java.util.List;

public class ElementosEntityToDto {

    public static ElementoOutDTO elementoOutDTO(Elementos elementos){
        ElementoOutDTO elementoOutDTO = new ElementoOutDTO();
        elementoOutDTO.setId(elementos.getId());
        elementoOutDTO.setNameElemento(elementos.getNameElemento());
        List<TipoOutDTO> listaTipoOutDTOS = new ArrayList<>();
        for(Tipo tipo : elementos.getTipos()){
            TipoOutDTO dto = new TipoOutDTO();
            dto.setId(tipo.getId());
            dto.setNameTipo(tipo.getNameTipo());
            dto.setCantidad(tipo.getCantidad());
            dto.setLargo(tipo.getMedidas3D().getLargo());
            dto.setAncho(tipo.getMedidas3D().getAncho());
            dto.setAlto(tipo.getMedidas3D().getAlto());
            dto.setAreaUnidad(tipo.getAreas().getAreaUnidad());
            dto.setAreaTotal(tipo.getAreas().getAreaTotal());
            listaTipoOutDTOS.add(dto);
        }
        elementoOutDTO.setTipo(listaTipoOutDTOS);
        return elementoOutDTO;
    }

}
