package Pilas;

public class Principal {

    public static void main(String[] args) {
        Pila p = new Pila();
        Pila p2 = new Pila(3);

        System.out.println("llenando pila 2");
        for (int i = 0; i < p2.getTama(); i++) {
            p2.push(i * 2);
        }

        System.out.println("imprimiendo pila 2");
        for (int i = 0; i < p2.getTama(); i++) {
            System.out.println("borrando " + p2.pop());
        }
        System.out.println("");

        p2.pop();
        p2.cima_value_pila();
    }
}
