package com.jaimes.back_obra.operaciones.calcular_medidas.dto.output;

public class Calculado3DOutDTO {

    private Double largo;
    private Double ancho;
    private Double alto;
    private Integer cantidad;
    private Double areaUnidad;
    private Double areaTotal;
    private String psi;
    private Double cementoUnidad;
    private Double arenaUnidad;
    private Double gravaUnidad;
    private Double aguaUnidad;
    private Double cementoTotal;
    private Double arenaTotal;
    private Double gravaTotal;
    private Double aguaTotal;

    public Calculado3DOutDTO() {
    }

    public Calculado3DOutDTO(Double largo, Double ancho, Double alto, Integer cantidad, Double areaUnidad, Double areaTotal, String psi, Double cementoUnidad, Double arenaUnidad, Double gravaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double gravaTotal, Double aguaTotal) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.cantidad = cantidad;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
        this.psi = psi;
        this.cementoUnidad = cementoUnidad;
        this.arenaUnidad = arenaUnidad;
        this.gravaUnidad = gravaUnidad;
        this.aguaUnidad = aguaUnidad;
        this.cementoTotal = cementoTotal;
        this.arenaTotal = arenaTotal;
        this.gravaTotal = gravaTotal;
        this.aguaTotal = aguaTotal;
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

    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
    }

    public Double getCementoUnidad() {
        return cementoUnidad;
    }

    public void setCementoUnidad(Double cementoUnidad) {
        this.cementoUnidad = cementoUnidad;
    }

    public Double getArenaUnidad() {
        return arenaUnidad;
    }

    public void setArenaUnidad(Double arenaUnidad) {
        this.arenaUnidad = arenaUnidad;
    }

    public Double getGravaUnidad() {
        return gravaUnidad;
    }

    public void setGravaUnidad(Double gravaUnidad) {
        this.gravaUnidad = gravaUnidad;
    }

    public Double getAguaUnidad() {
        return aguaUnidad;
    }

    public void setAguaUnidad(Double aguaUnidad) {
        this.aguaUnidad = aguaUnidad;
    }

    public Double getCementoTotal() {
        return cementoTotal;
    }

    public void setCementoTotal(Double cementoTotal) {
        this.cementoTotal = cementoTotal;
    }

    public Double getArenaTotal() {
        return arenaTotal;
    }

    public void setArenaTotal(Double arenaTotal) {
        this.arenaTotal = arenaTotal;
    }

    public Double getGravaTotal() {
        return gravaTotal;
    }

    public void setGravaTotal(Double gravaTotal) {
        this.gravaTotal = gravaTotal;
    }

    public Double getAguaTotal() {
        return aguaTotal;
    }

    public void setAguaTotal(Double aguaTotal) {
        this.aguaTotal = aguaTotal;
    }
}
