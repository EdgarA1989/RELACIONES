/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdad;

import numeraciones.Tipo;

/**
 *
 * @author EANDRADA
 */
public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private int motor;
    private int chasis;
    private Tipo tipo;
    private Cliente cliente;
            
    public Auto() {
    }

    public Auto(String marca, String modelo, int año, int motor, int chasis, Tipo tipo, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
        this.chasis = chasis;
        this.tipo = tipo;
        this.cliente=cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "\nmarca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", motor=" + motor + ", chasis=" + chasis + ", tipo=" + tipo;
    }
    
    
}
