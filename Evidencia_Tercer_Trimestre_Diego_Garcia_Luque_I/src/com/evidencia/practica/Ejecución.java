package com.evidencia.practica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ejecución {

    public static void main(String[] args) {
        // Crear una lista para almacenar los productos
        List<Frutas> productos = new ArrayList<>();

        // Agregar los productos a la lista
        try {
            productos.add(new Frutas(100, 80, parseFecha("15/03/2021"), "Manzana", 9.95));
            productos.add(new Frutas(150, 95, parseFecha("21/03/2021"), "Peras", 15.95));
            productos.add(new Frutas(100, 75, parseFecha("20/03/2021"), "Naranjas", 7.95));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        // Calcular el inventario total valorado por su precio
        double inventarioTotal = 0;
        for (Frutas producto : productos) {
            int stockNeto = producto.getUnidadesenStock() - producto.getUnidadesenPedido();
            inventarioTotal += stockNeto * producto.getPrecioUnitario();
        }
        
        // Mostrar el inventario total
        System.out.println("Inventario total valorado por su precio: " + inventarioTotal + " euros");
   
        // Mostrar la información de los productos
        for (Frutas producto : productos) {
            System.out.println("Producto: " + producto.getNombreProducto());
            System.out.println("Stock: " + producto.getUnidadesenStock());
            System.out.println("Pedido: " + producto.getUnidadesenPedido());
            System.out.println("Caducidad: " + formatDate(producto.getFechaCaducida()));
            System.out.println("Precio: " + producto.getPrecioUnitario());
            System.out.println();
        }
    }

    // Método auxiliar para convertir una cadena de texto en un objeto Date
    private static Date parseFecha(String fechaString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(fechaString);
    }

    // Método auxiliar para formatear una fecha como una cadena de texto
    private static String formatDate(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
    }
}
