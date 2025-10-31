package com.jaimes.back_obra.assets.tipo.utilidad;

import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import com.jaimes.back_obra.assets.tipo.dto.output.*;
import com.jaimes.back_obra.assets.tipo.entity.Tipo;

import java.util.List;

public class TipoToDto {
    public static TipoListOutDTO tipoOutListDTO(Tipo tipo){
        String medidaTipo;

        if(tipo.getMedidas() != null){
            medidaTipo = tipo.getMedidas().getMedidasTipo();
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
        final String tipoMedidas = tipo.getMedidas().getMedidasTipo().toLowerCase();

        final String condicion = tipoMedidas + " - " + tipoMaterial;

        return switch (condicion){
            case "3d - concreto" -> {
                Medidas3D medidas = (Medidas3D) tipo.getMedidas();
                yield new TipoConcreto3dDTO(
                        tipo.getId(),
                        tipo.getNameTipo(),
                        tipo.getCantidad(),
                        tipo.getMedidas().getMedidasTipo(),
                        medidas.getLargo(),
                        medidas.getAncho(),
                        medidas.getAlto(),
                        tipo.getAreas().getAreaOne(),
                        tipo.getAreas().getAreaAll(),
                        tipo.getMaterial().getMaterialTipo(),
                        tipo.getMaterial().getDosificacion().getDosificacion(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getCemento(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getCemento(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getArena(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getArena(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getGrava(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getGrava(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getAgua(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getAgua()
                );
            }

            case "2d - concreto" -> {
                Medidas2D medidas = (Medidas2D) tipo.getMedidas();
                yield new TipoConcreto2dDTO(
                        tipo.getId(),
                        tipo.getNameTipo(),
                        tipo.getCantidad(),
                        tipo.getMedidas().getMedidasTipo(),
                        medidas.getLargo(),
                        medidas.getAncho(),
                        tipo.getAreas().getAreaOne(),
                        tipo.getAreas().getAreaAll(),
                        tipo.getMaterial().getMaterialTipo(),
                        tipo.getMaterial().getDosificacion().getDosificacion(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getCemento(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getCemento(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getArena(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getArena(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getGrava(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getGrava(),
                        tipo.getMaterial().getDosificacion().getConcretoOne().getAgua(),
                        tipo.getMaterial().getDosificacion().getConcretoAll().getAgua()
                );
            }

            case "2d - mortero" -> {
                Medidas2D medidas = (Medidas2D) tipo.getMedidas();
                yield new TipoMortero2dDTO(
                        tipo.getId(),
                        tipo.getNameTipo(),
                        tipo.getCantidad(),
                        tipo.getMedidas().getMedidasTipo(),
                        medidas.getLargo(),
                        medidas.getAncho(),
                        tipo.getAreas().getAreaOne(),
                        tipo.getAreas().getAreaAll(),
                        tipo.getMaterial().getMaterialTipo(),
                        tipo.getMaterial().getDosificacion().getDosificacion(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getCemento(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getCemento(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getArena(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getArena(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getAgua(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getAgua()
                );
            }

            case "3d - mortero" -> {
                Medidas3D medidas = (Medidas3D) tipo.getMedidas();
                yield new TipoMortero3dDTO(
                        tipo.getId(),
                        tipo.getNameTipo(),
                        tipo.getCantidad(),
                        tipo.getMedidas().getMedidasTipo(),
                        medidas.getLargo(),
                        medidas.getAncho(),
                        medidas.getAlto(),
                        tipo.getAreas().getAreaOne(),
                        tipo.getAreas().getAreaAll(),
                        tipo.getMaterial().getMaterialTipo(),
                        tipo.getMaterial().getDosificacion().getDosificacion(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getCemento(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getCemento(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getArena(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getArena(),
                        tipo.getMaterial().getDosificacion().getMorteroOne().getAgua(),
                        tipo.getMaterial().getDosificacion().getMorteroAll().getAgua()
                );
            }

            default -> throw new RuntimeException("El elemento no se puede convertir.");
        };

    }

}
