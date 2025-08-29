package com.jaimes.back_obra.assets.tipo.utilidad;

import com.jaimes.back_obra.assets.tipo.dto.output.*;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;

import java.util.List;

public class TipoToDto {
    public static TipoListOutDTO tipoOutListDTO(Tipo tipo){
        return new TipoListOutDTO(
                tipo.getId(),
                tipo.getNameTipo(),
                tipo.getMedidas().getMedidasTipo(),
                tipo.getMaterial().getMaterialTipo(),
                tipo.getCantidad()
        );
    }

    public static List<TipoListOutDTO> allTipoOutListDTO(List<Tipo> tipo){
        return tipo.stream()
                .map(TipoToDto::tipoOutListDTO)
                .toList();
    }

    public static TipoOutDTO tipoOutModelDto(Tipo tipo){
        final String tipoMaterial = tipo.getMaterial().getMaterialTipo().toLowerCase();
        final String tipoMedidas = tipo.getMedidas().getMedidasTipo().toLowerCase();

        final String condicion = tipoMedidas + " - " + tipoMaterial;

        return switch (condicion){
            case "3d - concreto" -> new TipoConcreto3dDTO(
                    tipo.getId(),
                    tipo.getNameTipo(),
                    tipo.getCantidad(),
                    tipo.getMedidas().getMedidasTipo(),
                    tipo.getMedidas().getLargo(),
                    tipo.getMedidas().getAncho(),
                    tipo.getMedidas().getAlto(),
                    tipo.getAreas().getAreaOne(),
                    tipo.getAreas().getAreaAll(),
                    tipo.getMaterial().getMaterialTipo(),
                    tipo.getMaterial().getDosificacion().getPsi(),
                    tipo.getMaterial().getDosificacion().getCementoOne(),
                    tipo.getMaterial().getDosificacion().getCementoAll(),
                    tipo.getMaterial().getDosificacion().getArenaOne(),
                    tipo.getMaterial().getDosificacion().getArenaAll(),
                    tipo.getMaterial().getDosificacion().getGravaOne(),
                    tipo.getMaterial().getDosificacion().getGravaAll(),
                    tipo.getMaterial().getDosificacion().getAguaOne(),
                    tipo.getMaterial().getDosificacion().getAguaAll()
                );

            case "2d - concreto" -> new TipoConcreto2dDTO(
                    tipo.getId(),
                    tipo.getNameTipo(),
                    tipo.getCantidad(),
                    tipo.getMedidas().getMedidasTipo(),
                    tipo.getMedidas().getLargo(),
                    tipo.getMedidas().getAncho(),
                    tipo.getAreas().getAreaOne(),
                    tipo.getAreas().getAreaAll(),
                    tipo.getMaterial().getMaterialTipo(),
                    tipo.getMaterial().getDosificacion().getPsi(),
                    tipo.getMaterial().getDosificacion().getCementoOne(),
                    tipo.getMaterial().getDosificacion().getCementoAll(),
                    tipo.getMaterial().getDosificacion().getArenaOne(),
                    tipo.getMaterial().getDosificacion().getArenaAll(),
                    tipo.getMaterial().getDosificacion().getGravaOne(),
                    tipo.getMaterial().getDosificacion().getGravaAll(),
                    tipo.getMaterial().getDosificacion().getAguaOne(),
                    tipo.getMaterial().getDosificacion().getAguaAll()
            );

            case "2d - mortero" -> new TipoMortero2dDTO(
                    tipo.getId(),
                    tipo.getNameTipo(),
                    tipo.getCantidad(),
                    tipo.getMedidas().getMedidasTipo(),
                    tipo.getMedidas().getLargo(),
                    tipo.getMedidas().getAncho(),
                    tipo.getAreas().getAreaOne(),
                    tipo.getAreas().getAreaAll(),
                    tipo.getMaterial().getMaterialTipo(),
                    tipo.getMaterial().getDosificacion().getPsi(),
                    tipo.getMaterial().getDosificacion().getCementoOne(),
                    tipo.getMaterial().getDosificacion().getCementoAll(),
                    tipo.getMaterial().getDosificacion().getArenaOne(),
                    tipo.getMaterial().getDosificacion().getArenaAll(),
                    tipo.getMaterial().getDosificacion().getAguaOne(),
                    tipo.getMaterial().getDosificacion().getAguaAll()
            );

            case "3d - mortero" -> new TipoMortero3dDTO(
                    tipo.getId(),
                    tipo.getNameTipo(),
                    tipo.getCantidad(),
                    tipo.getMedidas().getMedidasTipo(),
                    tipo.getMedidas().getLargo(),
                    tipo.getMedidas().getAncho(),
                    tipo.getMedidas().getAlto(),
                    tipo.getAreas().getAreaOne(),
                    tipo.getAreas().getAreaAll(),
                    tipo.getMaterial().getMaterialTipo(),
                    tipo.getMaterial().getDosificacion().getPsi(),
                    tipo.getMaterial().getDosificacion().getCementoOne(),
                    tipo.getMaterial().getDosificacion().getCementoAll(),
                    tipo.getMaterial().getDosificacion().getArenaOne(),
                    tipo.getMaterial().getDosificacion().getArenaAll(),
                    tipo.getMaterial().getDosificacion().getAguaOne(),
                    tipo.getMaterial().getDosificacion().getAguaAll()
                );

            default -> throw new RuntimeException("El elemento no se puede convertir.");
        };

    }

}
