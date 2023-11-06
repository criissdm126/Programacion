package Listas_doblemente_enlazadas;

public class Principal {

	 public static void main(String[] args) {
	        Lista lista = new Lista();

	        lista.insertar("Dato 1");
	        lista.insertar("Dato 2");
	        lista.insertar("Dato 3");
	        lista.insertar("Dato 4");

	        System.out.println("Contenido de la lista:");
	        imprimirLista(lista);

	        System.out.println();

	        lista.avanzar(2);
	        System.out.println("Avanzar 2 posiciones:");
	        imprimirLista(lista);

	        System.out.println();

	        lista.retroceder(1);
	        System.out.println("Retroceder 1 posicion:");
	        imprimirLista(lista);

	        System.out.println();

	        Object datoExtraido = lista.extraer();
	        System.out.println("Dato extraido: " + datoExtraido);
	        System.out.println("Contenido de la lista despues de extraer:");
	        imprimirLista(lista);
	    }

	    public static void imprimirLista(Lista lista) {
	        Nodo nodoActual = lista.primerNodo();
	        while (nodoActual != null) {
	            System.out.println(nodoActual.getDato());
	            nodoActual = nodoActual.getSiguiente();
	        }
	    }
	}