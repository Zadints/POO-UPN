/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Comisario {
    private String nombre;
    private String apellido;
    private String uuidComisario;    
    private List<Participacion> participaciones = new ArrayList();
    //mi idea es la siguiente Comisario tiene lista de participacion
    //Evento tiene lista solo de Comisarios pero como comisarios tiene
    //ya participacion entonces no necesita almacenar participacion
    

    public List<Participacion> getParticipaciones() {
        return participaciones;
    }
    
    public void addParticipacion(Participacion participacion) {
        participaciones.add(participacion);
    }

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
