/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorceaula;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciocatorceaula {

    /**
     * @param args the command line arguments
     * Se pide ingresar una clave, si es "utn750" se mostrara el mensaje bienvenido, de lo contrario mensaje clave
     * erronea.
     * 
     * 15- Se inmgresa un importe si supera los 100 $ se le suma un 23% si es menor a 100$ se le descuenta el 50%
     * 16-Se ingresa el importe de un pasaje de avion y el mes de viaje,Si es enero se le descuenta un 10% por temporada baja
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave ;
        boolean respuesta;
        Scanner miscan = new Scanner (System.in);
        System.out.println("Ingresar clave");
        clave=miscan.next();
        
        respuesta = clave.equals("utn750");
        
        if (respuesta)
        {
            System.out.println("Bienvenidos");
        }
        
           else 
        {
            System.out.println("Clave erronea"); 
        }
        
    } 
}
