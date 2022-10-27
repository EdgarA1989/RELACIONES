/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enitdad;

import java.util.Date;
import numeraciones.Pago;

/**
 *
 * @author EANDRADA
 */
public class Cuota {
    private int numcuota;
    private int cuota;
    private boolean estapaga;
    private Date fechavencimiento;
    private Pago pago;

    public Cuota() {
    }

    public Cuota(int numcuota, int cuota, boolean estapaga, Date fechavencimiento, Pago pago) {
        this.numcuota = numcuota;
        this.cuota = cuota;
        this.estapaga = estapaga;
        this.fechavencimiento = fechavencimiento;
        this.pago = pago;
    }

    public int getNumcuota() {
        return numcuota;
    }

    public void setNumcuota(int numcuota) {
        this.numcuota = numcuota;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public boolean isEstapaga() {
        return estapaga;
    }

    public void setEstapaga(boolean estapaga) {
        this.estapaga = estapaga;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numcuota=" + numcuota + ", cuota=" + cuota + ", estapaga=" + estapaga + ", fechavencimiento=" + fechavencimiento + ", pago=" + pago + '}';
    }
    
    
}
