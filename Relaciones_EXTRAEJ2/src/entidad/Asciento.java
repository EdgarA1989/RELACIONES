/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import numeracion.Columnas;



/**
 *
 * @author edgar
 */
public class Asciento {
   
    private int fila;
    private Columnas columna;
    private Espectador espectador;
    private String libre;
    
           
    public Asciento() {
    }

    public Asciento(int fila, Columnas columna, Espectador espectador, String libre) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = espectador;
        this.libre = libre;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Columnas getColumna() {
        return columna;
    }

    public void setColumna(Columnas columna) {
        this.columna = columna;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public String getLibre() {
        return libre;
    }

    public void setLibre(String libre) {
        this.libre = libre;
    }

    

}
