/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

/**
 *
 * @author alumno
 */
public class FuncionesparaFor {
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
       

                    
       
    
          
       
       