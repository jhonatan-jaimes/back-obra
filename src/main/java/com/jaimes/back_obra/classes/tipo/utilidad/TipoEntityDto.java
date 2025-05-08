package com.jaimes.back_obra.classes.tipo.utilidad;

import com.jaimes.back_obra.classes.areas.entity.Areas;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.medidas.Medidas2D;
import com.jaimes.back_obra.classes.medidas.Medidas3D;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.TipoAllOutDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;

import java.util.ArrayList;
import java.util.List;

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
        Tipo3dOutDTO tipo3DOneOutDTO = new Tipo3dOutDTO();
        //Introdice todas las variables en el nuevo objeto
        tipo3DOneOutDTO.setId(tipo.getId());
        tipo3DOneOutDTO.setNameTipo(tipo.getNameTipo());
        tipo3DOneOutDTO.setCantidad(tipo.getCantidad());
        tipo3DOneOutDTO.setLargo(tipo.getMedidas3D().getLargo());
        tipo3DOneOutDTO.setAncho(tipo.getMedidas3D().getAncho());
        tipo3DOneOutDTO.setAlto(tipo.getMedidas3D().getAlto());
        tipo3DOneOutDTO.setAreaUnidad(tipo.getAreas().getAreaUnidad());
        tipo3DOneOutDTO.setAreaTotal(tipo.getAreas().getAreaTotal());
        //Devuelve el OBJETO (TIPOOUT)
        return tipo3DOneOutDTO;
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
        Tipo2dOutDTO tipo2DOutDTO = new Tipo2dOutDTO();
        //Introdice todas las variables en el nuevo objeto
        tipo2DOutDTO.setId(tipo.getId());
        tipo2DOutDTO.setNameTipo(tipo.getNameTipo());
        tipo2DOutDTO.setCantidad(tipo.getCantidad());
        tipo2DOutDTO.setLargo(tipo.getMedidas2D().getLargo());
        tipo2DOutDTO.setAncho(tipo.getMedidas2D().getAncho());
        tipo2DOutDTO.setAreaUnidad(tipo.getAreas().getAreaUnidad());
        tipo2DOutDTO.setAreaTotal(tipo.getAreas().getAreaTotal());
        //Devuelve el OBJETO (TIPOOUT)
        return tipo2DOutDTO;
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

    public static List<TipoAllOutDTO> listAllTipos(List<Tipo> tipos){
        //Crea una lista de tipos para enviarla
        List<TipoAllOutDTO> tipoAllOutDTOS = new ArrayList<>();
        //Recorre los tipos para asignarlos a la lista
        for(Tipo t : tipos){
            TipoAllOutDTO tl = new TipoAllOutDTO();
            tl.setId(t.getId());
            tl.setNameTipo(t.getNameTipo());
            tipoAllOutDTOS.add(tl);
        }
        //Devuelve la lista
        return tipoAllOutDTOS;
    }

    public static List<Tipo3dOutDTO> listTipo3d(List<Tipo> tipos){
        //Crea una lista de Tipos3d para enviarla
        List<Tipo3dOutDTO> tipos3dOutDTO = new ArrayList<>();
        //Recorre la lista de tipos para introducirla a la lista
        for (Tipo t : tipos){
            if(t.getMedidas2D() == null){
                Tipo3dOutDTO t3d = new Tipo3dOutDTO();
                t3d.setId(t.getId());
                t3d.setNameTipo(t.getNameTipo());
                t3d.setCantidad(t.getCantidad());
                t3d.setLargo(t.getMedidas3D().getLargo());
                t3d.setAncho(t.getMedidas3D().getAncho());
                t3d.setAlto(t.getMedidas3D().getAlto());
                t3d.setAreaUnidad(t.getAreas().getAreaUnidad());
                t3d.setAreaTotal(t.getAreas().getAreaTotal());
                tipos3dOutDTO.add(t3d);
            }
        }
        //Devuelve la losta de tipos3d
        return tipos3dOutDTO;
    }

    public static List<Tipo2dOutDTO> listTipo2d(List<Tipo> tipos){
        //Crea una lista de Tipos2d para enviarla
        List<Tipo2dOutDTO> tipos2dOutDTO = new ArrayList<>();
        //Recorre la lista de tipos para introducirla a la lista
        for(Tipo t : tipos){
            if(t.getMedidas3D() == null){
                Tipo2dOutDTO t2d = new Tipo2dOutDTO();
                t2d.setId(t.getId());
                t2d.setNameTipo(t.getNameTipo());
                t2d.setCantidad(t.getCantidad());
                t2d.setLargo(t.getMedidas2D().getLargo());
                t2d.setAncho(t.getMedidas2D().getAncho());
                t2d.setAreaUnidad(t.getAreas().getAreaUnidad());
                t2d.setAreaTotal(t.getAreas().getAreaTotal());
                tipos2dOutDTO.add(t2d);
            }
        }
        //Devuelve la losta de tipos2d
        return tipos2dOutDTO;
    }

}
