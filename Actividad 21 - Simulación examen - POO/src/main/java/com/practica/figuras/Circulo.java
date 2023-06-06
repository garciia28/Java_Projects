package com.practica.figuras;

public class Circulo extends Figura {
    public void calcularArea(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    @Override
    public void calcularArea() {
        System.out.println("No es posible calcular el área de un círculo genérico.");
        System.out.println("Utiliza el método calcularArea(radio) para calcular el área del círculo.");
    }
}
