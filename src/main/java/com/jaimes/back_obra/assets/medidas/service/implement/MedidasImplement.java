package com.jaimes.back_obra.assets.medidas.service.implement;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.dto.Medidas2dDTO;
import com.jaimes.back_obra.assets.medidas.dto.Medidas3dDTO;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import com.jaimes.back_obra.assets.medidas.service.MedidasService;
import com.jaimes.back_obra.operaciones.utilidad.Transform;
import org.springframework.stereotype.Service;

@Service
public class MedidasImplement implements MedidasService {


    @Override
    public Medidas3dDTO cambiar(double largo, double ancho, double alto) {
        return new Medidas3dDTO(largo, ancho, alto);
    }

    @Override
    public Medidas2dDTO cambiar(double largo, double ancho) {
        return new Medidas2dDTO(largo, ancho);
    }
}
