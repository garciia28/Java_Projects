package com.practica.personas;

public class Personas {
    // Clase Persona
    public static class Persona {
        private String nombre;
        private int edad;

        // Constructor sin argumentos
        public Persona() {
            nombre = "Sin nombre";
            edad = 0;
        }

        // Constructor con argumentos
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Llama al constructor sin argumentos
        persona1.mostrarInformacion();

        System.out.println();

        Persona persona2 = new Persona("Juan", 25); // Llama al constructor con argumentos
        persona2.mostrarInformacion();
    }
}
