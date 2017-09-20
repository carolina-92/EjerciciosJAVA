/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definicion variables
        String nombre ;
        String clave ;
        boolean usuario ;
        String sexo ;
        String localidad ;
        String colorfavorito ;
        
        Scanner miSc= new Scanner (System.in) ;
        
        //Tomo datos.
        System.out.println("Ingresar nombre");
        nombre= miSc.next();
        usuario = nombre.equals("Admin") ;
        
        System.out.println("Ingresar clave");
        clave= miSc.next() ;
        
        System.out.println("Ingrese sexo");
        sexo= miSc.next() ;
        //Ingresa m masculino , f femenino.
        
        System.out.println("Ingrese localidad");
        localidad= miSc.next() ;
        
        System.out.println("Ingrese Color Favorito");
        colorfavorito= miSc.next() ;
        //si es celeste o blanco usted es un patriota.
        
        /**
         * Si el masculino que viva en lanus o avellaneda y que su color favorito seal el rojo
         * mostrar el mensaje sos de independiente
         * 
         * Si el nombre es Andrea, la localidad es moron y el color favorito es verde o azul se coloca el msj
         * Feliz primavera
         */
         if (sexo.equals("m") && colorfavorito.equals("rojo")  && (localidad.equals("lanus") || localidad.equals("avellaneda")))
                
         {
             System.out.println("Sos de independiente");
         }
         
         if (nombre.equals("andrea") && localidad.equals("moron") && (colorfavorito.equals("verde") || colorfavorito.equals("azul")))
         { 
             System.out.println("Feliz primavera");
         }
              
                      
               
        if (usuario)
      //o if (nombre.equals("Admin") para comparar se usa el equals sin crear el boolean 
        {
        System.out.println("Bienvenido Administrador");
        
        } 
        else
        {
            System.out.println("Bienvenido "+ nombre);
        }
          
        if(sexo.equals("f"))
        {
            System.out.println("Feliz dia de la mujer");
        }
        //mujeres y de lanus mostrar bienvenidas.
        
        if (sexo.equals("f") && localidad.equals("lanus") ) 
           // el && es operador and
        {
            System.out.println("bienvenida");
        }
        //otra forma de hacerlo colocando dos if
        // if(sexo.equals("f"))
        //{ if (localidad.equals("lanus") )
        // { sout (Bienvenida) y cierro dos veces llaves
        //El problema que tiene es que si no es de sexo f sigue consultando por localidad
        
        if (colorfavorito.equals("celeste") || colorfavorito.equals("blanco") )
        
        {
            System.out.println("Usted es un patriota");
        }
    }
    
}
