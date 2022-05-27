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
public class Casa {

    int tamaño, costo, cx, cy;

    public Casa() {
    }

    public Casa(int tamaño, int costo, int cx, int cy) {
        this.tamaño = tamaño;
        this.costo = costo;
        this.cx = cx;
        this.cy = cy;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    @Override
    public String toString() {
        return "Casa{" + "tama\u00f1o=" + tamaño + ", costo=" + costo + ", cx=" + cx + ", cy=" + cy + '}';
    }

}
