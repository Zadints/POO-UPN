/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;
import com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.enums.CondicionArma;
/**
 *
 * @author luisl
 */
public class ContratoVigilancia {
    private String codigoVigilante;
    private String codigoSucursal;
    private String fecha;
    private CondicionArma condicion;

    public ContratoVigilancia(String codigoVigilante, String codigoSucursal, String fecha, CondicionArma condicion) {
        this.codigoVigilante = codigoVigilante;
        this.codigoSucursal = codigoSucursal;
        this.fecha = fecha;
        this.condicion = condicion;
    }

    public String getCodigoVigilante() { return codigoVigilante; }
    public String getCodigoSucursal() { return codigoSucursal; }
    public String getFecha() { return fecha; }
    public CondicionArma getCondicion() { return condicion; }
}
