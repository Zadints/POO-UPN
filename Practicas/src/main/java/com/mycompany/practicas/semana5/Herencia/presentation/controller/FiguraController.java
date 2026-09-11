package com.mycompany.practicas.Semana5.Herencia.presentation.controller;

import com.mycompany.practicas.Semana5.Herencia.core.application.dto.CilindroDto;
import com.mycompany.practicas.Semana5.Herencia.core.application.dto.CirculoDto;
import com.mycompany.practicas.Semana5.Herencia.core.application.usecases.CilindroUseCase;
import com.mycompany.practicas.Semana5.Herencia.core.application.usecases.CirculoUseCase;

public class FiguraController {

    private final CirculoUseCase circuloUseCase = new CirculoUseCase();
    private final CilindroUseCase cilindroUseCase = new CilindroUseCase();

    public CirculoDto calcularCirculo(double radio) {
        CirculoDto dto = new CirculoDto(radio);
        return circuloUseCase.calcular(dto);
    }

    public CilindroDto calcularCilindro(double radio, double altura) {
        CilindroDto dto = new CilindroDto(radio, altura);
        return cilindroUseCase.calcular(dto);
    }
}
