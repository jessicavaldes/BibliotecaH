package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Usuario;

public final class Bibliotecario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

    String acc = request.getParameter("acc");
    Usuario h = new Usuario();
    boolean off = true;
    boolean tipo = false;
    try {
        h = ((Usuario) session.getAttribute("user"));
    } catch (Exception e) {
        e.printStackTrace();
    }
    if (h != null) {
        off = false;
    }
    if (!off) {
        if (h.getTipo().equals("Bibliotecario")) {
            tipo = true;
        }
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Plugin CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/animate.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\" type=\"text/css\">\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/creative.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos CSS/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos CSS/Principal.css\">  \r\n");
      out.write("\r\n");
      out.write("       <script src=\"js/validacion.js\" language=\"javascript\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onresize=\"window.resizeTo(800,500)\"> \r\n");
      out.write("        <div class=\"fondoP\">\r\n");
      out.write("            <div class=\"FullScreen\">\r\n");
      out.write("                <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                                <span class=\"sr-only\">Biblioteca Heraldo</span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                                <span class=\"icon-bar\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a class=\"navbar-brand page-scroll\" href=\"index.jsp#HOME\">Biblioteca Heraldo</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"page-scroll\" href=\"index.jsp\">HOME</a>\r\n");
      out.write("                            </li> \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"page-scroll\" href=\"QuienesSomos.jsp\">NOSOTROS</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"page-scroll\" href=\"BuscarLibros.jsp\">BUSCAR LIBROS</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"pag-scroll\" href=\"ConsultaL.jsp\">CONSULTAR LIBROS</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                                ");

                                    try {
                                        String n = h.getNombre();
                                        if (!n.equals(null)) {
                                
      out.write("<li><a href=\"");
      out.print( h.getTipo());
      out.write(".jsp\">");

                                    out.print("Hola " + n);
                                        
      out.write("</a></li>");

                                            }
                                        } catch (Exception e) {
                                        
      out.write("\r\n");
      out.write("                                <li class=\"nivel1\"><a href=\"InicioSesion.jsp\">Login</a></li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.navbar-collapse -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.container-fluid -->\r\n");
      out.write("                </nav>\r\n");
      out.write("                ");
if (tipo) {
      out.write("\r\n");
      out.write("                <div id=\"contenido\">\r\n");
      out.write("                    <div id=\"info-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <a href=\"?acc=1\" ><li>Modificar mi información</li></a>\r\n");
      out.write("                            <a href=\"?acc=2\" ><li>Alta de Usuario</li></a>\r\n");
      out.write("                            <a href=\"?acc=3\" ><li>Baja de Usuario</li></a>\r\n");
      out.write("                            <a href=\"?acc=4\" ><li>Agregar Libro</li></a>\r\n");
      out.write("                            <a href=\"?acc=5\" ><li>Eliminar Libro</li></a>\r\n");
      out.write("                            <a href=\"?acc=6\" ><li>Actualizar Libros</li></a>\r\n");
      out.write("                            <a href=\"?acc=7\" ><li>Préstamo</li></a>\r\n");
      out.write("                            <a href=\"?acc=8\" ><li>Devolución</li></a>\r\n");
      out.write("                            <a href=\"?acc=9\" ><li>Stock de Libros</li></a>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"info-contenido\">\r\n");
      out.write("                        <div id=\"formulario\">\r\n");
      out.write("                            <div id=\"campos\">\r\n");
      out.write("                                ");
if (acc != null && (acc.equals("1") || acc.equals("2") || acc.equals("3") ||acc.equals("4") ||acc.equals("5") ||acc.equals("6") ||acc.equals("7")||acc.equals("8")||acc.equals("9")  )) {
                                        String[] titulo = {"Modificar mi información","Alta de Usuario", "Baja de Usuario", "Agregar Libros", "Eliminar Libros", "Actualizar Libros", "Préstamo", "Devolución", "Stock de Libros"};
                                        int num = Integer.parseInt(acc);
                                
      out.write("\r\n");
      out.write("                                <div id=\"titulo24\">\r\n");
      out.write("                                    ");
      out.print( titulo[num - 1]);
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"introducir\">\r\n");
      out.write("                                    ");

                                        if (acc.equals("1")) {
                                    
      out.write("\r\n");
      out.write("                                     <form name=\"formu\" action = \"ActualizarU\" method=\"Post\">\r\n");
      out.write("                                        <input type=\"text\" name=\"Nombre\" placeholder=\"Nombre:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                        <input type=\"text\" name=\"ApellidoP\" placeholder=\"Apellido Paterno:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                        <input type=\"text\" name=\"ApellidoM\" placeholder=\"Apellido Materno:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                        <input type=\"text\" name=\"usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\" ><br>\r\n");
      out.write("                                        <input type=\"text\" name=\"Correo\" placeholder=\"Correo electronico:\" class=\"cajatexto\" size=\"30\" ><br>\r\n");
      out.write("                                        <input type=\"password\" name=\"passOld\" placeholder=\"Contraseña Actual\" class=\"cajatexto\" size=\"30\" ><br>\r\n");
      out.write("                                        <input type=\"password\" name=\"pass\" placeholder=\"Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                              ");
      out.write("\r\n");
      out.write("                                        <input type=\"password\" name=\"pass2\" placeholder=\"Confirmar Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                    ");
      out.write("\r\n");
      out.write("                                        <input type=\"hidden\" name=\"idPersona\" value=\"");
      out.print( h.getId() );
      out.write("\">\r\n");
      out.write("                                        <input type=\"hidden\" name=\"idtipo\" value=\"1\">\r\n");
      out.write("                                        <button type=\"button\"  onclick=\"validacionMA()\">Modificar</button>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                    ");
} else if (acc.equals("2")) {
      out.write("\r\n");
      out.write("                                         <form name=\"formu\" action = \"RegistrarUs\" method=\"Post\">\r\n");
      out.write("                                           <input type=\"text\" name=\"Nombre\" placeholder=\"Nombre:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                           <input type=\"text\" name=\"ApellidoP\" placeholder=\"Apellido Paterno:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                           <input type=\"text\" name=\"ApellidoM\" placeholder=\"Apellido Materno:\" class=\"cajatexto\" size=\"30\"><br>\r\n");
      out.write("                                           <input type=\"text\" name=\"Correo\" placeholder=\"Correo electronico:\" class=\"cajatexto\" size=\"30\"><br>                        ");
      out.write("\r\n");
      out.write("                                           <input type=\"text\" name=\"usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\"><br> \r\n");
      out.write("                                           <input type=\"password\" name=\"pass\" placeholder=\"Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                              ");
      out.write("\r\n");
      out.write("                                           <input type=\"password\" name=\"pass2\" placeholder=\"Confirmar Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                   ");
      out.write("\r\n");
      out.write("                                           <input type=\"hidden\" name=\"idtipo\" value=\"2\">                                                                              ");
      out.write("\r\n");
      out.write("                                           <button type=\"button\" onclick=\"validacionR()\">Agregar</button>   \r\n");
      out.write("                                         </form>\r\n");
      out.write("                                    ");

                                     } else if (acc.equals("3")) {
      out.write("\r\n");
      out.write("                                     <form name=\"formu\" action=\"EliminarU\" method=\"Post\">\r\n");
      out.write("                                         <input type=\"text\" name=\"Usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                         <input type=\"hidden\" name=\"Usuario\" value=\"");
      out.print( h.getUsuario() );
      out.write("\">\r\n");
      out.write("                                         <input type=\"hidden\" name=\"idtipo\" value=\"3\">\r\n");
      out.write("                                         <button type=\"button\" onclick=\"validacionEU()\">Eliminar</button>\r\n");
      out.write("                                     </form>\r\n");
      out.write("                                    ");
 } else if(acc.equals("4")){  
                                    
      out.write("\r\n");
      out.write("                                        <form name=\"formu\" id =\"formu\" action=\"SubirLib\" method=\"POST\">\r\n");
      out.write("                                            <input type=\"text\" name=\"idLibro\" placeholder=\"idLibro:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"NombreLibro\" placeholder=\"Nombre Libro:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Autor\" placeholder=\"Autor:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Editorial\" placeholder=\"Editorial:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Año\" placeholder=\"Año:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Genero\" placeholder=\"Género:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"idLibro\" value=\"4\"> \r\n");
      out.write("                                            <button type=\"submit\">Registrar Libro </button>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    ");
} else if(acc.equals("5")){ 
      out.write("\r\n");
      out.write("                                            <form name=\"formu\" action=\"EliminarL\" method=\"Post\">\r\n");
      out.write("                                            <input type=\"text\" name=\"idLibro\" placeholder=\"idLibro:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <button type=\"submit\" onclick=\"validacionEL()\">Eliminar Libro</button>\r\n");
      out.write("                                            \r\n");
      out.write("                                   ");
 } else if (acc.equals("6")){ 
      out.write("\r\n");
      out.write("                                            <form name=\"formu\" action=\"ActualizarL\" method=\"Post\">\r\n");
      out.write("                                            <input type=\"text\" name=\"idLibro\" placeholder=\"idLibro:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"NombreLibro\" placeholder=\"Nombre Libro:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Autor\" placeholder=\"Autor:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Editorial\" placeholder=\"Editorial:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Año\" placeholder=\"Año:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"text\" name=\"Genero\" placeholder=\"Género:\" class=\"cajatexto\" size=\"30\">\r\n");
      out.write("                                            <input type=\"hidden\" name=\"idLibro\" value=\"4\"> \r\n");
      out.write("                                            <button type=\"submit\" onclick=\"validacionAL()\">Actualizar</button>\r\n");
      out.write("                                ");
 } else if (acc.equals("7")) { 
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                ");
} else if (acc.equals("8")) { 
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <a class=\"btn btn-default btn-xl wow tada\" href=\"CerrarSes\">Cerrar Sesión</a>\r\n");
      out.write("               \r\n");
      out.write("                ");
} else {
      out.write("\r\n");
      out.write("                <div class=\"DivBajoNav texto_Centrado\">\r\n");
      out.write("                    <a href=\"InicioSesion.jsp\"><p class=\"grande Titulo\">Inicia sesión porfavor</p></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
