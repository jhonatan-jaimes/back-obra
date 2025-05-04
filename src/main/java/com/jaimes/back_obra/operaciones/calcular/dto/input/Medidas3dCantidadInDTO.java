package com.jaimes.back_obra.operaciones.calcular.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Medidas3dCantidadInDTO {

    @NotNull(message = "El largo es obligatorio")
    @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
    private Double largo;

    @NotNull(message = "El ancho es obligatorio")
    @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
    private Double ancho;

    @NotNull(message = "El alto es obligatorio")
    @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
    private Double alto;

    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser mayor o igual a uno")
    private Integer cantidad;

    public Medidas3dCantidadInDTO() {
    }

    public Medidas3dCantidadInDTO(Double largo, Double ancho, Double alto, Integer cantidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.cantidad = cantidad;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


}
