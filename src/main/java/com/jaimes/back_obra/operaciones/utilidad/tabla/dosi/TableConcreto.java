package com.jaimes.back_obra.operaciones.utilidad.tabla.dosi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TableConcreto {

    private final Map<Clave, DosificacionConcreto> dosificaciones = new HashMap<>();

    public TableConcreto() {
        dosificaciones.put(new Clave("1:2:2", "280", "4000", "27"),
                new DosificacionConcreto(420, 0.67, 0.67, 190));

        dosificaciones.put(new Clave("1:2:2.5", "240", "3555", "24"),
                new DosificacionConcreto(380, 0.60, 0.76, 180));

        dosificaciones.put(new Clave("1:2:3", "226", "3224", "22"),
                new DosificacionConcreto(350, 0.55, 0.84, 170));

        dosificaciones.put(new Clave("1:2:3.5", "210", "3000", "20"),
                new DosificacionConcreto(320, 0.52, 0.90, 170));

        dosificaciones.put(new Clave("1:2:4", "200", "2850", "19"),
                new DosificacionConcreto(300, 0.48, 0.95, 158));

        dosificaciones.put(new Clave("1:2:4.5", "189", "2700", "18"),
                new DosificacionConcreto(280, 0.55, 0.89, 158));

        dosificaciones.put(new Clave("1:3:3", "168", "2400", "16"),
                new DosificacionConcreto(300, 0.72, 0.72, 158));

        dosificaciones.put(new Clave("1:3:4", "159", "2275", "15"),
                new DosificacionConcreto(260, 0.63, 0.83, 163));

        dosificaciones.put(new Clave("1:3:5", "140", "2000", "14"),
                new DosificacionConcreto(230, 0.55, 0.92, 148));

        dosificaciones.put(new Clave("1:3:6", "119", "1700", "12"),
                new DosificacionConcreto(210, 0.50, 1.00, 143));

        dosificaciones.put(new Clave("1:4:7", "109", "1560", "11"),
                new DosificacionConcreto(175, 0.55, 0.98, 133));

        dosificaciones.put(new Clave("1:4:8", "99", "1420", "10"),
                new DosificacionConcreto(160, 0.55, 1.03, 125));
    }

    public DosificacionConcreto getDosificacion(String clave){

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
