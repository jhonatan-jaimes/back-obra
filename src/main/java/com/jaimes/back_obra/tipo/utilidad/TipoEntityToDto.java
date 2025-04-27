package com.jaimes.back_obra.tipo.utilidad;

import com.jaimes.back_obra.areas.entity.Areas;
import com.jaimes.back_obra.elementos.entity.Elementos;
import com.jaimes.back_obra.medidas3d.entity.Medidas3D;
import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

public class TipoEntityToDto {
    public static Tipo dtoToEntity(TipoInDTO tipoInDTO){
        Elementos elementos = new Elementos();
        elementos.setId(tipoInDTO.getId());
        elementos.setNameElemento(tipoInDTO.getNameElemento());
        Tipo tipo = new Tipo();
        tipo.setNameTipo(tipoInDTO.getNameTipo());
        tipo.setCantidad(tipoInDTO.getCantidad());
        tipo.setElemento(elementos);
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(tipoInDTO.getLargo());
        medidas3D.setAncho(tipoInDTO.getAncho());
        medidas3D.setAlto(tipoInDTO.getAlto());
        medidas3D.setTipo(tipo);
        Areas areas = new Areas();
        areas.setAreaUnidad(tipoInDTO.getAreaUnidad());
        areas.setAreaTotal(tipoInDTO.getAreaTotal());
        areas.setTipo(tipo);

        tipo.setMedidas3D(medidas3D);
        tipo.setAreas(areas);

        return tipo;
    }
}
