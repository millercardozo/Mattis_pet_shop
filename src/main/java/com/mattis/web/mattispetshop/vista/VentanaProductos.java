/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaProductos extends JFrame {

    private JTable tablaProductos;
    private JTextField txtNombre, txtPrecio, txtStock;
    private JButton btnAgregar, btnEditar, btnEliminar, btnVolver;

    public VentanaProductos() {
        setTitle("Gestión de Productos - Mattis Pet Shop");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ---- Panel superior ----
        JPanel panelSuperior = new JPanel(new GridLayout(2, 4, 10, 10));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Datos del producto"));

        panelSuperior.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelSuperior.add(txtNombre);

        panelSuperior.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelSuperior.add(txtPrecio);

        panelSuperior.add(new JLabel("Stock:"));
        txtStock = new JTextField();
        panelSuperior.add(txtStock);

        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");
        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnEditar);
        panelSuperior.add(btnEliminar);

        add(panelSuperior, BorderLayout.NORTH);

        // ---- Tabla de productos ----
        String[] columnas = {"ID", "Nombre", "Precio", "Stock"};
        Object[][] datos = {
                {1, "Shampoo para perros", 15000, 25},
                {2, "Collar ajustable", 12000, 40},
                {3, "Juguete mordedor", 8000, 60}
        };
        tablaProductos = new JTable(datos, columnas);
        add(new JScrollPane(tablaProductos), BorderLayout.CENTER);

        // ---- Panel inferior ----
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnVolver = new JButton("Volver al menú");
        panelInferior.add(btnVolver);
        add(panelInferior, BorderLayout.SOUTH);

        // ---- Eventos ----
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra esta ventana
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaProductos().setVisible(true);
        });
    }
}