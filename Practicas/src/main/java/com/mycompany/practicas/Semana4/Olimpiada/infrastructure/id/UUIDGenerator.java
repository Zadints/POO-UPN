/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Olimpiada.infrastructure.id;
import com.mycompany.practicas.Semana4.Olimpiada.core.application.port.IdGenerator;
import java.util.UUID;
/**
 *
 * @author AUGUSTO RODRIGUEZ
 */
public class UUIDGenerator implements IdGenerator {
    @Override
    public String generar(){
        return UUID.randomUUID().toString();
    }
}
