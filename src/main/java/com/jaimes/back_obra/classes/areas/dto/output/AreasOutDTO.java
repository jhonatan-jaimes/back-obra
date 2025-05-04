package com.jaimes.back_obra.classes.areas.dto.output;

public class AreasOutDTO {

    private Double areaUnidad;
    private Double areaTotal;

    public AreasOutDTO() {
    }

    public AreasOutDTO(Double areaUnidad, Double areaTotal) {
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
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
