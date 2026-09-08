/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.domain.models;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Evento;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class Complejo {
    private String nombre;
    private String idComplejo;
    private String localizacion;
    private String jefeOrganizacion;
    private List<Area> areas;
    private List<Evento> eventos;

    public Complejo(String nombre, String idComplejo, String localizacion, String jefeOrganizacion, List<Area> areas, List<Evento> eventos ) {
        this.idComplejo = idComplejo;
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areas = areas;
        this.eventos = eventos;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdComplejo() {
        return idComplejo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getJefeOrganizacion() {
        return jefeOrganizacion;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    @Override
    public String toString(){
        return this.idComplejo;
    }
    
}

