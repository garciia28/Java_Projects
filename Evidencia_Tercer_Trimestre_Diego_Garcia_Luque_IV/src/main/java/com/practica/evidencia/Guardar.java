package com.practica.evidencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Guardar
 */
@WebServlet("/Guardar")
public class Guardar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guardar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            String insertar = "insert into asignaturas (nombre) values(?)";
            PreparedStatement ps = conn.prepareStatement(insertar);
            
            ps.setString(1, request.getParameter("asignatura1"));
            ps.executeUpdate();
            
            ps.setString(1, request.getParameter("asignatura2"));
            ps.executeUpdate();
            
            ps.setString(1, request.getParameter("asignatura3"));
            ps.executeUpdate();
            
            ps.setString(1, request.getParameter("asignatura4"));
            ps.executeUpdate();
            
            ps.setString(1, request.getParameter("asignatura5"));
            ps.executeUpdate();
            
            request.setAttribute("asignatura1", request.getParameter("asignatura1"));
            request.setAttribute("asignatura2", request.getParameter("asignatura2"));
            request.setAttribute("asignatura3", request.getParameter("asignatura3"));
            request.setAttribute("asignatura4", request.getParameter("asignatura4"));
            request.setAttribute("asignatura5", request.getParameter("asignatura5"));
            
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
