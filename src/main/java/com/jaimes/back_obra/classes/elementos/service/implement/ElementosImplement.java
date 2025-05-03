package com.jaimes.back_obra.classes.elementos.service.implement;

import com.jaimes.back_obra.classes.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento2dOutDto;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento3dOutDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.ElementosListOutDTO;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.elementos.repository.ElementosRepository;
import com.jaimes.back_obra.classes.elementos.service.ElementosService;
import com.jaimes.back_obra.classes.elementos.utilidades.ElementosEntityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementosImplement implements ElementosService {

    private final ElementosRepository elementosRepository;

    @Autowired
    public ElementosImplement(ElementosRepository elementosRepository) {
        this.elementosRepository = elementosRepository;
    }

    @Override
    public Elemento3dOutDTO findElemento3d(Long id) {
        Elementos elementos = elementosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Elemento no encontrado"));
        return ElementosEntityDto.elemento3dToOutDTO(elementos);
    }

    @Override
    public String saveElemento(ElementoInDTO elementoInDTO) {
        Elementos elemento = ElementosEntityDto.dtoToEntityElemento(elementoInDTO);
        elementosRepository.save(elemento);
        return "Guardado";
    }

    @Override
    public String saveAllElementos(List<ElementoInDTO> elementoInDTO) {
        List<Elementos> elementos = ElementosEntityDto.dtoToEntityElementos(elementoInDTO);
        elementosRepository.saveAll(elementos);
        return "Guardados";
    }

    @Override
    public String deleteElemento(Long id) {
        elementosRepository.deleteById(id);
        return "Eliminado";
    }

    @Override
    public Elemento2dOutDto findElemento2d(Long id) {
        Elementos elementos = elementosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Elemento no encontrado"));
        return ElementosEntityDto.elemento2dToOutDto(elementos);
    }

    @Override
    public List<ElementosListOutDTO> allElemetnos() {
        List<Elementos> elementos = elementosRepository.findAll();
        return ElementosEntityDto.allElementos(elementos);
    }

    @Override
    public String updateElemento(ElementoInDTO elementoInDTO) {
        Elementos elemento = elementosRepository.findById(elementoInDTO.getId())
                .orElseThrow(() -> new RuntimeException("El elemento no fue encontrado"));
        ElementosEntityDto.updateElemento(elemento, elementoInDTO);
        elementosRepository.save(elemento);
        return "Actualizado";
    }
}
