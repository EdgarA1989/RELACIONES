/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author edgar
 */
public class Comparador {
    
    public static Comparator<Alumno> maspulsos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.getVotosRecibidos().compareTo(o2.getVotosRecibidos());
    }
    };

}
