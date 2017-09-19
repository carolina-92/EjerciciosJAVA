/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreceaula;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciotreceaula {

    /**
     * @param args the command line arguments
     * Se ingresa una edad y se informa si es mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer edad ;
        String datoaux;
        
        Scanner miscan = new Scanner (System.in) ;
        
        System.out.println("Ingresas edad");
        datoaux= miscan.next();
        edad=Integer.parseInt(datoaux);
        
        if (edad > 17 ) 
            { System.out.println("Usted es mayor"); }
        else 
        { System.out.println("es menor");
        
        //if y else es una instruccion
        }
            
        
        
        
        
    }
    
}
