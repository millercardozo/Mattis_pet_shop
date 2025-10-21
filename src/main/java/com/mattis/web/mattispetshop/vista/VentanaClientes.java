/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaClientes extends JPanel {

    public VentanaClientes() {
        setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Gestión de Clientes", SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        JPanel formulario = new JPanel(new GridLayout(5, 2, 10, 10));
        formulario.setBorder(BorderFactory.createEmptyBorder(20, 60, 20, 60));

        formulario.add(new JLabel("Nombre:"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Teléfono:"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Correo:"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Dirección:"));
        formulario.add(new JTextField());

        JButton btnGuardar = new JButton("Guardar");
        formulario.add(btnGuardar);
        formulario.add(new JButton("Limpiar"));

        add(formulario, BorderLayout.CENTER);
    }
}

