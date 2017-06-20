drop database if exists BibliotecaHeraldo;
CREATE database BibliotecaHeraldo;


USE BibliotecaHeraldo;
#CREATE USER 'BibliotecaHeraldo'@'localhost' IDENTIFIED BY 'BH'; solo cuando se inicia por primera vez

#GRANT ALL ON BibliotecaHeraldo.* TO 'Biblioteca Heraldo'@'localhost' IDENTIFIED BY 'BH'; lo mismo de arriba

CREATE TABLE TblDatos (
idPersona INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(20) NOT NULL,
Apaterno VARCHAR(20) NOT NULL,
Amaterno VARCHAR(20) NOT NULL,
Email VARCHAR(30) NOT NULL
);

drop table if exists TblLibros;
CREATE TABLE TblLibros(
idLibro INT AUTO_INCREMENT PRIMARY KEY,
nombreLibro VARCHAR (50) NOT NULL,
Autor VARCHAR (80) NOT NULL,
Editorial VARCHAR (70) NOT NULL,
Genero VARCHAR (30) NOT NULL,
Anio int (6) not null,
idPersona int,
cantidad int (20),
FOREIGN KEY(idPersona) REFERENCES TblDatos(idPersona)
);

CREATE TABLE CatTipoPersona (
idTipo INT(2) AUTO_INCREMENT PRIMARY KEY,
Persona VARCHAR(11) NOT NULL
);


CREATE TABLE TblAcceso (
Usuario VARCHAR(20) PRIMARY KEY,
Contraseña VARCHAR(30) NOT NULL,
idPersona INT,
idTipo INT(2),
FOREIGN KEY(idPersona) REFERENCES TblDatos(idPersona),
FOREIGN KEY(idTipo) REFERENCES CatTipoPersona(idTipo)
);

CREATE TABLE Prestamos (
idPrestamo int auto_increment primary key,
Usuario VARCHAR(20),
idLibro int,
cantidad int (20),
FOREIGN KEY (Usuario) REFERENCES TblAcceso (Usuario),
FOREIGN KEY (idLibro) REFERENCES TblLibros (idLibro)
);

CREATE TABLE Devoluciones (
idDevolucion int auto_increment primary key,
Usuario VARCHAR (20),
idLibro int, 
cantidad int (20),
FOREIGN KEY (Usuario) REFERENCES TblAcceso (Usuario),
FOREIGN key (idLibro) REFERENCES TblLibros(idLibro)
);

select * from Prestamos;
select * from Devoluciones;


INSERT INTO CatTipoPersona (Persona) values 
('Admin'),	
('Usu'),
('Prove'),
('Biblio');

INSERT INTO TblDatos (Nombre,Apaterno,Amaterno,Email) values 
('Juan', 'Arceo', 'Rangel', 'loquesea@gmail.com'),
('Pepe', 'Ramirez', 'Valdes', 'loquesea@outlook.com'),
('Diana', 'Santiago', 'Celaya', 'loquesea@mail.com'),
('Luz', 'Sosa','Galindo','loquesea@ymail.com'),
('Susan', 'Gutierrez', 'Suarez', 'loquesea@mail.com')
;

INSERT INTO TblAcceso (Usuario,Contraseña,idPersona,idTipo) values 
('Juan11', '1234', '1', '1'),
('Pepe11', '1234', '2', '2'),
('Diana11', '1234', '3', '3'),
('Luz11', '1234' , '4','4'),
('Susy1', '1234','4','4')
;

INSERT INTO TblLibros (nombreLibro, Autor, Editorial, Genero, Anio, idPersona) values
('After Dark', 'Haruki Murakami', 'Bosquets', 'Novela', '1992', '2'),
('Mundo de Sofia', 'Jostein Gaarder', 'Bosquets', 'Novela', '1990', '2'),
('Joven de las Naranjas', 'Jostein Gaarder', 'Bosquets', 'Novela', '1999', '2')
;

select * from TblLibros;

SELECT TblDatos.idPersona, Nombre, Apaterno, Amaterno,idTipo, Usuario, Contraseña  FROM TblDatos INNER JOIN TblAcceso ON TblAcceso.idPersona=TblDatos.idPersona GROUP BY tblAcceso.idPersona;


