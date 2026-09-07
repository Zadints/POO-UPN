/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class Seccion {
private String idSeccion;
    private String aula;
    private Curso curso;
    private Profesor profesor;

    public Seccion(String idSeccion, String aula, Curso curso, Profesor profesor) {
        this.idSeccion = idSeccion;
        this.aula = aula;
        this.curso = curso;
        this.profesor = profesor;
    }

    public String getIdSeccion() { return idSeccion; }
    public String getAula() { return aula; }
    public Curso getCurso() { return curso; }
    public Profesor getProfesor() { return profesor; }
}
