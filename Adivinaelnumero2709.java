/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero2709;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Adivinaelnumero2709 {

    /**
     * @param args the command line arguments
     * * Informar si :
     * a- si le erro por un punto (casi casi)
     * b Si le erro por dos puntos (cerca)
     * c- Si le erro por 3 puntos (ni cerca)
     * d - Si le erro por 3 puntos (viene lejos)
     * e-Para todos los demas sos horrible en este juego.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerosecreto;
        int numeroingresado ;
        String datoaux;
        int resultado ;
        
        
        Scanner miscan = new Scanner (System.in);
        
        System.out.println("Ingresar numero");
        datoaux = miscan.next();
         numeroingresado= Integer.parseInt(datoaux);
        
        Random aleatorio = new Random (System.currentTimeMillis());
        // currentTimeMillis se ingresa para que refresque los valores 
        numerosecreto = aleatorio.nextInt(10);
        //// Producir nuevo int aleatorio entre 0 y 10
        System.out.println("el numero es  " + numeroingresado );
        
        
        
        if (numeroingresado ==numerosecreto)
        {
            System.out.println("Gano");
        }
        else
        {
        if (numeroingresado>numerosecreto)
        {
        System.out.println("Se paso");
        }
        else
        {
         System.out.println("Le falto");
       resultado= numeroingresado-numerosecreto;
       resultado =Math.abs(resultado);
        switch (resultado)
        {
        case 1: 
        
            System.out.println("Casi casi ");
        break ;
        case 2:
            System.out.println("cerca ");
        break;
        case 3:
            System.out.println("ni cerca");
        break;
        case 4:
            System.out.println("Viene lejos");
        break;
        default:
        System.out.println("Eres horrible en esto");
        }
         
        }
        }
    }
}
    
        
     // integer mirandom = (int) (Math.random() * 10) + 1 ;(castea(Int)
    //ramdon para que me de un entero y no con decimales- se le multiplica por 10 para que sea del un al 10 y se le suma uno para que vaya cambiando.
    // sout ("numero secreto " + mirandom)
    
    
//    } integer aux;
//    } aux = Math.abs (resultado)(Resultado negativo y positivo)
//    0
//    resultado=Math.abs (diferencia); Para hacer la diferencia.
//o hacer case :1
//case -1 :
//para cuando de valor negativo restando el numero ingresado cn el numero secreto.
//switch (resultado)
//        {
//        case 1: 
//        case -1:
//            System.out.println("Casi casi ");
//            
    

