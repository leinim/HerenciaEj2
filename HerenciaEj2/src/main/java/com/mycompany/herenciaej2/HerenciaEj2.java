/*
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */

package com.mycompany.herenciaej2;

import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author Mile
 */
public class HerenciaEj2 {

    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();
        
        l.crearLavadora();
        t.crearTelevisor();
        
        l.precioFinal();
        t.precioFinal();
        
        System.out.println(l.toString());
        System.out.println("");
        System.out.println(t.toString());
        
        System.out.println(l.getColor());
        System.out.println(l.getPrecio());        
        
        
    }
}
