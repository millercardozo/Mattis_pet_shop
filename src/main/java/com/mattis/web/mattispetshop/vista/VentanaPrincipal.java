/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private JPanel contenedor;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemClientes;
    private JMenuItem itemMascotas;
    private JMenuItem itemSalir;
    private JMenuItem itemProductos;


    public VentanaPrincipal() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("🐾 Mattis Pet Shop - Sistema de Gestión");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor = new JPanel(new BorderLayout());
        setContentPane(contenedor);

        // Crear barra de menú
        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Opciones");

        itemClientes = new JMenuItem("Clientes");
        itemMascotas = new JMenuItem("Mascotas");
        itemSalir = new JMenuItem("Salir");
        itemProductos = new JMenuItem("Productos");


        // Agregar items al menú
        menuOpciones.add(itemClientes);
        menuOpciones.add(itemMascotas);
        menuOpciones.addSeparator();
        menuOpciones.add(itemSalir);
        menuOpciones.add(itemProductos);

        barraMenu.add(menuOpciones);
        setJMenuBar(barraMenu);

        // Panel de bienvenida
        JLabel labelBienvenida = new JLabel("Bienvenido a Mattis Pet Shop 🐶🐱", SwingConstants.CENTER);
        labelBienvenida.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contenedor.add(labelBienvenida, BorderLayout.CENTER);

        // Listeners
        itemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel(new VentanaClientes());
            }
        });

        itemMascotas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel(new VentanaMascotas());
            }
        });

        itemSalir.addActionListener(e -> System.exit(0));
        itemProductos.addActionListener(e -> new VentanaProductos().setVisible(true));

    }

    private void mostrarPanel(JPanel panel) {
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
}
