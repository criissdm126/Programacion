package Listas_doblemente_enlazadas;

public class Nodo {
	
    private Object dato;    // Dato almacenado en el nodo
    private Nodo siguiente; // Referencia al siguiente nodo
    private Nodo anterior;  // Referencia al nodo anterior

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}