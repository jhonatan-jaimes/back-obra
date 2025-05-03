package com.jaimes.back_obra.operaciones.service;

import com.jaimes.back_obra.operaciones.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.dto.output.Medidas3dCantidadAreasOutDTO;

public interface CalcularService {

    Medidas3dCantidadAreasOutDTO calcularTipo3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO);

}
