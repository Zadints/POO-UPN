/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Evento {
    private String idEvento;
    private LocalDateTime fechaInicia;
    private LocalDateTime fechaTermina;
    private long duracion;
    private int participantes;
    private List<Participacion> comisarios;


    public Evento(String idEvento, LocalDateTime fechaInicia, LocalDateTime fechaTermina, long duracion, int participantes, List<Participacion> comisarios) {
        this.idEvento = idEvento;
        this.fechaInicia = fechaInicia;
        this.fechaTermina = fechaTermina;
        this.duracion = duracion;
        this.participantes = participantes;
        this.comisarios = comisarios;
        
    }

    public String getIdEvento() {
        return idEvento;
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

    public List<Participacion> getComisarios() {
        return comisarios;
    }
    
    @Override
    public String toString() {
        return this.idEvento + fechaInicia; 
    }
}
