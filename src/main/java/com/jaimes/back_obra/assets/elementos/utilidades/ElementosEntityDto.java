package com.jaimes.back_obra.assets.elementos.utilidades;

import com.jaimes.back_obra.assets.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.assets.elementos.dto.output.*;
import com.jaimes.back_obra.assets.elementos.dto.output.ElementoToDTO;
import com.jaimes.back_obra.assets.elementos.entity.Elementos;
import com.jaimes.back_obra.assets.tipo.utilidad.TipoToDto;
import java.util.List;

public class ElementosEntityDto {

    /*
    * Toma un elemento que viene desde la base de datos y lo convierte en un elemento DTO para enviarlo
    * al frontend
    * */
    public static ElementoTipoToDTO elementoToTiposDto(Elementos elementos){
        return new ElementoTipoToDTO(
                elementos.getId(),
                elementos.getNameElemento(),
                elementos.getTipos().stream()
                        .map(TipoToDto::tipoOutModelDto)
                        .toList()
        );
    }

    /*
    * Toma un elemento que viene de la base de datos y lo convierte a DTO, pero con la diferente que
    * muestra la cantidad de elementos tipos tiene en su interior.
    * */
    public static ElementoToDTO elementoToDto(Elementos elementos){
        return new ElementoToDTO(
                elementos.getId(),
                elementos.getNameElemento(),
                elementos.getTipos().size()
        );
    }

    public static ElementoTipoToDTO elementos3dToDto(Elementos elementos){

        return new ElementoTipoToDTO(
                elementos.getId(),
                elementos.getNameElemento(),
                elementos.getTipos().stream()
                        .map(TipoToDto::tipoOutModelDto)
                        .filter(e -> e.medidasTipo().equalsIgnoreCase("3d"))
                        .toList()
        );
    }

    public static ElementoTipoToDTO elementos2dToDto(Elementos elementos){

        return new ElementoTipoToDTO(
                elementos.getId(),
                elementos.getNameElemento(),
                elementos.getTipos().stream()
                        .map(TipoToDto::tipoOutModelDto)
                        .filter(e -> e.medidasTipo().equalsIgnoreCase("2d"))
                        .toList()
        );
    }

    public static Elementos dtoToEntityElemento(ElementoInDTO elementoInDTO){

        return new Elementos(
                elementoInDTO.getId(),
                elementoInDTO.getNameElemento(),
                null
        );
    }

    public static List<Elementos> dtoToEntityElementos(List<ElementoInDTO> elementoInDTOS){

        return elementoInDTOS.stream()
                .map(ElementosEntityDto::dtoToEntityElemento)
                .toList();
    }

    public static List<ElementoToDTO> allElementos(List<Elementos> elementos){

        return elementos.stream()
                .map(ElementosEntityDto::elementoToDto)
                .toList();
    }

    public static List<ElementoTipoToDTO> allElementosTipo(List<Elementos> elementos){

        return elementos.stream()
                .map(ElementosEntityDto::elementoToTiposDto)
                .toList();
    }

    public static Elementos updateElemento(Elementos elemento, ElementoInDTO elementoInDTO){
        elemento.setNameElemento(elementoInDTO.getNameElemento());
        return elemento;
    }

}
