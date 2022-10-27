/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author EANDRADA
 */
public class Sala {
    private Asciento sala[][]= new Asciento [9][6];
    private Pelicula pelicula;
    private String nombre;
    
    public Sala() {
    }

    public Sala(Pelicula pelicula, String nombre) {
        this.pelicula = pelicula;
        this.nombre = nombre;
    }

    public Asciento[][] getSala() {
        return sala;
    }

    public void setSala(Asciento[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
