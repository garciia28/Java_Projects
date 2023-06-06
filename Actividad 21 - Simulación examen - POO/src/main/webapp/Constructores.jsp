<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.practica.personas.Personas.Persona" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ejecución de Constructores.jsp</title>
</head>
<body>
    <h1>Ejecución de Constructores.jsp</h1>
    <%  
        Persona persona1 = new Persona();
        persona1.mostrarInformacion();

        out.println("<br>");

        Persona persona2 = new Persona("Juan", 25);
        persona2.mostrarInformacion();
    %>
</body>
</html>
