package com.jaimes.back_obra.assets.tipo.dto.output;

public record TipoListOutDTO(
        Long id,
        String nameTipo,
        String medidasTipo,
        String materialTipo,
        Integer cantidad
) {
}
