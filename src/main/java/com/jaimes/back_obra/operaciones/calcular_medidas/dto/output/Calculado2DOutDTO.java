package com.jaimes.back_obra.operaciones.calcular_medidas.dto.output;

public class Calculado2DOutDTO {

    private Double largo;
    private Double ancho;
    private Integer cantidad;
    private Double areaUnidad;
    private Double areaTotal;
    private String psi;
    private Double cemento;
    private Double arena;
    private Double agua;

    public Calculado2DOutDTO() {
    }

    public Calculado2DOutDTO(Double largo, Double ancho, Integer cantidad, Double areaUnidad, Double areaTotal, String psi, Double cemento, Double arena, Double agua) {
        this.largo = largo;
        this.ancho = ancho;
        this.cantidad = cantidad;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
        this.psi = psi;
        this.cemento = cemento;
        this.arena = arena;
        this.agua = agua;
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

    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
    }

    public Double getCemento() {
        return cemento;
    }

    public void setCemento(Double cemento) {
        this.cemento = cemento;
    }

    public Double getArena() {
        return arena;
    }

    public void setArena(Double arena) {
        this.arena = arena;
    }

    public Double getAgua() {
        return agua;
    }

    public void setAgua(Double agua) {
        this.agua = agua;
    }
}
