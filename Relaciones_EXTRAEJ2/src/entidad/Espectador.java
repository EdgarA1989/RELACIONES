/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author edgar
 */
public class Espectador {
    private String nombre;
    private int edad;
    private double dinerodisponible;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinerodisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinerodisponible = dinerodisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinerodisponible() {
        return dinerodisponible;
    }

    public void setDinerodisponible(double dinerodisponible) {
        this.dinerodisponible = dinerodisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinerodisponible=" + dinerodisponible + '}';
    }
    
    
}
