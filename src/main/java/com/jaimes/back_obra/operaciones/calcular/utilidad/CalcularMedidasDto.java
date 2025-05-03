package com.jaimes.back_obra.operaciones.utilidad;

import com.jaimes.back_obra.operaciones.dto.input.Medidas3dCantidadInDTO;
import com.jaimes.back_obra.operaciones.dto.output.Medidas3dCantidadAreasOutDTO;

public class CalcularMedidasDto {

    public static Medidas3dCantidadAreasOutDTO calcularMedidas3d(Medidas3dCantidadInDTO medidas3dCantidadInDTO){
        Medidas3dCantidadAreasOutDTO medidas3dCantidadAreasOutDTO = new Medidas3dCantidadAreasOutDTO();
        Double areaUnidad = ((medidas3dCantidadInDTO.getLargo() * Constantes3D.METROS_A_MILIMETROS) *
                (medidas3dCantidadInDTO.getAncho() * Constantes3D.METROS_A_MILIMETROS) *
                (medidas3dCantidadInDTO.getAlto() * Constantes3D.METROS_A_MILIMETROS)) /
                Constantes3D.MILIMETROS3_A_METROS3;
        Double areaTotal = areaUnidad * medidas3dCantidadInDTO.getCantidad();
        medidas3dCantidadAreasOutDTO.setLargo(medidas3dCantidadInDTO.getLargo());
        medidas3dCantidadAreasOutDTO.setAncho(medidas3dCantidadInDTO.getAncho());
        medidas3dCantidadAreasOutDTO.setAlto(medidas3dCantidadInDTO.getAlto());
        medidas3dCantidadAreasOutDTO.setCantidad(medidas3dCantidadInDTO.getCantidad());
        medidas3dCantidadAreasOutDTO.setAreaUnidad(areaUnidad);
        medidas3dCantidadAreasOutDTO.setAreaTotal(areaTotal);
        return medidas3dCantidadAreasOutDTO;
    }
}
