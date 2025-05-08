package com.jaimes.back_obra.operaciones.calcular_medidas.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Calcular2DInDTO {

    @NotNull(message = "El largo es obligatorio")
    @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
    private Double largo;

    @NotNull(message = "El ancho es obligatorio")
    @DecimalMin(value = "0.001", message = "El ancho debe ser mayor a 0 y positivo")
    private Double ancho;

    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser mayor o igual a uno")
    private Integer cantidad;

    @NotNull(message = "PSI es obligatorio")
    private String psi;

    public Calcular2DInDTO() {
    }

    public Calcular2DInDTO(Double largo, Double ancho, Integer cantidad, String psi) {
        this.largo = largo;
        this.ancho = ancho;
        this.cantidad = cantidad;
        this.psi = psi;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
    }
}
