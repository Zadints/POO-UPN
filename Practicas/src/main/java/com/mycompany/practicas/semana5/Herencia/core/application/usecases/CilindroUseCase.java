package com.mycompany.practicas.Semana5.Herencia.core.application.usecases;

import com.mycompany.practicas.Semana5.Herencia.core.application.dto.CilindroDto;
import com.mycompany.practicas.Semana5.Herencia.core.domain.models.Cilindro;

public class CilindroUseCase {

    public CilindroDto calcular(CilindroDto dto) {
        Cilindro cilindro = new Cilindro(dto.getRadio(), dto.getAltura());
        dto.setArea(cilindro.calcularArea());
        dto.setVolumen(cilindro.calcularVolumen());
        return dto;
    }
}
