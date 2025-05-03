package com.jaimes.back_obra.operaciones.calcular.dto.input;

public class Medidas2dCantidadesDTO {

    private Double largo;
    private Double ancho;
    private Integer cantidad;

    public Medidas2dCantidadesDTO() {
    }

    public Medidas2dCantidadesDTO(Double largo, Double ancho, Integer cantidad) {
        this.largo = largo;
        this.ancho = ancho;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
