/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
informar cuánto dinero le corresponde a cada uno.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidadganadores ;
        int montototal;
        int promedio ;
 
        Scanner pagare = new Scanner (System.in);
        System.out.println("Ingrese cantidad de ganadores");
        cantidadganadores= pagare.nextInt();
        System.out.println("Ingrese monto total");
        montototal=pagare.nextInt();
        promedio= montototal/cantidadganadores ;
        System.out.println("Le corresponde a cada uno " +promedio );
    }
    
}