drop procedure if exists RegistrarU;
delimiter //
create procedure RegistrarU(_Nombre varchar(20),_Apaterno varchar(20),_Amaterno varchar(20),_Email varchar(30), _Usuario varchar(20),_Contraseña varchar(30),_idTipo int(2))
begin 
DECLARE _idPersona int default 0;
insert into TblDatos (Nombre, Apaterno, Amaterno, Email) values (_Nombre,_Apaterno,_Amaterno,_Email);
select max(idPersona) into _idPersona from TblDatos;
insert into TblAcceso (Usuario,Contraseña,idPersona,idTipo) values (_Usuario,_Contraseña,_idPersona,_idTipo);
end//

Delimiter;

drop procedure if exists EliminarU;
delimiter //
create procedure EliminarU(_Usuario varchar(20))
begin
delete from TblAcceso where Usuario=_Usuario;
end//

drop procedure if exists ActualizarU//
create procedure ActualizarU(_Nombre varchar(20),_Apaterno varchar(20),_Amaterno varchar(20),_Email varchar(30),_Usuario varchar(20),_Contraseña varchar(30),_idPersona int)
begin
Update TblDatos set Nombre=_Nombre, Apaterno=_Apaterno, Amaterno=_Amaterno, Email=_Email where idPersona=_idPersona;
Update TblAcceso set Usuario=_Usuario, Contraseña=_Contraseña  where idPersona=_idPersona;
end//

drop procedure if exists SubirL//
CREATE PROCEDURE SubirL(_idLibro int, _nombreLibro varchar(50), _Autor VARCHAR(80), _Editorial VARCHAR (60), _Genero VARCHAR(30), _Anio int(7))
begin
insert into TblLibros (idLibro, nombreLibro, Autor, Editorial, Genero, Anio) values (_idLibro, _NombreLibro,_Autor, _Editorial, _Genero, _Anio);
end//

delimiter //
drop procedure if exists PrestamoL//
create procedure PrestamoL(_Usuario VARCHAR(20),_idLibro int,tipo int)
begin
declare num int;
declare num2 int;
select cantidad into num from Prestamos where idLibro= _idLibro && idUsuario=_idUsuario;
select cantidad into num2 from tblLibros where idLibro= _idLibro;

if not exists(select idPrestamo from Prestamos where idLibro= _idLibro && idUsuario=_idUsuario) and tipo=1 and _cantidad<=num2 then 

insert into PrestamoL (idUsuario,idLibro,cantidad) values (_idUsuario,_idPrestamo,_cantidad);
Update idLibros set cantidad=(num2-_cantidad) where idLibros= _idLibros;

elseif exists(select idPrestamo from Prestamos  where idLibro= _idLibro && idUsuario=_idUsuario) and tipo=1 and _cantidad<=num2 then 

update Prestamos set idUsuario=_idUsuario,idProducto=_idProducto,cantidad=(_cantidad+num) where idLibro= _idLibro && idUsuario=_idUsuario;
Update TblLibros set cantidad=(num2-_cantidad) where idProducto= _idProducto;

elseif exists(select idPrestamo from  Prestamos where idLibro= _idLibro && idUsuario=_idUsuario) and tipo=2 and _cantidad<=num2 then 

update Prestamos set idUsuario=_idUsuario,idLibro=_idLibro,cantidad=(_cantidad-num) where idLibro= _idLibro && idUsuario=_idUsuario;
Update TblLibros set cantidad=(num2 + _cantidad) where idLibro= _idLibro;

elseif tipo = 2 then delete from PrestamoL where idUsuario=_idUsuario;
end if;

end//

delimiter ;

call RegistrarU('Sebastian','Santiago','Hernandez','sebasc@gmail.com','Sebas1','qwerty123',4);
call EliminarU('Susy1');
call ActualizarU('Juan', 'Zepeda', 'Fernandez', 'juan@juan.com','juan12','1234', 4);
call SubirL(null,'Sino', 'Jose Merchant', 'Conaculta', 'Historia', '1970');
select * from tblDatos;
select * from tblLibros;
select * from Prestamos;
delimiter //
select * from tblAcceso;