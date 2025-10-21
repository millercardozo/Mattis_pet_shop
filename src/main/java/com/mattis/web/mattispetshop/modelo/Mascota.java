/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mattis.web.mattispetshop.modelo;

public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;
    private String propietario;

    public Mascota(String nombre, String tipo, int edad, String propietario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.propietario = propietario;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Dueño: " + propietario;
    }
}
