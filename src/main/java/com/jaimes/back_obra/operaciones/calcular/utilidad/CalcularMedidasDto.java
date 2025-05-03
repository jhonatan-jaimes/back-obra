package com.jaimes.back_obra.operaciones.calcular.utilidad;

import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas2dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas2dCantidadAreasOutDTO;
import com.jaimes.back_obra.operaciones.calcular.dto.output.Medidas3dCantidadAreasOutDTO;
import jakarta.servlet.http.PushBuilder;

public class CalcularMedidasDto {

    public static Medidas3dCantidadAreasOutDTO calcularMedidas3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO){
        Medidas3dCantidadAreasOutDTO medidas3dCantidadAreasOutDTO = new Medidas3dCantidadAreasOutDTO();
        Double areaUnidad = ((medidas3dCantidadInDTO.getLargo() * Constantes.METROS_A_MILIMETROS) *
                (medidas3dCantidadInDTO.getAncho() * Constantes.METROS_A_MILIMETROS) *
                (medidas3dCantidadInDTO.getAlto() * Constantes.METROS_A_MILIMETROS)) /
                Constantes.MILIMETROS3_A_METROS3;
        Double areaTotal = areaUnidad * medidas3dCantidadInDTO.getCantidad();
        medidas3dCantidadAreasOutDTO.setLargo(medidas3dCantidadInDTO.getLargo());
        medidas3dCantidadAreasOutDTO.setAncho(medidas3dCantidadInDTO.getAncho());
        medidas3dCantidadAreasOutDTO.setAlto(medidas3dCantidadInDTO.getAlto());
        medidas3dCantidadAreasOutDTO.setCantidad(medidas3dCantidadInDTO.getCantidad());
        medidas3dCantidadAreasOutDTO.setAreaUnidad(areaUnidad);
        medidas3dCantidadAreasOutDTO.setAreaTotal(areaTotal);
        return medidas3dCantidadAreasOutDTO;
    }

    public static Medidas2dCantidadAreasOutDTO calcularMedidas2d(Medidas2dCantidadInDTO medidas2dCantidadInDTO){
        Medidas2dCantidadAreasOutDTO medidas2dCantidadAreasOutDTO = new Medidas2dCantidadAreasOutDTO();
        Double areaUnidad = ((medidas2dCantidadInDTO.getLargo() * Constantes.METROS_A_MILIMETROS) *
                (medidas2dCantidadInDTO.getAncho() * Constantes.METROS_A_MILIMETROS)) /
                Constantes.MILIMETROS2_A_METROS2;
        Double areaTotal = areaUnidad * medidas2dCantidadInDTO.getCantidad();
        medidas2dCantidadAreasOutDTO.setLargo(medidas2dCantidadInDTO.getLargo());
        medidas2dCantidadAreasOutDTO.setAncho(medidas2dCantidadInDTO.getAncho());
        medidas2dCantidadAreasOutDTO.setCantidad(medidas2dCantidadInDTO.getCantidad());
        medidas2dCantidadAreasOutDTO.setAreaUnidad(areaUnidad);
        medidas2dCantidadAreasOutDTO.setAreaTotal(areaTotal);
        return medidas2dCantidadAreasOutDTO;
    }
}
