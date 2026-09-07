/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Domain.models;

/**
 *
 * @author cerna
 */
public class DatosAlumno {
 private String idAlumno;
    private String nombre;
    private String direccion;
    private String telefono; // Actualizado a español
    private String email;

    public DatosAlumno(String idAlumno, String nombre, String direccion, String telefono, String email) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getIdAlumno() { return idAlumno; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
}
