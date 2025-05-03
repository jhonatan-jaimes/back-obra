package com.jaimes.back_obra.operaciones.dto.output;

public class Medidas3dCantidadAreasOutDTO {

    private Double largo;
    private Double ancho;
    private Double alto;
    private Integer cantidad;
    private Double areaUnidad;
    private Double areaTotal;

    public Medidas3dCantidadAreasOutDTO() {
    }

    public Medidas3dCantidadAreasOutDTO(Double largo, Double ancho, Double alto, Integer cantidad, Double areaUnidad, Double areaTotal) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.cantidad = cantidad;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
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

    public Double getAreaUnidad() {
        return areaUnidad;
    }

    public void setAreaUnidad(Double areaUnidad) {
        this.areaUnidad = areaUnidad;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }
}
