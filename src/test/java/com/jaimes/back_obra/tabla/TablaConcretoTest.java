package com.jaimes.back_obra.tabla;

import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.DosificacionConcreto;
import com.jaimes.back_obra.operaciones.utilidad.tabla.dosi.TableConcreto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TablaConcretoTest {

    @Test
    public void getDosificacionTablaTestThrow() {
        TableConcreto tco = new TableConcreto();
        Assertions.assertThrows(RuntimeException.class, () -> tco.getDosificacion("999"));
    }

    @Test
    void getDosificacionTableTestProporcion(){
        TableConcreto tco = new TableConcreto();
        DosificacionConcreto dosi = tco.getDosificacion("1:2:3.5");
        Assertions.assertNotNull(dosi);
        Assertions.assertEquals(320, dosi.cemento());
        Assertions.assertEquals(0.52, dosi.arena());
        Assertions.assertEquals(0.90, dosi.grava());
        Assertions.assertEquals(170.0, dosi.agua());
    }

    @Test
    void getDosificacionTableTestResistencia(){
        TableConcreto tco = new TableConcreto();
        DosificacionConcreto dosi = tco.getDosificacion("189");
        Assertions.assertNotNull(dosi);
        Assertions.assertEquals(280, dosi.cemento());
        Assertions.assertEquals(0.55, dosi.arena());
        Assertions.assertEquals(0.89, dosi.grava());
        Assertions.assertEquals(158, dosi.agua());
    }
}
