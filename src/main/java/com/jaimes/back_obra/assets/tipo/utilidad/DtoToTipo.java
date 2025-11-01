package com.jaimes.back_obra.assets.tipo.utilidad;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.elementos.entity.Elementos;
import com.jaimes.back_obra.assets.materiales.dosificacion.Concreto;
import com.jaimes.back_obra.assets.materiales.dosificacion.Dosificacion;
import com.jaimes.back_obra.assets.materiales.entity.Material;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.tipo.dto.input.Tipo2dConcretoInDTO;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;

import java.awt.geom.Area;

public class DtoToTipo {
    public static Tipo dtoToTipo(Tipo2dConcretoInDTO tipo2dConcretoInDTO){
        if (tipo2dConcretoInDTO == null) {
            throw new IllegalArgumentException("El DTO no puede ser nulo");
        }
        Elementos elemento = new Elementos(
                1L,
                "Losa",
                null
        );

        Medidas2D medidas2D =  new Medidas2D(
                null,
                "2D",
                null,
                tipo2dConcretoInDTO.largo(),
                tipo2dConcretoInDTO.ancho()
        );

        Areas areas = new Areas(
                null,
                tipo2dConcretoInDTO.areaOne(),
                tipo2dConcretoInDTO.areaAll(),
                null
        );

        Concreto concretoOne = new Concreto(
                null,
                "Concreto",
                tipo2dConcretoInDTO.cementoOne(),
                tipo2dConcretoInDTO.arenaOne(),
                tipo2dConcretoInDTO.gravaOne(),
                tipo2dConcretoInDTO.aguaOne(),
                null

        );

        Concreto concretoAll = new Concreto(
                null,
                "Concreto",
                tipo2dConcretoInDTO.cementoAll(),
                tipo2dConcretoInDTO.arenaAll(),
                tipo2dConcretoInDTO.gravaAll(),
                tipo2dConcretoInDTO.aguaAll(),
                null

        );

        Dosificacion dosificacion = new Dosificacion(
                null,
                tipo2dConcretoInDTO.psi(),
                null,
                null,
                concretoOne,
                concretoAll,
                null
        );

        Material material = new Material(
                null,
                tipo2dConcretoInDTO.nameMaterial(),
                dosificacion,
                null,
                null
        );

        Tipo tipo = new Tipo(
                null,
                tipo2dConcretoInDTO.nameTipo(),
                tipo2dConcretoInDTO.cantidad(),
                medidas2D,
                areas,
                material,
                elemento
                );

        material.setTipo(tipo);
        dosificacion.setMaterial(material);
        concretoOne.setDosificacion(dosificacion);
        concretoAll.setDosificacion(dosificacion);
        areas.setTipo(tipo);
        medidas2D.setTipo(tipo);
        elemento.getTipos().add(tipo);

        return tipo;
    }
}
