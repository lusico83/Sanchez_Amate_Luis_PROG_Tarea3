
package tarea3;

import utilidades.Entrada;

public class Tarea3 {


    public static void main(String[] args) {

       int opcion, nueva_fila;
       char opcion_columna,nueva_columna;
       Rey ficha=new Rey();
   
       
       do{
       System.out.println("Introduce el color del rey que vas a manejar(1-BLANCO o 2-NEGRO:");
       opcion=Entrada.entero();
       }while(opcion<1||opcion>2);
       
       if (opcion==1){
           ficha.setColor(Color.BLANCO);
           ficha.setPosicionFila(1);
           ficha.setPosicionColumna('e');
       }else{
           ficha.setColor(Color.NEGRO);
           ficha.setPosicionFila(8);
           ficha.setPosicionColumna('e');
       }
       

       do{
       System.out.println("Introduce ahora que vas a hacer:/n1 para mover/n2 para mostrar la posicion actual/n3 para salir/nElige:");
       opcion=Entrada.entero();
       }while(opcion<1||opcion>2);    
       
        if (opcion==1){
               do{
                    System.out.println("Introduce ahora a que fila mueves(1 a 9):");
                    nueva_fila=Entrada.entero();
               }while(nueva_fila<1||opcion>9); 
               
               do{
                    System.out.println("Introduce ahora a que columna lo mueves(a a h):");
                    nueva_columna=Entrada.caracter();
               }while(nueva_columna<'a'||opcion>'h');    
       
                ficha.mueve(nueva_fila, nueva_columna);
       
       }else{
            
            if (opcion==2){
                System.out.println(ficha.toString());
            }
            else{
                System.exit(0);
            }
            }

            
            
       }
       
       
       
 
       
        
    }
    

