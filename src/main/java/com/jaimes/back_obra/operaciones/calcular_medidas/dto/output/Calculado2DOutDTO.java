package com.jaimes.back_obra.operaciones.calcular_medidas.dto.output;

public class Calculado2DOutDTO {

    private Double largo;
    private Double ancho;
    private Integer cantidad;
    private Double areaUnidad;
    private Double areaTotal;
    private String psi;
    private Double cementoUnidad;
    private Double arenaUnidad;
    private Double aguaUnidad;
    private Double cementoTotal;
    private Double arenaTotal;
    private Double aguaTotal;

    public Calculado2DOutDTO() {
    }

    public Calculado2DOutDTO(Double largo, Double ancho, Integer cantidad, Double areaUnidad, Double areaTotal, String psi, Double cementoUnidad, Double arenaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double aguaTotal) {
        this.largo = largo;
        this.ancho = ancho;
        this.cantidad = cantidad;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
        this.psi = psi;
        this.cementoUnidad = cementoUnidad;
        this.arenaUnidad = arenaUnidad;
        this.aguaUnidad = aguaUnidad;
        this.cementoTotal = cementoTotal;
        this.arenaTotal = arenaTotal;
        this.aguaTotal = aguaTotal;
    }

    public Double getAguaTotal() {
        return aguaTotal;
    }

    public void setAguaTotal(Double aguaTotal) {
        this.aguaTotal = aguaTotal;
    }

    public Double getArenaTotal() {
        return arenaTotal;
    }

    public void setArenaTotal(Double arenaTotal) {
        this.arenaTotal = arenaTotal;
    }

    public Double getCementoTotal() {
        return cementoTotal;
    }

    public void setCementoTotal(Double cementoTotal) {
        this.cementoTotal = cementoTotal;
    }

    public Double getAguaUnidad() {
        return aguaUnidad;
    }

    public void setAguaUnidad(Double aguaUnidad) {
        this.aguaUnidad = aguaUnidad;
    }

    public Double getArenaUnidad() {
        return arenaUnidad;
    }

    public void setArenaUnidad(Double arenaUnidad) {
        this.arenaUnidad = arenaUnidad;
    }

    public Double getCementoUnidad() {
        return cementoUnidad;
    }

    public void setCementoUnidad(Double cementoUnidad) {
        this.cementoUnidad = cementoUnidad;
    }

    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Double getAreaUnidad() {
        return areaUnidad;
    }

    public void setAreaUnidad(Double areaUnidad) {
        this.areaUnidad = areaUnidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
}
