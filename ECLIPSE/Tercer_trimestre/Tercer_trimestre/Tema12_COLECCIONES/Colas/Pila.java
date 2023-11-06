package Colas;

import java.util.ArrayDeque;

public class Pila {
    private ArrayDeque<Integer> pila;

    public Pila() {
        pila = new ArrayDeque<>();
    }

    public void insertar(int elemento) {
        pila.push(elemento);
    }

    public int quitar() {
        if (pila.isEmpty()) {
            return -1;
        }
        return pila.pop();
    }

    public boolean vacia() {
        return pila.isEmpty();
    }

    public int numelementos() {
        return pila.size();
    }
}



/*Implementar una clase pila para añadir prendas de ropa para planchar, usando deque y con los siguientes métodos (un LIFO)
 *        insertar: inserta elemento en la pila, no devuelve nada. Como parámetro recibe solo el número a insertar.
 *        quitar: quita elemento de la pila, devuelve -1 si está vacía. No recibe parámetros
 *        vacia: informa si la pila está vacía o no, devuelve booleano. No recibe parámetros
 *        numelementos: dice cuantos elementos hay en la pila. No recibe parámetros
 *        Después implementa un programa que haga uso de esa clase.
 */
