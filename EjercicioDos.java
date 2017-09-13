/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostar el  mismo nombre
     */
    public static void main(String[] args) {
         // TODO code application logic here
        String nombre;
        Scanner miscanner = new Scanner (System.in);
        System.out.println("Ingrese el nombre");
        nombre =miscanner.nextLine();
        System.out.println("el nombre ingresado es "+ nombre );
        
               
       
    }
    
}
