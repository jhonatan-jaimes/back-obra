package com.jaimes.back_obra.operaciones.calcular_medidas.dto.output;

public record Calcular2dOutDTO(
        Double largo,
        Double ancho,
        Integer cantidad,
        Double areaOne,
        Double areaAll,
        String psi,
        Double cementoOne,
        Double arenaOne,
        Double aguaOne,
        Double cementoAll,
        Double arenaAll,
        Double aguaAll
) {
}
