/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Area {
    private String idArea;
    private String descripcion;
    private String localizacion;

    public Area(String idArea, String descripcion, String localizacion) {
        this.idArea = idArea;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
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
    
    @Override
    public String toString() {
        return this.localizacion; 
    }
}
