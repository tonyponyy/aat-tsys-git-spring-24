DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	sueldo integer,
	trabajo integer,
	fecha date
);

insert into empleado (nombre, apellido,direccion,dni,sueldo,trabajo,fecha)values('Jose','Marin','calle imaginaria 1',123456789,1200,1, NOW());
insert into empleado (nombre, apellido,direccion,dni,sueldo,trabajo,fecha)values('Juan','Lopez','calle imaginaria 2',122222222,1200,1, NOW());
insert into empleado (nombre, apellido,direccion,dni,sueldo,trabajo,fecha)values('Pedro','Guillem','calle imaginaria 3',123333333,1200,1, NOW());
insert into empleado (nombre, apellido,direccion,dni,sueldo,trabajo,fecha)values('Jordi','Martin','calle imaginaria 4',123444444,1200,1, NOW());
insert into empleado (nombre, apellido,direccion,dni,sueldo,trabajo,fecha)values('Jonatan','Vicente','calle imaginaria 5',123455555,1200,1, NOW());