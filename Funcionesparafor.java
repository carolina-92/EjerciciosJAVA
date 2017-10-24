/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplefor;

/**
 *
 * @author alumno
 */
public class Funcionesparafor {
    public static void mostrarcaracteresAschii()
    {
     for (int contador=0 ; contador <150; contador++)   
     {
         System.out.println(+contador+"="+(char)contador);
     }
    }
    public static void Patrondeletras()
    {
//        char letra; //(char es caracter) //string "" char ''(una sola comilla)
//        for (letra='A' ;letra<= 'a' ;letra++)
//        {
//            System.out.println(letra);
//        }
//        System.out.println((char)65.567);//se denomina casteo de dato numerico a char
        
        for (int contador =65 ;contador <91;contador++)
        {
            for (int i=65;i<=contador; i++)
            {  
                char letracasteada =(char)i;
                switch(i)
                {
                    case 'A':
                        System.out.print("1");
                        break;
                    case 'E'  :
                           System.out.print("2");
                           break;
                    default:
                           
                   System.out.print((char)i);//para que convierta el numero en letra con char.(i es un numero)
                
                } 
            } 
            System.out.println();
            /*
            metodo 2
            
            /*
            for (int i=65;i<=contador; i++)
            {  
                
                switch(i)
                {
                    case '65':
                        System.out.print("1");
                        break;
                    case '69'  :
                           System.out.print("2");
                           break;
                    default:
                           
                   System.out.print((char)i);//para que convierta el numero en letra con char.(i es un numero)
                
                } 
            } 
            System.out.println();
            */
        }
        
    }
    
    public static void serieUTNFRA ()
            //primer metodo
     {     int resul=0; //(bandera)
    
        for (int numero=1; numero<100; numero++)
        {
            if (numero%3==0 && numero%5==0)
            {
                System.out.println("UTN-FRA");
                resul=1;
            }else
            {
                if(numero%3==0)
                {
                    System.out.println("FRA");
                    resul=1;
                }
            }   if(numero%5==0)
                {
                    System.out.println("UTN");
                    resul=1;
                }
            System.out.println("el numero es" +numero);
            resul=0; //(Para que entre nuevamente al for y empieze con el sig num y resul sea =0)
        }
        /*metodo2
        for (int numero=1; numero<100; numero++)
        {
            if (numero%3==0 && numero%5==0)
            {
                System.out.println("UTN-FRA");
                
            }else
            {
                if(numero%3==0)
                {
                    System.out.println("FRA");
                    
                }
            }   if(numero%5==0)
                {
                    System.out.println("UTN");
                    
                }
            if ( numero%3!==0 && mumero%5!==0)
            {
                 sout("el numero es" + numero)
             }
        }
        metodo 3;
        for (int numero=1; numero<100; numero++)
        {
            if (numero%3==0 && numero%5==0)
            {
                System.out.println("UTN-FRA");
           }     else 
                 {
                   if (numero %3==0)
                   {
                        sout(fra)
                    }else
                    {
                        if (numero&5==0)
                        {
                            sout(unt)
                        }else
                        {
                        }
                            sout(numero)
                    }
                 }
        
        
        */
        
        
                
    }
    public static void mostrartablamultiplicar ()
    {
        int num=5;
        int resul=0;
        for (int i=1 ; i< 11 ;i++)
        {
            resul=num*i;
            System.out.println(+num+"*"+i+"="+resul);
            
        }
    }
    public static void mostrarlacantidadnumeros ()
            
    {
        int num=589652365;
        int digitos=0;
//        int reversa=0;
        
        for (int i=1; num>0; i++)
        {
//        reversa=num%10;//
//        reversa=digitos;//7
          num=num/10;
          digitos++;
          
          
        }  
        System.out.println("tiene " + digitos+ " digitos"); 
           
    }
    public static void palíndromo ()
    {
        int numeroinicial=7557;
        int numero=numeroinicial;
        int reversa;
        String numeroenletras="";
        int numeroconvertido;
        
        for (int i=1 ; numeroinicial>0; i++)
        {
            reversa=numeroinicial%10;//3/5
            numeroenletras=numeroenletras+reversa;
            numeroinicial=numeroinicial/10;
        }
         numeroconvertido=Integer.parseInt(numeroenletras);
        if (numero==numeroconvertido)
        {
            System.out.println("es palindromo");
        }else
        System.out.println("No es palindromo");
    }
         public static void saludar()
    {
        System.out.println("Hola mundo");
    }
    public static void mostrarnumerocreciente ()
    {
        int contador ;
        for (contador=0 ; contador <100 ; contador++)
            System.out.println("El numero es " +contador);
    }
    public static void mostrarnumerodecreciente ()
       
