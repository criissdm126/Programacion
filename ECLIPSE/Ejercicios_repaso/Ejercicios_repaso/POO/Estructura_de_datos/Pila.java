package Estructura_de_datos;

import java.util.EmptyStackException;

public class Pila {
    private Nodo cima;
    private int size;

    public Pila() {
        cima = null;
        size = 0;
    }

    public void insertar(int x) {
        Nodo nuevoNodo = new Nodo(x);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        size++;
    }

    public int sacar() {
        if (cima == null) {
            throw new EmptyStackException();
        }
        int valorCima = cima.getValor();
        cima = cima.getSiguiente();
        size--;
        return valorCima;
    }

    public int cima() {
        if (cima == null) {
            throw new EmptyStackException();
        }
        return cima.getValor();
    }

    public int size() {
        return size;
    }
}
