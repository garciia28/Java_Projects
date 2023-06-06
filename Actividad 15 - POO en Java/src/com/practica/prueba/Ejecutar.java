package com.practica.prueba;

import com.practica.alumnos.Alumnos;

public class Ejecutar {

	public static void main(String[] args) {
        // Crear los alumnos
        Alumnos alumno1 = new Alumnos("Juan", 6.50, "DAM");
        Alumnos alumno2 = new Alumnos("Ignacio", 3.50, "DAW");
        Alumnos alumno3 = new Alumnos("Luis", 8.50, "DAM");
        Alumnos alumno4 = new Alumnos("Fran", 7.60, "DAW");
        
        // Calcular la nota media de los alumnos
        double notaMedia = (alumno1.getNota() + alumno2.getNota() + alumno3.getNota() + alumno4.getNota()) / 4.0;
        
        // Mostrar la nota media
        System.out.println("La nota media de los alumnos es: " + notaMedia);

    }
}
