package com.mycompany.practicas.Semana5.Herencia.core.application.dto;

public class CirculoDto {

    private double radio;
    private double area;
    private double longitud;

    public CirculoDto() {
    }

    public CirculoDto(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
