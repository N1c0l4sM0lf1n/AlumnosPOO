package org.example;

class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Programación", "INF123");

        Alumno a1 = new Alumno("Juan", "Perez", 1, 20, "Informática");
        Alumno a2 = new Alumno("Maria", "Gomez", 2, 21, "Informática");
        Alumno a3 = new Alumno("Pedro", "Lopez", 3, 22, "Informática");
        Alumno a4 = new Alumno("Ana", "Diaz", 4, 19, "Informática");
        Alumno a5 = new Alumno("Luis", "Torres", 5, 23, "Informática");

        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        curso.agregarAlumno(a3);
        curso.agregarAlumno(a4);
        curso.agregarAlumno(a5);


        System.out.println(curso);

        curso.eliminarAlumno(3);

        System.out.println("Después de eliminar:\n");
        System.out.println(curso);
    }
}