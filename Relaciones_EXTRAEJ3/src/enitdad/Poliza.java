/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdad;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import numeraciones.Cobertura;
import numeraciones.Pago;

/**
 *
 * @author EANDRADA
 */
public class Poliza {
   
     
    private int numpoliza;
    private Date fechaincio;
    private Date fechafinal;
    private int cantidadcuotas;
    private Pago formadepago;
    private int prima;
    private boolean granizo;
    private int maxgranizo;
    private Cobertura cobertura;
    private Cuota cuota;
    private ArrayList<Cliente> listacliente = new ArrayList();
    

    public Poliza() {
    }

    public Poliza(int numpoliza, Date fechaincio, Date fechaifinal, int cantidadcuotas, Pago formadepago, int prima, boolean granizo, int maxgranizo, Cobertura cobertura, Cuota cuota) {
        this.numpoliza = numpoliza;
        this.fechaincio = fechaincio;
        this.fechafinal= fechafinal;
        this.cantidadcuotas = cantidadcuotas;
        this.formadepago = formadepago;
        this.prima = prima;
        this.granizo = granizo;
        this.maxgranizo = maxgranizo;
        this.cobertura = cobertura;
        this.cuota = cuota;
    }   

    public int getNumpoliza() {
        return numpoliza;
    }

    public void setNumpoliza(int numpoliza) {
        this.numpoliza = numpoliza;
    }

    public Date getFechaincio() {
        return fechaincio;
    }

    public void setFechaincio(Date fechaincio) {
        this.fechaincio = fechaincio;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }

    public Pago getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(Pago formadepago) {
        this.formadepago = formadepago;
    }

    public int getPrima() {
        return prima;
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMaxgranizo() {
        return maxgranizo;
    }

    public void setMaxgranizo(int maxgranizo) {
        this.maxgranizo = maxgranizo;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public void setListacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numpoliza=" + numpoliza + ", fechaincio=" + fechaincio + ", fechafinal=" + fechafinal + ", cantidadcuotas=" + cantidadcuotas + ", formadepago=" + formadepago + ", prima=" + prima + ", granizo=" + granizo + ", maxgranizo=" + maxgranizo + ", cobertura=" + cobertura + ", cuota=" + cuota + ", \nlistacliente=" + listacliente + '}';
    }
    

   
    
}
