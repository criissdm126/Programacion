package Estructutrados;

import java.util.Objects;

public class Pila {
	
	//con el criterio LIFO
	//Última en Entrar, Primera en Salir
	
	public Nodo raiz;
	
	//constructor
	public Pila() {
		raiz = null;
	}
	
	//insertar(int x): inserta en la pila
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		
		if(raiz == null) {
			//nuevo.info = 4;
			raiz = nuevo;
		}
		else {
			//nuevo.info=7;
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}
	
	//sacar (): saca el primer elemento de la pila
	public void sacar(int x) {
		Nodo aux = raiz;
		Nodo anterior = raiz;
		while (aux!=null) {
			if (aux.info == x) {
				anterior.sig= aux.sig;
			}
			anterior = aux;
			
			aux = aux.sig;
			raiz = raiz.sig;
		}
	}
	
	//mostar lista
		public void mostrarLista(int x) {
			Nodo uno = raiz;
		while (uno!=null) {
			System.out.print(uno.info + "->");
			uno = uno.sig;
		}
		System.out.println("");
		}
	
	//cima(): muestra el primer elemento de la pila
	public void cima() {
		
	}
	
	//size(): muestra el tamaño de la pila
	public void size(int x) {
	
	}
	
	//MAIN
	public static void main(String[] args) {
		Pila pila = new Pila();
			
		pila.insertar(7);
		pila.insertar(5);
		pila.mostrarLista(0);
		pila.sacar(7);
			
			
		
		}

}
