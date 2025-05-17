package com.jaimes.back_obra.classes.elementos.service;

import com.jaimes.back_obra.classes.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento2dOutDto;
import com.jaimes.back_obra.classes.elementos.dto.output.Elemento3dOutDTO;
import com.jaimes.back_obra.classes.elementos.dto.output.ElementosListOutDTO;
import com.jaimes.back_obra.classes.elementos.repository.ConcretoPsi;
import com.jaimes.back_obra.classes.elementos.repository.MorteroPsi;

import java.util.List;

public interface ElementosService {

    Elemento3dOutDTO findElemento3d(Long id);
    Elemento2dOutDto findElemento2d(Long id);
    String saveElemento(ElementoInDTO elementoInDTO);
    String saveAllElementos(List<ElementoInDTO> elementoInDTO);
    String deleteElemento(Long id);
    List<ElementosListOutDTO> allElemetnos();
    String updateElemento(ElementoInDTO elementoInDTO);
    List<ConcretoPsi> materialPsiConcreto();
    List<MorteroPsi> materialPsiMortero();
}
