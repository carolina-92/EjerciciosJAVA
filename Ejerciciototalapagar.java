/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciototalapagar;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciototalapagar {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoaux;
        Integer cantidad ;
        Double precio ;
        Double preciofinal ;
        
        Scanner miscanner = new Scanner (System.in) ;
        System.out.println("Ingrese cantidad del producto");
        datoaux = miscanner.next() ;
        cantidad= Integer.parseInt(datoaux);
        
        //se crea el datoaux para guardar una variable en este caso string
        //luego con parse digo que a esa letra (sea entero o numero) lo convierto
        //en un numero (Dos lo toma como letra)
        
              
        System.out.println("Ingrese precio");
        datoaux= miscanner.next();
        precio=Double.parseDouble(datoaux);
        
        preciofinal= cantidad*precio ;
        System.out.println("Total a pagar es "+ preciofinal);
        
        
    }
    
}
