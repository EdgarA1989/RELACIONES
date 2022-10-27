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
public class Cine {
  
    ArrayList<Sala> cine = new ArrayList();

    public Cine() {
    }

    public ArrayList<Sala> getCine() {
        return cine;
    }

    public void setCine(ArrayList<Sala> cine) {
        this.cine = cine;
    }
    
    
}
