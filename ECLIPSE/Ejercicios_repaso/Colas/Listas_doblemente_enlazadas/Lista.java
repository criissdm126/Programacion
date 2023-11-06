package Listas_doblemente_enlazadas;

public class Lista {
   
	protected Nodo posicion; // Referencia al nodo actual en la lista

    public void avanzar(int posiciones) {
        if (posiciones <= 0) {
            return;
        }

        if (posicion == null) {
            posicion = primerNodo();
        }

        for (int i = 0; i < posiciones && posicion != null; i++) {
            posicion = posicion.getSiguiente();
        }
    }

    public void retroceder(int posiciones) {
        if (posiciones <= 0) {
            return;
        }

        for (int i = 0; i < posiciones && posicion != null; i++) {
            posicion = posicion.getAnterior();
        }
    }

    public void insertar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (posicion == null) {
            posicion = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(posicion.getSiguiente());
            if (posicion.getSiguiente() != null) {
                posicion.getSiguiente().setAnterior(nuevoNodo);
            }
            posicion.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(posicion);
            posicion = nuevoNodo;
        }
    }

    public Object extraer() {
        if (posicion == null) {
            return null;
        }

        Object dato = posicion.getDato();
        Nodo siguienteNodo = posicion.getSiguiente();

        if (posicion.getAnterior() != null) {
            posicion.getAnterior().setSiguiente(siguienteNodo);
        }
        if (siguienteNodo != null) {
            siguienteNodo.setAnterior(posicion.getAnterior());
        }

        posicion = siguienteNodo;
        return dato;
    }

    Nodo primerNodo() {
        Nodo nodo = posicion;
        while (nodo != null && nodo.getAnterior() != null) {
            nodo = nodo.getAnterior();
        }
        return nodo;
    }
}