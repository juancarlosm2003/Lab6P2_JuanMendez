/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_juanmendez;

import java.awt.Color;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Puffies {

    String nombre;
    int precio;
    String color;

    public Puffies() {
    }

    public Puffies(String nombre, int precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Puffies{" + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + '}';
    }

}
