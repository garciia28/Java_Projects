package com.practica.evidencia;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();

        datos.add("Madrid");
        datos.add("Sevilla");
        datos.add("Madrid");
        datos.add("Valencia");
        datos.add("Sevilla");
        datos.add("Madrid");

        datos.add("Cordoba"); // Añadir la ciudad "Córdoba"
        datos.remove("Valencia"); // Eliminar la ciudad "Valencia"

        Collections.sort(datos); // Ordenar los elementos en el ArrayList

        // Imprimir el listado ordenado
        for (String dato : datos) {
            System.out.println(dato);
        }
    }
}

