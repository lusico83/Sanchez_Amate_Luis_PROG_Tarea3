
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
    
    
    //Metodo Set para definir la fila, controlando que este en una fila valida
    public void setFila(int fila){
        
        if(fila>0&&fila<9){
        this.fila=fila;
    }
    else{
        System.out.println("Fila erronea. Cogeremos por defecto la fila 1.");
        this.fila=1;
    }
    
    }
    //Metodo Set para definir la columna, controlando que este en una columna valida
    public void setColumna(char columna){
        
        if(columna>='a'&&columna<='h'){
        this.columna=columna;
    }
    else{
        System.out.println("Fila erronea. Cogeremos por defecto la fila 1.");
        this.columna='a';
    } 
    
    }
    //Metodo Get que nos decuelve la fila
    public int getFila(){
        
        return fila;
        
    }
    //Metodo Get que nos decuelve la columna
    public char getColumna(){
        
        return columna;
        
    }
    //Metodo toString que nos devuelve un mensaje con la posicion de la ficha
    public String toString (){
        
        String mensaje="La posicion de es fila "+fila+" y columna "+columna+".";
        
        return mensaje;
        
    }
    
    
    
    
    
    
}
