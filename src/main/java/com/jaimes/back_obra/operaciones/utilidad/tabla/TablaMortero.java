package com.jaimes.back_obra.operaciones.utilidad.tabla;

import java.util.HashMap;
import java.util.Map;

public class TablaMortero {
    private final Map<Clave, DosificacionMortero> dosificaciones = new HashMap<>();

    public TablaMortero(){
        dosificaciones.put(new Clave("","", "", ""),
                new DosificacionMortero(0.0, 0.0, 0.0));
    }

    public DosificacionMortero getDosificacion(String clave){
        for(Map.Entry<Clave, DosificacionMortero> entry : dosificaciones.entrySet()){
            if(entry.getKey().proporcion().equals(clave) ||
                    entry.getKey().resistencia().equals(clave) ||
                    entry.getKey().peso().equals(clave) ||
                    entry.getKey().volumen().equals(clave)){
                return entry.getValue();
            }
        }
        throw new RuntimeException("La clave '" + clave + "' no se encuentra en la tabla de dosificación");
    }
}
