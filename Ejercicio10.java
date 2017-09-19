/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * Se pide el largo y ancho de un terreno y se pide la superficie del mismo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Largo ;
        int Ancho ;
        int Superficie ;
        Scanner Superficieacalcular = new Scanner(System.in) ;
        System.out.println("Ingresar largo del terreno");
        Largo= Superficieacalcular.nextInt();
        System.out.println("Ingresar ancho del terreno");
        Ancho = Superficieacalcular.nextInt();
        Superficie= Largo*Ancho ;
        System.out.println("La superfice del terreno es " + Superficie);
        
        
        
    }
    
}
