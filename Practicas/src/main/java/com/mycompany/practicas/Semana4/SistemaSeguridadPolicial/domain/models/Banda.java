/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;

/**
 *
 * @author luisl
 */
public class Banda {
    private String numero;
    private int totalMiembros;

    public Banda(String numero, int totalMiembros) {
        this.numero = numero;
        this.totalMiembros = totalMiembros;
    }

    public String getNumero() { return numero; }
    public int getTotalMiembros() { return totalMiembros; }

    @Override
    public String toString() {
        return "Banda #" + numero + " (" + totalMiembros + " integrantes)";
    }
}
