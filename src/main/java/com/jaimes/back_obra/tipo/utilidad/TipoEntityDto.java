package com.jaimes.back_obra.tipo.utilidad;

import com.jaimes.back_obra.areas.entity.Areas;
import com.jaimes.back_obra.elementos.entity.Elementos;
import com.jaimes.back_obra.medidas3d.entity.Medidas3D;
import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

public class TipoEntityDto {
    public static Tipo dtoToEntity(TipoInDTO tipoInDTO){
        //Crea un nuevo elemento para ingresar el ID, NOMBRE y relacionarlo con el TIPO
        Elementos elementos = new Elementos();
        elementos.setId(tipoInDTO.getId());
        elementos.setNameElemento(tipoInDTO.getNameElemento());
        //Crea un nuevo tipo para introducir el nombre y relacionar con el elemento
        Tipo tipo = new Tipo();
        tipo.setNameTipo(tipoInDTO.getNameTipo());
        tipo.setCantidad(tipoInDTO.getCantidad());
        tipo.setElemento(elementos);
        //Crea un elemento medidas para introdicir los atributos
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(tipoInDTO.getLargo());
        medidas3D.setAncho(tipoInDTO.getAncho());
        medidas3D.setAlto(tipoInDTO.getAlto());
        medidas3D.setTipo(tipo);
        //Crea un elemento area para las areas que viene desde el front
        Areas areas = new Areas();
        areas.setAreaUnidad(tipoInDTO.getAreaUnidad());
        areas.setAreaTotal(tipoInDTO.getAreaTotal());
        areas.setTipo(tipo);
        //Relaciona las medidas y las áreas al tipo
        tipo.setMedidas3D(medidas3D);
        tipo.setAreas(areas);
        //Devuelve el OBJETO (TIPO)
        return tipo;
    }

    public static Tipo3dOutDTO entity3dToDto(Tipo tipo){
        Tipo3dOutDTO tipo3dOutDTO = new Tipo3dOutDTO();
        tipo3dOutDTO.setId(tipo.getId());
        tipo3dOutDTO.setNameTipo(tipo.getNameTipo());
        tipo3dOutDTO.setCantidad(tipo.getCantidad());
        tipo3dOutDTO.setLargo(tipo.getMedidas3D().getLargo());
        tipo3dOutDTO.setAncho(tipo.getMedidas3D().getAncho());
        tipo3dOutDTO.setAlto(tipo.getMedidas3D().getAlto());
        tipo3dOutDTO.setAreaUnidad(tipo.getAreas().getAreaUnidad());
        tipo3dOutDTO.setAreaTotal(tipo.getAreas().getAreaTotal());
        return tipo3dOutDTO;
    }
}
