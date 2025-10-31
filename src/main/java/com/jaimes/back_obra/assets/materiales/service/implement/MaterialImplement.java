package com.jaimes.back_obra.assets.materiales.service.implement;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.materiales.dto.ConcretoDTO;
import com.jaimes.back_obra.assets.materiales.dto.MorteroDTO;
import com.jaimes.back_obra.assets.materiales.dto.ValdosasDTO;
import com.jaimes.back_obra.assets.materiales.service.MaterialService;
import com.jaimes.back_obra.operaciones.utilidad.Transform;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionConcreto;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionMortero;
import com.jaimes.back_obra.operaciones.utilidad.tabla.service.TablaService;
import com.jaimes.back_obra.operaciones.utilidad.tabla.service.implement.TablaImplement;
import org.springframework.stereotype.Service;

@Service
public class MaterialImplement implements MaterialService {

    private final TablaService tablaService = new TablaImplement();

    private MorteroDTO morteroDTO(Areas areas, DosificacionMortero dMortero){
        final double areaOne = Transform.METROS_TO_MILIMETROS.convertir(areas.getAreaOne());
        final double areaAll = Transform.METROS_TO_MILIMETROS.convertir(areas.getAreaAll());
        final double cemento = Transform.METROS_TO_MILIMETROS.convertir(dMortero.cemento());
        final double arena = Transform.METROS_TO_MILIMETROS.convertir(dMortero.arena());
        final double agua = Transform.METROS_TO_MILIMETROS.convertir(dMortero.agua());
        return new MorteroDTO(
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * cemento) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * cemento) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * arena) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * arena) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * agua) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * agua) * 100.0) /100.0
        );
    }

    private ConcretoDTO concretoDTO(Areas areas, DosificacionConcreto dConcreto){
        final double areaOne = Transform.METROS_TO_MILIMETROS.convertir(areas.getAreaOne());
        final double areaAll = Transform.METROS_TO_MILIMETROS.convertir(areas.getAreaAll());
        final double cemento = Transform.METROS_TO_MILIMETROS.convertir(dConcreto.cemento());
        final double arena = Transform.METROS_TO_MILIMETROS.convertir(dConcreto.arena());
        final double grava = Transform.METROS_TO_MILIMETROS.convertir(dConcreto.grava());
        final double agua = Transform.METROS_TO_MILIMETROS.convertir(dConcreto.agua());
        return new ConcretoDTO(
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * cemento) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * cemento) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * arena) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * arena) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * grava) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * grava) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaOne * agua) * 100.0) /100.0,
                Math.round(Transform.MILIMETROS2_TO_METROS2.convertir(areaAll * agua) * 100.0) /100.0
        );
    }

    @Override
    public MorteroDTO calcularMortero(Areas areas, String dosificacion) {
        DosificacionMortero doMortero = tablaService.getDosiMortero(dosificacion);
        return morteroDTO(areas, doMortero);
    }

    @Override
    public ConcretoDTO calcularConcreto(Areas areas, String dosificacion) {
        DosificacionConcreto doConcreto = tablaService.getDosiConcreto(dosificacion);
        return concretoDTO(areas, doConcreto);
    }

    @Override
    public ValdosasDTO calcularValdosa(Areas areas) {
        return null;
    }
}
