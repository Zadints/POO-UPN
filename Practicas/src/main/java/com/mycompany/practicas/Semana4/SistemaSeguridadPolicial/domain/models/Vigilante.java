/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;

/**
 *
 * @author luisl
 */
public class Vigilante {
    private String codigo;
    private int edad;

    public Vigilante(String codigo, int edad) {
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getCodigo() { return codigo; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "Vigilante " + codigo + " (" + edad + " años)";
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
