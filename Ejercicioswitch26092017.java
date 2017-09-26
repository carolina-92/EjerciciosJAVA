/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch26092017;

import java.awt.BorderLayout;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author alumno
 */
public class Ejercicioswitch26092017 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes ;
        String vacaciones ;
        int edad ;
        String datoaux ;
        Scanner miscan = new Scanner (System.in);
        
        
        System.out.println("Vas de vacaciones?");
        vacaciones = miscan.next();
        if (vacaciones.equals("si"))
        { 
        System.out.println("Ingresar mes");
        mes = miscan.next();
        
        System.out.println("Ingresar edad");
        datoaux= miscan.next() ;
        edad =Integer.parseInt(datoaux);
               
                
                        
        switch(mes)
        {
        case "enero" :
        case "febrero" :
        System.out.println("Lindo veranito");
        break ;
        case "julio":
        System.out.println("Lindo invierno");
        if (edad >79 )
        {System.out.println("Vacunate contra la gripe");
        }
        
        
        break ;
        default :
            System.out.println("No es verano");
        }
       
        }
        
                
    }
    
}
