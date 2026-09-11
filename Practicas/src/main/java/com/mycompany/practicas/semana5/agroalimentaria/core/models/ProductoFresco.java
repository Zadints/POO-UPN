/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.semana5.agroalimentaria.core.models;

/**
 *
 * @author USER
 */
public class ProductoFresco extends Producto {
    private String fechaDeEnvasado;
    private String paisDeOrigen;

    public ProductoFresco(String nombre, String fechaDeCaducidad, int numeroDeLote, String fechaDeEnvasado, String paisDeOrigen) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nfechaDeEnvasado=" + fechaDeEnvasado + "\npaisDeOrigen=" + paisDeOrigen;
    }
}
