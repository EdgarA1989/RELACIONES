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
public class ListaPersona {
        private ArrayList<Persona> listapersona= new ArrayList();

    public ListaPersona() {
    }

    public ArrayList<Persona> getListapersona() {
        return listapersona;
    }

    public void setListapersona(ArrayList<Persona> listapersona) {
        this.listapersona = listapersona;
    }

    @Override
    public String toString() {
        return "ListaPersona{" + "listapersona=" + listapersona + '}';
    }
        
        
}
