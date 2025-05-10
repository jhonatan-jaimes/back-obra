package com.jaimes.back_obra.operaciones.calcular_medidas.utilidad;

import com.jaimes.back_obra.classes.areas.dto.AreasDTO;
import com.jaimes.back_obra.classes.concreto.dto.ConcretoDTO;
import com.jaimes.back_obra.classes.mortero.dto.MorteroDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular2DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.input.Calcular3DInDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado2DOutDTO;
import com.jaimes.back_obra.operaciones.calcular_medidas.dto.output.Calculado3DOutDTO;

public class CalcularDto {

    public static Calculado3DOutDTO calcularMedidas3d(Calcular3DInDTO calcular3DInDTO){
        Calculado3DOutDTO calculado3DOutDTO = new Calculado3DOutDTO();
        AreasDTO areasDTO = areasDTO(calcular3DInDTO);
        ConcretoDTO concretoDTO = concretoDTO(calcular3DInDTO);
        calculado3DOutDTO.setLargo(calcular3DInDTO.getLargo());
        calculado3DOutDTO.setAncho(calcular3DInDTO.getAncho());
        calculado3DOutDTO.setAlto(calcular3DInDTO.getAlto());
        calculado3DOutDTO.setCantidad(calcular3DInDTO.getCantidad());
        calculado3DOutDTO.setAreaUnidad(areasDTO.getAreaUnidad());
        calculado3DOutDTO.setAreaTotal(areasDTO.getAreaTotal());
        calculado3DOutDTO.setPsi(calcular3DInDTO.getPsi());
        calculado3DOutDTO.setCementoUnidad(concretoDTO.getCementoUnidad());
        calculado3DOutDTO.setArenaUnidad(concretoDTO.getArenaUnidad());
        calculado3DOutDTO.setGravaUnidad(concretoDTO.getGravaUnidad());
        calculado3DOutDTO.setAguaUnidad(concretoDTO.getAguaUnidad());
        calculado3DOutDTO.setCementoTotal(concretoDTO.getCementoTotal());
        calculado3DOutDTO.setArenaTotal(concretoDTO.getArenaTotal());
        calculado3DOutDTO.setGravaTotal(concretoDTO.getGravaTotal());
        calculado3DOutDTO.setAguaTotal(concretoDTO.getAguaTotal());
        return calculado3DOutDTO;
    }

    public static AreasDTO areasDTO(Object object){
        AreasDTO aDto = new AreasDTO();
        if(object instanceof Calcular3DInDTO calcular3DInDTO){
            Double areaUnidad = ((calcular3DInDTO.getLargo() * Constantes.METROS_A_MILIMETROS) *
                    (calcular3DInDTO.getAncho() * Constantes.METROS_A_MILIMETROS) *
                    (calcular3DInDTO.getAlto() * Constantes.METROS_A_MILIMETROS)) /
                    Constantes.MILIMETROS3_A_METROS3;
            Double areaTotal = ((areaUnidad * Constantes.METROS2_A_MILIMETROS2) *
                    calcular3DInDTO.getCantidad()) / Constantes.MILIMETROS2_A_METROS2;
            aDto.setAreaUnidad(areaUnidad);
            aDto.setAreaTotal(areaTotal);
        } else if(object instanceof Calcular2DInDTO calcular2DInDTO){
            Double areaUnidad = ((calcular2DInDTO.getLargo() * Constantes.METROS_A_MILIMETROS) *
                    (calcular2DInDTO.getAncho() * Constantes.METROS_A_MILIMETROS)) /
                    Constantes.MILIMETROS2_A_METROS2;
            Double areaTotal = ((areaUnidad * Constantes.METROS2_A_MILIMETROS2) *
                    calcular2DInDTO.getCantidad()) / Constantes.MILIMETROS2_A_METROS2;
            aDto.setAreaUnidad(areaUnidad);
            aDto.setAreaTotal(areaTotal);
        }
        return aDto;
    }

