package com.jaimes.back_obra.assets.medidas.service.implement;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import com.jaimes.back_obra.assets.medidas.service.MedidasService;
import com.jaimes.back_obra.operaciones.utilidad.Transform;
import org.springframework.stereotype.Service;

@Service
public class MedidasImplement implements MedidasService {

    @Override
    public Areas calcularAreas(Medidas3D medidas, int cantidad) {

        // Se multiplica por constante para convertirlo en número entero y asi tener mayor precision
        final double areaOne = Math.round(Transform.MILIMETROS3_TO_METROS3.convertir(
                Transform.METROS_TO_MILIMETROS.convertir(medidas.getLargo()) *
                        Transform.METROS_TO_MILIMETROS.convertir(medidas.getAncho()) *
                        Transform.METROS_TO_MILIMETROS.convertir(medidas.getAlto())) * 100.0 / 100.0);
        final double areaAll = areaOne * cantidad;
        return new Areas(
                null,
                areaOne,
                areaAll,
                null
        );
    }

    @Override
    public Areas calcularAreas(Medidas2D medidas, int cantidad) {
        // Se multiplica por constante para convertirlo en número entero y asi tener mayor precision
        final double areaOne = Math.round(Transform.MILIMETROS3_TO_METROS3.convertir(
                Transform.METROS_TO_MILIMETROS.convertir(medidas.getLargo()) *
                        Transform.METROS_TO_MILIMETROS.convertir(medidas.getAncho())) * 100.0 / 100.0);
        final double areaAll = areaOne * cantidad;
        return new Areas(
                null,
                areaOne,
                areaAll,
                null
        );
    }
}
