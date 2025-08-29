package com.jaimes.back_obra.assets.elementos.dto.output;

import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

public record ElementoToDTO(
        Long id,
        String nameElemento,
        Integer tipo
) {
}
