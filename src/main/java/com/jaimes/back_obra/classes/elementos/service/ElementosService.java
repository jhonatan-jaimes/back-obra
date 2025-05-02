package com.jaimes.back_obra.classes.elementos.service;

import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.ElementoOutDTO;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;

public interface ElementosService {
    ElementoOutDTO findElemento(long id);
    Elementos saveElemetno(Tipo3dInDTO tipo3dInDTO);
}
