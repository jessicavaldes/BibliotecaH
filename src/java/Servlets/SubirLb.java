package Servlets;

import Clases.LibrosB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubirLb extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        LibrosB p = new LibrosB();

        String idLibro = request.getParameter("idLibro");
        String nombreLibro = request.getParameter("nombreLibro");
        String Autor = request.getParameter("Autor");
        String Genero = request.getParameter("Genero");
        String Editorial = request.getParameter("Editorial");        
        String Anio = request.getParameter("Anio");
        try {
            p.SubirLb(idLibro, nombreLibro, Autor, Editorial, Genero, Anio);
        } catch (SQLException ex) {
            ex.getMessage();
        }finally{
            response.sendRedirect("index.jsp");
        }
    }
}