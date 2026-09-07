/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Core.application.Dto;

/**
 *
 * @author cerna
 */
public class RegistrarNotaSeparadaDto {
    public String alumnoId;
    public String cursoNombre;
    public String profesorId;
    public double notaValor;

    public RegistrarNotaSeparadaDto(String alumnoId, String cursoNombre, String profesorId, double notaValor) {
        this.alumnoId = alumnoId;
        this.cursoNombre = cursoNombre;
        this.profesorId = profesorId;
        this.notaValor = notaValor;
    }
}

