/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana5.agroalimentaria.core.models;

/**
 *
 * @author USER
 */
public class ProductoCongelado extends Producto {
    private double temperaturaDeCongelacion;

    public ProductoCongelado(String nombre, String fechaDeCaducidad, int numeroDeLote, double temperaturaDeCongelacion) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.temperaturaDeCongelacion = temperaturaDeCongelacion;
    }

    public double getTemperaturaDeCongelacion() {
        return temperaturaDeCongelacion;
    }

    public void setTemperaturaDeCongelacion(double temperaturaDeCongelacion) {
        this.temperaturaDeCongelacion = temperaturaDeCongelacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemperaturaDeCongelacion=" + temperaturaDeCongelacion;
    }
}