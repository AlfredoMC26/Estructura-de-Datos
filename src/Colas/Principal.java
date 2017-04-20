
package Colas;

public class Principal {

    public static void main(String[] args) {
        Cola c = new Cola();
        
        c.agregar(30);
        c.agregar(5);
        c.agregar(12);
        System.out.println("Valor: "+c.quitar());
        System.out.println("Valor: "+c.quitar());
        c.agregar(45);
        System.out.println("Valor: "+c.quitar());
        System.out.println("Valor: "+c.quitar());    
        System.out.println("Valor: "+c.quitar());
    }
    
}
