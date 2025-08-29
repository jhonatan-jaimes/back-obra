package com.jaimes.back_obra.operaciones.calcular_medidas.service.implement;

import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado2DOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado3DOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.service.CalcularService;
import org.springframework.stereotype.Service;

@Service
public class CalcularImplement implements CalcularService {

    @Override
    public Calculado3DOutDTO calcularTipo3d(Calcular3DInDTO calcular3DInDTO) {
        return null;
    }

    @Override
    public Calculado2DOutDTO calcularTipo2d(Calcular2DInDTO calcular2DInDTO) {
        return null;
    }
}
