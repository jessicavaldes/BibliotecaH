function validacionIS(){ //validacion del inicio de sesion
    var val = 1;
    
    if (document.formu.usuario.value.length < 1 || document.formu.usuario.value.length > 8){ 
        alert("Tiene que escribir su usuario y no sobrepasar el limite de 8 caracteres");
        document.fvalida.nombre.focus();
        val= 0; 
    } 
    
    if (document.formu.pass.value.length < 1){ 
        alert("Tiene que escribir su contraseña");
        document.fvalida.pass.focus();
        val= 0; 
    }
    
    if(val == 1){
        document.formu.submit();
    }
}
    

function validacionR(){ //validacion registro
    var val = 1;
    
    if (document.formu.Nombre.value.length==0 || document.formu.Nombre.value.length>20){ 
        alert("Tiene que escribir su nombre y no sobrepasar el limite de 20 caracteres");
        document.fvalida.Nombre.focus();
        val= 0; 
    } 
    
        if (document.formu.ApellidoP.value.length==0 || document.formu.ApellidoP.value.length>20){ 
        alert("Tiene que escribir su apellido paterno y no sobrepasar el limite de 20 caracteres");
        document.fvalida.ApellidoP.focus();
        val= 0; 
    } 
    
    if (document.formu.ApellidoM.value.length==0 || document.formu.ApellidoM.value.length>20){ 
        alert("Tiene que escribir su apellido materno y no sobrepasar el limite de 20 caracteres");
        document.fvalida.ApellidoM.focus();
        val= 0; 
    }
    
     expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!expr.test(document.formu.Correo.value) ){
        alert("Error: La dirección de correo " + document.formu.Correo.value + " es incorrecta.");
        val= 0;
    }
    
    if (document.formu.usuario.value.length==0 || document.formu.usuario.value.length>8){ 
        alert("Tiene que escribir su usuario y no sobrepasar el limite de 8 caracteres");
        document.fvalida.nombre.focus();
        val= 0; 
    } 
    
    if (document.formu.pass.value.length==0 || document.formu.pass.value.length>8){ 
        alert("Tiene que escribir su contraseña y no sobrepasar el limite de 8 caracteres");
        document.fvalida.pass.focus();
        val= 0; 
    }
    
    if (document.formu.pass2.value.length==0 || document.formu.pass2.value.length>8){ 
        alert("Tiene que escribir la contraseña de confirmación y no sobrepasar el limite de 8 caracteres");
        document.fvalida.pass2.focus();
        val= 0; 
    }else{
        if (document.formu.pass.value!=document.formu.pass2.value){
            alert("Error: La contraseñas no coinciden");
            val= 0;
        }
    }
    
    if(val == 1){
        document.formu.submit();
    }
    
}
    
    function validacionMU() { //validacion de modificar usuario
    val=1;

    
    if (document.formu.Nombre.value.length==0){ 
        alert("Tiene que escribir su nuevo nombre");
        document.fvalida.Nombre.focus();
        val= 0; 
    } 
    
        if (document.formu.ApellidoP.value.length==0){ 
        alert("Tiene que escribir su nuevo apellido paterno");
        document.fvalida.ApellidoP.focus();
        val= 0; 
    } 

    if (document.formu.ApellidoM.value.length==0){ 
        alert("Tiene que escribir su nuevo apellido materno");
        document.fvalida.ApellidoM.focus();
        val= 0; 
    } 
    
    
    if (document.formu.usuario.value.length==0){ 
        alert("Tiene que escribir su nuevo usuario");
        document.fvalida.nombre.focus();
        val= 0; 
    } 
   
    if (document.formu.pass.value.length==0){ 
        alert("Tiene que escribir su nueva contraseña");
        document.fvalida.pass.focus();
        val= 0; 
    }
    
    if (document.formu.pass2.value.length==0){ 
        alert("Tiene que escribir la contraseña de confirmación");
        document.fvalida.pass2.focus();
        val= 0; 
    }else{
        if (document.formu.pass.value!=document.formu.pass2.value){
            alert("Error: La contraseñas no coinciden");
            val= 0;
        }
    }
    
    if (document.formu.idtipo.value!=4){ 
        alert("Error fatal");
        val= 0; 
    }
    
    if(val==1){
        document.formu.submit();
    }
    
    
}

