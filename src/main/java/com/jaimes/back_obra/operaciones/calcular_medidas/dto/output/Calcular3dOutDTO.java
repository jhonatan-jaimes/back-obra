package com.jaimes.back_obra.operaciones.calcular_medidas.dto.output;

public record Calcular3dOutDTO(
         Double largo,
         Double ancho,
         Double alto,
         Integer cantidad,
         Double areaOne,
         Double areaAll,
         String psi,
         Double cementoOne,
         Double arenaOne,
         Double gravaOne,
         Double aguaOne,
         Double cementoAll,
         Double arenaAll,
         Double gravaAll,
         Double aguaAll
) {
}
