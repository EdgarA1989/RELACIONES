/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Perro {
    private String nommbre;
    private String raza;
    private int edad;
    private String tamanio;


    public Perro() {
    }

    public Perro(String nommbre, String raza, int edad, String tamanio) {
        this.nommbre = nommbre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nommbre=" + nommbre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
}

