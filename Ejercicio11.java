/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad ;
        int precio ;
        int Totalapagar ;
        
        Scanner Pagare = new  Scanner (System.in) ;
        System.out.println("Ingrese cantidad de producto");
        cantidad = Pagare.nextInt();
        System.out.println("Ingrese precio del producto por unidad");
        precio = Pagare.nextInt();
        Totalapagar = cantidad*precio ;
        //numero con decimales para que los tomes, que variable elegir?
        System.out.println("El total a pagar es " +Totalapagar) ;
    }
    
}
