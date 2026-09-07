/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Core.application.Dto;

/**
 *
 * @author cerna
 */

public class MatriculaDto {
    public String carreraId;
    public String carreraNombre;
    public String cursoId;
    public String cursoNombre;
    public String cursoDescripcion;
    public int cursoHoras;
    public String seccionId;
    public String seccionAula;
    public String profesorId;
    public String profesorNombre;
    public String profesorTelefono;
    public double profesorSueldo;
    public String alumnoId;
    public String alumnoNombre;
    public String alumnoDireccion;
    public String alumnoTelefono;
    public String alumnoEmail;

    public MatriculaDto(String carreraId, String carreraNombre, String cursoId, String cursoNombre, String cursoDescripcion, 
                        int cursoHoras, String seccionId, String seccionAula, String profesorId, String profesorNombre, 
                        String profesorTelefono, double profesorSueldo, String alumnoId, String alumnoNombre, 
                        String alumnoDireccion, String alumnoTelefono, String alumnoEmail) {
        this.carreraId = carreraId;
        this.carreraNombre = carreraNombre;
        this.cursoId = cursoId;
        this.cursoNombre = cursoNombre;
        this.cursoDescripcion = cursoDescripcion;
        this.cursoHoras = cursoHoras;
        this.seccionId = seccionId;
        this.seccionAula = seccionAula;
        this.profesorId = profesorId;
        this.profesorNombre = profesorNombre;
        this.profesorTelefono = profesorTelefono;
        this.profesorSueldo = profesorSueldo;
        this.alumnoId = alumnoId;
        this.alumnoNombre = alumnoNombre;
        this.alumnoDireccion = alumnoDireccion;
        this.alumnoTelefono = alumnoTelefono;
        this.alumnoEmail = alumnoEmail;
    }
}

