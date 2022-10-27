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
public class Juego {
    
   private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver= new Revolver();

    public Juego() {
    }

    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
            
   public void llenarJuego(ArrayList<Jugador>lista, Revolver r){
       jugadores= lista;
       revolver=r;
       
       
   }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

  

   
public void ronda(){
    for (int i = 0; i < jugadores.size(); i++) {
        boolean aux =jugadores.get(i).disparo(revolver);
        if (aux==true){
           System.out.println("El jugador ");
            System.out.println(jugadores.get(i).toString());
            System.out.println("A sido mojado");
            break;
        }
        
}
    
}
}