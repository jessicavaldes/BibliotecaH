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
Contrasenia VARCHAR(30) NOT NULL,
idPersona INT,
idTipo INT(2),
FOREIGN KEY(idPersona) REFERENCES TblDatos(idPersona),
FOREIGN KEY(idTipo) REFERENCES CatTipoPersona(idTipo)
);

CREATE TABLE Prestamos (
idPrestamo int auto_increment primary key,
idPersona int,
idLibro int,
status boolean,
FOREIGN KEY (idPersona) REFERENCES TblDatos (idPersona),
FOREIGN KEY (idLibro) REFERENCES TblLibros (idLibro)
);


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
('Susan', 'Gutierrez', 'Suarez', 'loquesea@mailma.com')
;

INSERT INTO TblAcceso (Usuario,Contrasenia,idPersona,idTipo) values 
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

SELECT TblDatos.idPersona, Nombre, Apaterno, Amaterno,idTipo, Usuario, Contrasenia  FROM TblDatos INNER JOIN TblAcceso ON TblAcceso.idPersona=TblDatos.idPersona GROUP BY tblAcceso.idPersona;

drop procedure if exists RegistrarU;
delimiter //
create procedure RegistrarU(_Nombre varchar(20),_Apaterno varchar(20),_Amaterno varchar(20),_Email varchar(30), _Usuario varchar(20),_Contrasenia varchar(30),_idTipo int(2))
begin 
DECLARE _idPersona int default 0;
insert into TblDatos (Nombre, Apaterno, Amaterno, Email) values (_Nombre,_Apaterno,_Amaterno,_Email);
select max(idPersona) into _idPersona from TblDatos;
insert into TblAcceso (Usuario,Contrasenia,idPersona,idTipo) values (_Usuario,_Contrasenia,_idPersona,_idTipo);
end//

Delimiter;

drop procedure if exists EliminarU;
delimiter //
create procedure EliminarU(_Usuario varchar(20))
begin
delete from TblAcceso where Usuario=_Usuario;
end//

drop procedure if exists ActualizarU//
create procedure ActualizarU(_Nombre varchar(20),_Apaterno varchar(20),_Amaterno varchar(20),_Email varchar(30),_Usuario varchar(20),_Contrasenia varchar(30),_idPersona int)
begin
Update TblDatos set Nombre=_Nombre, Apaterno=_Apaterno, Amaterno=_Amaterno, Email=_Email where idPersona=_idPersona;
Update TblAcceso set Usuario=_Usuario, Contrasenia=_Contrasenia  where idPersona=_idPersona;
end//

drop procedure if exists SubirL//
CREATE PROCEDURE SubirL(_idLibro int, _nombreLibro varchar(50), _Autor VARCHAR(80), _Editorial VARCHAR (60), _Genero VARCHAR(30), _Anio int(7), _idPer int(10), _Cantidad int(10))
begin
insert into TblLibros (idLibro, nombreLibro, Autor, Editorial, Genero, Anio, idPersona, cantidad) values (_idLibro, _NombreLibro,_Autor, _Editorial, _Genero, _Anio, _idPer, _Cantidad);
end//

drop procedure if exists HacerPrestamo//
CREATE PROCEDURE HacerPrestamo(_idPersona int, _idLibro int)
BEGIN
INSERT INTO Prestamos(idPersona, idLibro, status) values (_idPersona, _idLibro, true);
UPDATE TblLibros SET cantidad = cantidad - 1 WHERE idLibro = _idLibro;
END//

drop procedure if exists QuitarPrestamo//
CREATE PROCEDURE QuitarPrestamo(_idPrestamo int, _idLibro int)
BEGIN
UPDATE Prestamos SET status = false WHERE idPrestamo = _idPrestamo;
UPDATE TblLibros SET cantidad = cantidad + 1 WHERE idLibro = _idLibro;
END//

call RegistrarU('Sebastian','Santiago','Hernandez','sebasc@gmail.com','Sebas1','qwerty123',4);
call EliminarU('Susy1');
call ActualizarU('Juan', 'Zepeda', 'Fernandez', 'juan@juan.com','juan12','1234', 4);
call SubirL(null,'Sino', 'Jose Merchant', 'Conaculta', 'Historia', '1970');
select * from tblDatos;
select * from tblLibros;
select * from Prestamos;
delimiter //
select * from tblAcceso;