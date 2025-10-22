package com.jaimes.back_obra.assets.medidas.service;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas2D;
import com.jaimes.back_obra.assets.medidas.entity.Medidas3D;

public interface MedidasService {
    Areas calcularAreas(Medidas3D medidas, int cantidad);
    Areas calcularAreas(Medidas2D medidas, int cantidad);
}
