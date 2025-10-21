-- ======================================================
--  Mattis Pet Shop - Base de Datos
--  Evidencia: GA7-220501096-AA2-EV01

-- ======================================================

-- Crear base de datos
CREATE DATABASE IF NOT EXISTS mattispetshop
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE mattispetshop;

-- ======================================================
-- Tabla CLIENTE
-- ======================================================
CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(20),
    email VARCHAR(100),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ======================================================
-- Tabla MASCOTA
-- ======================================================
CREATE TABLE mascota (
    id_mascota INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    especie VARCHAR(50),
    raza VARCHAR(50),
    edad INT,
    id_cliente INT,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
    ON DELETE CASCADE
);

-- ======================================================
-- Tabla PRODUCTO
-- ======================================================
CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    stock INT DEFAULT 0,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ======================================================
-- Datos iniciales (opcional)
-- ======================================================
INSERT INTO cliente (nombre, apellido, direccion, telefono, email)
VALUES 
('Carlos', 'Ramírez', 'Calle 45 #12-30', '3124567890', 'carlos@mail.com'),
('Laura', 'Gómez', 'Cra 20 #8-15', '3109876543', 'laura@mail.com');

INSERT INTO mascota (nombre, especie, raza, edad, id_cliente)
VALUES
('Rocky', 'Perro', 'Golden Retriever', 3, 1),
('Michi', 'Gato', 'Siames', 2, 2);

INSERT INTO producto (nombre, descripcion, precio, stock)
VALUES
('Champú para perros', 'Champú antipulgas de 500ml', 25000, 20),
('Collar luminoso', 'Collar LED ajustable', 18000, 15);
