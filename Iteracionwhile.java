/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Iteracionwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        String clave ;
        Scanner miscan = new Scanner (System.in);
        System.out.println("Solicitar clave");
        clave=miscan.next();
        
        if (clave.equals(1234))
        {
            System.out.println("Bienvenidos");
        }
        else 
        {
        System.out.println("Reingrese la clave");
        clave=miscan.next();
        }
         while(!clave.equals("1234"))
         {
         System.out.println("Reingresar clave");
         
          clave=miscan.next();
         }
         System.out.println("Bienvenidos");
         
         Integer micontador=0;
         
         while(micontador<3)
         {
             micontador=micontador+1;
             System.out.println("contando");
         }
         System.out.println("Termine");
    }
    
    } 
    

