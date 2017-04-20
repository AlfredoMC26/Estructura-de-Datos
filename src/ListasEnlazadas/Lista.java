package ListasEnlazadas;

public class Lista {

    Nodo primero;

    public Lista() {
        primero = null;
    }

    public Lista agregarCabezaLista(int valor) {
        Nodo nuevo;
        nuevo = new Nodo(valor);
        nuevo.establecerEnlace(primero);
        primero = nuevo;
        return this;
    }

    public void visualiza() {
        Nodo n;
        int k = 0;

        n = primero;
        while (n != null) {
            System.out.println("Dato:" + n.obtenerDato() + "\tEnlace:" + n.obtenerEnlace());
            n = n.obtenerEnlace();
        }
    }

    public Lista agregarFinal(int entrada) {
        Nodo indice, ultimo;
        indice = primero;
        if (indice != null) {
            while (indice.enlace != null) {
                indice = indice.enlace;
            }

            ultimo = new Nodo(entrada);
            indice.enlace = ultimo;
        }
        return this;
    }

    /*public Lista agregarFinal (Nodo ultimo, int entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
    }*/
    public Nodo buscarLista(int datoDestino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (datoDestino == indice.dato) {
                return indice;
            }
        }
        return null;
    }

    public Lista agregarNodoLista(int dato, int nuevoDato) {
        Nodo nuevo, anterior;

        anterior = buscarLista(dato);
        if (anterior != null) {
            nuevo = new Nodo(nuevoDato);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }

    public void eliminarNodo(int dato) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato == dato);
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

}
