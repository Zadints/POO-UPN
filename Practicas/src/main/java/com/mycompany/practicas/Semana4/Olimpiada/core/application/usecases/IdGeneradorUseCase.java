/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.core.application.usecases;

import com.mycompany.practicas.Semana4.Olimpiada.core.application.port.IdGenerator;

/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class IdGeneradorUseCase {
    private final IdGenerator idGenerator;

    public IdGeneradorUseCase(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }
    
    public String generar(){
        return idGenerator.generar();
    }
}
