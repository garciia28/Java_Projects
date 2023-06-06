package com.empresa.restaurante;

import com.empresa.cocina.Menu; 
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/")
public class MenuServlet extends HttpServlet {
    private Map<String, Menu> menusSemana;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init() throws ServletException {
        // Inicializar el mapa de menús de la semana
        menusSemana = new HashMap<>();

        // Agregar los menús para cada día de la semana
        Menu lunes = new Menu("Arroz con pollo", "Jugo de naranja", "Flan");
        menusSemana.put("Lunes", lunes);

        Menu martes = new Menu("Espaguetis a la bolognesa", "Agua mineral", "Fruta fresca");
        menusSemana.put("Martes", martes);

        Menu miercoles = new Menu("Sopa de verduras", "Refresco de limón", "Helado");
        menusSemana.put("Miércoles", miercoles);

        Menu jueves = new Menu("Ensalada mixta", "Té helado", "Pastel de chocolate");
        menusSemana.put("Jueves", jueves);

        Menu viernes = new Menu("Pescado a la plancha", "Cerveza", "Gelatina");
        menusSemana.put("Viernes", viernes);

        Menu sabado = new Menu("Hamburguesa con papas fritas","Batido de fresa", "Mousse");
        menusSemana.put("Sábado", sabado);

        Menu domingo = new Menu("Asado de carne", "Vino tinto", "Tarta de manzana");
        menusSemana.put("Domingo", domingo);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // Obtener el día de la semana ingresado en la solicitud
        String dia = request.getParameter("dia");

        // Buscar el menú correspondiente al día ingresado
        Menu menu = menusSemana.get(dia);

        // Enviar la respuesta con el detalle del menú
        response.setContentType("text/html");
        response.getWriter().println("<h1>Menú del " + dia + "</h1>");
        if (menu != null) {
            response.getWriter().println("<p>Comida: " + menu.getComida() + "</p>");
            response.getWriter().println("<p>Bebida: " + menu.getBebida() + "</p>");
            response.getWriter().println("<p>Postre: " + menu.getPostre() + "</p>");
        } else {
            response.getWriter().println("<p>No se encontró menú para el día " + dia + "</p>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // Obtener los parámetros del formulario de menú
        String dia = request.getParameter("dia");
        String comida = request.getParameter("comida");
        String bebida = request.getParameter("bebida");
        String postre = request.getParameter("postre");

        // Crear un nuevo menú y almacenarlo en el mapa de menús de la semana
        Menu menu = new Menu(comida, bebida, postre);
        menusSemana.put(dia, menu);
        
        // Redirigir a la página de búsqueda de menús
        response.sendRedirect("buscar.jsp");
    }
	
}
