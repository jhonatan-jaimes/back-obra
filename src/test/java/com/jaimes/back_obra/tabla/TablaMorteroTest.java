package com.jaimes.back_obra.tabla;

import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionMortero;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.TablaMortero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TablaMorteroTest {

    @Test
    public void getDosificacionTablaTestThrow(){
        TablaMortero tmo = new TablaMortero();
        Assertions.assertThrows(RuntimeException.class, () -> tmo.getDosificacion("999"));
    }

    @Test
    void getDosificacionTableTestProporcion(){
        TablaMortero tco = new TablaMortero();
        DosificacionMortero dosi = tco.getDosificacion("1:4");
        Assertions.assertNotNull(dosi);
        Assertions.assertEquals(364, dosi.cemento());
        Assertions.assertEquals(1.16, dosi.arena());
        Assertions.assertEquals(170, dosi.agua());
    }

    @Test
    void getDosificacionTableTestResistencia(){
        TablaMortero tco = new TablaMortero();
        DosificacionMortero dosi = tco.getDosificacion("160");
        Assertions.assertNotNull(dosi);
        Assertions.assertEquals(260, dosi.cemento());
        Assertions.assertEquals(1.2, dosi.arena());
        Assertions.assertEquals(140, dosi.agua());
    }
}
