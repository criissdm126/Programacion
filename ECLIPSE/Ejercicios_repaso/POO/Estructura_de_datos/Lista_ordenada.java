package Estructura_de_datos;

import java.util.NoSuchElementException;

public class Lista_ordenada {
	
	    private Nodo raiz;
	    private int size;

	    public Lista_ordenada() {
	        raiz = null;
	        size = 0;
	    }

	    public boolean esta(int x) {
	        Nodo actual = raiz;
	        while (actual != null) {
	            if (actual.getValor() == x) {
	                return true;
	            } else if (actual.getValor() > x) {
	                break;
	            }
	            actual = actual.getSiguiente();
	        }
	        return false;
	    }

	    public int estaPosicion(int x) {
	        Nodo actual = raiz;
	        int posicion = 0;
	        while (actual != null && actual.getValor() <= x) {
	            if (actual.getValor() == x) {
	                return posicion;
	            }
	            actual = actual.getSiguiente();
	            posicion++;
	        }
	        return -1;
	    }

	    public void insertar(int x) {
	        Nodo nuevoNodo = new Nodo(x);
	        if (raiz == null || raiz.getValor() >= x) {
	            nuevoNodo.setSiguiente(raiz);
	            raiz = nuevoNodo;
	        } else {
	            Nodo actual = raiz;
	            while (actual.getSiguiente() != null && actual.getSiguiente().getValor() < x) {
	                actual = actual.getSiguiente();
	            }
	            nuevoNodo.setSiguiente(actual.getSiguiente());
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
	        Nodo actual = raiz;
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

	    public int size() {
	        return size;
	    }

}
