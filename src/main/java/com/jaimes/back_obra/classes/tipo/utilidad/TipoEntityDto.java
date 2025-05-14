package com.jaimes.back_obra.classes.tipo.utilidad;

import com.jaimes.back_obra.classes.areas.entity.Areas;
import com.jaimes.back_obra.classes.concreto.entity.Concreto;
import com.jaimes.back_obra.classes.elementos.entity.Elementos;
import com.jaimes.back_obra.classes.medidas.Medidas2D;
import com.jaimes.back_obra.classes.medidas.Medidas3D;
import com.jaimes.back_obra.classes.mortero.entity.Mortero;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo2dInDTO;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dConcretoInDTO;
import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dMorteroInDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo2dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.Tipo3dOutDTO;
import com.jaimes.back_obra.classes.tipo.dto.output.TipoAllOutDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;

import java.util.ArrayList;
import java.util.List;

public class TipoEntityDto {

    public static Tipo dtoToEntity3d(Object object){
        Tipo tipo = new Tipo();
        if(object instanceof Tipo3dConcretoInDTO tipo3DConcretoInDTO){
            //Crea un nuevo elemento para ingresar el ID, NOMBRE y relacionarlo con el TIPO
            Elementos elementos = new Elementos();
            elementos.setId(tipo3DConcretoInDTO.getId());
            elementos.setNameElemento(tipo3DConcretoInDTO.getNameElemento());
            //Crea un nuevo tipo para introducir el nombre y relacionar con el elemento
            //Tipo tipo = new Tipo();
            tipo.setNameMaterial(tipo3DConcretoInDTO.getNameMaterial());
            tipo.setNameTipo(tipo3DConcretoInDTO.getNameTipo());
            tipo.setCantidad(tipo3DConcretoInDTO.getCantidad());
            tipo.setElemento(elementos);
            //Crea un elemento medidas para introdicir los atributos
            Medidas3D medidas3D = new Medidas3D();
            medidas3D.setLargo(tipo3DConcretoInDTO.getLargo());
            medidas3D.setAncho(tipo3DConcretoInDTO.getAncho());
            medidas3D.setAlto(tipo3DConcretoInDTO.getAlto());
            medidas3D.setTipo(tipo);
            //Crea un elemento area para las areas que viene desde el front
            Areas areas = new Areas();
            areas.setAreaUnidad(tipo3DConcretoInDTO.getAreaUnidad());
            areas.setAreaTotal(tipo3DConcretoInDTO.getAreaTotal());
            areas.setTipo(tipo);
            //Crea elemento concreto para introducir los valores
            Concreto concreto = new Concreto();
            concreto.setPsi(tipo3DConcretoInDTO.getPsi());
            concreto.setCementoUnidad(tipo3DConcretoInDTO.getCementoUnidad());
            concreto.setArenaUnidad(tipo3DConcretoInDTO.getArenaUnidad());
            concreto.setGravaUnidad(tipo3DConcretoInDTO.getGravaUnidad());
            concreto.setAguaUnidad(tipo3DConcretoInDTO.getAguaUnidad());
            concreto.setCementoTotal(tipo3DConcretoInDTO.getCementoTotal());
            concreto.setArenaTotal(tipo3DConcretoInDTO.getArenaTotal());
            concreto.setGravaTotal(tipo3DConcretoInDTO.getGravaTotal());
            concreto.setAguaTotal(tipo3DConcretoInDTO.getAguaTotal());
            concreto.setTipo(tipo);
            //Relaciona las medidas y las áreas al tipo
            tipo.setMedidas3D(medidas3D);
            tipo.setAreas(areas);
            tipo.setConcreto(concreto);
        } else if (object instanceof Tipo3dMorteroInDTO tipo3dMorteroInDTO) {
            //Crea un nuevo elemento para ingresar el ID, NOMBRE y relacionarlo con el TIPO
            Elementos elementos = new Elementos();
            elementos.setId(tipo3dMorteroInDTO.getId());
            elementos.setNameElemento(tipo3dMorteroInDTO.getNameElemento());
            //Crea un nuevo tipo para introducir el nombre y relacionar con el elemento
            //Tipo tipo = new Tipo();
            tipo.setNameMaterial(tipo3dMorteroInDTO.getNameMaterial());
            tipo.setNameTipo(tipo3dMorteroInDTO.getNameTipo());
            tipo.setCantidad(tipo3dMorteroInDTO.getCantidad());
            tipo.setElemento(elementos);
            //Crea un elemento medidas para introdicir los atributos
            Medidas3D medidas3D = new Medidas3D();
            medidas3D.setLargo(tipo3dMorteroInDTO.getLargo());
            medidas3D.setAncho(tipo3dMorteroInDTO.getAncho());
            medidas3D.setAlto(tipo3dMorteroInDTO.getAlto());
            medidas3D.setTipo(tipo);
            //Crea un elemento area para las areas que viene desde el front
            Areas areas = new Areas();
            areas.setAreaUnidad(tipo3dMorteroInDTO.getAreaUnidad());
            areas.setAreaTotal(tipo3dMorteroInDTO.getAreaTotal());
            areas.setTipo(tipo);
            //Crea elemento mortero para introducir los valores
            Mortero mortero = new Mortero();
            mortero.setPsi(tipo3dMorteroInDTO.getPsi());
            mortero.setCementoUnidad(tipo3dMorteroInDTO.getCementoUnidad());
            mortero.setArenaUnidad(tipo3dMorteroInDTO.getArenaUnidad());
            mortero.setAguaUnidad(tipo3dMorteroInDTO.getAguaUnidad());
            mortero.setCementoTotal(tipo3dMorteroInDTO.getCementoTotal());
            mortero.setArenaTotal(tipo3dMorteroInDTO.getArenaTotal());
            mortero.setAguaTotal(tipo3dMorteroInDTO.getAguaTotal());
            mortero.setTipo(tipo);
            //Relaciona las medidas y las áreas al tipo
            tipo.setMedidas3D(medidas3D);
            tipo.setAreas(areas);
            tipo.setMortero(mortero);
        }
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
        //Ingresar cantidades de obra
        tipo3DOneOutDTO.setPsi(tipo.getConcreto().getPsi());
        tipo3DOneOutDTO.setCementoUnidad(tipo.getConcreto().getCementoUnidad());
        tipo3DOneOutDTO.setArenaUnidad(tipo.getConcreto().getArenaUnidad());
        tipo3DOneOutDTO.setGravaUnidad(tipo.getConcreto().getGravaUnidad());
        tipo3DOneOutDTO.setAguaUnidad(tipo.getConcreto().getAguaUnidad());
        tipo3DOneOutDTO.setCementoTotal(tipo.getConcreto().getCementoTotal());
        tipo3DOneOutDTO.setArenaTotal(tipo.getConcreto().getArenaTotal());
        tipo3DOneOutDTO.setGravaTotal(tipo.getConcreto().getGravaTotal());
        tipo3DOneOutDTO.setAguaTotal(tipo.getConcreto().getAguaTotal());
        //Devuelve el OBJETO (TIPOOUT)
        return tipo3DOneOutDTO;
    }

