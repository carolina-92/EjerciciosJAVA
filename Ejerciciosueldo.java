/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosueldo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciosueldo {

    /**
     * @param args the command line arguments
     *  Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
        informar cuanto le corresponde de sueldo, restándole el 15% de aportes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double valorhora ;
        Double cantidadhoras ;
        String datoaux;
        Double sueldo ;
        
        Scanner miscan = new Scanner (System.in) ;
        
        System.out.println("Ingresar el valor de la hora de trabajo");
        datoaux = miscan.next() ;
        valorhora=Double.parseDouble(datoaux) ;
       
        System.out.println("Ingresar cantidad de horas");
        datoaux = miscan.next() ;
        cantidadhoras=Double.parseDouble(datoaux) ;
        
        sueldo= (cantidadhoras*valorhora)-(cantidadhoras*valorhora)*0.15;
        //o tambien puede ser (cantidadhoras*valorhora)*0.85
        System.out.println("El sueldo a pagar es " +sueldo);
    }
    
}
