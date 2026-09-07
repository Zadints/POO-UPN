/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;

/**
 *
 * @author luisl
 */
public class Delincuente {
    private String codigo;
    private String nombre;
    private String numeroBanda; // Puede ser null o vacío si actúa solo

    public Delincuente(String codigo, String nombre, String numeroBanda) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroBanda = numeroBanda;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getNumeroBanda() { return numeroBanda; }

    @Override
    public String toString() {
        return nombre + " [" + codigo + "]";
    }
}
