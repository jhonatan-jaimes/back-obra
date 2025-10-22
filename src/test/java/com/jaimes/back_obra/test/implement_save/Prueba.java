package com.jaimes.back_obra.test.implement_save;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;
import com.jaimes.back_obra.assets.medidas.service.implement.MedidasImplement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MedidasImplementTest {

    private MedidasImplement medidasImplement;

    @BeforeEach
    void setUp() {
        medidasImplement = new MedidasImplement();
    }

    @Test
    void testCalcularAreas_Medidas3D_CasoBasico() {
        // Given
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(1.0);  // 1 metro
        medidas3D.setAncho(1.0);  // 1 metro
        medidas3D.setAlto(1.0);   // 1 metro
        int cantidad = 2;

        // When
        Areas resultado = medidasImplement.calcularAreas(medidas3D, cantidad);

        // Then
        assertNotNull(resultado);
        assertEquals(1.0, resultado.getAreaOne(), 0.01); // 1 m³
        assertEquals(2.0, resultado.getAreaAll(), 0.01); // 2 m³
    }

    @Test
    void testCalcularAreas_Medidas3D_ValoresDecimales() {
        // Given
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(2.5);
        medidas3D.setAncho(1.5);
        medidas3D.setAlto(0.5);
        int cantidad = 3;

        // When
        Areas resultado = medidasImplement.calcularAreas(medidas3D, cantidad);

        // Then
        assertNotNull(resultado);
        // 2.5 * 1.5 * 0.5 = 1.875 m³
        assertEquals(1.875, resultado.getAreaOne(), 0.01);
        assertEquals(5.625, resultado.getAreaAll(), 0.01); // 1.875 * 3
    }

    @Test
    void testCalcularAreas_Medidas2D_CasoBasico() {
        // Given
        Medidas2D medidas2D = new Medidas2D();
        medidas2D.setLargo(2.0);  // 2 metros
        medidas2D.setAncho(3.0);  // 3 metros
        int cantidad = 4;

        // When
        Areas resultado = medidasImplement.calcularAreas(medidas2D, cantidad);

        // Then
        assertNotNull(resultado);
        assertEquals(6.0, resultado.getAreaOne(), 0.01); // 6 m²
        assertEquals(24.0, resultado.getAreaAll(), 0.01); // 24 m²
    }

    @Test
    void testCalcularAreas_Medidas2D_ValoresDecimales() {
        // Given
        Medidas2D medidas2D = new Medidas2D();
        medidas2D.setLargo(1.5);
        medidas2D.setAncho(2.5);
        int cantidad = 2;

        // When
        Areas resultado = medidasImplement.calcularAreas(medidas2D, cantidad);

        // Then
        assertNotNull(resultado);
        // 1.5 * 2.5 = 3.75 m²
        assertEquals(3.75, resultado.getAreaOne(), 0.01);
        assertEquals(7.5, resultado.getAreaAll(), 0.01); // 3.75 * 2
    }

    @Test
    void testCalcularAreas_Medidas3D_CantidadCero() {
        // Given
        Medidas3D medidas3D = new Medidas3D();
        medidas3D.setLargo(1.0);
        medidas3D.setAncho(1.0);
        medidas3D.setAlto(1.0);
        int cantidad = 0;

        // When
        Areas resultado = medidasImplement.calcularAreas(medidas3D, cantidad);

        // Then
        assertNotNull(resultado);
        assertEquals(1.0, resultado.getAreaOne(), 0.01);
        assertEquals(0.0, resultado.getAreaAll(), 0.01); // 1 * 0 = 0
    }
}