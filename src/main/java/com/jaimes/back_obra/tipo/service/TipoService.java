package com.jaimes.back_obra.tipo.service;

import com.jaimes.back_obra.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

public interface TipoService {

    //Borra por id tanto tipos 2d como 3d
    String deleteTipo(Long id);
    //Buscar, guargar, actualizar tipos3d
    Tipo3dOutDTO findTipo3dById(Long id);
    Tipo updateTipo3d(Tipo3dInDTO tipo3dInDTO);
    Tipo saveTipo3d(Tipo3dInDTO tipo3dInDTO);
    //Buscar, guargar, actualizar tipos2d
    Tipo2dOutDTO findTipo2dById(Long id);
    Tipo updateTipo2d(Tipo2dInDTO tipo2dInDTO);
    Tipo saveTipo2d(Tipo2dInDTO tipo2dInDTO);

}
