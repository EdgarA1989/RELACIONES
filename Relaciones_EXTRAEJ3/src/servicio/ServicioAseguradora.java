/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import enitdad.Auto;
import enitdad.Cliente;
import enitdad.Cuota;
import enitdad.Poliza;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import numeraciones.Cobertura;
import static numeraciones.Cobertura.TERCEROS;
import numeraciones.Pago;
import numeraciones.Tipo;

/**
 *
 * @author EANDRADA
 */
public class ServicioAseguradora {

    Scanner leer = new Scanner(System.in);
    ArrayList<Cliente> listacliente = new ArrayList();
    ArrayList<Auto> listaauto = new ArrayList();
    ArrayList<Poliza> listapoliza = new ArrayList();

    public void generarClientes() {

        Cliente c1 = new Cliente("Edgar", "Andrada", "edgar.andrada@gmail.com", 34156411, "Alberti 683", 1151498777);
        listacliente.add(c1);
        Cliente c2 = new Cliente("Juan", "Perez", "juan.perez@gmail.com", 34234121, "Camacua 1234", 1151234421);
        listacliente.add(c2);
        Cliente c3 = new Cliente("Marcela", "Marquez", "marcela.marquez@gmail.com", 31234500, "Azopardo 13", 1144332190);
        listacliente.add(c3);
        Cliente c4 = new Cliente("Priscila", "Andrada", "pipi.andrada@gmail.com", 52300872, "Montevideo 1892", 1186542317);
        listacliente.add(c4);
        Cliente c5 = new Cliente("Homero", "Simpsons", "homero.simpsons@gmail.com", 30980100, "Siempreviva 206", 1124528620);
        listacliente.add(c5);
    }

    public void generarAutos() {

        Auto a1 = new Auto("Volkswagen", "Voyage", 2022, 14101, 1401, Tipo.Sedan, null);
        listaauto.add(a1);
        Auto a2 = new Auto("Ford", "Ka", 2018, 14102, 1402, Tipo.Hatchback, null);
        listaauto.add(a2);
        Auto a3 = new Auto("Fiat", "Pulse", 2020, 14103, 1403, Tipo.SUV, null);
        listaauto.add(a3);
        Auto a4 = new Auto("Volkswagen", "Gol", 2019, 14104, 1405, Tipo.Sedan, null);
        listaauto.add(a4);
        Auto a5 = new Auto("Chevrolet", "Cruze", 2018, 14105, 1405, Tipo.Hatchback, null);
        listaauto.add(a5);
    }

    public void generarPoliza() throws ParseException {
//        this.numpoliza = numpoliza;
//        this.fechaincio = fechaincio;
//        this.cantidadcuotas = cantidadcuotas;
//        this.formadepago = formadepago;
//        this.prima = prima;
//        this.granizo = granizo;
//        this.maxgranizo = maxgranizo;
//        this.cobertura = cobertura;
//        this.cuota = cuota;
        Poliza poliza = new Poliza();
        System.out.println("Bienvenido");
        System.out.println("Ingrese numero de Poliza");
        poliza.setNumpoliza(leer.nextInt());
        elegirCliente(poliza);
        poliza.setCantidadcuotas(12);
        System.out.println("Ingrese fecha de inicio de la poliza en formato dd/mm/yyyy");
        String fechainicio = leer.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        poliza.setFechaincio(sdf.parse(fechainicio));
        System.out.println("Ingrese fecha final de la poliza en formato dd/mm/yyyy");
        String fechafinal = leer.next();
        poliza.setFechafinal(sdf.parse(fechafinal));
        poliza.setPrima(calculoPrima(poliza));
        poliza.setCobertura(elegirCobertura(poliza));
        poliza.setFormadepago(elegirPago(poliza));
        System.out.println(poliza.toString());
      
    }

    public void elegirCliente(Poliza poliza) {

        System.out.println(listacliente.toString());
        System.out.println("Elija el cliente segun el DNI");
        int dni = leer.nextInt();
        int longitud = listacliente.size();
        for (int i = 0; i < longitud; i++) {
            if (listacliente.get(i).getDni() == dni) {
                poliza.getListacliente().add(listacliente.get(i));
                poliza.getListacliente().get(0).getAutocliente().add(asignarAuto()); //ASIGNA AUTO MEDIATE EL METODO AL CLIENTE

            }
        }

    }

