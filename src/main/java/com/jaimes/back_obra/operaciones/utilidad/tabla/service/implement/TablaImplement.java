package com.jaimes.back_obra.operaciones.utilidad.tabla.service.implement;

import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionConcreto;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionMortero;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.TablaMortero;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.TableConcreto;
import com.jaimes.back_obra.operaciones.utilidad.tabla.service.TablaService;
import org.springframework.stereotype.Service;

@Service
public class TablaImplement implements TablaService {

    @Override
    public DosificacionMortero getDosiMortero(String dosificacion) {
        TablaMortero tablaMortero = new TablaMortero();
        return tablaMortero.getDosificacion(dosificacion);
    }

    @Override
    public DosificacionConcreto getDosiConcreto(String dosificacion) {
        TableConcreto tableConcreto = new TableConcreto();
        return tableConcreto.getDosificacion(dosificacion);
    }
}
