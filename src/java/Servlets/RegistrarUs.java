package Servlets;

import Clases.UsuarioB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrarUs extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioB p = new UsuarioB();
        
        String nombre = request.getParameter("Nombre");
        String paterno = request.getParameter("ApellidoP");
        String materno= request.getParameter("ApellidoM");
        String email = request.getParameter("Correo");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("pass");
        String tipo = request.getParameter("idtipo");


        
        try {
            p.Registrar(nombre,paterno,materno,email,usuario,password,tipo);
        } catch (SQLException ex) {
            ex.getMessage();
        }finally{
            response.sendRedirect("index.jsp");
        }
    }

}