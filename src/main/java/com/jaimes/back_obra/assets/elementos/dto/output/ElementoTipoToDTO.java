package com.jaimes.back_obra.assets.elementos.dto.output;

import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

import java.util.List;

public record ElementoTipoToDTO(
        Long id,
        String nameElemento,
        List<TipoOutDTO> tipo
) {
}
