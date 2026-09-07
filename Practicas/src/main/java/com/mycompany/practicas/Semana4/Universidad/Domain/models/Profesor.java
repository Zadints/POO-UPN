/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class Profesor {
   private String idProfesor;
    private String nombre;
    private String telefono; // Actualizado a español
    private double sueldo;

    public Profesor(String idProfesor, String nombre, String telefono, double sueldo) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public String getIdProfesor() { return idProfesor; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public double getSueldo() { return sueldo; }
}
