/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria.ferrete;

import java.util.Scanner;

/**
 *
 * @author ext83235
 */
public class FerreteriaFerrete {

    /**
     * @param args the command line arguments
     * Debemos hacer una serie de aplicaciones para este negocio
	23- Debemos pedir el ancho y el largo de un terreno e informar cuantos metros de alambre necesitamos para dar tres (3) vueltas de alambre.
	24- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos de alambre e informar cuantos metros de alambre necesitamos para completar las vueltas de alambre.
	25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada material que necesito.
	26- Se pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit, hacer la cuenta y mostrar el resultado.
	27- para una pileta se necesita saber la superficie, se debe pedir que tipo de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si es cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double ancho ;
        Double largo ;
        Double superficie ;
        Double superficie1 ;
        String datoaux ;
        Double alambre ;
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
        alambre = Double.parseDouble(datoaux);
        cuenta = superficie1 - alambre;
        
        //Si la cuenta es por una sola vuelta es superficie en vez de superficie1.
        
        if ( cuenta > 0.1 )
        {
        System.out.println("Le falta "+ cuenta + " metros para completar la vuelta de alambre");
        }else
           
        {
        System.out.println(" No le faltan metros de cable");
    
        }       
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
        

        if (unidad.equals("celcius"))
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

