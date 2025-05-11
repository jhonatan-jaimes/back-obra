package com.jaimes.back_obra.classes.tipo.dto.output;

public class Tipo2dOutDTO {

    private Long id;
    private String nameTipo;
    private Integer cantidad;
    private Double largo;
    private Double ancho;
    private Double areaUnidad;
    private Double areaTotal;
    private String psi;
    private Double cementoUnidad;
    private Double arenaUnidad;
    private Double aguaUnidad;
    private Double cementoTotal;
    private Double arenaTotal;
    private Double aguaTotal;

    public Tipo2dOutDTO() {
    }

    public Tipo2dOutDTO(Long id, String nameTipo, Integer cantidad, Double largo, Double ancho, Double areaUnidad, Double areaTotal, String psi, Double cementoUnidad, Double arenaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double aguaTotal) {
        this.id = id;
        this.nameTipo = nameTipo;
        this.cantidad = cantidad;
        this.largo = largo;
        this.ancho = ancho;
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

    public Double getAguaTotal() {
        return aguaTotal;
    }

    public void setAguaTotal(Double aguaTotal) {
        this.aguaTotal = aguaTotal;
    }
}
