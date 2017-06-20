<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "javax.servlet.http.HttpSession"%>
<%@page import = "java.io.*"%>
<%@page import = "javax.servlet.*"%>  
<%@page import = "javax.servlet.http.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>Iniciar Sesión</title>
    <meta charset="UTF-8">
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

    <link href="Estilos CSS/Principal.css"  rel="stylesheet">

    <script src="js/validacion.js" language="javascript" type="text/javascript"></script>
    
</head>
<body>
    <div class="manzana">
    <div class="FullScreen">
        
        
         <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
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
                        <a class="page-scroll" href="index.jsp#NOSOTROS">NOSOTROS</a>
                    </li>
                        <li class="nivel1"><a href="InicioSesion.jsp">Login</a></li>
                            
                </ul>
            </div>
        </div>
    </nav>
       <div class="DivBajoNav FullScreen">
            <div id="DivForm" class="Container1 texto_Centrado">
                <p class="Titulo grande">Iniciar sesión</p>              
                <form name="formu" id ="formu" action="InicioSes" method="POST">                 
                    <input type="text" id="campo" name="usuario" placeholder="Usuario" class="cajatexto" size="30">
                    <input type="password" id="password" name="pass" placeholder="Contraseña" class="cajatexto" size="30">  
                    <button type="button" onclick="validacionIS()"> Iniciar </button>
                    ¿No tienes cuenta? <a href="Registrar.jsp">Regístrate</a>                   
                </form> 
            </div>
        </div>
    </div>
    </div>
</body>
</html>