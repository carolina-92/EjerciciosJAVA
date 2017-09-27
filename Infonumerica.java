/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Infonumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //modulo (%) es el signo de porcentaje.
        /*
        Integer numerouno ;
        Integer numerodos ;
        Integer resultado ;
                             
       numerouno=2 ;
       numerodos=10;
       resultado=2%10; //da el resto de la division de 2/10
       
       
       System.out.println("Resultado " + resultado);
       resultado= 10%2 ;
       System.out.println("Resultado " + resultado);
        prueba para saber que es el modulo-
  */
       Integer numeroingresado ;
       String datoaux;
       
        Scanner miscan = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        datoaux= miscan.next();
        numeroingresado= Integer.parseInt(datoaux);
        
      //1- Informar si el mumero es mayor o menor a 100.
      if (numeroingresado !=100)
      {
      if (numeroingresado >100 )
      {
     System.out.println(" El numero ingresado es mayor a 100");
     }else 
      {
          System.out.println("Es menor a 100");
      }}
            
      if (numeroingresado !=0 )
      {
          if (numeroingresado >0)
          {
          System.out.println("El numero es positivo");
          }
      else
      {
         System.out.println("Es negativo");
      } 
      

//3- Informar si es par. 
        if (numeroingresado /2 ==0 );
        {
            System.out.println("El numero es par");
        }     
      }
    }
}
    


    

      
      
    
    
    

