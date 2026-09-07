/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.enums.ComisarioRol;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Participacion {
    private Comisario comisario;
    private ComisarioRol rol;

    public Participacion(Comisario comisario, ComisarioRol rol) {
        this.comisario = comisario;
        this.rol = rol;
    }

    public Comisario getComisario() {
        return comisario;
    }

    public ComisarioRol getRol() {
        return this.rol;
    }    
    
}
