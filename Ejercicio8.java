/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     * Se piden tres números e informar el promedio
     */
    public static void main(String[] args) {
        // TODO code application logic here
int numerouno ;
int numerodos ; 
int numerotres ;
int Promedio ;

    Scanner promedios = new Scanner (System.in);
    System.out.println("Ingrese primer numero");
    numerouno= promedios.nextInt();
    System.out.println("Ingrese segundo numero") ;
    numerodos=promedios.nextInt();
    System.out.println("Ingrese tercer numero");
    numerotres=promedios.nextInt();
    Promedio = (numerouno+numerodos+numerotres) /3  ;
    System.out.println("Promedio " + Promedio); 
    
            

    
        
    

    }
    
}
