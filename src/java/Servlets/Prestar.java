package Servlets;

import Clases.LibrosB;
import Clases.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Prestar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LibrosB p = new LibrosB();
        
        int idLibro = Integer.parseInt(request.getParameter("idLibro"));
        HttpSession session = request.getSession(true);
        Usuario user = (Usuario) session.getAttribute("user");
        int idUser = Integer.parseInt(user.getId());
        
        try {
            p.PrestarLB(idLibro, idUser);
        } catch (SQLException ex) {
            ex.getMessage();
        }finally{
            response.sendRedirect("index.jsp");
        }
    }

}