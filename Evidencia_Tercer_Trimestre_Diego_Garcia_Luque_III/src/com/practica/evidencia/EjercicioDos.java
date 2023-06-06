package com.practica.evidencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> datos = new HashMap<>();

        agregarDato(datos, "Madrid", 50);
        agregarDato(datos, "Sevilla", 40);
        agregarDato(datos, "Madrid", 35);
        agregarDato(datos, "Valencia", 81);

        // Mostrar el listado ordenado
        mostrarListadoOrdenado(datos);
    }

    private static void agregarDato(HashMap<String, ArrayList<Integer>> datos, String ciudad, int valor) {
        ArrayList<Integer> valores = datos.getOrDefault(ciudad, new ArrayList<>());
        valores.add(valor);
        datos.put(ciudad, valores);
    }

    private static void mostrarListadoOrdenado(HashMap<String, ArrayList<Integer>> datos) {
        List<String> clavesOrdenadas = new ArrayList<>(datos.keySet());
        Collections.sort(clavesOrdenadas);

        for (String clave : clavesOrdenadas) {
            ArrayList<Integer> valores = datos.get(clave);
            for (int valor : valores) {
                System.out.println(clave + ": " + valor);
            }
        }
    }
}



