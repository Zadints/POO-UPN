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
    private ComisarioRol rol;
    private Comisario comisarioParticipacion;
    private String idEvn;
    
    public Participacion( ComisarioRol rol, String idEvn, Comisario comisarioParticipacion) {
        this.rol = rol;
        this.idEvn = idEvn;
        this.comisarioParticipacion = comisarioParticipacion;
    }

    public ComisarioRol getRol() {
        return this.rol;
    }    
    
    public String getUuidEvento(){
        return idEvn;
    }

    public Comisario getComisarioParticipacion() {
        return comisarioParticipacion;
    }

    public String getIdEvn() {
        return idEvn;
    }
    
}
