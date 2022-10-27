/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Baraja;
import entidad.Carta;
import enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class ServicioCarta {

    Scanner leer = new Scanner(System.in);
    Baraja barajafinal = new Baraja();
    Baraja monton = new Baraja();

    public void crearBaraja() {
        ArrayList<Carta> baraja = new ArrayList();
        int aux = 1;
        for (int i = 0; i < 10; i++) {
            Carta carta = new Carta();
            if (aux == 8) {
                carta.setNumero(aux + 2);
                aux++;
            } else if (aux == 9) {
                carta.setNumero(aux + 2);
                aux = 12;
            } else {
                carta.setNumero(aux);
                aux++;
            }
            carta.setPalo(Palos.BASTO);
            baraja.add(carta);
           
        }
        aux = 1;
        for (int i = 0; i < 10; i++) {
            Carta carta = new Carta();
            if (aux == 8) {
                carta.setNumero(aux + 2);
                aux++;
            } else if (aux == 9) {
                carta.setNumero(aux + 2);
                aux = 12;
            } else {
                carta.setNumero(aux);
                aux++;
            }
            carta.setPalo(Palos.COPA);
            baraja.add(carta);
        }
        aux = 1;
        for (int i = 0; i < 10; i++) {
            Carta carta = new Carta();
            if (aux == 8) {
                carta.setNumero(aux + 2);
                aux++;
            } else if (aux == 9) {
                carta.setNumero(aux + 2);
                aux = 12;
            } else {
                carta.setNumero(aux);
                aux++;
            }
            carta.setPalo(Palos.ESPADA);
            baraja.add(carta);

        }
        aux = 1;
        for (int i = 0; i < 10; i++) {
            Carta carta = new Carta();
            if (aux == 8) {
                carta.setNumero(aux + 2);
                aux++;
            } else if (aux == 9) {
                carta.setNumero(aux + 2);
                aux = 12;
            } else {
                carta.setNumero(aux);
                aux++;
            }
            carta.setPalo(Palos.ORO);
            baraja.add(carta);
        }
        barajafinal.setBaraja(baraja);
    }

    public void menuBaraja() {
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("BIENVENIDO AL JUGO DE CARTAS");
            System.out.println("1-BARAJAR Mezcla las cartas");
            System.out.println("2-SIGUIENTE CARTA");
            System.out.println("3-CARTAS DISPONIBLES");
            System.out.println("4-REPARTIR CARTAS");
            System.out.println("5-CARTAS DEL MONTON");
            System.out.println("6-MOSTRAR BARAJA");
            System.out.println("7-SALIR");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrar();
                    break;
            }
        }

    }

    public void barajar() {
        Collections.shuffle(barajafinal.getBaraja());
        System.out.println("Se mezclaron las cartas");

    }

    public void siguienteCarta() {
        Iterator it = barajafinal.getBaraja().iterator();
        if (it.hasNext()) {
            System.out.println(it.next());
        }else {
            System.out.println("Ya no quedan cartas disponibles");
        }

    }

    public void cartasDisponibles() {
        System.out.println("Quedan " + barajafinal.getBaraja().size() + " cartas disponbles");
    }

    public void darCartas() {
        System.out.println("Ingrese cantidad de cartas a Repartir");
        int cantidad = leer.nextInt();
        if (cantidad < barajafinal.getBaraja().size()) {
            for (int i = 0; i <= cantidad; i++) {
                System.out.println("Se entrega la carta " + barajafinal.getBaraja().get(0)+ " Al jugador");
                
                monton.getBaraja().add(i, barajafinal.getBaraja().get(0));
                barajafinal.getBaraja().remove(0);
            }
 
        } else {
            System.out.println("El numero de cartas a repartir es mayor al numero de  cartas del maso");
        }

    }

    public void cartasMonton() {
        if (monton.getBaraja().size()==0){
            System.out.println("Aun no se han repartido las cartas del Mazo");
        }else{
          for (Carta aux : monton.getBaraja()) {
            System.out.println(aux);
        }  
        }
   
    }

    public void mostrar() {
        for (Carta aux : barajafinal.getBaraja()) {
            System.out.println(aux);
        }
    }
}
