package com.jaimes.back_obra.tipo.dto.input;

public class TipoInDTO {

    private Long id;
    private String nameElemento;
    private String nameTipo;
    private Integer cantidad;
    private Double largo;
    private Double ancho;
    private Double alto;
    private Double areaUnidad;
    private Double areaTotal;

    public TipoInDTO() {
    }

    public TipoInDTO(Long id, String nameElemento, String nameTipo, Integer cantidad, Double largo, Double ancho, Double alto, Double areaUnidad, Double areaTotal) {
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
