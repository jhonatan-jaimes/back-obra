package com.jaimes.back_obra.operaciones.utilidad.tabla.dosi;

import java.util.HashMap;
import java.util.Map;

public class TablaMortero {
    private final Map<Clave, DosificacionMortero> dosificaciones = new HashMap<>();

    public TablaMortero(){
        dosificaciones.put(new Clave("1:2", "310", "4400", "30"),
                new DosificacionMortero(510, 0.97, 220));

        dosificaciones.put(new Clave("1:3", "280", "3980", "27"),
                new DosificacionMortero(454, 1.10, 185));

        dosificaciones.put(new Clave("1:4", "240", "3400", "23"),
                new DosificacionMortero(364, 1.16, 170));

        dosificaciones.put(new Clave("1:5", "200", "2850", "19"),
                new DosificacionMortero(302, 1.18, 150));

        dosificaciones.put(new Clave("1:6", "160", "2275", "16"),
                new DosificacionMortero(260, 1.20, 140));

        dosificaciones.put(new Clave("1:7", "120", "1700", "12"),
                new DosificacionMortero(228, 1.25, 130));
    }

    public DosificacionMortero getDosificacion(String clave){
        return dosificaciones.entrySet().stream()
                .filter(entry -> entry.getKey().proporcion().equals(clave) ||
                        entry.getKey().resistencia().equals(clave) ||
                        entry.getKey().peso().equals(clave) ||
                        entry.getKey().volumen().equals(clave))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("La clave '" + clave + "' no se encuentra en la tabla de dosificación"));
    }
}
