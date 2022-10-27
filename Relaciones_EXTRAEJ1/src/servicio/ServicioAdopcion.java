/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ListaPerro;
import entidad.ListaPersona;
import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class ServicioAdopcion {

    Scanner leer = new Scanner(System.in);
    ListaPerro listaperro = new ListaPerro();
    ListaPersona listapersona = new ListaPersona();

    public void menu() {
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("BiENVENIDO AL MENU");
            System.out.println("1-INGRESAR PERSONA");
            System.out.println("2-INGREAR PERRO");
            System.out.println("3-MOSTRAR PERROS");
            System.out.println("4-MOSTRAR PERSONAS");
            System.out.println("5-ASIGNAR PERRO A PERSONA");
            System.out.println("6-SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    crearPerro();
                    break;
                case 3:
                    mostrarPerro();
                    break;
                case 4:
                    mostrarPersona();
                    break;
                case 5:
                    adoptarPerro();
                    break;
               }
            }

        }

    public void crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el Nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el Apellido de la persona");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la Edad de " + persona.getNombre() + " " + persona.getApellido());
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI de " + persona.getNombre() + " " + persona.getApellido());
        persona.setDni(leer.nextInt());
        listapersona.getListapersona().add(persona);
    }

    public void crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el Nombre del Perro");
        perro.setNommbre(leer.next());
        System.out.println("Ingrese la raza del perro");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la Edad de " + perro.getNommbre());
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño de " + perro.getNommbre());
        perro.setTamanio(leer.next());
        listaperro.getListaperro().add(perro);

    }

    public void mostrarPerro() {
        for (Perro aux : listaperro.getListaperro()) {
            System.out.println(aux);
        }
    }

    public void mostrarPersona() {
        for (Persona aux : listapersona.getListapersona()) {
            System.out.println(aux);
        }
    }

    public void adoptarPerro() {
        System.out.println("Elija el DNI de la persona");
        Integer dni = leer.nextInt();
        boolean auxperro = false;
        boolean auxpersona = false;
        for (int i = 0; i < listapersona.getListapersona().size(); i++) {
            int dnipersona = listapersona.getListapersona().get(i).getDni();
            if (dnipersona == dni) {
                auxpersona = true;
                System.out.println("PERROS DISPONIBLES PARA ELEGIR");
                mostrarPerro();
                System.out.println("Ingrese el nombre del Perro que desea adoptar");
                String nombreperro = leer.next();
                for (int j = 0; j < listaperro.getListaperro().size(); j++) {
                    if (listaperro.getListaperro().get(j).getNommbre().equalsIgnoreCase(nombreperro)) {
                        auxperro = true;
                        listapersona.getListapersona().get(i).setPerro(listaperro.getListaperro().get(j));
                        listaperro.getListaperro().remove(j);
                    }
                }
                if (auxperro == false) {
                    System.out.println("El nombre del perro ingresado no corresponde a ninguno de la lista");
                }
            }
        }
        if (auxpersona == false) {
            System.out.println("El DNI de la persona ingresado no corresponde a ninguno de la lista");
        }
    }
}
