/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana5.agroalimentaria.core.models;

/**
 *
 * @author USER
 */
public class ProductoRefrigerado extends Producto {
    private String codigoDigesa;

    public ProductoRefrigerado(String nombre, String fechaDeCaducidad, int numeroDeLote, String codigoDigesa) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.codigoDigesa = codigoDigesa;
    }

    public String getCodigoDigesa() {
        return codigoDigesa;
    }

    public void setCodigoDigesa(String codigoDigesa) {
        this.codigoDigesa = codigoDigesa;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncodigoDigesa=" + codigoDigesa;
    }
}