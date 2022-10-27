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
public class Revolver {

    private int posicionactual;
    private int posicionagua;

    public Revolver() {
    }

    public Revolver(int posicionactual, int posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(int posicionactual) {
        this.posicionactual = posicionactual;
    }

    public int getPosicionagua() {
        return posicionagua;
    }
    
    

    public void setPosicionagua(int posicionagua) {
        this.posicionagua = posicionagua;
    }

    public Revolver llenarRevolver(Revolver revolver) {
//      Revolver revolver = new Revolver();
        posicionactual = (int) (Math.random() * 6 + 1);
        posicionagua = (int) (Math.random() * 6 + 1);
        return revolver;
    }
    
    public boolean mojar(){
        boolean aux=false;
        if (posicionagua==posicionactual){
            aux=true;
        }
        return aux;
    }
    
    public void siguienteChorro(){
        posicionactual = (int) (Math.random() * 6 + 1);
       
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }
    
  
}
