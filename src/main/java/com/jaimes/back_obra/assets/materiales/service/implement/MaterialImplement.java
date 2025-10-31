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
        final double areaOne = Transform.METROS3_TO_MILIMETROS3.convertir(areas.getAreaOne());
        final double areaAll = Transform.METROS3_TO_MILIMETROS3.convertir(areas.getAreaAll());
        final double cemento = Transform.METROS3_TO_MILIMETROS3.convertir(dMortero.cemento());
        final double arena = Transform.METROS3_TO_MILIMETROS3.convertir(dMortero.arena());
        final double agua = Transform.METROS3_TO_MILIMETROS3.convertir(dMortero.agua());
        return new MorteroDTO(
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * cemento),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * cemento),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * arena),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * arena),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * agua),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * agua)
        );
    }

    private ConcretoDTO concretoDTO(Areas areas, DosificacionConcreto dConcreto){
        final double areaOne = Transform.METROS3_TO_MILIMETROS3.convertir(areas.getAreaOne());
        final double areaAll = Transform.METROS3_TO_MILIMETROS3.convertir(areas.getAreaAll());
        final double cemento = Transform.METROS3_TO_MILIMETROS3.convertir(dConcreto.cemento());
        final double arena = Transform.METROS3_TO_MILIMETROS3.convertir(dConcreto.arena());
        final double grava = Transform.METROS3_TO_MILIMETROS3.convertir(dConcreto.grava());
        final double agua = Transform.METROS3_TO_MILIMETROS3.convertir(dConcreto.agua());
        return new ConcretoDTO(
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * cemento),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * cemento),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * arena),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * arena),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * grava),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * grava),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaOne * agua),
                Transform.MILIMETROS3_TO_METROS3.convertir(areaAll * agua)
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
