package com.jaimes.back_obra.operaciones.dto.input;

public class Medidas3dCantidadInDTO {

    private Double largo;
    private Double ancho;
    private Double alto;
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
