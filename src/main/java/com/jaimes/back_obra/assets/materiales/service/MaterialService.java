package com.jaimes.back_obra.assets.materiales.service;

import com.jaimes.back_obra.assets.areas.dto.AreasDTO;
import com.jaimes.back_obra.assets.areas.entity.Areas;
import com.jaimes.back_obra.assets.materiales.dto.ConcretoDTO;
import com.jaimes.back_obra.assets.materiales.dto.MorteroDTO;
import com.jaimes.back_obra.assets.materiales.dto.ValdosasDTO;
import com.jaimes.back_obra.assets.materiales.entity.Material;

public interface MaterialService {
    MorteroDTO calcularMortero(Areas areas, String dosificacion);
    ConcretoDTO calcularConcreto(Areas areas, String dosificacion);
    ValdosasDTO calcularValdosa(Areas areas);
}
