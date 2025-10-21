/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMascotas extends JPanel {

    public VentanaMascotas() {
        setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Gestión de Mascotas", SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        JPanel formulario = new JPanel(new GridLayout(5, 2, 10, 10));
        formulario.setBorder(BorderFactory.createEmptyBorder(20, 60, 20, 60));

        formulario.add(new JLabel("Nombre de la Mascota:"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Tipo (Perro, Gato, etc.):"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Raza:"));
        formulario.add(new JTextField());

        formulario.add(new JLabel("Edad:"));
        formulario.add(new JTextField());

        JButton btnGuardar = new JButton("Guardar");
        formulario.add(btnGuardar);
        formulario.add(new JButton("Limpiar"));

        add(formulario, BorderLayout.CENTER);
    }
}