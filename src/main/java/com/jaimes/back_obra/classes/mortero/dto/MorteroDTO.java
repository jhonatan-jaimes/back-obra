package com.jaimes.back_obra.classes.mortero.dto;

public class MorteroDTO {

    private String psi;
    private Double cemento;
    private Double arena;
    private Double agua;

    public MorteroDTO() {
    }

    public MorteroDTO(String psi, Double cemento, Double arena, Double agua) {
        this.psi = psi;
        this.cemento = cemento;
        this.arena = arena;
        this.agua = agua;
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
