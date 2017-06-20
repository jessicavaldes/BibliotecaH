<%@page import="Clases.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Usuario h = new Usuario();
    try {
        h = ((Usuario) session.getAttribute("user"));
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html lang = "es">
    <head>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">  
        
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
    
      <!-- Bootstrap Core CSS -->
    <link href="CSS/bootstrap2.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="CSS/agency.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/CSS/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    
    <link href="Estilos CSS/Principal.css"  rel="stylesheet">
        
        
        <title>Quienes Somos</title>
        <script src="pulsar.js"></script>
    </head>
    <body>
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
                            <a class="navbar-brand page-scroll" href="index.jsp#HOME">Biblioteca Xánat</a>
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
                        <!-- /.navbar-collapse -->
                    </div>
                    <!-- /.container-fluid -->
                </nav>
            <br><BR><br><BR>
                    
            <div class="DivBajoNav">
                <aside>
                    <div>
                        <h2 ALIGN=center>Del momento... Biblioteca Heraldo</h2>  
                    </div>
                </aside>
            </div>
                        
        <section id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Biblioteca Heraldo</h2></br>
                    <h3 class="section-subheading text-muted">Acerca del sitio web...</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <ul class="timeline">
                        <li>
                            <div class="timeline-image">
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    
                                    <h4 class="subheading">PROPOSITO</h4>
                                </div>
                                <div class="timeline-body">
                                    
                            <p> Nos encargamos de ser una Biblioteca líder en el mundo virtual </p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="timeline-image">
                                
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    
                                    <h4 class="subheading">ASPIRACIONES</h4>
                                </div>
                                <div class="timeline-body">
                                    <p>A través de la Biblioteca Heraldo puedes obtener conocimiento de calidad.</p>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-image">
                                <h3>Propagar</h3>
                            </div>
                        </li>
                    </ul>
                    
                </div>
            </div>
        </div>
    </section>
   
                    <footer>
                        <small>&copy; 2017 Biblioteca Heraldo</small>
                    </footer>
                </aside>
            </div>
        </div>
                
                 <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>
              </div>  
    </div>
    </body>
</html>