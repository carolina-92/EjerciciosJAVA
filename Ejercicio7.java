/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     * Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se llama “ XXXXXX y
tiene XX años de edad”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad ;
         String nombre; 
        
        Scanner edadynombre = new Scanner (System.in) ; 
        System.out.println("Ingresar edad");
        edad = edadynombre.nextInt();
        System.out.println("Ingresar nombre");
        //porque no toma el nextline
        nombre= edadynombre.next();
        System.out.println("Usted se llama " +nombre +" " +" y tiene " +edad +" años de edad");
    }
    
}
