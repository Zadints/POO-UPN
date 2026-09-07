/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.enums;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public enum ComisarioRol {
    SUPERVISOR("Supervisor"),
    SEGURIDAD("Seguridad"),
    ARBITRAJE("Arbitraje");
    
    private String rol;

    private ComisarioRol(String rol) {
        this.rol = rol;
    }
    
    public String getRol(){
        return rol;
    }
    
    @Override
    public String toString() {
        return this.rol; 
    }
}
