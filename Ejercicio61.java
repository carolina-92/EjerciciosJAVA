/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.pkg1;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio61 {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje “su nombre
es XXXXX y XXXXXX es su apellido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre ;
        String  apellido ;
        
        Scanner nombreyapellido = new Scanner (System.in);
        System.out.println("Ingresar nombre");
        nombre= nombreyapellido.nextLine() ;
        System.out.println("Ingresar apellido");
        apellido= nombreyapellido.nextLine() ;
        System.out.println("su nombre es "+nombre +" " +apellido +" es su apellido" );
    }
    
}
