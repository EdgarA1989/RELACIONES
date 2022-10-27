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
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private Integer votosRecibidos;
    private Voto votos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni, Integer votosRecibidos, Voto votos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votosRecibidos = votosRecibidos;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Voto getVotos() {
        return votos;
    }

    public void setVotos(Voto votos) {
        this.votos = votos;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Integer getVotosRecibidos() {
        return votosRecibidos;
    }
    
    public void setVotosRecibidos(Integer votosRecibidos) {
        this.votosRecibidos = votosRecibidos;
    }

    @Override
    public String toString() {
        return "Alumno: " + "\n - Nombre Completo: " + nombreCompleto + "\n - DNI: " + dni + "\n - Votos Recibidos: " + votosRecibidos;
    }

    
}
