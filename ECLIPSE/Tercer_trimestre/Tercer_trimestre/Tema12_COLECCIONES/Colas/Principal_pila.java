package Colas;

public class Principal_pila {

	public static void main(String[] args) {
	    Pila pila = new Pila();

	    pila.insertar(5);
	    pila.insertar(10);
	    pila.insertar(15);

	    System.out.println("Hay " + pila.numelementos() + " elementos en la pila.");

	    System.out.println("Se ha quitado el elemento " + pila.quitar() + " de la pila.");

	    System.out.println("La pila esta vacia: " + pila.vacia());
	}
}