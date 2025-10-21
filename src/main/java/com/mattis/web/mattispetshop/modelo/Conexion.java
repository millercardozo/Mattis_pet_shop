/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/mattis_petshop";
    private static final String USER = "root";  // cambia si tu usuario es diferente
    private static final String PASSWORD = "miller691";  // agrega tu contraseña si la tienes

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Conexión exitosa a la base de datos Mattis Pet Shop");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("❌ Error de conexión: " + e.getMessage());
            }
        }
        return conexion;
    }
}

