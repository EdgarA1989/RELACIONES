/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Asciento;
import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import entidad.Sala;
import java.util.ArrayList;
import java.util.Scanner;
import numeracion.Columnas;

/**
 *
 * @author EANDRADA
 */
public class ServicioCine {

    Scanner leer = new Scanner(System.in);
    Sala sala = new Sala();
    ArrayList<Espectador> espectadores = new ArrayList();
    Cine cine = new Cine();

    public void armarSala() {

        Asciento[][] matrizaux = new Asciento[9][6];
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                Asciento ascientos = new Asciento();
                switch (j) {
                    case 0:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.A);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                    case 1:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.B);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                    case 2:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.C);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                    case 3:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.D);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                    case 4:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.E);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                    case 5:
                        ascientos.setFila(i);
                        ascientos.setColumna(Columnas.F);
                        ascientos.setLibre(" ");
                        matrizaux[i][j] = ascientos;
                        break;
                }
            }
        }
        sala.setSala(matrizaux);
        sala.setPelicula(crearPelicula());

    }

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el Titulo de la Pelicula");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el Director de la Pelicula");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese duracion de la Pelicula");
        pelicula.setDuracion(leer.nextDouble());
        System.out.println("Ingrese edad minima de la Pelicula");
        pelicula.setEdadminima(leer.nextInt());
        return pelicula;
    }

    public void generarEspectadores() {
        Espectador uno = new Espectador("Edgar", 33, 2000);
        espectadores.add(uno);
        Espectador dos = new Espectador("Marcos", 42, 4000);
        espectadores.add(dos);
        Espectador tres = new Espectador("Lucia", 19, 2000);
        espectadores.add(tres);
        Espectador cuatro = new Espectador("Juana", 23, 2000);
        espectadores.add(cuatro);
        Espectador cinco = new Espectador("Federico", 37, 5000);
        espectadores.add(cinco);
        Espectador seis = new Espectador("Cecilia", 30, 8000);
        espectadores.add(seis);
        Espectador siete = new Espectador("Fernando", 63, 9000);
        espectadores.add(siete);
        Espectador ocho = new Espectador("Pablo", 73, 2700);
        espectadores.add(ocho);
        Espectador nueve = new Espectador("Paolo", 79, 3100);
        espectadores.add(nueve);
        Espectador diez = new Espectador("Milagros", 72, 12000);
        espectadores.add(diez);
        Espectador once = new Espectador("Melody", 19, 2900);
        espectadores.add(once);
        Espectador doce = new Espectador("Morena", 21, 9700);
        espectadores.add(doce);

    }

    public void llenarAleatorio() {
        int longitud = espectadores.size();
        for (int i = 0; i < longitud; i++) {
            int fa = (int) (Math.random() * 8 + 1); //fa = fila aleatoria
            int ca = (int) (Math.random() * 6); //ca = columna aleatoria
            while (sala.getSala()[fa][ca].getLibre().equalsIgnoreCase("X")) {
                fa = (int) (Math.random() * 8 + 1); //fa = fila aleatoria
                ca = (int) (Math.random() * 6); //ca = columna aleatoria
            }
            sala.getSala()[fa][ca].setEspectador(espectadores.get(i));
            sala.getSala()[fa][ca].setLibre("X");

        }
        cine.getCine().add(sala);
    }

    public void mostrarSala() {
        System.out.println(cine.getCine().get(0).getPelicula().toString());
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getCine().get(0).getSala()[i][j].getFila());
                System.out.print(cine.getCine().get(0).getSala()[i][j].getColumna());
                System.out.print(cine.getCine().get(0).getSala()[i][j].getLibre());
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    public void menu() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("BIENVENIDO AL CINE");
            System.out.println("1-Ingresar nuevo Espectador");
            System.out.println("2-Mostrar SALA");
            System.out.println("3-Mostrar Espectador");
            System.out.println("4-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresarNuevoEspectador();
                    break;
                case 2:
                    mostrarSala();
                    break;
                case 3:
                    mostrarEspectador();
            }
        }
    }

    public void ingresarNuevoEspectador() {
        Espectador nuevo = new Espectador();
        System.out.println("Ingrese su nombre");
        nuevo.setNombre(leer.next());
        System.out.println("Ingrese edad de " + nuevo.getNombre());
        nuevo.setEdad(leer.nextInt());
        System.out.println("Ingrese dinero Disponible de " + nuevo.getNombre());
        nuevo.setDinerodisponible(leer.nextDouble());

        //Variables necesarias
        int columna = 0;
        int fila = 0;
        double valorentrada = 1000;
        boolean saldo = false;
        boolean mayor = false;
        if (valorentrada <= nuevo.getDinerodisponible()) {
            saldo = true;
        }
        if (sala.getPelicula().getEdadminima() <= nuevo.getEdad()) {
            mayor = true;
        }
        if (mayor == true && saldo == true) {
            System.out.println("Ingrese una ubicacion disponible inidicado numero de Fila y Letra de columna");
            System.out.println("");
            mostrarSala();

            System.out.println("Ingrese numero de fila");
            fila = (leer.nextInt());
            System.out.println("Ingrese la Letra de columna");
            String letra = leer.next();
            while (cine.getCine().get(0).getSala()[fila][columna].getLibre().equalsIgnoreCase("X")) {
                System.out.println("Lugar ocupado");
                System.out.println("Ingrese numero de fila");
                fila = (leer.nextInt());
                System.out.println("Ingrese la Letra de columna");
                letra = leer.next();
            }
            switch (letra) {
                case "A":
                    columna = 0;
                    break;
                case "B":
                    columna = 1;
                    break;
                case "C":
                    columna = 2;
                    break;
                case "D":
                    columna = 3;
                    break;
                case "E":
                    columna = 4;
                    break;
                case "F":
                    columna = 5;
                    break;
            }
            cine.getCine().get(0).getSala()[fila][columna].setLibre("X");
            cine.getCine().get(0).getSala()[fila][columna].setEspectador(nuevo);

        }
        if (saldo == false) {
            System.out.println("Lo sentimos no cuenta con dinero suficiente");
        } else if (mayor == false) {
            System.out.println("Lo sentimos es menor a la edad permitida por la pelicula");
        }

    }

    public void mostrarEspectador() {
        int columna = 0;
        System.out.println("Ingrese la ubicacion del asciento opcupado mediante numero de Fila y Letra de columna");
        mostrarSala();

        System.out.println("Ingrese numero de fila");
        int fila = (leer.nextInt());
        System.out.println("Ingrese la Letra de columna");
        String letra = leer.next();
         switch (letra) {
            case "A":
                columna = 0;
                break;
            case "B":
                columna = 1;
                break;
            case "C":
                columna = 2;
                break;
            case "D":
                columna = 3;
                break;
            case "E":
                columna = 4;
                break;
            case "F":
                columna = 5;
                break;
        }
        if (cine.getCine().get(0).getSala()[fila][columna].getLibre().equalsIgnoreCase("X")) {
          System.out.println(cine.getCine().get(0).getSala()[fila][columna].getEspectador().toString());  
        }else {
            System.out.println("El asciento se encuentra libre");
        }
    }
}
