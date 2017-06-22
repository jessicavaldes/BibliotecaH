<%@page import="java.util.List"%>
<%@page import="Clases.LibrosB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.Usuario"%>
<%@page import="Clases.Libros"%>
<%
    String acc = request.getParameter("acc");
    Usuario h = new Usuario();
    List<Libros> libros = null;
    LibrosB obj = new LibrosB();
    boolean off = true;
    boolean tipo = false;
    try {
        h = ((Usuario) session.getAttribute("user"));
        libros = obj.BuscarTodos();
    } catch (Exception e) {
        e.printStackTrace();
    }
    if (h != null) {
        off = false;
    }
     if (!off) {
        if (h.getTipo().equals("Usuario")) {
            tipo = true;
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">


        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="CSS/bootstrap.min.css" type="text/css">

        <!-- Custom Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

        <!-- Plugin CSS -->
        <link rel="stylesheet" href="CSS/animate.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/bootstrap.css" type="text/css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="CSS/creative.css" type="text/css">


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->


        <link rel="stylesheet" href="Estilos CSS/style.css">

        <link rel="stylesheet" href="Estilos CSS/Principal.css">  


        <script src="js/validacion.js" language="javascript" type="text/javascript"></script>
    </head>
    <body onresize="window.resizeTo(800,500)"> 
        <div class="manzana">
            <div class="FullScreen">

                <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Biblioteca Heraldo</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand page-scroll" href="index.jsp#HOME">Biblioteca Heraldo</a>
                        </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a class="page-scroll" href="index.jsp">HOME</a>
                            </li> 
                            <li>
                                <a class="page-scroll" href="QuienesSomos.jsp">NOSOTROS</a>
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
                                %><li><a href="<%= h.getTipo()%>.jsp"><%
                                    out.print("Hola " + n);
                                        %></a></li><%
                                            }
                                        } catch (Exception e) {
                                        %>
                                <li class="nivel1"><a href="InicioSesion.jsp">Login</a></li>
                                    <%}%>
                            </ul>
                        </div>
                        <!-- /.navbar-collapse -->
                    </div>
                    <!-- /.container-fluid -->
                </nav>

                <%if (tipo) {%>
                <div id="contenido">
                    <div id="info-menu">
                        <ul>
                            <li>Búsqueda de libros</li>                          
                        </ul>
                    </div>
                    <div id="info-contenido">
                        <div id="formulario">
                            <div id="campos">
                                <div id="titulo24">
                                    Libros
                                </div>

                                <div id="introducir" class="row">
                                    <% for( int i = 0; i < libros.size(); i++) {%>
                                    <div class="col-lg-12">
                                        <img class="img-circle" src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Generic placeholder image" width="140" height="140">
                                        <h2>Heading</h2>
                                        <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
                                        <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
                                    </div>
                                    <%}%>
                                </div>
                        </div>
                    </div>
                </div>
            </div>
            <a class="btn btn-default btn-xl wow tada" href="CerrarSes">Cerrar Sesión</a>
            <%} else {%>
            <div class="DivBajoNav texto_Centrado">
                <a href="InicioSesion.jsp"><p class="grande Titulo">Inicia sesión porfavor</p></a>
            </div>
            <%}%>
        </div>
    </div>
</body>
</html>
