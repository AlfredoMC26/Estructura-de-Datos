
package ListasEnlazadas;

public class Principal {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.agregarCabezaLista(20);
        l.agregarCabezaLista(15);
        l.agregarCabezaLista(30);
        System.out.println("Elementos de la lista");
        l.visualiza();
        
        l.agregarNodoLista(15, 50);
        System.out.println("Elementos de la lista");
        l.visualiza();
        
        l.agregarFinal(18);
        System.out.println("Elementos de la lista");
        l.visualiza();
        
        l.eliminarNodo(15);
        System.out.println("Elementos de la lista");
        l.visualiza();
    }
}
