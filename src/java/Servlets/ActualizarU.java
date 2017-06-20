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


public class ActualizarU extends HttpServlet {
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        UsuarioB p = new UsuarioB();
        Usuario h = new Usuario();
        
        String nombre = request.getParameter("Nombre");
        String paterno = request.getParameter("ApellidoP");
        String materno= request.getParameter("ApellidoM");
        String email = request.getParameter("Correo");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("pass");
        String passwordOld = request.getParameter("passOld");
        String id = request.getParameter("idPersona");
        String tipo = request.getParameter("idtipo");

        h.setNombre(nombre);
        h.setPaterno(paterno);
        h.setMaterno(materno);
        switch(tipo){
            case "1":
                h.setTipo("Administrador");
                break;
            case "2":
                h.setTipo("Proveedor");
                break;
            case "3":
                h.setTipo("Bibliotecario");
                break;
            case "4":
                h.setTipo("Usuario");
            }
        h.setPassword(password);
        h.setEmail(email);
        h.setId(id);
        h.setUsuario(usuario);
        
        
        try {
            Usuario usuario1 = (Usuario) session.getAttribute("user");
            String passOld = usuario1.getPassword();
            if(passOld.equals(passwordOld) ){
            p.ActualizarU(nombre,paterno,materno,email, usuario,password,id);
            session.setAttribute("user",h);
            }
        } 
        catch (SQLException ex) {
            ex.getMessage();
        }finally{
            response.sendRedirect("index.jsp");
        }
        
    }

}
