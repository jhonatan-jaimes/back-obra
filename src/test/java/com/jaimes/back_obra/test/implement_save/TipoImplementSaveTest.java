package com.jaimes.back_obra.test.implement_save;

import com.jaimes.back_obra.classes.tipo.dto.input.Tipo3dInDTO;
import com.jaimes.back_obra.classes.tipo.entity.Tipo;
import com.jaimes.back_obra.classes.tipo.repository.TipoRepository;

import com.jaimes.back_obra.classes.tipo.service.implement.TipoImplement;
import com.jaimes.back_obra.classes.tipo.utilidad.TipoEntityDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TipoImplementSaveTest {

    @Mock
    private TipoRepository tipoRepository;

    @InjectMocks
    private TipoImplement tipoImplement;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveTipo3d(){

        Tipo3dInDTO dto = new Tipo3dInDTO();
        dto.setId(1L);
        dto.setNameElemento("Ladrillo");
        dto.setNameTipo("Ladrillo galleta");
        dto.setCantidad(4000);
        dto.setLargo(.1);
        dto.setAncho(.2);
        dto.setAlto(.3);
        dto.setAreaUnidad(.006);
        dto.setAreaTotal(24.0);

        Tipo tipoMock = TipoEntityDto.dtoToEntity3d(dto);
        when(tipoRepository.save(any(Tipo.class))).thenReturn(tipoMock);

        // Act




    }
}
