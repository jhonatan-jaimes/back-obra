package com.jaimes.back_obra.operaciones.calcular.service.implement;

import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas2dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas2dCantidadAreasOutDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas3dCantidadAreasOutDTO;
import com.jaimes.back_obra.operaciones.calcular.service.CalcularService;
import com.jaimes.back_obra.operaciones.calcular.utilidad.CalcularMedidasDto;
import org.springframework.stereotype.Service;

@Service
public class CalcularImplement implements CalcularService {

    @Override
    public Medidas3dCantidadAreasOutDTO calcularTipo3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO) {
        return CalcularMedidasDto.calcularMedidas3d(medidas3dCantidadInDTO);
    }

    @Override
    public Medidas2dCantidadAreasOutDTO calcularTipo2d(Medidas2dCantidadInDTO medidas2DCantidadInDTO) {
        return CalcularMedidasDto.calcularMedidas2d(medidas2DCantidadInDTO);
    }
}
