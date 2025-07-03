-- ========================================
-- 1. ELIMINAR Y CREAR BASE DE DATOS
-- ========================================

DROP DATABASE IF EXISTS tienda_db;
CREATE DATABASE tienda_db;
USE tienda_db;

-- ========================================
-- 2. CREACIÓN DE TABLAS
-- ========================================

-- Tabla: marca
CREATE TABLE marca(
  codmar INT PRIMARY KEY AUTO_INCREMENT,
  nommar VARCHAR(40) NOT NULL,
  estmar BIT NOT NULL
) ENGINE=InnoDB;

-- Tabla: categoria
CREATE TABLE categoria(
  codcat INT PRIMARY KEY AUTO_INCREMENT,
  nomcat VARCHAR(40) NOT NULL,
  estcat BIT NOT NULL
) ENGINE=InnoDB;

-- Tabla: sexo
CREATE TABLE sexo(
  codsex INT PRIMARY KEY AUTO_INCREMENT,
  nomsex VARCHAR(20) NOT NULL,
  estsex BIT NOT NULL
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: tipodocumento
CREATE TABLE tipodocumento(
  codtipd INT PRIMARY KEY AUTO_INCREMENT,
  nomtipd VARCHAR(30) NOT NULL,
  esttipd BIT NOT NULL
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: distrito
DROP TABLE IF EXISTS distrito;
CREATE TABLE distrito(
  coddis INT PRIMARY KEY AUTO_INCREMENT,
  nomdis VARCHAR(30) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  estdis BIT NOT NULL
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: rol
DROP TABLE IF EXISTS rol;
CREATE TABLE rol(
  codrol INT PRIMARY KEY AUTO_INCREMENT,
  nomrol VARCHAR(40) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  estrol BIT NOT NULL
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: producto
CREATE TABLE producto(
  codpro INT PRIMARY KEY AUTO_INCREMENT,
  nompro VARCHAR(40) NOT NULL,
  despro VARCHAR(200) NOT NULL,
  prepro DOUBLE NOT NULL,
  canpro INT NOT NULL,
  estpro BIT NOT NULL,
  codmar INT NOT NULL,
  codcat INT NOT NULL,
  FOREIGN KEY (codmar) REFERENCES marca(codmar),
  FOREIGN KEY (codcat) REFERENCES categoria(codcat)
) ENGINE=InnoDB;

-- Tabla: cliente
DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente(
  codcli INT PRIMARY KEY AUTO_INCREMENT,
  nomcli VARCHAR(40) NOT NULL,
  apepcli VARCHAR(40) NOT NULL,
  apemcli VARCHAR(40) NOT NULL,
  doccli VARCHAR(15) NOT NULL,
  feccli DATE NOT NULL,
  dircli VARCHAR(100) NOT NULL,
  telcli VARCHAR(7),
  celcli VARCHAR(9) NOT NULL,
  corcli VARCHAR(40),
  estcli BIT NOT NULL,
  coddis INT NOT NULL,
  codsex INT NOT NULL,
  codtipd INT NOT NULL,
  FOREIGN KEY (coddis) REFERENCES distrito(coddis),
  FOREIGN KEY (codsex) REFERENCES sexo(codsex),
  FOREIGN KEY (codtipd) REFERENCES tipodocumento(codtipd)
);

-- Tabla: empleado
CREATE TABLE empleado(
  codemp INT PRIMARY KEY AUTO_INCREMENT,
  nomemp VARCHAR(40) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  apepemp VARCHAR(30) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  apememp VARCHAR(30) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  dniemp VARCHAR(8) NOT NULL,
  fecemp DATE NOT NULL,
  diremp VARCHAR(50) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  telemp VARCHAR(7) NOT NULL,
  celemp VARCHAR(9) NOT NULL,
  coremp VARCHAR(40) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  sexemp VARCHAR(9) NOT NULL,
  usuemp VARCHAR(40) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  claemp VARCHAR(40) BINARY CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  estemp BIT NOT NULL,
  coddis INT NOT NULL,
  codrol INT NOT NULL,
  FOREIGN KEY (coddis) REFERENCES distrito(coddis),
  FOREIGN KEY (codrol) REFERENCES rol(codrol)
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: ticketpedido
CREATE TABLE ticketpedido(
  nrotic INT PRIMARY KEY AUTO_INCREMENT,
  fectic DATETIME NOT NULL,
  esttic BIT NOT NULL,
  codcli INT NOT NULL,
  codemp INT NOT NULL,
  FOREIGN KEY (codcli) REFERENCES cliente(codcli),
  FOREIGN KEY (codemp) REFERENCES empleado(codemp)
) ENGINE=InnoDB CHARACTER SET=utf8;

-- Tabla: detalleticketpedido
CREATE TABLE detalleticketpedido(
  nrodettic INT PRIMARY KEY AUTO_INCREMENT,
  nrotic INT NOT NULL,
  codpro INT NOT NULL,
  cantic INT NOT NULL,
  pretic DOUBLE NOT NULL,
  estdettick BIT NOT NULL,
  FOREIGN KEY (nrotic) REFERENCES ticketpedido(nrotic),
  FOREIGN KEY (codpro) REFERENCES producto(codpro)
) ENGINE=InnoDB CHARACTER SET=utf8;

-- ========================================
-- 3. INSERCIÓN DE DATOS PARA TODAS LAS TABLAS
-- ========================================

-- Tabla: marca
INSERT INTO marca(nommar, estmar) VALUES
('LG', 1),
('Sony', 1),
('Fender', 1),
('Gibson', 1),
('Samsung', 1),
('Yamaha', 1);

-- Tabla: categoria
INSERT INTO categoria(nomcat, estcat) VALUES
('Televisores', 1),
('Equipos de Sonido', 1),
('Guitarras', 1),
('Bajos', 1),
('Teclados', 1),
('Accesorios', 1);

-- Tabla: producto
INSERT INTO producto(nompro, despro, prepro, canpro, estpro, codmar, codcat) VALUES
('Smart TV 40 pulgadas', 'Televisor inteligente LED 40"', 1450, 10, 1, 1, 1),
('Guitarra SG', 'Guitarra SG color negro doble Hambucker', 7800, 5, 1, 4, 3),
('Smart TV 50 pulgadas', 'Pantalla 4K con HDR', 1890, 8, 1, 5, 1),
('Teclado PSR-E373', 'Teclado musical 61 teclas', 850, 15, 1, 6, 5),
('Auriculares Sony WH-1000XM4', 'Cancelación de ruido', 1200, 20, 1, 2, 6);

-- Tabla: sexo
INSERT INTO sexo(nomsex, estsex) VALUES
('Masculino', 1),
('Femenino', 1),
('Otros', 1),
('Sin especificar', 1);

-- Tabla: tipodocumento
INSERT INTO tipodocumento(nomtipd, esttipd) VALUES
('DNI', 1),
('RUC', 1),
('Pasaporte', 1),
('Carnet de Extranjería', 1);

-- Tabla: distrito
INSERT INTO distrito(nomdis, estdis) VALUES
('Lima',1),
('Miraflores',1),
('San Isidro',1),
('Comas',1),
('San Juan de Lurigancho',1);

-- Tabla: rol
INSERT INTO rol(nomrol, estrol) VALUES
('administrador',1),
('usuario',1),
('invitado',1);

-- Tabla: cliente
INSERT INTO cliente(nomcli, apepcli, apemcli, doccli, feccli, dircli, telcli, celcli, corcli, estcli, coddis, codsex, codtipd) 
VALUES 
('Jose Daniel', 'Osorio', 'Morales', '77456231', '1993-08-04', 'Av. Luis Braille 1450', '2462119', '999874521', NULL, 1, 1, 1, 1),
('Stefani Daniela', 'Morales', 'Castillo', '79853214', '1997-04-02', 'Av. Las Flores 1980', NULL, '951753258', 'smorales@gmail.com', 1, 2, 2, 1),
('Carlos', 'Fernández', 'Soto', '71234567', '1990-01-01', 'Jr. Ayacucho 321', '4321897', '912345678', 'cf@gmail.com', 1, 3, 1, 1);

-- Tabla: empleado
INSERT INTO empleado(nomemp, apepemp, apememp, dniemp, fecemp, diremp, telemp, celemp, coremp, sexemp, usuemp, claemp, estemp, coddis, codrol) 
VALUES 
('Mario Antonio', 'Huapalla', 'Morales', '41526332', '1982-02-17', 'Av. Braille 1450', '4253524', '963258741', 'mhuapalla@gmail.com', 'Masculino', 'mhuapalla', '123456', 1, 1, 1),
('Daniela', 'Ruiz', 'Vega', '43526172', '1991-03-12', 'Calle Palmeras 123', '7651234', '912312312', 'druiz@gmail.com', 'Femenino', 'druiz', '654321', 1, 2, 2);

-- Tabla: ticketpedido
INSERT INTO ticketpedido(fectic, esttic, codcli, codemp)
VALUES 
('2025-07-01', 1, 1, 1),
('2025-07-02', 1, 2, 2),
('2025-07-03', 1, 3, 1);

-- Tabla: detalleticketpedido
INSERT INTO detalleticketpedido(nrotic, codpro, cantic, pretic, estdettick) VALUES
(1, 1, 1, 1450, 1),
(1, 5, 2, 1200, 1),
(2, 2, 1, 7800, 1),
(2, 3, 1, 1890, 1),
(3, 4, 3, 850, 1);
