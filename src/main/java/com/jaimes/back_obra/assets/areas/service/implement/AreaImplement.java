package com.jaimes.back_obra.assets.areas.service.implement;

import com.jaimes.back_obra.assets.areas.dto.AreasDTO;
import com.jaimes.back_obra.assets.areas.service.AreaService;
import com.jaimes.back_obra.assets.medidas.dto.Medidas2dDTO;
import com.jaimes.back_obra.assets.medidas.dto.Medidas3dDTO;
import com.jaimes.back_obra.assets.medidas.service.MedidasService;
import com.jaimes.back_obra.assets.medidas.service.implement.MedidasImplement;
import com.jaimes.back_obra.operaciones.utilidad.Transform;
import org.springframework.stereotype.Service;

@Service
public class AreaImplement implements AreaService {

    private final MedidasService medidasService = new MedidasImplement();

    @Override
    public AreasDTO calcular(Medidas3dDTO medidas, int cantidad) {
        if (medidas.largo() == null || medidas.ancho() == null || medidas.alto() == null){
            throw new RuntimeException("No puede haber medidas nulas");
        }

        if (medidas.largo() <= 0 || medidas.ancho() <= 0 || medidas.alto() <= 0 || cantidad <= 0){
            throw new RuntimeException("Las medidas no pueden valer 0 o inferior");
        }

        // Se multiplica por constante para convertirlo en número entero y asi tener mayor precision

        final double areaMili = Transform.METROS_TO_MILIMETROS.convertir(medidas.largo()) *
                Transform.METROS_TO_MILIMETROS.convertir(medidas.ancho()) *
                Transform.METROS_TO_MILIMETROS.convertir(medidas.alto());

        final double areaOne = Math.round(Transform.MILIMETROS3_TO_METROS3.convertir(areaMili) * 100.0) / 100.0;
        final double areaAll = Math.round(Transform.MILIMETROS3_TO_METROS3.convertir(areaMili * cantidad)
                * 100.0) / 100.0;

        return new AreasDTO(areaOne, areaAll);
    }

    @Override
    public AreasDTO calcular(double largo, double ancho, double alto, int cantidad){
        if(largo <= 0 || ancho <= 0|| alto <= 0 || cantidad <= 0){
            throw new RuntimeException("Los valores no pueden ser cero ni negativo");
        }

        return calcular(medidasService.cambiar(largo, ancho, alto), cantidad);
    }

    @Override
    public AreasDTO calcular(double largo, double ancho, int cantidad){
        if(largo <= 0 || ancho <= 0|| cantidad <= 0){
            throw new RuntimeException("Los valores no pueden ser cero ni negativo");
        }

        return calcular(medidasService.cambiar(largo, ancho), cantidad);
    }

    @Override
    public AreasDTO calcular(Medidas2dDTO medidas, int cantidad) {
        if (medidas.largo() == null || medidas.ancho() == null){
            throw new RuntimeException("No puede haber medidas nulas");
        }

        if (medidas.largo() <= 0 || medidas.ancho() <= 0){
            throw new RuntimeException("Las medidas no pueden valer 0");
        }

        final double areaMili = Transform.METROS_TO_MILIMETROS.convertir(medidas.largo()) *
                Transform.METROS_TO_MILIMETROS.convertir(medidas.ancho());

        // Se multiplica por constante para convertirlo en número entero y asi tener mayor precision
        final double areaOne = Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaMili) * 100.0) / 100.0;
        final double areaAll = Math.round(Transform.MILIMETROS3_TO_METROS3.convertir(areaMili * cantidad)
                * 100.0) / 100.0;

        return new AreasDTO(areaOne, areaAll);
    }
}
