package com.jaimes.back_obra.assets.medidas.service;

import com.jaimes.back_obra.assets.medidas.dto.Medidas2dDTO;
import com.jaimes.back_obra.assets.medidas.dto.Medidas3dDTO;


public interface MedidasService {
    Medidas3dDTO cambiar(double largo, double ancho, double alto);
    Medidas2dDTO cambiar(double largo, double ancho);
}
