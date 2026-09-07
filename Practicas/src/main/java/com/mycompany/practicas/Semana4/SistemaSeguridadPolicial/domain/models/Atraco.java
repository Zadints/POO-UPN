/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;

/**
 *
 * @author luisl
 */
public class Atraco {
    private String codigoDelincuente;
    private String codigoSucursal;
    private String fecha;

    public Atraco(String codigoDelincuente, String codigoSucursal, String fecha) {
        this.codigoDelincuente = codigoDelincuente;
        this.codigoSucursal = codigoSucursal;
        this.fecha = fecha;
    }

    public String getCodigoDelincuente() { return codigoDelincuente; }
    public String getCodigoSucursal() { return codigoSucursal; }
    public String getFecha() { return fecha; }
}
