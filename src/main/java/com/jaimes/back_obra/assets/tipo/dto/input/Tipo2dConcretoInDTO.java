package com.jaimes.back_obra.assets.tipo.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Tipo2dConcretoInDTO(
        String nameElemento,

        String nameMaterial,

        @NotBlank(message = "El nombre del tipo no puede estar vacio")
        String nameTipo,

        @NotNull(message = "La cantidad es obligatoria")
        @Min(value = 1, message = "La cantidad debe ser mayor o igual a uno")
        Integer cantidad,

        @NotNull(message = "El largo es obligatorio")
        @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
        Double largo,

        @NotNull(message = "El ancho es obligatorio")
        @DecimalMin(value = "0.001", message = "El ancho debe ser mayor a 0 y positivo")
        Double ancho,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double areaOne,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double areaAll,

        @NotBlank(message = "No puede estar vacio")
        String psi,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double cementoOne,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double arenaOne,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double gravaOne,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double aguaOne,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double cementoAll,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double arenaAll,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double gravaAll,

        @NotNull(message = "No puede estar vacio")
        @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
        Double aguaAll
) {
}
