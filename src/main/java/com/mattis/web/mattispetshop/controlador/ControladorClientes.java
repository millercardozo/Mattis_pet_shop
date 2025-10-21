/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.controlador;

import com.mattis.web.mattispetshop.modelo.Cliente;
import java.util.ArrayList;

public class ControladorClientes {
    private ArrayList<Cliente> listaClientes;

    public ControladorClientes() {
        listaClientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return listaClientes;
    }

    public void eliminarCliente(String nombre) {
        listaClientes.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
    }
}
