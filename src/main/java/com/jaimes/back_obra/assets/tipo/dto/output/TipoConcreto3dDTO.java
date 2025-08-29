package com.jaimes.back_obra.assets.tipo.dto.output;

import com.jaimes.back_obra.assets.tipo.utilidad.TipoOutDTO;

public record TipoConcreto3dDTO(
        Long id,
        String nameTipo,
        Integer cantidad,
        String medidasTipo,
        Double largo,
        Double ancho,
        Double alto,
        Double areaOne,
        Double areaAll,
        String materialTipo,
        String psi,
        Double cementoOne,
        Double cementoAll,
        Double arenaOne,
        Double arenaAll,
        Double gravaOne,
        Double gravaAll,
        Double aguaOne,
        Double aguaAll
) implements TipoOutDTO {
}

