package com.practica.animal;

public class Animales {

    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        animal1.hacerSonido(); // Llama al método hacerSonido() de la clase Perro
        animal2.hacerSonido(); // Llama al método hacerSonido() de la clase Gato
    }
}