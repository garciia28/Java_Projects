<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.practica.figuras.Figura, com.practica.figuras.Rectangulo, com.practica.figuras.Circulo" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ejecución de herencia.java</title>
</head>
<body>
    <h1>Ejecución de herencia.java</h1>
    <%  
        Figura figura = new Figura();
        figura.calcularArea(); 
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea(5, 10);
        
        Circulo circulo = new Circulo();
        circulo.calcularArea(3.5);
        circulo.calcularArea();
    %>
</body>
</html>