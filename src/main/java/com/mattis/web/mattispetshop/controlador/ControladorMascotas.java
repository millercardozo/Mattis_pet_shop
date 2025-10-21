/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.controlador;

import com.mattis.web.mattispetshop.modelo.Mascota;
import java.util.ArrayList;

public class ControladorMascotas {
    private ArrayList<Mascota> listaMascotas;

    public ControladorMascotas() {
        listaMascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

    public ArrayList<Mascota> obtenerMascotas() {
        return listaMascotas;
    }

    public void eliminarMascota(String nombre) {
        listaMascotas.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
    }
}