/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Sede {
    private String idSede;    
    private double presupuesto;
    private List<Complejo> complejos;
    private String nombre;

    public Sede(String idSede, double presupuesto, List<Complejo> numComplejos, String nombre) {
        this.idSede = idSede;
        this.presupuesto = presupuesto;
        this.complejos = numComplejos;
        this.nombre = nombre;
    }

    public String getIdSede() {
        return idSede;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getNumComplejos() {
        return complejos.size();
    }

    public List<Complejo> getComplejos() {
        return complejos;
    }

    public String getNombre() {
        return nombre;
    }
    
 
}
