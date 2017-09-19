/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodel35;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciodel35 {

    /**
     * @param args the command line arguments
     *  Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
internos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double importe ;
        String datoaux ;
        Double totalconiva ;
        
        Scanner miscan = new Scanner (System.in);
        System.out.println("Ingrese importe del producto");
        datoaux =miscan.next() ;
        importe= Double.parseDouble(datoaux);
        
        totalconiva= importe + (importe*0.35) ;
        System.out.println("El importe del producto es "+ totalconiva);
        
        
        
            }
    
}
