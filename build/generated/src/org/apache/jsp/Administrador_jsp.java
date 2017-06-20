package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Usuario;

public final class Administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

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
        if (h.getTipo().equals("Administrador")) {
            tipo = true;
        }
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- Plugin CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/animate.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/bootstrap.css\" type=\"text/css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/creative.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos CSS/style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos CSS/Principal.css\">  \n");
      out.write("\n");
      out.write("       <script src=\"js/validacion.js\" language=\"javascript\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onresize=\"window.resizeTo(800,500)\"> \n");
      out.write("        <div class=\"fondoP\">\n");
      out.write("            <div class=\"FullScreen\">\n");
      out.write("                <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Biblioteca Xanat</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand page-scroll\" href=\"index.jsp#HOME\">Biblioteca Xanat</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"index.jsp\">HOME</a>\n");
      out.write("                            </li> \n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"QuienesSomos.jsp\">NOSOTROS</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"page-scroll\" href=\"BuscarLibros.jsp\">BUSCAR LIBROS</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"pag-scroll\" href=\"PrestamoL.jsp\">PRESTAMO DE LIBROS</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"pag-scroll\" href=\"DSemanal.jsp\">DESCUBRIMIENTO</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"pag-scroll\" href=\"ConsultaL.jsp\">CONSULTAR LIBROS</a>\n");
      out.write("                            </li>\n");
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
                                        
      out.write("\n");
      out.write("                                <li class=\"nivel1\"><a href=\"InicioSesion.jsp\">Login</a></li>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.navbar-collapse -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                ");
if (tipo) {
      out.write("\n");
      out.write("                <div id=\"contenido\">\n");
      out.write("                    <div id=\"info-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <a href=\"?acc=1\" ><li>Modificar mi información</li></a>\n");
      out.write("                            <a href=\"?acc=2\" ><li>Agregar Bibliotecario(a)</li></a>\n");
      out.write("                            <a href=\"?acc=3\" ><li>Eliminar Bibliotecario(a)</li></a>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"info-contenido\">\n");
      out.write("                        <div id=\"formulario\">\n");
      out.write("                            <div id=\"campos\">\n");
      out.write("                                ");
if (acc != null && (acc.equals("1") || acc.equals("2") || acc.equals("3"))) {
                                        String[] titulo = {"Modificar mi información","Agregar Bibliotecario(a)", "Eliminar Bibliotecario(a)", "Agregar Libros", "Eliminar Libros"};
                                        int num = Integer.parseInt(acc);
                                
      out.write("\n");
      out.write("                                <div id=\"titulo24\">\n");
      out.write("                                    ");
      out.print( titulo[num - 1]);
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"introducir\">\n");
      out.write("                                    ");

                                        if (acc.equals("1")) {
                                    
      out.write("\n");
      out.write("                                     <form name=\"formu\" action = \"ActualizarU\" method=\"Post\">\n");
      out.write("                                        <input type=\"text\" name=\"Nombre\" placeholder=\"Nombre:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                        <input type=\"text\" name=\"ApellidoP\" placeholder=\"Apellido Paterno:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                        <input type=\"text\" name=\"ApellidoM\" placeholder=\"Apellido Materno:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                        <input type=\"text\" name=\"usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\" ><br>\n");
      out.write("                                        <input type=\"text\" name=\"Correo\" placeholder=\"Correo electronico:\" class=\"cajatexto\" size=\"30\" ><br>\n");
      out.write("                                        <input type=\"password\" name=\"passOld\" placeholder=\"Contraseña Actual\" class=\"cajatexto\" size=\"30\" ><br>\n");
      out.write("                                        <input type=\"password\" name=\"pass\" placeholder=\"Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                              ");
      out.write("\n");
      out.write("                                        <input type=\"password\" name=\"pass2\" placeholder=\"Confirmar Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                    ");
      out.write("\n");
      out.write("                                        <input type=\"hidden\" name=\"idPersona\" value=\"");
      out.print( h.getId() );
      out.write("\">\n");
      out.write("                                        <input type=\"hidden\" name=\"idtipo\" value=\"1\">\n");
      out.write("                                        <button type=\"button\"  onclick=\"validacionMA()\">Modificar</button>\n");
      out.write("                                        \n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    ");
} else if (acc.equals("2")) {
      out.write("\n");
      out.write("                                         <form name=\"formu\" action = \"RegistrarUs\" method=\"Post\">\n");
      out.write("                                           <input type=\"text\" name=\"Nombre\" placeholder=\"Nombre:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                           <input type=\"text\" name=\"ApellidoP\" placeholder=\"Apellido Paterno:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                           <input type=\"text\" name=\"ApellidoM\" placeholder=\"Apellido Materno:\" class=\"cajatexto\" size=\"30\"><br>\n");
      out.write("                                           <input type=\"text\" name=\"Correo\" placeholder=\"Correo electronico:\" class=\"cajatexto\" size=\"30\"><br>                        ");
      out.write("\n");
      out.write("                                           <input type=\"text\" name=\"usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\"><br> \n");
      out.write("                                           <input type=\"password\" name=\"pass\" placeholder=\"Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                              ");
      out.write("\n");
      out.write("                                           <input type=\"password\" name=\"pass2\" placeholder=\"Confirmar Contraseña:\" class=\"cajatexto\" size=\"30\"><br>                   ");
      out.write("\n");
      out.write("                                           <input type=\"hidden\" name=\"idtipo\" value=\"2\">                                                                              ");
      out.write("\n");
      out.write("                                           <button type=\"button\" onclick=\"validacionR()\">Agregar</button>   \n");
      out.write("                                         </form>\n");
      out.write("                                    ");

                                     } else if (acc.equals("3")) {
      out.write("\n");
      out.write("                                     <form name=\"formu\" action=\"EliminarU\" method=\"Post\">\n");
      out.write("                                         <input type=\"text\" name=\"Usuario\" placeholder=\"Usuario:\" class=\"cajatexto\" size=\"30\">\n");
      out.write("                                         <input type=\"hidden\" name=\"Usuario\" value=\"");
      out.print( h.getUsuario() );
      out.write("\">\n");
      out.write("                                         <input type=\"hidden\" name=\"idtipo\" value=\"3\">\n");
      out.write("                                         <button type=\"button\" onclick=\"validacionEU()\">Eliminar</button>\n");
      out.write("                                     </form>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <a class=\"btn btn-default btn-xl wow tada\" href=\"CerrarSes\">Cerrar Sesión</a>\n");
      out.write("               \n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                <div class=\"DivBajoNav texto_Centrado\">\n");
      out.write("                    <a href=\"InicioSesion.jsp\"><p class=\"grande Titulo\">Inicia sesión porfavor</p></a>\n");
      out.write("                </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
