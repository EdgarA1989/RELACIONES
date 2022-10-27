/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_extraej2;

import servicio.ServicioCine;

/**
 *
 * @author edgar
 */
public class Relaciones_EXTRAEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioCine serviciocine = new ServicioCine(); 
       serviciocine.armarSala();
       serviciocine.generarEspectadores();
       serviciocine.llenarAleatorio();
       serviciocine.menu();
     
       
    }
    
}
