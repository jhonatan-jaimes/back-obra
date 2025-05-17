package com.jaimes.back_obra.classes.tipo.service;

import com.jaimes.back_obra.classes.tipo.dto.input.Tipo2dConcretoInDTO;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.TipoAllOutDTO;

import java.util.List;

public interface TipoService {

    //Borra por id tanto tipos 2d como 3d
    String deleteTipo(Long id);
    List<TipoAllOutDTO> findAllTipo();
    //Buscar, guargar, actualizar tipos3d
    Tipo3dOutDTO findTipo3dById(Long id);
    String updateTipo3d(Tipo3dConcretoInDTO tipo3DConcretoInDTO);
    String saveTipo3d(Object object);
    List<Tipo3dOutDTO> findAllTipo3d();
    //Buscar, guargar, actualizar tipos2d
    Tipo2dOutDTO findTipo2dById(Long id);
    String updateTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO);
    String saveTipo2d(Tipo2dConcretoInDTO tipo2DConcretoInDTO);
    List<Tipo2dOutDTO> findAllTipo2d();

}
