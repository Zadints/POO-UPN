/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models;

/**
 *
 * @author luisl
 */
public class Sucursal {
    private String codigo;
    private String domicilio;
    private int numEmpleados;
    private String codigoBanco;

    public Sucursal(String codigo, String domicilio, int numEmpleados, String codigoBanco) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.numEmpleados = numEmpleados;
        this.codigoBanco = codigoBanco;
    }

    public String getCodigo() { return codigo; }
    public String getDomicilio() { return domicilio; }
    public int getNumEmpleados() { return numEmpleados; }
    public String getCodigoBanco() { return codigoBanco; }

    @Override
    public String toString() {
        return "Sucursal " + codigo + " (" + domicilio + ")";
    }
}
