/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdad;

import java.util.ArrayList;

/**
 *
 * @author EANDRADA
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String mail;
    private int dni;
    private String domicilio;
    private int telefono;
    private ArrayList<Auto> autocliente = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String mail, int dni, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Auto> getAutocliente() {
        return autocliente;
    }

    public void setAutocliente(ArrayList<Auto> autocliente) {
        this.autocliente = autocliente;
    }

    @Override
    public String toString() {
        return "\nnombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", \nautocliente=" + autocliente +"";
    }
    
    
}
