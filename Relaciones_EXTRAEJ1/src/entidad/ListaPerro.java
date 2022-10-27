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
public class ListaPerro {
    
     private ArrayList<Perro> listaperro = new ArrayList();

    public ListaPerro() {
    }

    public ArrayList<Perro> getListaperro() {
        return listaperro;
    }

    public void setListaperro(ArrayList<Perro> listaperro) {
        this.listaperro = listaperro;
    }

    @Override
    public String toString() {
        return "LlistaPerro{" + "listaperro=" + listaperro + '}';
    }
     
}
