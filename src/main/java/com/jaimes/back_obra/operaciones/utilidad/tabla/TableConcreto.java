package com.jaimes.back_obra.operaciones.utilidad.tabla;

import java.util.HashMap;
import java.util.Map;

public class TableConcreto {

    private final Map<Clave, Dosificacion> dosificaciones = new HashMap<>();

    public TableConcreto() {
        dosificaciones.put(new Clave("1:2:2", "280", "4000", "27"),
                new Dosificacion("420", "0.67", "0.67", "190"));

        dosificaciones.put(new Clave("1:2:2.5", "240", "3555", "24"),
                new Dosificacion("380", "0.60", "0.76", "180"));

        dosificaciones.put(new Clave("1:2:3", "226", "3224", "22"),
                new Dosificacion("350", "0.55", "0.84", "170"));

        dosificaciones.put(new Clave("1:2:3.5", "210", "3000", "20"),
                new Dosificacion("320", "0.52", "0.90", "170"));

        dosificaciones.put(new Clave("1:2:4", "200", "2850", "19"),
                new Dosificacion("300", "0.48", "0.95", "158"));

        dosificaciones.put(new Clave("1:2:4.5", "189", "2700", "18"),
                new Dosificacion("280", "0.55", "0.89", "158"));

        dosificaciones.put(new Clave("1:3:3", "168", "2400", "16"),
                new Dosificacion("300", "0.72", "0.72", "158"));

        dosificaciones.put(new Clave("1:3:4", "159", "2275", "15"),
                new Dosificacion("260", "0.63", "0.83", "163"));

        dosificaciones.put(new Clave("1:3:5", "140", "2000", "14"),
                new Dosificacion("230", "0.55", "0.92", "148"));

        dosificaciones.put(new Clave("1:3:6", "119", "1700", "12"),
                new Dosificacion("210", "0.50", "1.00", "143"));

        dosificaciones.put(new Clave("1:4:7", "109", "1560", "11"),
                new Dosificacion("175", "0.55", "0.98", "133"));

        dosificaciones.put(new Clave("1:4:8", "99", "1420", "10"),
                new Dosificacion("160", "0.55", "1.03", "125"));
    }

    public Dosificacion getDosificacion(String clave){
        for(Map.Entry<Clave, Dosificacion> entry : dosificaciones.entrySet()){
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
