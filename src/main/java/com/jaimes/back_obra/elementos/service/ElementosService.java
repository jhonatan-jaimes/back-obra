package com.jaimes.back_obra.elementos.service;

import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.elementos.entity.Elementos;

public interface ElementosService {
    ElementoOutDTO findElemento(long id);
    Elementos saveElemetno(Tipo3dInDTO tipo3dInDTO);
}
