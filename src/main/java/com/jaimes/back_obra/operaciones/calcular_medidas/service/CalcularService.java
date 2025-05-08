package com.jaimes.back_obra.operaciones.calcular_medidas.service;

import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado2DOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado3DOutDTO;

public interface CalcularService {

    Calculado3DOutDTO calcularTipo3d(Calcular3DInDTO calcular3DInDTO);
    Calculado2DOutDTO calcularTipo2d(Calcular2DInDTO calcular2DInDTO);

}
