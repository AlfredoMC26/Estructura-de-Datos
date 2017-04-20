
package Arbol;

public class Nodo {
    Object dato;
    Nodo izquierdo;
    Nodo derecho;
    
    Nodo (Object valor){
        dato = valor;
        izquierdo = null;
        derecho = null;
    }
    
    Nodo(Nodo hijoIzquierdo, Object valor,Nodo hijoDerecho){
        dato = valor;
        izquierdo = hijoIzquierdo;
        derecho = hijoDerecho;
    }
    
    Object valorNodo(){
        return dato;
    }
    
    Nodo subArbolIzquierdo(){
        return izquierdo;
    }
    
    Nodo subArbolDerecho(){
        return derecho;
    }
    
    void nuevoValor(Object valor){
        dato = valor;
    }
    
    void ramaIzquierda(Nodo n){
        izquierdo = n;
    }
    
    void ramaDerecha(Nodo n){
        derecho = n;
    }
}
    
