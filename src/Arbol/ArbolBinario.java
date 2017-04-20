
package Arbol;

public class ArbolBinario {
    Nodo raiz;
    
    ArbolBinario(){
        raiz = null;
    }
    
    ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }
    
    Nodo raizArbo(){
        return raiz;
    }
    
    boolean estaVacio(){
        return raiz == null;
    }
    
    Nodo nuevoArbol(Nodo hijoIzquierdo, Object valor, Nodo hijoDerecho){
        return new Nodo(hijoIzquierdo,valor,hijoDerecho);
    } 
}
