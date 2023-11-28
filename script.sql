CONN SYS/ORACLE@PDB AS SYSDBA;

CREATE USER LIBRERIA IDENTIFIED BY 123;
GRANT UNLIMITED TABLESPACE TO LIBRERIA;

GRANT CREATE SESSION TO LIBRERIA;
GRANT CREATE TABLE TO LIBRERIA;
GRANT CREATE SEQUENCE TO LIBRERIA;

COMMIT;

CONN  LIBRERIA/123@PDB;

CREATE SEQUENCE Incrementa START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE TABLE LIBRERIA.LIBROS(
    id NUMBER DEFAULT Incrementa.NEXTVAL PRIMARY KEY,
    titulo VARCHAR2(50),
    autor VARCHAR2(50),
    editorial VARCHAR2(50),
    descripcion VARCHAR2(250),
    paginas NUMBER(4),
    precio NUMBER(8,2),
    estatus NUMBER (1)
); 

CREATE SEQUENCE IncrementaEmp START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE TABLE LIBRERIA.EMPLEADOS(
    id NUMBER DEFAULT IncrementaEmp.NEXTVAL PRIMARY KEY,
    nombre VARCHAR2(20),
    ap_pat VARCHAR2(20),
    ap_mat VARCHAR2(20),
    edad NUMBER,
    email VARCHAR2(100),
    telefono NUMBER(10),
    salario NUMBER(5),
    estatus NUMBER(1)
);


COMMIT;

CONN SYS/ORACLE@PDB AS SYSDBA;

GRANT SELECT,INSERT,UPDATE,DELETE ON LIBRERIA.LIBROS TO LIBRERIA;
GRANT SELECT,INSERT,UPDATE,DELETE ON LIBRERIA.EMPLEADOS TO LIBRERIA;

COMMIT;


CONN  LIBRERIA/123@PDB;

INSERT INTO LIBRERIA.LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) 
VALUES ('El Señor de los Anillos', 'J.R.R. Tolkien', 'Editorial A', 'Fantasía épica', 1000, 39.99, 1);

INSERT INTO LIBRERIA.LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) 
VALUES ('1984', 'George Orwell', 'Editorial B', 'Distopía', 300, 19.99, 1);

INSERT INTO LIBRERIA.LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) 
VALUES ('Cien años de soledad', 'Gabriel García Márquez', 'Editorial C', 'Realismo mágico', 500, 29.99, 1);

INSERT INTO LIBRERIA.LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) 
VALUES ('Harry Potter y la piedra filosofal', 'J.K. Rowling', 'Editorial D', 'Magia y aventura', 400, 24.99, 1);

INSERT INTO LIBRERIA.LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) 
VALUES ('Don Quijote de la Mancha', 'Miguel de Cervantes', 'Editorial E', 'Novela satírica', 800, 34.99, 1);

COMMIT;

INSERT INTO LIBRERIA.EMPLEADOS (nombre, ap_pat, ap_mat, edad, email, telefono, salario, estatus) 
VALUES ('Juan', 'Pérez', 'Gómez', 30, 'juan.perez@email.com', 1234567890, 50000, 1);

INSERT INTO LIBRERIA.EMPLEADOS (nombre, ap_pat, ap_mat, edad, email, telefono, salario, estatus) 
VALUES ('María', 'López', 'García', 28, 'maria.lopez@email.com', 9876543210, 48000, 1);

INSERT INTO LIBRERIA.EMPLEADOS (nombre, ap_pat, ap_mat, edad, email, telefono, salario, estatus) 
VALUES ('Carlos', 'Ramírez', 'Vega', 35, 'carlos.ramirez@email.com', 5551234567, 55000, 1);

INSERT INTO LIBRERIA.EMPLEADOS (nombre, ap_pat, ap_mat, edad, email, telefono, salario, estatus) 
VALUES ('Ana', 'Martínez', 'Hernández', 32, 'ana.martinez@email.com', 1112223333, 52000, 1);

INSERT INTO LIBRERIA.EMPLEADOS (nombre, ap_pat, ap_mat, edad, email, telefono, salario, estatus) 
VALUES ('Javier', 'Gutiérrez', 'Sánchez', 40, 'javier.gutierrez@email.com', 6667778888, 60000, 1);

COMMIT;


