package com.practica.figuras;

public class Rectangulo extends Figura {
    public void calcularArea(int base, int altura) {
        int area = base * altura;
        System.out.println("El area del rectángulo es: " + area);
    }
}
