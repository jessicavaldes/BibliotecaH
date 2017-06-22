package Servlets;

import Clases.Usuario;
import Clases.UsuarioB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InicioSes extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String usuario = request.getParameter("usuario");
		String password = request.getParameter("pass");
                System.out.println(usuario + "   " + password);
                UsuarioB us = new UsuarioB();
                Usuario user;
                try {
                    user= us.BuscarPorUsuario(usuario);
                } catch (SQLException ex) {
                    System.out.println(ex);
                    user=null;
                }

                if(user != null && user.getPassword().equals(password) && user.getUsuario().equals(usuario)){
		
			System.out.println("Bienvenido");
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index.jsp");
			
		} else {
			response.sendRedirect("InicioSesion.jsp");
		}
    }
}