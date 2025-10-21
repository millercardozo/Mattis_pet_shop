/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.controlador;

import com.mattis.web.mattispetshop.modelo.Producto;
import java.util.ArrayList;

public class ControladorProductos {
    private ArrayList<Producto> listaProductos;

    public ControladorProductos() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Producto> obtenerProductos() {
        return listaProductos;
    }

    public void eliminarProducto(String nombre) {
        listaProductos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }
}