function validacionMA(){ //validacion de modificar admin
    val=1;
    
    if (document.formu.Nombre.value.length==0 || document.formu.Nombre.value.length>20){ 
        alert("Tiene que escribir su nombre y no sobrepasar el limite de 20 caracteres");
        document.fvalida.Nombre.focus();
        val= 0; 
    } 
    
        if (document.formu.ApellidoP.value.length==0 || document.formu.ApellidoP.value.length>20){ 
        alert("Tiene que escribir su apellido paterno y no sobrepasar el limite de 20 caracteres");
        document.fvalida.ApellidoP.focus();
        val= 0; 
    } 
    
    if (document.formu.ApellidoM.value.length==0 || document.formu.ApellidoM.value.length>20){ 
        alert("Tiene que escribir su apellido materno y no sobrepasar el limite de 20 caracteres");
        document.fvalida.ApellidoM.focus();
        val= 0; 
    }
    
     expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!expr.test(document.formu.Correo.value) ){
        alert("Error: La dirección de correo " + document.formu.Correo.value + " es incorrecta.");
        val= 0;
    }
    
    if (document.formu.usuario.value.length==0 || document.formu.usuario.value.length>8){ 
        alert("Tiene que escribir su usuario y no sobrepasar el limite de 8 caracteres");
        document.fvalida.nombre.focus();
        val= 0; 
    } 
    
    if (document.formu.passOld.value.length==0 || document.formu.passOld.value.length>8){ 
        alert("Tiene que escribir su contraseña actual y no sobrepasar el limite de 8 caracteres");
        document.fvalida.pass.focus();
        val= 0; 
    }

    if (document.formu.pass.value.length==0 || document.formu.pass.value.length>8){ 
        alert("Tiene que escribir su nueva contraseña y no sobrepasar el limite de 8 caracteres");
        document.fvalida.pass.focus();
        val= 0; 
    }else{
        if (document.formu.pass.value==document.formu.passOld.value){
            alert("Error: La contraseña nueva es igual a la contraseña vieja");
            val= 0;
        }
    }
    
    if (document.formu.pass2.value.length==0 || document.formu.pass2.value.length>8){ 
        alert("Tiene que escribir la contraseña de confirmación y no sobrepasar el limite de 8 caracteres");
        document.fvalida.pass2.focus();
        val= 0; 
    }else{
        if (document.formu.pass.value!=document.formu.pass2.value){
            alert("Error: La contraseñas no coinciden");
            val= 0;
        }
    }
    
    if(val==1){
        document.formu.submit();
    }
    
}
function validacionEU() { //validacion de eliminar usuario
    val=1;
    
    if (document.formu.Usuario.value.length==0){ 
        alert("Tiene que escribir el nombre del usuario que desea eliminar");
        document.fvalida.Usuario.focus();
        val= 0; 
    }
   
    if(val==1){
        document.formu.submit()
        alert("El usuario ha sido eliminado");
    }
}

function validacionSL(){ //validacion de subirLibro
    val =1;
    
    if(document.formu.idLibro.value.length==0){
        alert("Tiene que escribir el nombre id del libro.");
        
    }    
    if(document.formu.nombreLibro.value.length==0){
        alert("Tiene que escribir el nombre del libro.");
        
    }
    
    if(document.formu.autor.value.length==0){
        alert("Tiene que escribir el autor.");
    }
    
    if(document.formu.editorial.value.length==0){
        alert("Tiene que escribir la editorial.");
    }
    if(docuement.formu.anio.value.length==0){
        alert("Tiene que escirbir el año.");
    }
    if(val==1){
        docuement.formu.submit()
        alert("El libro ha sido Registrado.")
    }
}