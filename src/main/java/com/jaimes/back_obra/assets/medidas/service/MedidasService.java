package com.jaimes.back_obra.assets.medidas.service;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.medidas.entity.Medidas;

public interface MedidasService {
    Areas calcularAreas(Medidas medidas, Integer cantidad);
}
