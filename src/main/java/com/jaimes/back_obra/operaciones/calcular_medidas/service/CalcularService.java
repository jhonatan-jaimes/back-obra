package com.jaimes.back_obra.operaciones.calcular_medidas.service;

import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3dInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calcular2dOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calcular3dOutDTO;

public interface CalcularService {

    Calcular3dOutDTO calcular(Calcular3dInDTO calcular3DInDTO);
    Calcular2dOutDTO calcular(Calcular2dInDTO calcular2DInDTO);

}
