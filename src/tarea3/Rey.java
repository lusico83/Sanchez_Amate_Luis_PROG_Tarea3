
package tarea3;

public class Rey {
    
    private Color color_rey;
    private Posicion posicion_rey;
    

    Rey(){
    
    color_rey=Color.BLANCO;
    posicion_rey.fila=1;
    posicion_rey.columna='e';
        
        }
    
    public void setColor(Color color_rey){
        this.color_rey=color_rey;
    }
    
    public void setPosicionFila(int fila){
        this.posicion_rey.fila=fila;
    }
    
    public void setPosicionColumna(char columna){
        this.posicion_rey.columna=columna;
    }
    
    public Color getColor(){
    return color_rey;
    }
    
    public int getPosicionFila(){
    return posicion_rey.fila;
    }
    
    public int getPosicionColumna(){
    return posicion_rey.columna;
    }
    
    public String toString (){
        
        String mensaje="El rey color "+color_rey+" esta en la fila "+posicion_rey.fila+" y columna "+posicion_rey.columna+".";
        
        return mensaje;
        
    }

}
    
    
    
            
            
    
    
    
    
    
    
   
