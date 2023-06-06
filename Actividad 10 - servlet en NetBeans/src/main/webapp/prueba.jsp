<%-- 
    Document   : prueba.jsp
    Created on : 24 abr 2023, 11:33:10
    Author     : Tecnicos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int numero = 5;
            out.println("El triple es " + (numero*numero*numero));
        %>
    </body>
</html>
