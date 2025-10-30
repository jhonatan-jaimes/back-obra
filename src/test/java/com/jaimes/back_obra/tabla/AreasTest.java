package com.jaimes.back_obra.tabla;

import com.jaimes.back_obra.assets.areas.dto.AreasDTO;
import com.jaimes.back_obra.assets.areas.service.AreaService;
import com.jaimes.back_obra.assets.areas.service.implement.AreaImplement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AreasTest {

    @Test
    void areaMedidas3dTest (){
        AreaService areaService = new AreaImplement();
        AreasDTO areas = areaService.calcular(.3, .3, 4, 20);
        Assertions.assertEquals(.36, areas.areaOne());
        Assertions.assertEquals(7.2, areas.areaAll());
    }

    @Test
    void areaMedidas3dZeroTest(){
        AreaService areaService = new AreaImplement();
        Assertions.assertThrows(RuntimeException.class, () -> areaService.calcular(0, .3, 4, 20));
    }
}
