package com.jaimes.back_obra.assets.tipo.utilidad;

import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import com.jaimes.back_obra.assets.tipo.dto.output.*;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;

import java.util.List;

public class TipoToDto {
    public static TipoListOutDTO tipoOutListDTO(Tipo tipo){
        String medidaTipo;

        if(tipo.getMedidas3D() != null){
            medidaTipo = tipo.getMedidas3D().getMedidasTipo();
        } else if (tipo.getMedidas2D() != null) {
            medidaTipo = tipo.getMedidas2D().getMedidasTipo();
        } else {
            throw new RuntimeException("El objeto no tiene ningun tipo de medidas");
        }

        return new TipoListOutDTO(
                tipo.getId(),
                tipo.getNameTipo(),
                medidaTipo,
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
        final String tipoMedidas = tipo.getMedidas3D().getMedidasTipo().toLowerCase();

        final String condicion = tipoMedidas + " - " + tipoMaterial;

        return switch (condicion){
            case "3d - concreto" -> new TipoConcreto3dDTO(
                    tipo.getId(),
                    tipo.getNameTipo(),
                    tipo.getCantidad(),
                    tipo.getMedidas3D().getMedidasTipo(),
                    tipo.getMedidas3D().getLargo(),
                    tipo.getMedidas3D().getAncho(),
                    tipo.getMedidas3D().getAlto(),
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
                    tipo.getMedidas2D().getMedidasTipo(),
                    tipo.getMedidas2D().getLargo(),
                    tipo.getMedidas2D().getAncho(),
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
                    tipo.getMedidas2D().getMedidasTipo(),
                    tipo.getMedidas2D().getLargo(),
                    tipo.getMedidas2D().getAncho(),
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
                    tipo.getMedidas3D().getMedidasTipo(),
                    tipo.getMedidas3D().getLargo(),
                    tipo.getMedidas3D().getAncho(),
                    tipo.getMedidas3D().getAlto(),
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
