package com.jaimes.back_obra.assets.tipo.service;

import com.jaimes.back_obra.assets.message.MessageStatus;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo2dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.dto.output.TipoListOutDTO;
import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

import java.util.List;

public interface TipoService {

    //Borra por id tanto tipos 2d como 3d
    MessageStatus deleteTipo(Long id);
    List<TipoListOutDTO> findAllTipo();
    List<TipoOutDTO> findAllTipoModel();
    //Buscar, guargar, actualizar tipos3d
    TipoOutDTO findTipo3dById(Long id);
    MessageStatus updateTipo3d(Tipo3dConcretoInDTO tipo3DConcretoInDTO);
    MessageStatus saveTipo3d(Object object);
    //Buscar, guargar, actualizar tipos2d
    TipoOutDTO findTipo2dById(Long id);
    MessageStatus updateTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO);
    MessageStatus saveTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO);
    List<TipoOutDTO> findAllTipo2d();

}
