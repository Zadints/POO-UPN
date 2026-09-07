/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class NotaAlumno {
    private DatosAlumno alumno;
    private Seccion seccion;
    private double nota;

    public NotaAlumno(DatosAlumno alumno, Seccion seccion, double nota) {
        this.alumno = alumno;
        this.seccion = seccion;
        this.nota = nota;
    }

    public DatosAlumno getAlumno() { return alumno; }
    public Seccion getSeccion() { return seccion; }
    public double getNota() { return nota; }
}
