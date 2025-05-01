package com.jaimes.back_obra.tipo.service;

import com.jaimes.back_obra.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.TipoAllOutDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

import java.util.List;

public interface TipoService {

    //Borra por id tanto tipos 2d como 3d
    String deleteTipo(Long id);
    List<TipoAllOutDTO> findAllTipo();
    //Buscar, guargar, actualizar tipos3d
    Tipo3dOutDTO findTipo3dById(Long id);
    Tipo updateTipo3d(Tipo3dInDTO tipo3dInDTO);
    Tipo saveTipo3d(Tipo3dInDTO tipo3dInDTO);
    List<Tipo3dOutDTO> findAllTipo3d();
    //Buscar, guargar, actualizar tipos2d
    Tipo2dOutDTO findTipo2dById(Long id);
    Tipo updateTipo2d(Tipo2dInDTO tipo2dInDTO);
    Tipo saveTipo2d(Tipo2dInDTO tipo2dInDTO);
    List<Tipo2dOutDTO> findAllTipo2d();

}
