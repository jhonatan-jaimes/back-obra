package com.jaimes.back_obra.operaciones.service.implement;

import com.jaimes.back_obra.operaciones.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.dto.output.Medidas3dCantidadAreasOutDTO;
import com.jaimes.back_obra.operaciones.service.CalcularService;
import com.jaimes.back_obra.operaciones.utilidad.CalcularMedidasDto;
import org.springframework.stereotype.Service;

@Service
public class CalcularImplement implements CalcularService {

    @Override
    public Medidas3dCantidadAreasOutDTO calcularTipo3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO) {
        return CalcularMedidasDto.calcularMedidas3d(medidas3dCantidadInDTO);
    }
}
