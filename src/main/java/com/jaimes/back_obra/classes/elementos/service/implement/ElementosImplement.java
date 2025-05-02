package com.jaimes.back_obra.classes.elementos.service.implement;

import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.elementos.repository.ElementosRepository;
import com.jaimes.back_obra.classes.elementos.service.ElementosService;
import com.jaimes.back_obra.classes.elementos.utilidades.ElementosEntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementosImplement implements ElementosService {

    private final ElementosRepository elementosRepository;

    @Autowired
    public ElementosImplement(ElementosRepository elementosRepository) {
        this.elementosRepository = elementosRepository;
    }

    @Override
    public ElementoOutDTO findElemento(long id) {
        Elementos elementos = elementosRepository.findById(id).orElseThrow();
        ElementoOutDTO elementoOutDTO = ElementosEntityToDto.elementoOutDTO(elementos);
        return elementoOutDTO;
    }

    @Override
    public Elementos saveElemetno(Tipo3dInDTO tipo3dInDTO) {
        return null;
    }
}
