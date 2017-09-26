/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch2.pkg2609;

import java.util.Scanner;
import sun.print.resources.serviceui;

/**
 *
 * @author alumno
 */
public class Switch22609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mesdelaño;
        String datoaux;
        
        
        Scanner miscan = new Scanner (System.in);
        System.out.println("Ingresar mes del año");
        datoaux= miscan.next();
        mesdelaño= Integer.parseInt(datoaux);
        
        switch (mesdelaño) 
        {
        case 1:
        System.out.println("Es verano");
        }
               
                   
        
        
    }
    
}
