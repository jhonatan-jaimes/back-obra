package com.jaimes.back_obra.tabla;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.materiales.dto.ConcretoDTO;
import com.jaimes.back_obra.assets.materiales.dto.MorteroDTO;
import com.jaimes.back_obra.assets.materiales.service.MaterialService;
import com.jaimes.back_obra.assets.materiales.service.implement.MaterialImplement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaterialTest {

    @Test
    void materialConcretoTest(){
        MaterialService materialService = new MaterialImplement();

        ConcretoDTO dConcreto = materialService.calcularConcreto(
                new Areas(null, .32, 6.4, null), "1:2:2");

        Assertions.assertEquals(134.40, dConcreto.cementoOne());
        Assertions.assertEquals(2688.00, dConcreto.cementoAll());
        Assertions.assertEquals(.21, dConcreto.arenaOne());
        Assertions.assertEquals(4.29, dConcreto.arenaAll());
        Assertions.assertEquals(.21, dConcreto.gravaOne());
        Assertions.assertEquals(4.29, dConcreto.gravaAll());
        Assertions.assertEquals(60.80, dConcreto.aguaOne());
        Assertions.assertEquals(1216.00, dConcreto.aguaAll());
    }

    @Test
    void materialMorteroTest(){
        MaterialService materialService = new MaterialImplement();

        MorteroDTO dMortero = materialService.calcularMortero(
                new Areas(null, .32, 6.4, null), "1:2");

        Assertions.assertEquals(163.2, dMortero.cementoOne());
        Assertions.assertEquals(3264.0, dMortero.cementoAll());
        Assertions.assertEquals(.31, dMortero.arenaOne());
        Assertions.assertEquals(6.21, dMortero.arenaAll());
        Assertions.assertEquals(70.4, dMortero.aguaOne());
        Assertions.assertEquals(1408.0, dMortero.aguaAll());
    }
}
