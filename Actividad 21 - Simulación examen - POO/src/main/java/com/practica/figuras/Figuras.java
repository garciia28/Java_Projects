package com.practica.figuras;

public class Figuras {
    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.calcularArea(); // Llama al método calcularArea de la clase Figura

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea(5, 10); // Llama al método calcularArea(int base, int altura) de la clase Rectangulo

        Circulo circulo = new Circulo();
        circulo.calcularArea(3.5); // Llama al método calcularArea(double radio) de la clase Circulo
        circulo.calcularArea(); // Llama al método calcularArea() sobreescrito de la clase Circulo
    }
}
