/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Evento {
    private String nombre;
    private String uuidEvento;
    private LocalDateTime fechaInicia;
    private LocalDateTime fechaTermina;
    private long duracion;
    private int participantes;
    private List<Comisario> comisarios;


    public Evento(String nombre, String uuidEvento, LocalDateTime fechaInicia, LocalDateTime fechaTermina, long duracion, int participantes, List<Comisario> comisarios) {
        this.nombre = nombre;
        this.uuidEvento = uuidEvento;
        this.fechaInicia = fechaInicia;
        this.fechaTermina = fechaTermina;
        this.duracion = duracion;
        this.participantes = participantes;
        this.comisarios = comisarios;
        
    }

    public String getUuidEvento() {
        return uuidEvento;
    }

    public LocalDateTime getFechaInicia() {
        return fechaInicia;
    }

    public LocalDateTime getFechaTermina() {
        return fechaTermina;
    }

    public long getDuracion() {
        return duracion;
    }

    public int getParticipantes() {
        return participantes;
    }

    public List<Comisario> getComisarios() {
        return comisarios;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return this.nombre; 
    }
}