    {
    for (int contador =100 ;contador >0 ; contador --)
        {
            System.out.println("El numero es " +contador);
        }
    }
    public static void mostrarnumerospares ()
    {
        for (int contador=0 ;contador <100 ; contador++)
        {
            if (contador%2==0)
            {
                System.out.println("Numero pares" +contador);
            }
        }
    }
    public static void numerosdivisiblespor6 ()
    {
            for (int contador=6; contador <200;contador++)
            {
                if (contador%6==0)
                {
                    System.out.println("Mostrar divisibles " + contador);
                }
            }
    }
    public static void mostartablarmultiplicar ()
    {
       int numero=9;
       int resultado ;
       for (int contador =1 ;contador< 21; contador++)
       {    
           resultado =numero*contador;
//           System.out.println("Resultado"+ resultado);
             System.out.println(numero + " * " +contador+ "=" +resultado) ;
       }
       
    } 
       public static void numerosamultiplicar()
       {
    int numero=3;
    int resultado ;
    
    for (int contador =1 ;contador<11;contador++)
       {    
           while (numero>0 && numero <21)
               
          {
           resultado =numero*contador; 
           System.out.println(numero + " * " +contador+ "=" +resultado) ;
           break;
          }
           
          }
                    
      
    }
       public static void numerosadividir()
       {
    Double numero =1.00 ;
    Double resultado ;
    
    for (int contador =1 ;contador<11;contador++)
       {    
           while (numero>0 && numero <21)
               
          {
           resultado = (numero %contador) ;
           System.out.println(numero + " * " +contador+ "=" +resultado) ;
           break;
       }
        }
    }
       public static void sabersiesprimo ()
       {
           int numero=7 ;
           int contador ;
           String bandera = "no" ;
           
           for ( contador=2 ; contador < numero ;contador ++)
           {
               if (numero%contador ==0)
               {   bandera ="si";
                   break;
               }
               
           }
           if (bandera.equals("si"))
           {
               System.out.println("No es primo");
           } else
           {
               System.out.println("Es primo");
           }
           
           /*
           int numero=7 ;
           int contador ;
           String bandera = true;
           
           for ( contador=2 ; contador < numero ;contador ++)
           {
               if (numero%contador ==0)
               {   bandera =false ;
                   break;
               }
               
           }
           if (bandera==false)
           {
               System.out.println("No es primo");
           } else
           {
               System.out.println("Es primo");
           */
           
           
//           if (contador ==numero)
//           {
//               System.out.println("Es primo");
//           }else
//               {
//               System.out.println("No es primo");
//           
//                } // una de las formas.
       
//       public static void primosdelunoal100 ()
//       {
//       int numero=1 ;
//       boolean bandera = true ;
//       int contador ;
//       
//       
//       for (contador =2 ; contador <numero ; contador ++ );
//       {
//           while (numero<101) 
//           {
//               
//               if (numero%contador==0) 
//               {
//                   bandera=false ;
//                   break ;
//               } 
//               }
//                   if (bandera =true )
//                   {
//                       System.out.println("Numeros primos " + numero );
//                   }
//               }
//           }
//       } //rehacer
//       
       
       }
       public static void centronumerico ()
             {
           int numero =6 ;
           int sumaanteriores=0 ;
           int sumaposteriores=0;
           boolean escentronumerico=false ;
           
           for (int contador=1 ; contador < numero ; contador ++ )
           {
               sumaanteriores=sumaanteriores+contador ;//porque es uno menos al numero
           }
                 System.out.println(+sumaanteriores);
                 for (int posterior = numero+1 ; ; posterior++ )
                 {
                     sumaposteriores=sumaposteriores+posterior ;
                     if (sumaanteriores==sumaposteriores)
                     {
                    escentronumerico=true;
                     }
                     if (sumaposteriores> sumaanteriores)
                     {
                         break;
                     }
                      if (escentronumerico)
                     {
                         System.out.println("es centro numerico" + numero) ;
                     }
                     else
                     {
                     System.out.println("no es centro numerico");
                      }
                 }
                
                 
       }     
       public static void centronumericodel1al1000 ()
       {
           int numero =0;
           int sumaanteriores=0 ;
           int sumaposteriores=0;
           boolean escentronumerico=false ;
           /*/for (numero =0 ; numero < 1000 ; numero ++)
           //{
           int numero =0;
           int sumaanteriores=0 ;
           int sumaposteriores=0;
           boolean escentronumerico=false ;
           }
          */ 
           while (numero < 1001 )
           {
            numero =0;
            sumaanteriores=0 ;
            sumaposteriores=0;
            escentronumerico=false ;
            
                  }                 
                for (int contador=1 ; contador < numero ; contador ++ )
                {
                    sumaanteriores=sumaanteriores+contador ;//porque es uno menos al numero
                }
                    System.out.println(+sumaanteriores);
                 for (int posterior = numero+1 ; ; posterior++ )
                 {
                    sumaposteriores=sumaposteriores+posterior ;
                     if (sumaanteriores==sumaposteriores)
                     {
                    escentronumerico=true;
                     }
                 if (sumaposteriores> sumaanteriores)
                 {
                     break;
                 }
                 if (escentronumerico)
                 {
                     System.out.println("es centro numerico" + numero) ;
                 }
                 else
                 {
                     System.out.println("no es centro numerico");
                 }
                  numero ++ ;
               }
                                  
        
        
       }
       public static void fibonaccisusecion ()
       {
          int numero=1 ;
          int suma =1 ;
          int anterior=1 ;
          int fibonacci ;
          for  (int contador =1 ;contador <10 ;contador ++ )
          {
              fibonacci = suma +anterior ;
              
              System.out.println("serie" +fibonacci);
          }
       }
       
    }
    

