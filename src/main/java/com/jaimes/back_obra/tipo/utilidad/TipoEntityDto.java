package com.jaimes.back_obra.tipo.utilidad;

import com.jaimes.back_obra.areas.entity.Areas;
import com.jaimes.back_obra.elementos.entity.Elementos;
import com.jaimes.back_obra.medidas2d.entity.Medidas2D;
import com.jaimes.back_obra.medidas3d.entity.Medidas3D;
import com.jaimes.back_obra.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

public class TipoEntityDto {
    public static Tipo dtoToEntity3d(Tipo3dInDTO tipo3dInDTO){
        //Crea un nuevo elemento para ingresar el ID, NOMBRE y relacionarlo con el TIPO
        Elementos elementos = new Elementos();
        elementos.setId(tipo3dInDTO.getId());
        elementos.setNameElemento(tipo3dInDTO.getNameElemento());
        //Crea un nuevo tipo para introducir el nombre y relacionar con el elemento
        Tipo tipo = new Tipo();
        tipo.setNameTipo(tipo3dInDTO.getNameTipo());
        tipo.setCantidad(tipo3dInDTO.getCantidad());
        tipo.setElemento(elementos);
        //Crea un elemento medidas para introdicir los atributos
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(tipo3dInDTO.getLargo());
        medidas3D.setAncho(tipo3dInDTO.getAncho());
        medidas3D.setAlto(tipo3dInDTO.getAlto());
        medidas3D.setTipo(tipo);
        //Crea un elemento area para las areas que viene desde el front
        Areas areas = new Areas();
        areas.setAreaUnidad(tipo3dInDTO.getAreaUnidad());
        areas.setAreaTotal(tipo3dInDTO.getAreaTotal());
        areas.setTipo(tipo);
        //Relaciona las medidas y las áreas al tipo
        tipo.setMedidas3D(medidas3D);
        tipo.setAreas(areas);
        //Devuelve el OBJETO (TIPO)
        return tipo;
    }

    public static Tipo3dOutDTO entity3dToDto(Tipo tipo){
        //Crea un TIPOOUTDTO para enviar el json
        Tipo3dOutDTO tipo3dOutDTO = new Tipo3dOutDTO();
        //Introdice todas las variables en el nuevo objeto
        tipo3dOutDTO.setId(tipo.getId());
        tipo3dOutDTO.setNameTipo(tipo.getNameTipo());
        tipo3dOutDTO.setCantidad(tipo.getCantidad());
        tipo3dOutDTO.setLargo(tipo.getMedidas3D().getLargo());
        tipo3dOutDTO.setAncho(tipo.getMedidas3D().getAncho());
        tipo3dOutDTO.setAlto(tipo.getMedidas3D().getAlto());
        tipo3dOutDTO.setAreaUnidad(tipo.getAreas().getAreaUnidad());
        tipo3dOutDTO.setAreaTotal(tipo.getAreas().getAreaTotal());
        //Devuelve el OBJETO (TIPOOUT)
        return tipo3dOutDTO;
    }

    public static Tipo updateTipo3d(Tipo tipo, Tipo3dInDTO tipo3dInDTO){
        //Asigna los nuevos valores para actualizar el TIPO
        tipo.setNameTipo(tipo3dInDTO.getNameTipo());
        tipo.setCantidad(tipo3dInDTO.getCantidad());
        tipo.getMedidas3D().setLargo(tipo3dInDTO.getLargo());
        tipo.getMedidas3D().setAncho(tipo3dInDTO.getAncho());
        tipo.getMedidas3D().setAlto(tipo3dInDTO.getAlto());
        tipo.getAreas().setAreaUnidad(tipo3dInDTO.getAreaUnidad());
        tipo.getAreas().setAreaTotal(tipo3dInDTO.getAreaTotal());
        //Devuelve el tipo para que se guarde
        return tipo;
    }

    public static Tipo dtoToEntity2d(Tipo2dInDTO tipo2dInDTO){
        //Crea un nuevo elemento para ingresar el ID, NOMBRE y relacionarlo con el TIPO
        Elementos elementos = new Elementos();
        elementos.setId(tipo2dInDTO.getId());
        elementos.setNameElemento(tipo2dInDTO.getNameElemento());
        //Crea un nuevo tipo para introducir el nombre y relacionar con el elemento
        Tipo tipo = new Tipo();
        tipo.setNameTipo(tipo2dInDTO.getNameTipo());
        tipo.setCantidad(tipo2dInDTO.getCantidad());
        tipo.setElemento(elementos);
        //Crea un elemento medidas para introdicir los atributos
        Medidas2D medidas2D = new Medidas2D();
        medidas2D.setLargo(tipo2dInDTO.getLargo());
        medidas2D.setAncho(tipo2dInDTO.getAncho());
        medidas2D.setTipo(tipo);
        //Crea un elemento area para las areas que viene desde el front
        Areas areas = new Areas();
        areas.setAreaUnidad(tipo2dInDTO.getAreaUnidad());
        areas.setAreaTotal(tipo2dInDTO.getAreaTotal());
        areas.setTipo(tipo);
        //Relaciona las medidas y las áreas al tipo
        tipo.setMedidas2D(medidas2D);
        tipo.setAreas(areas);
        //Devuelve el OBJETO (TIPO)
        return tipo;
    }

    public static Tipo2dOutDTO entity2dToDto(Tipo tipo){
        //Crea un TIPOOUTDTO para enviar el json
        Tipo2dOutDTO tipo2dOutDTO = new Tipo2dOutDTO();
        //Introdice todas las variables en el nuevo objeto
        tipo2dOutDTO.setId(tipo.getId());
        tipo2dOutDTO.setNameTipo(tipo.getNameTipo());
        tipo2dOutDTO.setCantidad(tipo.getCantidad());
        tipo2dOutDTO.setLargo(tipo.getMedidas2D().getLargo());
        tipo2dOutDTO.setAncho(tipo.getMedidas2D().getAncho());
        tipo2dOutDTO.setAreaUnidad(tipo.getAreas().getAreaUnidad());
        tipo2dOutDTO.setAreaTotal(tipo.getAreas().getAreaTotal());
        //Devuelve el OBJETO (TIPOOUT)
        return tipo2dOutDTO;
    }

    public static Tipo updateTipo2d(Tipo tipo, Tipo2dInDTO tipo2dinDTO){
        //Asigna los nuevos valores para actualizar el TIPO
        tipo.setNameTipo(tipo2dinDTO.getNameTipo());
        tipo.setCantidad(tipo2dinDTO.getCantidad());
        tipo.getMedidas2D().setLargo(tipo2dinDTO.getLargo());
        tipo.getMedidas2D().setAncho(tipo2dinDTO.getAncho());
        tipo.getAreas().setAreaUnidad(tipo2dinDTO.getAreaUnidad());
        tipo.getAreas().setAreaTotal(tipo2dinDTO.getAreaTotal());
        //Devuelve el tipo para que se guarde
        return tipo;
    }

}
