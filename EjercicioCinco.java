/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * Se necesita pedir dos numeros y sumarlos. mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerouno ;
        int numerodos ;
        int suma ;
        
        Scanner numeroaingresar = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        numerouno = numeroaingresar.nextInt() ;
        System.out.println("Ingrese segundo numero");
        numerodos =numeroaingresar.nextInt();
        suma = numerouno+numerodos ;
        System.out.println("La suma es " + suma );
        
        
      
        
    }
    
}
