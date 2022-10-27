/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_extraej3;

import java.text.ParseException;
import servicio.ServicioAseguradora;

/**
 *
 * @author EANDRADA
 */
public class Relaciones_EXTRAEJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       ServicioAseguradora servicioaseguradora = new ServicioAseguradora();
       servicioaseguradora.generarClientes();
       servicioaseguradora.generarAutos();
       servicioaseguradora.generarPoliza();
       
    }
    
}
