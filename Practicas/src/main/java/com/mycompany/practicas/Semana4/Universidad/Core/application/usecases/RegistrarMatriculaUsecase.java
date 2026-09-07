/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas.Semana4.Universidad.Core.application.usecases;

import com.mycompany.practicas.Semana4.Universidad.Core.application.Dto.MatriculaDto;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Carrera;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Curso;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.DatosAlumno;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Matricula;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Profesor;
import com.mycompany.practicas.Semana4.Universidad.Domain.models.Seccion;

/**
 *
 * @author cerna
 */

public class RegistrarMatriculaUsecase {

    public Matricula ejecutar(MatriculaDto dto) {
        Carrera carrera = new Carrera(dto.carreraId, dto.carreraNombre);
        Curso curso = new Curso(dto.cursoId, dto.cursoNombre, dto.cursoDescripcion, dto.cursoHoras, carrera);
        Profesor profesor = new Profesor(dto.profesorId, dto.profesorNombre, dto.profesorTelefono, dto.profesorSueldo);
        Seccion seccion = new Seccion(dto.seccionId, dto.seccionAula, curso, profesor);
        DatosAlumno alumno = new DatosAlumno(dto.alumnoId, dto.alumnoNombre, dto.alumnoDireccion, dto.alumnoTelefono, dto.alumnoEmail);
        
        return new Matricula(alumno, seccion);
    }
}

