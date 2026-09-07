/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Comisario {
    private String uuidComisario;
    private String nombre;

    public Comisario(String idComisario, String nombre) {
        this.uuidComisario = idComisario;
        this.nombre = nombre;
    }

    public String getUUID() {
        return uuidComisario;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return this.nombre; 
    }

}