    public Auto asignarAuto() {
        System.out.println("Elija el auto que le corresponde");
        System.out.println("Autos disponibles:");
        System.out.println(listaauto.toString());
        System.out.println("Seleccione por numero de motor");
        int motor = leer.nextInt();
        for (int j = 0; j < listaauto.size(); j++) {
            if (listaauto.get(j).getMotor() == motor) {
                return listaauto.get(j);

            }
        }
        return null;
    }

    public int calculoPrima(Poliza poliza) {

        String modelo = poliza.getListacliente().get(0).getAutocliente().get(0).getModelo();
        int año = poliza.getListacliente().get(0).getAutocliente().get(0).getAño();
        int total = 0;
        int porcentaje = 0;
        switch (modelo) {
            case "Voyage":
                total = 1800000;
                switch (año) {
                    case 2022:
                        return total;
                    case 2021:
                        porcentaje = (int) (total * 0.01);
                        return (total - porcentaje);
                    case 2020:
                        porcentaje = (int) (total * 0.02);
                        return (total - porcentaje);
                    case 2019:
                        porcentaje = (int) (total * 0.03);
                        return (total - porcentaje);
                    case 2018:
                        porcentaje = (int) (total * 0.4);
                        return (total - porcentaje);
                }

                break;
            case "Pulse":
                total = 2300000;
                switch (año) {
                    case 2022:
                        return total;
                    case 2021:
                        porcentaje = (int) (total * 0.05);
                        return (total - porcentaje);
                    case 2020:
                        porcentaje = (int) (total * 0.1);
                        return (total - porcentaje);
                    case 2019:
                        porcentaje = (int) (total * 0.15);
                        return (total - porcentaje);
                    case 2018:
                        porcentaje = (int) (total * 0.2);
                        return (total - porcentaje);
                }

            case "Ka":
                total = 1500000;
                switch (año) {
                    case 2022:
                        return total;
                    case 2021:
                        porcentaje = (int) (total * 0.05);
                        return (total - porcentaje);
                    case 2020:
                        porcentaje = (int) (total * 0.1);
                        return (total - porcentaje);
                    case 2019:
                        porcentaje = (int) (total * 0.15);
                        return (total - porcentaje);
                    case 2018:
                        porcentaje = (int) (total * 0.2);
                        return (total - porcentaje);
                }
                break;
            case "Cruze":
                total = 2800000;
                switch (año) {
                    case 2022:
                        return total;
                    case 2021:
                        porcentaje = (int) (total * 0.05);
                        return (total - porcentaje);
                    case 2020:
                        porcentaje = (int) (total * 0.1);
                        return (total - porcentaje);
                    case 2019:
                        porcentaje = (int) (total * 0.15);
                        return (total - porcentaje);
                    case 2018:
                        porcentaje = (int) (total * 0.2);
                        return (total - porcentaje);
                }

            case "Gol":
                total = 1400000;
                switch (año) {
                    case 2022:
                        return total;
                    case 2021:
                        porcentaje = (int) (total * 0.05);
                        return (total - porcentaje);
                    case 2020:
                        porcentaje = (int) (total * 0.1);
                        return (total - porcentaje);
                    case 2019:
                        porcentaje = (int) (total * 0.15);
                        return (total - porcentaje);
                    case 2018:
                        porcentaje = (int) (total * 0.2);
                        return (total - porcentaje);
                }

        }
        return 0;
    }
    
    
    public Cobertura elegirCobertura(Poliza poliza){
        System.out.println("Seleccione la cobertura que desea");
        System.out.println("1-Contra Terceros");
        System.out.println("2-Todo riesgo");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                return Cobertura.TERCEROS;
            case 2:
                return Cobertura.TODO_RIESGO;
               
        }
      return null;  
    }
    
    public Pago elegirPago(Poliza poliza){
        System.out.println("Seleccione la cobertura que desea");
        System.out.println("1-Efectivo");
        System.out.println("2-Tarjeta");
        System.out.println("3-Transferencia");
        System.out.println("4-Mercado pago");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                return Pago.EFECTIVO;
            case 2:
                return Pago.TARJETA;
            case 3:
                return Pago.TRANSFERENCIA;
            case 4:
                return Pago.MERCADOPAGO;   
        }
      return null;  
    }


//    public int maxGranizo(int p1){
//        int maxgranizo = (int) (p1 * 0.4);
//        return maxgranizo;
//    }
//    
//    public Cuota crearCuota(){
//        
//    }
}
