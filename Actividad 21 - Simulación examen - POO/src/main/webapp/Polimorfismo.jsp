<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.practica.animal.Animal, com.practica.animal.Perro, com.practica.animal.Gato" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ejecución de Polimorfismo.jsp</title>
</head>
<body>
    <h1>Ejecución de Polimorfismo.jsp</h1>
    <%  
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        animal1.hacerSonido();
        animal2.hacerSonido();
    %>
</body>
</html>
