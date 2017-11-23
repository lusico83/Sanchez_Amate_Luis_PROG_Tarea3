
package tarea3;

public class Posicion {
    
    private int fila;
    private char columna;
    
    //Constructor  
    
    Posicion(int fila, char columna){
    
    if(fila>0&&fila<9){
    this.fila=fila;
    }
    else{
    System.out.println("Fila erronea. Cogeremos por defecto la fila 1.");
    this.fila=1;
    }
    
    if(columna>='a'&&columna<='h'){
    this.columna=columna;
    }
    else{
    System.out.println("Fila erronea. Cogeremos por defecto la fila 1.");
    this.columna='a';
    }
    
    }
    
    
}
