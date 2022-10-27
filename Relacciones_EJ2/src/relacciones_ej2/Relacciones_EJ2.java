/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacciones_ej2;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Relacciones_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores =new ArrayList();
     
       Revolver revolver = new Revolver();
        Juego partida = new Juego();
        Scanner leer = new Scanner(System.in); 
        System.out.println("Bienvenido al Juego");
        System.out.println("Ingrese la cantidad de jugadores entre 1 y 6");
        int cantidad = leer.nextInt();
        while (cantidad>6 || cantidad<0){
            System.out.println("Ingrese la cantidad de jugadores entre 1 y 6");
            cantidad= leer.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            Jugador pj = new Jugador();
            System.out.println("Ingrese los datos del jugador "+ (i+1));
            System.out.println("Ingrese el nombre");
            pj.setNombre(leer.next());
            System.out.println("Ingrese el ID de "+ pj.getNombre());
            pj.setIdjugador(leer.nextInt());
            jugadores.add(pj);
        }
        revolver = revolver.llenarRevolver(revolver);

        partida.llenarJuego(jugadores, revolver);
        partida.ronda();
    }
    
}
