/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.presentation.controller;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases.EventoUseCase;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.Dto.GetAllDto;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.Comisario;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.*;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class EventoController {
    
    public static void eliminarComisario(String uuid){
        EventoUseCase.removeComisario(uuid);
    }
    
    
    public static GetAllDto getComisarios(){
        return EventoUseCase.getComisarios();
    }
    public static GetAllDto getEventos(){
        return EventoUseCase.getEventos();
    }    
    public static GetAllDto getAreas(){
        return EventoUseCase.getAreas();
    }
    public static GetAllDto getComplejos(){
        return  EventoUseCase.getComplejos();
    }
    public static GetAllDto getSedes(){
        return  EventoUseCase.getSedes();
    }
    
    
    
    public static void crearComisario(Comisario nuevoComisario){
        EventoUseCase.addComisario(nuevoComisario);
    }
    public static void crearEvento(Evento nuevoEvento){
        EventoUseCase.addEvento(nuevoEvento);
    }
    public static void crearComplejo(Complejo nuevoComplejo){     
        EventoUseCase.addComplejo(nuevoComplejo);
    }
    public static void crearArea(Area nuevoArea){     
        EventoUseCase.addArea(nuevoArea);
    }
    public static void crearSede(Sede nuevaSede){
        EventoUseCase.addSede(nuevaSede);
    }
}
