/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author edgar
 */
public class Jugador {

    private int idjugador;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }

    public Jugador(int idjugador, String nombre) {
        this.idjugador = idjugador;
        this.nombre = nombre;
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "idjugador=" + idjugador + ", \nnombre=" + nombre + '}';
    }
    
    

    public boolean disparo(Revolver r) {
        mojado = r.mojar();
        if (mojado == true) {

        } else {
            r.siguienteChorro();
        }
        return mojado;

    }

}
