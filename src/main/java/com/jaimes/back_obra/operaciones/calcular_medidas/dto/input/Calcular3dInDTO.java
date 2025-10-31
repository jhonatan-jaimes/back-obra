package com.jaimes.back_obra.operaciones.calcular_medidas.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record Calcular3dInDTO(
        @NotNull(message = "El largo es obligatorio")
        @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
        Double largo,

        @NotNull(message = "El ancho es obligatorio")
        @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
        Double ancho,

        @NotNull(message = "El alto es obligatorio")
        @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
        Double alto,

        @NotNull(message = "La cantidad es obligatoria")
        @Min(value = 1, message = "La cantidad debe ser mayor o igual a uno")
        Integer cantidad,

        @NotNull(message = "PSI es obligatorio")
        String psi
) { }
