package com.jaimes.back_obra.assets.elementos.service.implement;

import com.jaimes.back_obra.assets.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.assets.elementos.dto.output.ElementoTipoToDTO;
import com.jaimes.back_obra.assets.elementos.dto.output.ElementoToDTO;
import com.jaimes.back_obra.assets.elementos.entity.Elementos;
import com.jaimes.back_obra.assets.elementos.repository.ConcretoPsi;
import com.jaimes.back_obra.assets.elementos.repository.ElementosRepository;
import com.jaimes.back_obra.assets.elementos.repository.MorteroPsi;
import com.jaimes.back_obra.assets.elementos.service.ElementosService;
import com.jaimes.back_obra.assets.elementos.utilidades.ElementosEntityDto;
import com.jaimes.back_obra.assets.message.MessageStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElementosImplement implements ElementosService {

    private final ElementosRepository elementosRepository;

    @Autowired
    public ElementosImplement(ElementosRepository elementosRepository) {
        this.elementosRepository = elementosRepository;
    }

    @Override
    public ElementoToDTO findElemento(Long id) {
        Elementos elementos = elementosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Elemento no encontrado con id: " + id));
        return ElementosEntityDto.elementoToDto(elementos);
    }

    @Override
    public MessageStatus saveElemento(ElementoInDTO elementoInDTO) {
        Elementos elemento = ElementosEntityDto.dtoToEntityElemento(elementoInDTO);
        elementosRepository.save(elemento);
        return new MessageStatus("Guardado");
    }

    @Override
    public MessageStatus saveAllElementos(List<ElementoInDTO> elementoInDTO) {
        List<Elementos> elementos = ElementosEntityDto.dtoToEntityElementos(elementoInDTO);
        elementosRepository.saveAll(elementos);
        return new MessageStatus("Guardados");
    }

    @Override
    public MessageStatus deleteElemento(Long id) {
        elementosRepository.deleteById(id);
        return new MessageStatus("Eliminado");
    }

    @Override
    public ElementoTipoToDTO findElemento2d(Long id) {
        Elementos elementos = elementosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Elemento no encontrado con id: " + id));
        return ElementosEntityDto.elementos2dToDto(elementos);
    }

    @Override
    public List<ElementoToDTO> allElemetnos() {
        List<Elementos> elementos = elementosRepository.findAll();
        return ElementosEntityDto.allElementos(elementos);
    }

    @Override
    public List<ElementoTipoToDTO> allElemetnosTipo(){
        List<Elementos> elementos = elementosRepository.findAll();
        return ElementosEntityDto.allElementosTipo(elementos);
    }

    @Override
    public String updateElemento(ElementoInDTO elementoInDTO) {
        Elementos elemento = elementosRepository.findById(elementoInDTO.getId())
                .orElseThrow(() -> new RuntimeException("El elemento no fue encontrado"));
        ElementosEntityDto.updateElemento(elemento, elementoInDTO);
        elementosRepository.save(elemento);
        return "Actualizado";
    }

    @Override
    public List<ConcretoPsi> materialPsiConcreto() {
        List<ConcretoPsi> concretoPsi = new ArrayList<>();
        concretoPsi.add(new ConcretoPsi(1L, "4000"));
        concretoPsi.add(new ConcretoPsi(2L, "3224"));
        concretoPsi.add(new ConcretoPsi(3L, "2850"));
        return concretoPsi;
    }

    @Override
    public List<MorteroPsi> materialPsiMortero() {
        List<MorteroPsi> morteroPsi = new ArrayList<>();
        morteroPsi.add(new MorteroPsi(1L, "4400"));
        morteroPsi.add(new MorteroPsi(2L, "3980"));
        morteroPsi.add(new MorteroPsi(3L, "3400"));
        return morteroPsi;
    }
}
