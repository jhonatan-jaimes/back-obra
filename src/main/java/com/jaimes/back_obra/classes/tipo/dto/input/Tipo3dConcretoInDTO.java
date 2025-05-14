package com.jaimes.back_obra.classes.tipo.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Tipo3dConcretoInDTO {

    private Long id;
    private String nameElemento;
    private String nameMaterial;

    @NotBlank(message = "El nombre del tipo no puede estar vacio")
    private String nameTipo;

    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad debe ser mayor o igual a uno")
    private Integer cantidad;

    @NotNull(message = "El largo es obligatorio")
    @DecimalMin(value = "0.001", message = "El largo debe ser mayor a 0 y positivo")
    private Double largo;

    @NotNull(message = "El ancho es obligatorio")
    @DecimalMin(value = "0.001", message = "El ancho debe ser mayor a 0 y positivo")
    private Double ancho;

    @NotNull(message = "El alto es obligatorio")
    @DecimalMin(value = "0.001", message = "El alto debe ser mayor a 0 y positivo")
    private Double alto;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double areaUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double areaTotal;

    @NotBlank(message = "No puede estar vacio")
    private String psi;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double cementoUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double arenaUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double gravaUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double aguaUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double cementoTotal;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double arenaTotal;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double gravaTotal;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0.000000001", message = "El area debe ser mayor a cero")
    private Double aguaTotal;

    public Tipo3dConcretoInDTO() {
    }

    public Tipo3dConcretoInDTO(Long id, String nameElemento, String nameMaterial, String nameTipo, Integer cantidad, Double largo, Double ancho, Double alto, Double areaUnidad, Double areaTotal, String psi, Double cementoUnidad, Double arenaUnidad, Double gravaUnidad, Double aguaUnidad, Double cementoTotal, Double arenaTotal, Double gravaTotal, Double aguaTotal) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.nameMaterial = nameMaterial;
        this.nameTipo = nameTipo;
        this.cantidad = cantidad;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameElemento() {
        return nameElemento;
    }

    public void setNameElemento(String nameElemento) {
        this.nameElemento = nameElemento;
    }

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
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

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
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
