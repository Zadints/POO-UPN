/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Core.application.usecases;

import com.mycompany.practicas.Semana4.Universidad.Core.application.Dto.RegistrarNotaSeparadaDto;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Carrera;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Curso;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.DatosAlumno;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Matricula;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Nota;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Profesor;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Seccion;

/**
 *
 * @author cerna
 */
public class RegistrarNotaAparteUsecase {

    public Nota ejecutar(RegistrarNotaSeparadaDto dto) {
        DatosAlumno alumno = new DatosAlumno(dto.alumnoId, "Juan Perez (ID Cargado)", "", "", "");
        Carrera carrera = new Carrera("CAR-00", "Facultad de Ingeniería");
        Curso curso = new Curso("CUR-00", dto.cursoNombre, "", 4, carrera);
        Profesor profesor = new Profesor(dto.profesorId, "Profesor Validado", "", 2500.0);
        
        Seccion seccion = new Seccion("SEC-00", "Aula Virtual", curso, profesor);
        Matricula matricula = new Matricula(alumno, seccion);
        
        return new Nota(matricula, dto.notaValor);
    }
}
