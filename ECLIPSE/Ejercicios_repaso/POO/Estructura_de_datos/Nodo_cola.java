package Estructura_de_datos;

public class Nodo_cola {


	    private int valor;
	    private Nodo siguiente;

	    public Nodo_cola (int valor) {
	        this.valor = valor;
	        siguiente = null;
	    }

	    public int getValor() {
	        return valor;
	    }

	    public Nodo getSiguiente() {
	        return siguiente;
	    }

	    public void setSiguiente(Nodo siguiente) {
	        this.siguiente = siguiente;
	    }
	
}
