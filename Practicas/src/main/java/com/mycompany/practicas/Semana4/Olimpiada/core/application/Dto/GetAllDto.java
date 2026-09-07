/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.Dto;
import java.util.List;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public final class GetAllDto<T> {
    private final List<T> items;

    public GetAllDto(List<T> items) {
        this.items = List.copyOf(items);
    }
    
    public List<T> getItems() { return items; }
}
