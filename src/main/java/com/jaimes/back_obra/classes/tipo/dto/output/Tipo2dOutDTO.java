package com.jaimes.back_obra.classes.tipo.dto.output;

public class Tipo2dOutDTO {

    private Long id;
    private String nameTipo;
    private Integer cantidad;
    private Double largo;
    private Double ancho;
    private Double areaUnidad;
    private Double areaTotal;

    public Tipo2dOutDTO() {
    }

    public Tipo2dOutDTO(Long id, String nameTipo, Integer cantidad, Double largo, Double ancho, Double areaUnidad, Double areaTotal) {
        this.id = id;
        this.nameTipo = nameTipo;
        this.cantidad = cantidad;
        this.largo = largo;
        this.ancho = ancho;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTipo() {
        return nameTipo;
    }

    public void setNameTipo(String nameTipo) {
        this.nameTipo = nameTipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
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
