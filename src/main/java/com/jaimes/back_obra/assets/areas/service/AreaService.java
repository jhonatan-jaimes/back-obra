package com.jaimes.back_obra.assets.areas.service;

import com.jaimes.back_obra.assets.areas.dto.AreasDTO;
import com.jaimes.back_obra.assets.medidas.dto.Medidas2dDTO;
import com.jaimes.back_obra.assets.medidas.dto.Medidas3dDTO;

public interface AreaService {
    AreasDTO calcular(Medidas3dDTO medidas, int cantidad);
    AreasDTO calcular(double largo, double ancho , double alto, int cantidad);
    AreasDTO calcular(Medidas2dDTO medidas, int cantidad);
    AreasDTO calcular(double largo, double ancho, int cantidad);
}
