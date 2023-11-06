package Estructura_de_datos;

import java.util.NoSuchElementException;

public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int size;

    public Cola() {
        inicio = null;
        fin = null;
        size = 0;
    }

    public void insertar(int x) {
        Nodo nuevoNodo = new Nodo(x);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        size++;
    }

    public int sacar() {
        if (inicio == null) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        int valorInicio = inicio.getValor();
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        size--;
        return valorInicio;
    }

    public int primero() {
        if (inicio == null) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        return inicio.getValor();
    }

    public int ultimo() {
        if (fin == null) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        return fin.getValor();
    }

    public int size() {
        return size;
    }
}

