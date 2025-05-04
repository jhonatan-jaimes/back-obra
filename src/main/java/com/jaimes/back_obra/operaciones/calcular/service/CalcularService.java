package com.jaimes.back_obra.operaciones.calcular.service;

import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas2dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas2dCantidadAreasOutDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas3dCantidadAreasOutDTO;

public interface CalcularService {

    Medidas3dCantidadAreasOutDTO calcularTipo3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO);
    Medidas2dCantidadAreasOutDTO calcularTipo2d(Medidas2dCantidadInDTO medidas2DCantidadInDTO);

}
