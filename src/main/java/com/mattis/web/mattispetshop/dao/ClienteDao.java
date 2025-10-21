/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.dao;

import com.mattis.web.mattispetshop.modelo.Cliente;
import com.mattis.web.mattispetshop.modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private Connection con = Conexion.getConexion();

    public void insertar(Cliente cliente) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO clientes (nombre, telefono, correo, direccion) VALUES (?, ?, ?, ?)");
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDireccion());
            ps.executeUpdate();
            System.out.println("✅ Cliente registrado correctamente");
        } catch (SQLException e) {
            System.err.println("❌ Error al insertar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clientes");
            while (rs.next()) {
                Cliente c = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("correo"),
                    rs.getString("direccion")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al listar clientes: " + e.getMessage());
        }
        return lista;
    }
}
