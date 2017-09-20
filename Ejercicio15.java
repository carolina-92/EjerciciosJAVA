/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     *  Se ingresa un importe si supera los 100 $ se le suma un 23% si es menor a 100$ se le descuenta el 50%.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double importe;
        String datoaux;
        Double impuesto ;
        Double descuento ;
        
        Scanner miscan = new Scanner (System.in) ;
        System.out.println("Ingresar importe");
        datoaux=miscan.next();
        importe = Double.parseDouble(datoaux);
        
        if (importe > 100)
                   
        { impuesto= importe + (importe*0.23) ;
            System.out.println("El importe es "+impuesto);
                                 
                       
       } else
        { descuento = importe - (importe*0.50) ;
            System.out.println("El importe es " +descuento);
        
    }
    
}
}
