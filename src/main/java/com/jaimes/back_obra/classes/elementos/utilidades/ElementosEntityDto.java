package com.jaimes.back_obra.classes.elementos.utilidades;

import com.jaimes.back_obra.classes.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento2dOutDto;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento3dOutDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.ElementosListOutDTO;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;

import java.util.ArrayList;
import java.util.List;

public class ElementosEntityDto {

    public static Elemento3dOutDTO elemento3dToOutDTO(Elementos elementos){
        Elemento3dOutDTO elemento3dOutDTO = new Elemento3dOutDTO();
        elemento3dOutDTO.setId(elementos.getId());
        elemento3dOutDTO.setNameElemento(elementos.getNameElemento());
        List<Tipo3dOutDTO> listTipo3DOutDTOS = new ArrayList<>();
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
            listTipo3DOutDTOS.add(dto);
        }
        elemento3dOutDTO.setTipo3d(listTipo3DOutDTOS);
        return elemento3dOutDTO;
    }

    public static Elemento2dOutDto elemento2dToOutDto(Elementos elementos){
        Elemento2dOutDto elemento2dOutDto = new Elemento2dOutDto();
        elemento2dOutDto.setId(elementos.getId());
        elemento2dOutDto.setNameElemento(elementos.getNameElemento());
        List<Tipo2dOutDTO> listTipo2dOutDTOS = new ArrayList<>();
        for (Tipo tipo : elementos.getTipos()){
            Tipo2dOutDTO dto = new Tipo2dOutDTO();
            dto.setId(tipo.getId());
            dto.setNameTipo(tipo.getNameTipo());
            dto.setCantidad(tipo.getCantidad());
            dto.setLargo(tipo.getMedidas2D().getLargo());
            dto.setAncho(tipo.getMedidas2D().getAncho());
            dto.setAreaUnidad(tipo.getAreas().getAreaUnidad());
            dto.setAreaTotal(tipo.getAreas().getAreaTotal());
            listTipo2dOutDTOS.add(dto);
        }
        elemento2dOutDto.setTipo2d(listTipo2dOutDTOS);
        return elemento2dOutDto;
    }

    public static Elementos dtoToEntityElemento(ElementoInDTO elementoInDTO){
        Elementos elementos = new Elementos();
        elementos.setNameElemento(elementoInDTO.getNameElemento());
        return elementos;
    }

    public static List<Elementos> dtoToEntityElementos(List<ElementoInDTO> elementoInDTOS){
        List<Elementos> elementos = new ArrayList<>();
        for (ElementoInDTO eI : elementoInDTOS){
            Elementos e = new Elementos();
            e.setNameElemento(eI.getNameElemento());
            elementos.add(e);
        }
        return elementos;
    }

    public static List<ElementosListOutDTO> allElementos(List<Elementos> elementos){
        List<ElementosListOutDTO> allElemetos = new ArrayList<>();
        for (Elementos e : elementos){
            ElementosListOutDTO eDto = new ElementosListOutDTO();
            eDto.setId(e.getId());
            eDto.setNameElemento(e.getNameElemento());
            allElemetos.add(eDto);
        }
        return allElemetos;
    }

    public static Elementos updateElemento(Elementos elemento, ElementoInDTO elementoInDTO){
        elemento.setNameElemento(elementoInDTO.getNameElemento());
        return elemento;
    }

}
