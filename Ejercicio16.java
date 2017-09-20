/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un pasaje de avion y el mes de viaje,
     * Si es enero se le descuenta un 10% por temporada baja
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double importe ;
        String mes ;
        String datoaux;
        boolean respuestames;
        //boolean  puede almacenar unicamente dos valores: verdadero o falso
        Double descuento ;
        
        Scanner miscan = new Scanner (System.in) ;
        System.out.println("Ingrese Importe del pasaje");
        datoaux=miscan.next();
        importe= Double.parseDouble(datoaux) ;
        
        System.out.println("Ingrese mes de viaje");
        mes= miscan.next();
        respuestames=mes.equals("enero");
        //equals compara si dos objetos apuntan al mismo objeto. Equals() se usa para saber si dos objetos 
        //son del mismo tipo y tienen los mismos datos. Nos dara el valor true si son iguales y false si no.
        //la variable boolean la defini arriba para que sea verdadero o falso el objeto.
        
        if (respuestames)
        { descuento = importe -(importe*.10) ;
        System.out.println("Su importe por temporada baja es " +descuento);
        } else
        { System.out.println("Su importe es " +importe);
    }
    
}
}
