/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     * Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
informar cuanto le corresponde de sueldo, restándole el 15% de aportes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double horadetrabajo ;
        double cantidaddehorastrabajadas ;
        double valorconaporte ;
        


        Scanner sueldo = new Scanner (System.in) ;
        System.out.println("Ingrese el valor de la hora de trabajo");
        horadetrabajo = sueldo.nextDouble();
        System.out.println("Ingrese cantidad de horas trabajadas");
        cantidaddehorastrabajadas = sueldo.nextDouble();
        valorconaporte= (horadetrabajo*cantidaddehorastrabajadas)* 0.85 ;     
        //verificar los decimales
        //(Saco el 85 por ciento del total ya que se le resta 15) 
        System.out.println( "El sueldo total  con aportes es " +sueldo) ;  


    }
    
}
