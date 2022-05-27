/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_juanmendez;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Juegos {

    String nombre;
    int costo, recompensa, porcentaje;

    public Juegos() {
    }

    public Juegos(String nombre, int costo, int recompensa, int porcentaje) {
        this.nombre = nombre;
        this.costo = costo;
        this.recompensa = recompensa;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Juegos{" + "nombre=" + nombre + ", costo=" + costo + ", recompensa=" + recompensa + ", porcentaje=" + porcentaje + '}';
    }

}
