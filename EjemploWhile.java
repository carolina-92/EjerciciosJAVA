/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
//        EjemploWhile.Mostarmenu();
        
        EjemploWhile.primosdel1al100();
        
    }//finaliza en main
    public static void primosdel1al100 ()
            
        { Integer numeroingresado=1 ;
            while (numeroingresado <101)
            {
                numeroingresado++;
                Integer contador=2 ; //porque 1 es divisible por todos
                Integer contadordedivisores =0 ;
            while (contador < numeroingresado)
            {
                if (numeroingresado%contador==0)
                {
                    contadordedivisores++;
                    break;
                }
                contador ++ ;
            } 
            if (contadordedivisores>0)
            {
//                System.out.println("No es primo");
            }
            else
            {
                    System.out.println("es primo" + numeroingresado);
            }
        }
}
        public static void numeroprimo()
        {
            Integer numeroingresado=357 ;
            Integer contador=2 ; //porque 1 es divisible por todos
            Integer contadordedivisores =0 ;
            while (contador < numeroingresado)
            {
                if (numeroingresado%contador==0)
                {
                    contadordedivisores++;
                    break;
                }
                contador ++ ;
            } 
            if (contadordedivisores>0)
            {
                System.out.println("No es primo");
            }
            else
            {
                    System.out.println("es primo");
            }

        }
    
    public static void contadoresyacumuladores () 
    {
        Integer contador=0 ;
        Integer acumulador=0 ;
        Integer multiplicador=1;
        Integer resta=0 ;
        Integer contadorpares=0;
        Integer contadordiv3=0;
        
        while (contador<10)
        {   
            contador ++;
            System.out.println("numero :" + contador);
            acumulador=acumulador+contador ;
            multiplicador=multiplicador*contador;
            resta=resta-contador;
            if (contador%2==0)
            {
                contadorpares++ ;
            }
            if (contador%3==0)
            {
                contadordiv3++ ;
            }
        }  
        System.out.println("la suma "+acumulador);
        System.out.println("la multiplicador " + multiplicador);
        System.out.println("La resta es " + resta);
        System.out.println("Los pares son " +contadorpares);
        System.out.println("Los divisores de 3 son " + contadordiv3);
       
    
   
    
    /**pide los datos de una persona y valida cada uno
     * Datos a pedir. Nombre, 
     * Edad (entre 1 y 100 años)
     * Sexo(f o m)
     * Estado Civil( Soltero, casado, divorciado. viudo)
     * Nacionalidad (N, L, E , R)
     * Sueldo (Entre 8.000 y 58.000)
     * Dona organos (si o no)
     * Clave no menos de 6 caracteres.
     */
     /*
     */}
        public static void tomardatosvalidados () 
        {
          Scanner Scan = new Scanner (System.in);
          String aux;
          String nombre , nacionalidad , sexo="a" , estadocivil, donador="j", clave ;
          Integer edad , sueldo;
          
            System.out.println("Ingresar nombre");
            nombre = Scan.next();
            
            System.out.println("Ingresar edad");
            aux= Scan.next();
            edad = Integer.parseInt(aux);
            
            while (!(edad > 0 && edad < 101) )
        {
            System.out.println("reingresar edad");
            aux= Scan.next();
            edad = Integer.parseInt(aux);
        }
            System.out.println("Ingresar Sexo");
            sexo = Scan.next();
            while (!(sexo.equals("f") ||  sexo.equals("m")))
        {
            System.out.println("Reingresar sexo");
            sexo = Scan.next();
        }
            System.out.println("Ingresar estado civil");
            estadocivil=Scan.next();
            while (!(estadocivil.equals("s") || estadocivil.equals("c") || estadocivil.equals("v") || estadocivil.equals("d")))
        {
            System.out.println("Reingresar estado civil");
            estadocivil=Scan.next();
        }   
            System.out.println("Ingresar nacionalidad");
            nacionalidad= Scan.next();
            while (!(nacionalidad.equalsIgnoreCase("n")|| nacionalidad.equalsIgnoreCase("l") || nacionalidad.equalsIgnoreCase("e") || nacionalidad.equalsIgnoreCase("r") ) )
        {
            System.out.println("Reingrese nacionalidad");
            nacionalidad= Scan.next();
        }   
            System.out.println("Ingresar sueldo");
            aux= Scan.next();
            sueldo= Integer.parseInt(aux);
            
            while (!(sueldo >=8000 && sueldo <= 58000)) 
        {
            System.out.println("Ingresar sueldo");
            aux= Scan.next();
            sueldo= Integer.parseInt(aux);
        }   
            System.out.println("Dona organos?");
            donador=Scan.next();
            while (!(donador.equalsIgnoreCase("si" )|| donador.equalsIgnoreCase("no")))
        {
            System.out.println("Dona organos?");
            donador=Scan.next();
        }    
            
            
            
            System.out.println("Ingresar clave");
            clave= Scan.next();
            
//            String otroaux = "lalala";
//            Integer resultado= otroaux.length();
//            System.out.println(resultado); otra opcion posible

            while (clave.length()<6) 
        {
           System.out.println("Ingresar clave de mas de 5 digitos");
            clave= Scan.next();  
//        
            
        }} 
                



    public static void PromedioConIf () 
            // TODO code application logic here
     {
         int numerouno;
         int numerodos;
         int promedio;
         String datoaux;
         
         Scanner miscan = new Scanner (System.in);
         System.out.println("Ingrese numero uno ");
         datoaux= miscan.next();
         numerouno=Integer.parseInt(datoaux);
         
         System.out.println("Ingrese numero dos");
         datoaux= miscan.next();
         numerodos=Integer.parseInt(datoaux);
         promedio= (numerouno+numerodos)/2;
         System.out.println("El promedio es "+ promedio);
         } //promedio con if
         
         
    public static void PromedioConwhile ()
    {
            
         int numero;
         int promedio;
         String datoaux;
         Integer contador=0  ;
         Integer suma=0 ;
         
         Scanner miscan = new Scanner (System.in);
         while (contador < 3)
         {
             contador=contador+1;
             System.out.println("Ingrese numero" +contador);
             datoaux= miscan.next();
             numero= Integer.parseInt(datoaux);
             suma=suma+numero;
         }
         promedio=suma/contador ;
          System.out.println("El promedio es "+ promedio);
          
          
     } // Cuando no sabemos la cantidad de iteraciones
    public static void iteracionSinCantidad()
    {
        String continuar= "si" ;
        
        
        while(!continuar.equals("no"))
            
        { System.out.println("hola, desea continuar");
          Scanner scan =new Scanner (System.in);
          continuar= scan.next();
        }
    } public static void SalidaporLogica() 
    {
        String Continuar ="si";
        while (true)
        {
        System.out.println("Hola, desea continuar");
        Scanner scan= new Scanner (System.in);
        Continuar=scan.next();
         if (Continuar.equals("no"));
         {
             break;
         }
    }
    } public static void pedirnumero() 
    {
       Integer numero ;
       Integer contador=0 ;
       String Aux;
       Integer suma= 0;
       
       Scanner scan = new Scanner (System.in);
       
       
       while (contador <10  && suma <50  ) //contador <10  || suma >50  no va a salir porque le falta el if.
       { 
           contador ++;
           System.out.println("Ingrese numero " + contador);
           Aux= scan.next();
           numero= Integer.parseInt(Aux);
           suma= suma + numero;
           
           //while mientras. 
       } 
        System.out.println("La suma es " +suma);
        System.out.println("la cantidad es " + contador);
    } 

    public static void Mostarmenu() 
    {
        String opcion= "nada";
        Scanner scan = new Scanner (System.in);
        while (!opcion.equals("6"))
        {
        
        System.out.println("1- sumar");
        System.out.println("2-restar");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");
        System.out.println("6-salir");
        System.out.println("Ingrese opcion deseada");
        opcion= scan.next();
        switch (opcion)
        {
         case "1":// entre comillas pq es un string y los string llevan comillas doble
         EjemploWhile.sumar();
         break;
         case "2":
         EjemploWhile.restar();
         break;
         case "3":
             EjemploWhile.multiplicar();
             break;
         case "4":
             EjemploWhile.dividir();
             break ;
         case "6":
                 System.out.println("Adios!!");
                 break;
         default:
             System.out.println("Ingreso una opcion equivocada");
            
            
        }
            
        } //de while
        System.out.println("Cerro el menu");
    } public static void sumar ()
    {
        Integer numerouno;
        Integer numerodos;
        String aux;
        Integer resultado;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        aux=scan.next();
        numerouno= Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero");
        aux=scan.next();
        numerodos=Integer.parseInt(aux);
        
        resultado= (numerouno + numerodos);
        System.out.println("El resultado de la sumar es " + resultado);
                
                
    }
    public static void restar ()
    {
        Integer numerouno;
        Integer numerodos;
        String aux;
        Integer resultado;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        aux=scan.next();
        numerouno= Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero");
        aux=scan.next();
        numerodos=Integer.parseInt(aux);
        
        resultado= (numerouno - numerodos);
        System.out.println("El resultado de la resta es " + resultado);
        
}
    public static void multiplicar ()
    {
        Integer numerouno;
        Integer numerodos;
        String aux;
        Integer resultado;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        aux=scan.next();
        numerouno= Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero");
        aux=scan.next();
        numerodos=Integer.parseInt(aux);
        
        resultado= (numerouno * numerodos);
        System.out.println("El resultado de la multiplicacion  es " + resultado);
        
}
    public static void dividir ()
    {
        Integer numerouno;
        Integer numerodos;
        String aux;
        Integer resultado;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        aux=scan.next();
        numerouno= Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero");
        aux=scan.next();
        numerodos=Integer.parseInt(aux);
        
        resultado= (numerouno / numerodos);
        System.out.println("El resultado de la division  es " + resultado);
        
}
}
        
    
    
