/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class Curso {
  private String idCurso;
    private String nombre;
    private String descripcion;
    private int horasPorSemana;
    private Carrera carrera;

    public Curso(String idCurso, String nombre, String descripcion, int horasPorSemana, Carrera carrera) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horasPorSemana = horasPorSemana;
        this.carrera = carrera;
    }

    public String getIdCurso() { return idCurso; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getHorasPorSemana() { return horasPorSemana; }
    public Carrera getCarrera() { return carrera; }
}
