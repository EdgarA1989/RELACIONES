/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import entidad.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import numeracion.Apellidos;
import numeracion.Nombres;
import utilidades.Comparador;

/**
 *
 * @author edgar
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);
    ArrayList<Nombres> nombres = new ArrayList(Arrays.asList(Nombres.values()));
    ArrayList<Apellidos> apellidos = new ArrayList(Arrays.asList(Apellidos.values()));
    ArrayList<Alumno> alumnos = new ArrayList<>();
    ArrayList<Alumno> facilitadores = new ArrayList();
    ArrayList<Alumno> suplentes = new ArrayList();
   

    public void crearAlumno() {

        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);
        for (int i = 0; i < 10; i++) {

            alumnos.add(new Alumno((nombres.get(i).toString() + " " + apellidos.get(i).toString()), (int) (Math.random() * (40000000 - 30000000) + 30000000), 0,null));
        }
//        for (Alumno nombre : alumnos) {
//            System.out.println(nombre);
//        }
    }

    public void votacion() {
        for (int i = 0; i < 10; i++) {
            Voto voto = new Voto();
            ArrayList<String> votados = new ArrayList<>();
            Alumno votante = alumnos.get(i);
            voto.setVotante(votante);
            int[] votos = {10, 10, 10};
            for (int j = 0; j < 3; j++) {
                int posicion = (int) (Math.random() * 9);
                while (posicion == i || votos[0] == posicion || votos[1] == posicion || votos[2] == posicion) {
                    posicion = (int) (Math.random() * 9);
                }
                alumnos.get(posicion).setVotosRecibidos(alumnos.get(posicion).getVotosRecibidos() + 1);
                votos[j] = posicion;
                
                String nombre = alumnos.get(posicion).getNombreCompleto();
                votados.add(nombre);
                voto.setVotados(votados);
                // System.out.println(posicion);
            }
            alumnos.get(i).setVotos(voto);
        }
    }
    
    public void menu(){
        int opcion=0;
        while (opcion!=4){
        System.out.println("Bienvenido a la clase");
        System.out.println("1-Mostrar Alumnos");
        System.out.println("2-Mostrar votacion de Alumnos");
        System.out.println("3-Mostrar nuevos facilitadores");
        System.out.println("4-Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1:
                mostrarAlumnos();
                break;
            case 2:
                mostrarVotosAlumnos();
                break;
            case 3:
                elegirFacilitadores();
                break;
        }
        }   
    }
    
    public void mostrarAlumnos(){
        for (Alumno nombre : alumnos) {
            System.out.println(nombre);
        }
    }
    
    
    public void mostrarVotosAlumnos(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("-Nombre de alumno: ");
            System.out.println(alumnos.get(i).getNombreCompleto());
            System.out.println("-Votos recibidos");
            System.out.println(alumnos.get(i).getVotosRecibidos());
            System.out.println("Voto a:");
            for (int j = 0; j < 3; j++) {
                System.out.println(alumnos.get(i).getVotos().getVotados().get(j));
                
            }
            
        }
    }
   public void elegirFacilitadores(){
       Collections.sort(alumnos, Collections.reverseOrder(Comparador.maspulsos));
       for (int i = 0; i < 10; i++) {
           if (i<5){
           facilitadores.add(alumnos.get(i));
           }
           else {
           suplentes.add(alumnos.get(i));
           }
       }
       System.out.println("-Los facilitadores titulares son: ");
       for (Alumno aux : facilitadores) {
           System.out.println(aux);
       }
       System.out.println("-Los facilitadores suplentes son:");
        for (Alumno aux : suplentes) {
           System.out.println(aux);
       }
       
   }
    
}
