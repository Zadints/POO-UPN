/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.practicas.Semana4.Olimpiada.core.domain.models.*;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.Dto.*;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class EventoUseCase {
    private static List<Comisario> comisarios = new ArrayList();
    private static List<Evento> eventos = new ArrayList();
    private static List<Area> areas = new ArrayList();
    private static List<Complejo> complejos = new ArrayList();
    private static List<Sede> sedes = new ArrayList();
     
    
    
    public static void removeComisario(String uuid){
        if (comisarios == null) return;        
        comisarios.removeIf(comisario -> comisario.getUUID().equals(uuid)); 
        if (eventos == null) return;
        for (Evento e : eventos) {
           List<Comisario> comisarios = e.getComisarios();           
            for (Comisario c : comisarios) {
                if (c.getUUID().equals(uuid)) {
                    comisarios.remove(c);
                }
            }
        }
 
    }
    public static String removeArea(Area areaEliminar){
        //ver aqui Complejso tiene area mijos antes de eliminar:
        //si se peude chevere.
        for (Complejo c : complejos) {
            List<Area> areasDeUnComplejo = c.getAreas();
            for (Area a : areasDeUnComplejo) {
                if (a.equals(areaEliminar)) {
                    return "No se peude elimianr porque el área está en uso dentro de" + c.getNombre();
                }
            }
        }
        //Si no existe en el coso de complejos usado la área se eliimna 
        //de lo contrario no se eliimna
        areas.remove(areaEliminar);
        return "";
    }
    
    public static GetAllDto getComisarios(){    
        return new GetAllDto(comisarios);
    }
    public static GetAllDto getEventos(){
        return new GetAllDto(eventos);
    }
    public static GetAllDto getAreas(){
        return new GetAllDto(areas);
    }
    public static GetAllDto getComplejos(){
        return new GetAllDto(complejos);
    }
    public static GetAllDto getSedes(){
        return new GetAllDto(sedes);
    }
    
    public static List<Comisario> addParticipacionComisario(List<Participacion> nuevosPartiComisarios){
        
        List<Comisario> tempComisarios = new ArrayList();
        
        for (Comisario comisarioExiste : comisarios) {
            for (Participacion comisarioNuevo : nuevosPartiComisarios) {
                if (comisarioNuevo.getComisarioParticipacion().getUUID() == comisarioExiste.getUUID()) {
                    comisarioExiste.addParticipacion(comisarioNuevo);
                    tempComisarios.add(comisarioExiste);
                }
            }
        }
        
        if (tempComisarios == null || tempComisarios.size() == 0) {
            return null;
        }
        return tempComisarios;
    }
    public static String addComisario(Comisario nuevoComisario){
        if (comisarios.contains(nuevoComisario)) {
            return "El comisario ingresado ya existe";
        }
        comisarios.add(nuevoComisario);
        return null;
    }
    public static void addEvento(Evento nuevoEvento){
        if (eventos.contains(nuevoEvento)) {
            return;
        }
        eventos.add(nuevoEvento);
    }
    public static void addComplejo(Complejo nuevoComplejo){    
        boolean existe = complejos.stream()
                          .anyMatch(complejo -> complejo.getLocalizacion().
                                  equals( nuevoComplejo.getLocalizacion()));
        if (existe) {
            return;
        }
       complejos.add(nuevoComplejo);
    }  
    
    public static List<Area> addArea(AreaDto nuevaAreaDto){
        
        boolean existe = areas.stream()
                          .anyMatch(area -> area.getLocalizacion().
                                  equals(nuevaAreaDto.getLocalizacion()));
        boolean existe2 = areas.stream()
                          .anyMatch(area -> area.getNombre().
                                  equals(nuevaAreaDto.getNombre())); 
        if (existe || existe2) return null;
        
        Area nuevaArea = new Area(nuevaAreaDto.getIdArea(), nuevaAreaDto.getDescripcion(), 
                nuevaAreaDto.getLocalizacion(), nuevaAreaDto.getNombre());
        areas.add(nuevaArea);
        return areas;
    }
    
    public static void addSede(Sede nuevaSede){
        if (sedes.contains(nuevaSede)) {
            return;
        }
        sedes.add(nuevaSede);
    }
    
}
