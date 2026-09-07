/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class Nota {
    private Matricula matricula;
    private double valorNota;

    public Nota(Matricula matricula, double valorNota) {
        this.matricula = matricula;
        this.valorNota = valorNota;
    }

    public Matricula getMatricula() { return matricula; }
    public double getValorNota() { return valorNota; }
}
