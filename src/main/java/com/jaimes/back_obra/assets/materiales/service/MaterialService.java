package com.jaimes.back_obra.assets.materiales.service;

import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.materiales.entity.Material;

public interface MaterialService {
    Material calcularMaterial(Areas areas);
}
