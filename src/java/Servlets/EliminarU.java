package Servlets;

import Clases.Usuario;
import Clases.UsuarioB;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class EliminarU extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            UsuarioB p = new UsuarioB();
            String Usuario = request.getParameter("Usuario");
            try{
                p.EliminarU(Usuario);
            } catch(SQLException ex){
                ex.getMessage();
            }finally{
                response.sendRedirect("index.jsp");
            }     
    }

}
