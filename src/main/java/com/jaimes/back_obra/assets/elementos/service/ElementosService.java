package com.jaimes.back_obra.assets.elementos.service;

import com.jaimes.back_obra.assets.elementos.dto.input.ElementoInDTO;
import com.jaimes.back_obra.assets.elementos.dto.output.*;
import com.jaimes.back_obra.assets.elementos.repository.ConcretoPsi;
import com.jaimes.back_obra.assets.elementos.repository.MorteroPsi;
import com.jaimes.back_obra.assets.message.MessageStatus;

import java.util.List;

public interface ElementosService {

    ElementoToDTO findElemento(Long id);
    ElementoTipoToDTO findElemento2d(Long id);
    MessageStatus saveElemento(ElementoInDTO elementoInDTO);
    MessageStatus saveAllElementos(List<ElementoInDTO> elementoInDTO);
    MessageStatus deleteElemento(Long id);
    List<ElementoToDTO> allElemetnos();
    List<ElementoTipoToDTO> allElemetnosTipo();
    String updateElemento(ElementoInDTO elementoInDTO);
    List<ConcretoPsi> materialPsiConcreto();
    List<MorteroPsi> materialPsiMortero();
}
