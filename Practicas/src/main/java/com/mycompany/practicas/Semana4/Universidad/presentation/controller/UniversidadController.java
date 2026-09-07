/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.presentation.controller;

/**
 *
 * @author cerna
 */
import com.mycompany.practicas.Semana4.Universidad.Core.application.Dto.MatriculaDto;
import com.mycompany.practicas.Semana4.Universidad.Core.application.Dto.RegistrarNotaSeparadaDto;
import com.mycompany.practicas.Semana4.Universidad.Core.application.usecases.RegistrarMatriculaUsecase;
import com.mycompany.practicas.Semana4.Universidad.Core.application.usecases.RegistrarNotaAparteUsecase;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Matricula;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Nota;

/**
 *
 * @author cerna
 */

public class UniversidadController {
    private RegistrarMatriculaUsecase matriculaUsecase;
    private RegistrarNotaAparteUsecase notaAparteUsecase;

    public UniversidadController() {
        this.matriculaUsecase = new RegistrarMatriculaUsecase();
        this.notaAparteUsecase = new RegistrarNotaAparteUsecase();
    }

    public String procesarRegistroMatricula(MatriculaDto dto) {
        Matricula mat = matriculaUsecase.ejecutar(dto);
        return "=== SUCESO: PROCESO DE MATRÍCULA INTERNA ===\n" +
               "Inscripción guardada correctamente en el sistema.\n" +
               "Estudiante: " + mat.getAlumno().getNombre() + " [ID: " + mat.getAlumno().getIdAlumno() + "]\n" +
               "Asignatura: " + mat.getSeccion().getCurso().getNombre() + "\n" +
               "Sección/Aula: " + mat.getSeccion().getAula();
    }

    public String procesarNotaAparte(RegistrarNotaSeparadaDto dto) {
        Nota nota = notaAparteUsecase.ejecutar(dto);
        return "=== SUCESO: REGISTRO ACADÉMICO SEPARADO ===\n" +
               "Calificación asentada con éxito por el departamento.\n" +
               "ID Alumno: " + nota.getMatricula().getAlumno().getIdAlumno() + "\n" +
               "Curso Evaluado: " + nota.getMatricula().getSeccion().getCurso().getNombre() + "\n" +
               "ID Profesor Firmante: " + nota.getMatricula().getSeccion().getProfesor().getIdProfesor() + "\n" +
               "-----------------------------------------------\n" +
               "Nota Final Emitida: " + nota.getValorNota();
    }
}