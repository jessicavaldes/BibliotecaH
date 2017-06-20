<%@page import="Clases.Usuario"%>
<%@page import="Clases.LibrosB" %>
<%@page import="Clases.Libros" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "javax.servlet.http.HttpSession"%>
<%@page import = "java.io.*"%>
<%@page import = "javax.servlet.*"%>  
<%@page import = "javax.servlet.http.*"%>
<%
    Usuario h = new Usuario();
    try {
        h = ((Usuario) session.getAttribute("user"));
    } catch (Exception e) {
        e.printStackTrace();
    }
    LibrosB p = new LibrosB();
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
    <title>Página de Inicio</title>
    <link rel="stylesheet" href="CSS/bootstrap.min.css" type="text/css">
    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <link rel="stylesheet" href="CSS/animate.min.css" type="text/css">
    <link rel="stylesheet" href="CSS/bootstrap.css" type="text/css">

    <link rel="stylesheet" href="CSS/creative.css" type="text/css">
    <link rel="stylesheet" href="CSS/top.css" type="text/css">

    <link href="Estilos CSS/Principal.css"  rel="stylesheet">
    </head>
    <body id="page-top">
           <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#HOME">Biblioteca Heraldo</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#HOME">HOME</a>
                    </li> 
                    <li>
                        <a class="page-scroll" href="#NOSOTROS">NOSOTROS</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="BuscarLibros.jsp">BUSCAR LIBROS</a>
                    </li>
                    <li>
                        <a class="pag-scroll" href="ConsultaL.jsp">CONSULTAR LIBROS</a>
                    </li>
                    <%
                        try {
                            String n = h.getNombre();
                            if (!n.equals(null)) {
                                %><li><a href="<%= h.getTipo() %>.jsp"><%
                                out.print("Hola " + n);
                                %></a></li><%
                            }
                        } catch (Exception e) {
                    %>
                        <li class="nivel1"><a href="InicioSesion.jsp">Login</a></li>
                            <%}%>
                </ul>
            </div>
                
        </div>
                
    </nav>
                
    <header id="HOME">
        <div class="header-content">
            <div class="header-content-inner">
                <h1>Biblioteca Heraldo</h1>
                <hr>
                <%
                    try {
                        String n = h.getNombre();
                        if (!n.equals(null)) {
                            %><a class="btn btn-default btn-xl wow tada" href="<%= h.getTipo() %>.jsp">Panel de <%=h.getTipo()%></a><%
                        }
                    } catch (Exception e) {
                %>
                    <a class="btn btn-default btn-xl wow tada" href="InicioSesion.jsp">INICIAR SESION</a>
                <%}%>
            </div>
        </div>
    </header>
     <section class="bg-primary" id="DESCUBRIMIENTO">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">DESCUBRIMIENTO SEMANAL</h2>
                    <hr class="light">
                    <p class="text-faded">Debido a que el mundo de las letras es muy extenso, nos damos un clavado cada semana para rescatar libros.</p>
                   
                </div>
            </div>
        </div>
    </section>

    <aside class="bg-dark" id="NOSOTROS">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Nosotros</h2>
                    <p> Biblioteca virtual con patrimonio cultural único.
                    <hr class="light">
                    <a href="QuienesSomos.jsp" class="btn btn-default btn-xl wow tada">Quienes Somos</a>

                </div>
            </div>
        </div>
    </aside>
     <section >
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading"><font color="black">Informacion</h2>
                    <hr class="primary">
                    
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn"></i>
                    <p>123-456-6789</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                    <p><a href="mailto:your-email@your-domain.com"><font color="black">biblioteca_heraldo@gmail.com</font></a></p>
                </div>
            </div>
        </div>
    </section>

    <script src="js/jquery.js"></script>

    <script src="js/bootstrap.min.js"></script>

    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <script src="js/creative.js"></script>

    </body>
</html>
