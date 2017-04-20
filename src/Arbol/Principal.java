
package Arbol;

public class Principal {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();
        Nodo n1,n2,n3,n4,n5,n6,n7;
        
        n1 = arbol.nuevoArbol(null, "Maria", null);
        n2 = arbol.nuevoArbol(null, "Rodrigo", null);
        n3 = arbol.nuevoArbol(n1, "Esperanza", n2);
        
        n4 = arbol.nuevoArbol(null, "Anyora", null);
        n5 = arbol.nuevoArbol(null, "Abel", null);
        n6 = arbol.nuevoArbol(n4, "M.Jesus", n5);
        
        n7 = arbol.nuevoArbol(n3, "Esperanza", n6);
        
        ArbolBinario arbola = new ArbolBinario(n7);
        
        System.out.println("\t\t\t\t"+n7.dato);
        System.out.println("\t"+n7.izquierdo.dato+"\t\t\t\t\t"+n7.derecho.dato);
        System.out.println(""+n7.izquierdo.izquierdo.dato+"\t\t\t"+n7.izquierdo.derecho.dato+"\t\t\t"+n7.derecho.izquierdo.dato+"\t\t\t"+n7.derecho.derecho.dato);
        //System.out.println("\t"+n7.izquierdo.derecho.dato);
        //System.out.println(""+n7.derecho.izquierdo.dato);
        //System.out.println(""+n7.derecho.derecho.dato);
        
    }
   
}
