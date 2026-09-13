package com.mycompany.practicas.Semana5.Herencia.core.application.usecases;

import com.mycompany.practicas.Semana5.Herencia.core.application.dto.CirculoDto;
import com.mycompany.practicas.Semana5.Herencia.core.domain.models.Circulo;

public class CirculoUseCase {

    public CirculoDto calcular(CirculoDto dto) {
        Circulo circulo = new Circulo(dto.getRadio());
        dto.setArea(circulo.calcularArea());
        dto.setLongitud(circulo.calcularLongitud());
        return dto;
    }
}
