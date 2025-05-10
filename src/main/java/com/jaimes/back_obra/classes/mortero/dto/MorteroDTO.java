package com.jaimes.back_obra.classes.mortero.dto;

public class MorteroDTO {

    private String psi;
    private Double cementoUnidad;
    private Double arenaUnidad;
    private Double aguaUnidad;
    private Double cementoTotal;
    private Double arenaTotal;
    private Double aguaTotal;

    public MorteroDTO() {
    }

    public MorteroDTO(String psi, Double cementoUnidad, Double arenaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double aguaTotal) {
        this.psi = psi;
        this.cementoUnidad = cementoUnidad;
        this.arenaUnidad = arenaUnidad;
        this.aguaUnidad = aguaUnidad;
        this.cementoTotal = cementoTotal;
        this.arenaTotal = arenaTotal;
        this.aguaTotal = aguaTotal;
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