    public static Tipo updateTipo3d(Tipo tipo, Tipo3dConcretoInDTO tipo3DConcretoInDTO){
        //Asigna los nuevos valores para actualizar el TIPO
        tipo.setNameTipo(tipo3DConcretoInDTO.getNameTipo());
        tipo.setCantidad(tipo3DConcretoInDTO.getCantidad());
        tipo.getMedidas3D().setLargo(tipo3DConcretoInDTO.getLargo());
        tipo.getMedidas3D().setAncho(tipo3DConcretoInDTO.getAncho());
        tipo.getMedidas3D().setAlto(tipo3DConcretoInDTO.getAlto());
        tipo.getAreas().setAreaUnidad(tipo3DConcretoInDTO.getAreaUnidad());
        tipo.getAreas().setAreaTotal(tipo3DConcretoInDTO.getAreaTotal());
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
        //Crea elemento mortero para introducir los valores
        Mortero mortero = new Mortero();
        mortero.setPsi(tipo2dInDTO.getPsi());
        mortero.setCementoUnidad(tipo2dInDTO.getCementoUnidad());
        mortero.setArenaUnidad(tipo2dInDTO.getArenaUnidad());
        mortero.setAguaUnidad(tipo2dInDTO.getAguaUnidad());
        mortero.setCementoTotal(tipo2dInDTO.getCementoTotal());
        mortero.setArenaTotal(tipo2dInDTO.getArenaTotal());
        mortero.setAguaTotal(tipo2dInDTO.getAguaTotal());
        mortero.setTipo(tipo);
        //Relaciona las medidas y las áreas al tipo
        tipo.setMedidas2D(medidas2D);
        tipo.setAreas(areas);
        tipo.setMortero(mortero);
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
        //Ingresar cantidades de obra
        tipo2DOutDTO.setPsi(tipo.getMortero().getPsi());
        tipo2DOutDTO.setCementoUnidad(tipo.getMortero().getCementoUnidad());
        tipo2DOutDTO.setArenaUnidad(tipo.getMortero().getArenaUnidad());
        tipo2DOutDTO.setAguaUnidad(tipo.getMortero().getAguaUnidad());
        tipo2DOutDTO.setCementoTotal(tipo.getMortero().getCementoTotal());
        tipo2DOutDTO.setArenaTotal(tipo.getMortero().getArenaTotal());
        tipo2DOutDTO.setAguaTotal(tipo.getMortero().getAguaTotal());
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
