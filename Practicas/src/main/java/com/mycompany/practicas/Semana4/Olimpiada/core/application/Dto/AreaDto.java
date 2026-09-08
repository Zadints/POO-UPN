/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.Dto;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class AreaDto {

    
    private String idArea;
    private String descripcion;
    private String localizacion;
    private String nombre;

    public AreaDto(String idArea, String descripcion, String localizacion, String nombre) {
        this.idArea = idArea;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
        this.nombre = nombre;
    }
    
    
    public String getIdArea() {
        return idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getNombre() {
        return nombre;
    }
    
}
