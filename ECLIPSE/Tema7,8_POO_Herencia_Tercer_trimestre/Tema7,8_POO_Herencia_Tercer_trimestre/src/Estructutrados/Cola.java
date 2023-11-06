package Estructutrados;

public class Cola {
	
	//con el criterio FIFO
	//por el cual la última unidad de carga en entrar al almacén será la primera en salir del mismo
	
	public Nodo raiz;
	
	//constructor
	public Cola() {
		raiz = null;
	}
	
	//insertar(int x): inserta el elemento x al final de la cola
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
	
	public void insertaPos(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		Nodo busca = raiz;
		
		while (busca.sig != null) {
			busca = busca.sig;
		}
		
		busca.sig = nuevo;
	}
	
	// sacar (): saca el primer elemento de la cola
	public void sacar(int x) {
		Nodo aux = raiz;
		Nodo anterior = raiz;
		
		while(aux != null) {
			if (aux.info == x) {
				anterior.sig = aux.sig;
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
	
	//primero(): muestra el primer elemento de la cola
	public void primero(int x) {
		Nodo num = new Nodo();
		num.info = x;
		Nodo busca = raiz;
		
		
		while(busca.sig != null) {
			busca = busca.sig;
		}
		
		busca.sig = num;
	
		
	}
	
	//ultimo(): muestra el ultimo elemento de la cola
	public void ultimo(int x) {
		
	}
	
	//size(): muestra el tamaño de la cola
	public void size() {
		
	}
	
	//MAIN
		public static void main(String[] args) {
			
			Cola cola = new Cola();
			
			cola.insertar(5);
			cola.insertar(7);
			cola.insertaPos(8);
			
			cola.sacar(5);
			
			cola.primero(0);
			cola.mostrarLista(0);
		}

}
