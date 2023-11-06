package Estructura_de_datos;

import java.util.NoSuchElementException;

import org.w3c.dom.Node;

public class Lista {
    private Node raiz;
    private int size;

    public Lista() {
        raiz = null;
        size = 0;
    }

    public boolean esta(int x) {
        Node actual = raiz;
        while (actual != null) {
            if (actual.getValor() == x) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int estaPosicion(int x) {
        Node actual = raiz;
        int posicion = 0;
        while (actual != null) {
            if (actual.getValor() == x) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }
        return -1;
    }

    public void insertarPrimero(int x) {
        Nodo nuevoNodo = new Nodo(x);
        nuevoNodo.setSiguiente(raiz);
        raiz = nuevoNodo;
        size++;
    }

    public void insertarUltimo(int x) {
        Nodo nuevoNodo = new Nodo(x);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            Nodo actual = raiz;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        size++;
    }

    public void borrar(int x) {
        if (raiz == null) {
            return;
        }
        if (raiz.getValor() == x) {
            raiz = raiz.getSiguiente();
            size--;
            return;
        }
        Node actual = raiz;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor() == x) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                size--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    public int primero() {
        if (raiz == null) {
            throw new NoSuchElementException("La lista está vacía.");
        }
        return raiz.getValor();
    }

    public int ultimo() {
        if (raiz == null) {
            throw new NoSuchElementException("La lista está vacía.");
        }
        Nodo actual = raiz;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getValor();
    }

    public void borrarPrimero() {
        if (raiz == null) {
            return;
        }
        raiz = raiz.getSiguiente();
        size--;
    }

    public void borrarUltimo() {
        if (raiz == null) {
            return;
        }
        if (raiz.getSiguiente() == null) {
            raiz = null;
        } else {
            Nodo actual = raiz;
            while (actual.getSiguiente().getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
        size--;
    }

    public void insertaPos(int posicion, int x) {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException("La posición está fuera de rango.");
        }
        if (posicion == 0) {
            insertarPrimero(x);
            return;
        }
        Nodo nuevoNodo = new Nodo(x);
        Node actual = raiz;
        for (int i = 0; i < posicion - 1; i++) {
            actual = actual.getSiguiente();
        }
    }    
}
