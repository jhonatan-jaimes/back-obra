package com.jaimes.back_obra.assets.medidas.service.implement;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas;
import com.jaimes.back_obra.assets.medidas.service.MedidasService;
import com.jaimes.back_obra.operaciones.utilidad.Constantes;
import org.springframework.stereotype.Service;

import java.awt.geom.Area;
import java.math.BigDecimal;

@Service
public class MedidasImplement implements MedidasService {

    @Override
    public Areas calcularAreas(Medidas medidas, Integer cantdad) {

        // Se multiplica por constante para convertirlo en número entero y asi tener mayor precision
        final double areaOne = Math.round(((medidas.getAlto() * Constantes.METROS3_A_MILIMETROS3)
                * (medidas.getAncho() * Constantes.METROS_A_MILIMETROS)
                * (medidas.getAlto() * Constantes.METROS_A_MILIMETROS)
                / Constantes.MILIMETROS3_A_METROS3) * 100.0) / 100.0;
        final double areaAll = areaOne * cantdad;
        return new Areas(
                null,
                areaOne,
                areaAll,
                null
        );
    }
}
