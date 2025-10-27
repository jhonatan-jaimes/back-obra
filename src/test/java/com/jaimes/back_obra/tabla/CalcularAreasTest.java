package com.jaimes.back_obra.tabla;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.service.MedidasService;
import com.jaimes.back_obra.assets.medidas.service.implement.MedidasImplement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularAreasTest {

    @Test
    void calcularArea2dTest(){
        Medidas2D medidas2D = new Medidas2D(null, null, null, 20.0, 10.0);
        int cantidad = 2;
        MedidasService medidasService = new MedidasImplement();
        Areas areas = medidasService.calcularAreas(medidas2D, cantidad);
        Assertions.assertEquals(200, areas.getAreaOne());
        Assertions.assertEquals(400, areas.getAreaAll());
    }

    @Test
    void calcularArea2dNullableTest(){
        Medidas2D medidas2D = new Medidas2D(null, null, null, null, 0.0);
        int cantidad = 2;
        MedidasService medidasService = new MedidasImplement();
        Assertions.assertThrows(RuntimeException.class, () -> medidasService.calcularAreas(medidas2D, cantidad));
    }

    @Test
    void calcularArea2dZeroTest(){
        Medidas2D medidas2D = new Medidas2D(null, null, null, 0.0, 0.0);
        int cantidad = 2;
        MedidasService medidasService = new MedidasImplement();
        Assertions.assertThrows(RuntimeException.class, () -> medidasService.calcularAreas(medidas2D, cantidad));
    }

}
