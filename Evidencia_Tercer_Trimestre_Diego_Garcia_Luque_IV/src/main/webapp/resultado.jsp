<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Resultados</title>
</head>
<body>
    <h1>Resultados</h1>
    <%
        String asignatura1 = request.getParameter("asignatura1");
        String asignatura2 = request.getParameter("asignatura2");
        String asignatura3 = request.getParameter("asignatura3");
        String asignatura4 = request.getParameter("asignatura4");
        String asignatura5 = request.getParameter("asignatura5");
    %>
    <p>Asignatura 1: <%= asignatura1 %></p>
    <p>Asignatura 2: <%= asignatura2 %></p>
    <p>Asignatura 3: <%= asignatura3 %></p>
    <p>Asignatura 4: <%= asignatura4 %></p>
    <p>Asignatura 5: <%= asignatura5 %></p>
</body>
</html>
