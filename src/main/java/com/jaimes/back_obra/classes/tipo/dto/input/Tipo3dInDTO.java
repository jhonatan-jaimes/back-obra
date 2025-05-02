package com.jaimes.back_obra.classes.tipo.dto.input;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Tipo3dInDTO {

    private Long id;
    private String nameElemento;

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
    @DecimalMin(value = "0,000000001", message = "El area debe ser mayor a cero")
    private Double areaUnidad;

    @NotNull(message = "No puede estar vacio")
    @DecimalMin(value = "0,000000001", message = "El area debe ser mayor a cero")
    private Double areaTotal;

    public Tipo3dInDTO() {
    }

    public Tipo3dInDTO(Long id, String nameElemento, String nameTipo, Integer cantidad, Double largo, Double ancho, Double alto, Double areaUnidad, Double areaTotal) {
        this.id = id;
        this.nameElemento = nameElemento;
        this.nameTipo = nameTipo;
        this.cantidad = cantidad;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.areaUnidad = areaUnidad;
        this.areaTotal = areaTotal;
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
}