    public static ConcretoDTO concretoDTO(Calcular3DInDTO calcular3DInDTO){
        ConcretoDTO cDto = new ConcretoDTO();
        AreasDTO aDto = areasDTO(calcular3DInDTO);
        switch (calcular3DInDTO.getPsi()) {
            case "4000" -> {
                double cementoUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_4000_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                cDto.setCementoUnidad(cementoUnidad);
                cDto.setArenaUnidad(arenaUnidad);
                cDto.setGravaUnidad(gravaUnidad);
                cDto.setAguaUnidad(aguaUnidad);
                cDto.setCementoTotal(cementoTotal);
                cDto.setArenaTotal(arenaTotal);
                cDto.setGravaTotal(gravaTotal);
                cDto.setAguaTotal(aguaTotal);
            }
            case "3224" -> {
                double cementoUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_3224_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                cDto.setCementoUnidad(cementoUnidad);
                cDto.setArenaUnidad(arenaUnidad);
                cDto.setGravaUnidad(gravaUnidad);
                cDto.setAguaUnidad(aguaUnidad);
                cDto.setCementoTotal(cementoTotal);
                cDto.setArenaTotal(arenaTotal);
                cDto.setGravaTotal(gravaTotal);
                cDto.setAguaTotal(aguaTotal);
            }
            case "2850" -> {
                double cementoUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = ((aDto.getAreaUnidad() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double gravaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_GRAVA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = ((aDto.getAreaTotal() * Constantes.METROS3_A_MILIMETROS3) *
                        Constantes.PSIC_2850_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                cDto.setCementoUnidad(cementoUnidad);
                cDto.setArenaUnidad(arenaUnidad);
                cDto.setGravaUnidad(gravaUnidad);
                cDto.setAguaUnidad(aguaUnidad);
                cDto.setCementoTotal(cementoTotal);
                cDto.setArenaTotal(arenaTotal);
                cDto.setGravaTotal(gravaTotal);
                cDto.setAguaTotal(aguaTotal);
            }
        }
        return cDto;
    }

    public static MorteroDTO morteroDTO(Calcular2DInDTO calcular2DInDTO){
        MorteroDTO mDto = new MorteroDTO();
        AreasDTO aDto = areasDTO(calcular2DInDTO);
        switch (calcular2DInDTO.getPsi()){
            case "4400" -> {
                double cementoUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_4400_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                mDto.setCementoUnidad(cementoUnidad);
                mDto.setArenaUnidad(arenaUnidad);
                mDto.setAguaUnidad(aguaUnidad);
                mDto.setCementoTotal(cementoTotal);
                mDto.setArenaTotal(arenaTotal);
                mDto.setAguaTotal(aguaTotal);
            }
            case "3980" -> {
                double cementoUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3980_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                mDto.setCementoUnidad(cementoUnidad);
                mDto.setArenaUnidad(arenaUnidad);
                mDto.setAguaUnidad(aguaUnidad);
                mDto.setCementoTotal(cementoTotal);
                mDto.setArenaTotal(arenaTotal);
                mDto.setAguaTotal(aguaTotal);
            }
            case "3400" -> {
                double cementoUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaUnidad = (((aDto.getAreaUnidad() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                double cementoTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_CEMENTO) / Constantes.MILIMETROS3_A_METROS3;
                double arenaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_ARENA) / Constantes.DECIMALES_MILIMETROS3_A_METROS3;
                double aguaTotal = (((aDto.getAreaTotal() * Constantes.METROS2_A_MILIMETROS2) * 10) *
                        Constantes.PSIM_3400_AGUA) / Constantes.MILIMETROS3_A_METROS3;
                mDto.setCementoUnidad(cementoUnidad);
                mDto.setArenaUnidad(arenaUnidad);
                mDto.setAguaUnidad(aguaUnidad);
                mDto.setCementoTotal(cementoTotal);
                mDto.setArenaTotal(arenaTotal);
                mDto.setAguaTotal(aguaTotal);
            }
        }
        return mDto;
    }

    public static Calculado2DOutDTO calcularMedidas2d(Calcular2DInDTO calcular2DInDTO){
        Calculado2DOutDTO calculado2DOutDTO = new Calculado2DOutDTO();
        AreasDTO areasDTO = areasDTO(calcular2DInDTO);
        MorteroDTO morteroDTO = morteroDTO(calcular2DInDTO);
        calculado2DOutDTO.setLargo(calcular2DInDTO.getLargo());
        calculado2DOutDTO.setAncho(calcular2DInDTO.getAncho());
        calculado2DOutDTO.setCantidad(calcular2DInDTO.getCantidad());
        calculado2DOutDTO.setAreaUnidad(areasDTO.getAreaUnidad());
        calculado2DOutDTO.setAreaTotal(areasDTO.getAreaTotal());
        calculado2DOutDTO.setPsi(calcular2DInDTO.getPsi());
        calculado2DOutDTO.setCementoUnidad(morteroDTO.getCementoUnidad());
        calculado2DOutDTO.setArenaUnidad(morteroDTO.getArenaUnidad());
        calculado2DOutDTO.setAguaUnidad(morteroDTO.getAguaUnidad());
        calculado2DOutDTO.setCementoTotal(morteroDTO.getCementoTotal());
        calculado2DOutDTO.setArenaTotal(morteroDTO.getArenaTotal());
        calculado2DOutDTO.setAguaTotal(morteroDTO.getAguaTotal());
        return calculado2DOutDTO;
    }
}
