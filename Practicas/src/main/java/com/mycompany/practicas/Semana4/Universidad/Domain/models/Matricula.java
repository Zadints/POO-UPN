/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class Matricula {
    private DatosAlumno alumno;
    private Seccion seccion;

    public Matricula(DatosAlumno alumno, Seccion seccion) {
        this.alumno = alumno;
        this.seccion = seccion;
    }

    public DatosAlumno getAlumno() { return alumno; }
    public Seccion getSeccion() { return seccion; }
}
