/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopromedio;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciopromedio {

    /**
     * @param args the command line arguments
     *  Se piden tres números e informar el promedio
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoaux ;
        Double numerouno ;
        Double numerodos;
        Double numerotres ;
        Double promedio ;
        
        Scanner miscan = new Scanner (System.in) ;
        System.out.println("Ingrese primer numero");
        datoaux = miscan.next() ;
        numerouno=Double.parseDouble(datoaux);
        //Con parse se ingresa una letra y se convierte en numero
        //ya que next es para string y al ingresar el 2 lo toma como letra pero
        //lo convierte en numero con parse
        
        
        System.out.println("Ingrese segundo numero");
        datoaux = miscan.next() ;
        numerodos=Double.parseDouble(datoaux);
        
        System.out.println("Ingrese tercer numero");
        datoaux = miscan.next() ;
        numerotres=Double.parseDouble(datoaux);
        
        promedio = (numerouno+numerodos+numerotres)/3 ;
        System.out.println("El promedio es " +promedio);
        
        
        
        
        
    }
    
}
