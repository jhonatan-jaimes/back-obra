package com.jaimes.back_obra.elementos.service.implement;

import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.elementos.entity.Elementos;
import com.jaimes.back_obra.elementos.repository.ElementosRepository;
import com.jaimes.back_obra.elementos.service.ElementosService;
import com.jaimes.back_obra.elementos.utilidades.ElementosEntityToDto;
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
    public Elementos saveElemetno(TipoInDTO tipoInDTO) {
        return null;
    }
}
