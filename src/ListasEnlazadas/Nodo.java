
package ListasEnlazadas;

public class Nodo {
    int dato;
    Nodo enlace;
    public Nodo(int x){
        dato = x;
        enlace = null;
    }
    
    public int obtenerDato(){
        return dato;
    }
    
    public Nodo obtenerEnlace (){
        return enlace;
    }
    
    public void establecerEnlace (Nodo enlace){
        this.enlace = enlace;
    }
}
