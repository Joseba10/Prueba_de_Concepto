package com.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Usuario;

/**
 * Servlet implementation class ControladorFormulario
 */

@WebServlet("/perfil")
public class ControladorFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
	

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			// recoger parametros
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
			String direccion = request.getParameter("direccion");
			String pais = request.getParameter("pais");
			Usuario usuario = new Usuario(id, nombre, apellidos, direccion, pais);

			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(15);
			session.setAttribute("uPublic", usuario);
			
			System.out.println(usuario);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			request.getRequestDispatcher("frontoffice/index.jsp").forward(request, response);
		}

	}


}
