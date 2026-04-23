package org.example;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String codigo;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumno == null) return false;

        // Evitar duplicados por matrícula
        if (existeAlumno(alumno.getMatricula())) {
            return false;
        }

        alumnos.add(alumno);
        return true;
    }

    public boolean eliminarAlumno(int matricula) {
        for (Alumno a : alumnos) {
            if (a.getMatricula() == matricula) {
                alumnos.remove(a);
                return true;
            }
        }
        return false;
    }

    public boolean existeAlumno(int matricula) {
        for (Alumno a : alumnos) {
            if (a.getMatricula() == matricula) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String resultado = "Curso: " + nombre + " (" + codigo + ")\n";
        resultado += "Alumnos:\n";

        for (Alumno a : alumnos) {
            resultado += a.toString() + "\n";
        }

        return resultado;
    }
}