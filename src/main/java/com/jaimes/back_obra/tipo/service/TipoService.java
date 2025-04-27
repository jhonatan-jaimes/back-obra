package com.jaimes.back_obra.tipo.service;

import com.jaimes.back_obra.tipo.dto.input.TipoInDTO;
import com.jaimes.back_obra.tipo.entity.Tipo;

public interface TipoService {

    Tipo saveTipo(TipoInDTO tipoInDTO);
}
