/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17.pkg20.pkg09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio172009 {

    /**
     * @param args the command line arguments
     * Se pide una edad y se informa si es niño, adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad ;
        String datoaux;
        
        Scanner miscan =new Scanner (System.in) ;
        System.out.println("Ingresar edad"); 
        datoaux =miscan.next();
        edad= Integer.parseInt(datoaux) ;
        
//        if (edad <= 12) 
//        { 
//            System.out.println("Es niño");
//        }
//        if (edad >12 && edad <=18)
//        {
//            System.out.println("Es adolescente");
//        }
//        if (edad>18)
//        {
//            System.out.println("Usted es mayor");
// El codigo anterior consulta 3 veces cada vez que pasa y ocupa procesador, el de 
//abajo es la manera mas optima.
//           
//        }
        if (edad > 17) 
        {System.out.println("Es mayor");
        } else
        {if (edad<13)
        {System.out.println("Es menor");
        }
        else
        {
            System.out.println(" Es adolescente");
            //Si es mayor a 17 es mayor sino, si es menor a trece es menor sino es adolecente, entre 13 y 17.
        }
        }
        }
        
    }
    

