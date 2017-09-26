/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ferreteria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double ancho ;
        Double largo ;
        Double superficie ;
        Double superficie1 ;
        String datoaux ;
        Double cantidadhilos ;
        Double cuenta;
        Integer Material ;
        Double cal ;
        Double cemento ;
        Double temperatura ;
        String unidad ;
        Boolean medida ;
        Double f ;
        Double c;
        String tipodepileta ;
        Double radio ;
        
        Scanner miscan = new Scanner (System.in) ;
        System.out.println("Solicitar ancho del terreno");
        datoaux = miscan.next();
        ancho= Double.parseDouble(datoaux);
        
        System.out.println("Ingresar Largo del terreno ");
        datoaux = miscan.next();
        largo= Double.parseDouble(datoaux);
        superficie1 = (ancho*largo) *3 ;
        System.out.println("Necesita " +superficie1 +"de metros de alambre");
        
        System.out.println("Informar cantidad de hilos de alambre");
        datoaux = miscan.next() ;
        cantidadhilos = Double.parseDouble(datoaux);
        cuenta = cantidadhilos *(largo *ancho );
                                        
        System.out.println("La cantidad de metros que necesita es "  +  cuenta);
           
            
        
//        //Si la cuenta es por una sola vuelta es superficie en vez de superficie1.
//        
//        if ( cuenta >0.1 )
//        {
//        System.out.println("Le falta "+ cuenta + " metros para completar la vuelta de alambre");
//        }else
//           
//        {
//        System.out.println(" No le faltan metros de cable");
    
//        }       
        superficie =ancho * largo ;
        cal = 2 * superficie ;
        cemento= 3* superficie  ;
        System.out.println("La cantidad de bolsas de cal que necesita es " + cal + " y la cantidad de bolsas de cemento que necesita es " + cemento);
        //Con lo que se ingreso anteriormente 
        
        System.out.println("Ingresar temperatura");
        datoaux = miscan.next() ;
        temperatura = Double.parseDouble(datoaux) ;
        
        System.out.println("Indique si quiere pasarlo a Celcius o Fahrenheit");
        unidad=miscan.next();
        medida = unidad.equals("celcius");
        

        if (medida)
        {     
        c=(temperatura-32)* 9/5 ;
        System.out.println("La temperatura en Celcius es " + c);
        }
        else
        {
        if (unidad.equals("fahrenheit"))
        { f= (9/5 * temperatura) +32 ;
        System.out.println("La temperatura en Fahrenheit es "+ f);
        } else
        { 
         System.out.println("Coloco una unidad de medida erronea");
        }
                
        }
        
        System.out.println("Solicitar el tipo de pileta");
        tipodepileta= miscan.next();
        
        if (tipodepileta.equals("redonda"))
        {
        System.out.println("Ingresar el radio");
        datoaux= miscan.next();
        radio= Double.parseDouble(datoaux);
        superficie = 3.14 * (radio *radio);
        System.out.println("La superficie de la pileta es " +superficie );
        } else 
        { if (tipodepileta.equals("cuadrada"))
        System.out.println("ingresar ancho");
        datoaux = miscan.next();
        ancho= Double.parseDouble(datoaux);
        
        System.out.println("Ingresar largo");
        datoaux = miscan.next();
        largo= Double.parseDouble(datoaux);
        superficie =largo*ancho;
        System.out.println("La superficie de la pileta es " + superficie);
              
        
        }
        
    }
}

    
    

