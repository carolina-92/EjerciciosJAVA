/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Adivinaelnumero {

    /**
     * @param args the command line arguments
     * 
     * Informar si :
     * a- si le erro por un punto (casi casi)
     * b Si le erro por dos puntos (cerca)
     * c- Si le erro por 3 puntos (ni cerca)
     * d - Si le erro por 3 puntos (viene lejos)
     * e-Para todos los demas sos horrible en este juego.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroal;
        int numero ;
        String datoaux;
        
        Scanner miscan = new Scanner (System.in);
        
        System.out.println("Ingresar numero");
        datoaux = miscan.next();
        numero = Integer.parseInt(datoaux);
        
        Random aleatorio = new Random (System.currentTimeMillis());
        // currentTimeMillis se ingresa para que refresque los valores 
        numeroal = aleatorio.nextInt(10);
        //// Producir nuevo int aleatorio entre 0 y 10
        System.out.println("el numero es  " + numeroal );
        
        
        
        if (numero==numeroal)
        {
            System.out.println("Gano");
        }else
        {
            if (numero>numeroal)
            {
            System.out.println("Se paso");
        }
        else
        {
         System.out.println("Le falto");
        }
        }
     // integer mirandom = (int) (Math.random() * 10) + 1 ;(castea(Int)
    //ramdon para que me de un entero y no con decimales- se le multiplica por 10 para que sea del un al 10 y se le suma uno para que vaya cambiando.
    // sout ("numero secreto " + mirandom)
    }
    
    
    
}
    

