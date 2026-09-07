/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.infrastructure.Controller;
import com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.enums.CondicionArma;
import com.mycompany.practicas.Semana4.SistemaSeguridadPolicial.domain.models.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author luisl
 */
public class SeguridadController {
    private List<Banco> bancos = new ArrayList<>();
    private List<Sucursal> sucursales = new ArrayList<>();
    private List<Vigilante> vigilantes = new ArrayList<>();
    private List<ContratoVigilancia> contratos = new ArrayList<>();
    private List<Banda> bandas = new ArrayList<>();
    private List<Delincuente> delincuentes = new ArrayList<>();
    private List<Atraco> atracos = new ArrayList<>();

    public boolean registrarBanco(String codigo, String domicilio) {
        Banco nuevoBanco = new Banco(codigo, domicilio);
        return bancos.add(nuevoBanco);
    }

    public boolean registrarSucursal(String codigo, String domicilio, int empleados, String codigoBanco) {
        return sucursales.add(new Sucursal(codigo, domicilio, empleados, codigoBanco));
    }

    public boolean registrarVigilante(String codigo, int edad) {
        for (Vigilante v : vigilantes) {
            if (v.getCodigo().equals(codigo)) {
                
                return false; 
            }
        }
        return vigilantes.add(new Vigilante(codigo, edad));
    }
    
    public boolean eliminarVigilante(String codigo) {
        
        for (int i = 0; i < vigilantes.size(); i++) {
            if (vigilantes.get(i).getCodigo().equals(codigo)) {
                vigilantes.remove(i); 
                return true; 
            }
        }
        return false; 
    }
    
    public boolean actualizarVigilante(String codigo, int nuevaEdad) {
        
        for (Vigilante v : vigilantes) {
            if (v.getCodigo().equals(codigo)) {
                v.setEdad(nuevaEdad); 
                return true; 
            }
        }
        return false; 
    }
    
    public boolean contratarVigilante(String codVigilante, String codSucursal, String fecha, CondicionArma condicion) {
        return contratos.add(new ContratoVigilancia(codVigilante, codSucursal, fecha, condicion));
    }

    public boolean registrarBanda(String numero, int miembros) {
        return bandas.add(new Banda(numero, miembros));
    }

    public boolean registrarDelincuente(String codigo, String nombre, String numBanda) {
        return delincuentes.add(new Delincuente(codigo, nombre, numBanda));
    }

    public boolean registrarAtraco(String codDelincuente, String codSucursal, String fecha) {
        return atracos.add(new Atraco(codDelincuente, codSucursal, fecha));
    }

    
    public List<Banco> getBancos() { return bancos; }
    public List<Sucursal> getSucursales() { return sucursales; }
    public List<Vigilante> getVigilantes() { return vigilantes; }
    public List<Delincuente> getDelincuentes() { return delincuentes; }

    public String generarReportePolicial() {
        StringBuilder sb = new StringBuilder("=== REPORTE DE SEGURIDAD POLICIAL ===\n\n");
        sb.append("Total Bancos: ").append(bancos.size()).append("\n");
        sb.append("Total Sucursales: ").append(sucursales.size()).append("\n");
        sb.append("Total Vigilantes: ").append(vigilantes.size()).append("\n");
        sb.append("Total Atracos Registrados: ").append(atracos.size()).append("\n\n");
        
        sb.append("--- DETALLE DE ATRACOS ---\n");
        for (Atraco a : atracos) {
            sb.append("Fecha: ").append(a.getFecha())
              .append(" | Sucursal: ").append(a.getCodigoSucursal())
              .append(" | Delincuente: ").append(a.getCodigoDelincuente()).append("\n");
        }
        return sb.toString();
    }
    
    
}
