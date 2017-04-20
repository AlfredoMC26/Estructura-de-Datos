package Colas;

public class Cola {

    int tamano = 20;
    int frente;
    int fin;
    int[] listaCola;

    Cola() {
        frente = 0;
        fin = -1;
        listaCola = new int[tamano];
    }

    void agregar(int valor) {
        if (!colaLlena()) {
            listaCola[++fin] = valor;
        } else {
            System.out.println("No se puede agregar, cola llena");
        }

    }

    int quitar() {
        if (!colaVacia()) 
            return listaCola[frente++];
        else return 0;
    }

    boolean colaLlena() {
        return fin == tamano - 1;
    }

    boolean colaVacia() {
        return frente > fin;
    }

}
