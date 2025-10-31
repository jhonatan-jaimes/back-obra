package com.jaimes.back_obra.operaciones.utilidad.tabla.service;

import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionConcreto;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionMortero;

public interface TablaService {
    DosificacionMortero getDosiMortero(String dosificacion);
    DosificacionConcreto getDosiConcreto(String dosificacion);
}
