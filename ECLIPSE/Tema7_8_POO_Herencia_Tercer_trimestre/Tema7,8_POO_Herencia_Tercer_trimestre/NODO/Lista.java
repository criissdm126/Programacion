package NODO;

public class Lista {
	
	public Nodo raiz;
	public Lista() {
		raiz = null;
	}
	
	//insertar en la primera posición
	public  void insertaPrimero (int x) {
		
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		
		if(raiz == null) {
			//nuevo.info = 4;
			raiz = nuevo;
		}
		else {
			//nuevo.info=7;
			nuevo.nodo_siguiente = raiz;
			raiz = nuevo;
		}
		
	}
	
	//insertar en la última posición
	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		Nodo busca = raiz;
		
		while (busca.nodo_siguiente != null) {
			busca = busca.nodo_siguiente;
		}
		
		busca.nodo_siguiente = nuevo;
	}
	
	//mostar lista
	public void mostrarLista(int x) {
		Nodo uno = raiz;
	while (uno!=null) {
		System.out.print(uno.info + "->");
		uno = uno.nodo_siguiente;
	}
	System.out.println("");
	}
	
	//Mirar si está o no un nº en la lista
	//meter un if en el while anterior
	
	/*public boolean comprobarLista(int x) {
		Nodo aux = raiz;
		return  aux.equals(raiz.getClass()) && raiz.equals(aux.getClass());
		while(aux !=null ) {
			if (aux.info == x) {
				num = true;
			}
			else {
				num = false;
			}
		}
	}*/

	
	//método borrar
	public void borrarNumero(int x) {
		Nodo aux = raiz;
		Nodo previo = raiz;
		while (aux!=null) {
			if (aux.info == x) {
				previo.nodo_siguiente = aux.nodo_siguiente;
			}
			previo = aux;
			aux = aux.nodo_siguiente;
			raiz = raiz.nodo_siguiente;
		}
		
	}
	//metodo primero: muestra el valor del primer elemento de la lista (nodo raíz)
	public void primero() {
		Nodo aux = raiz;
		aux.info = raiz.info;
	}
	
	//muestra el valor del último elemento de la lista (que tenga como siguiente null)
	public void ultimo() {
		Nodo aux = raiz;
		Nodo ult = raiz;
		if(aux != null) {
			aux.nodo_siguiente = ult;
		}
		aux = ult;
		ult.nodo_siguiente = raiz;
	}
	//borra el primero
	public void borrarPrimero(int x) {
		Nodo aux = raiz;
		Nodo prim = raiz;
		while (aux != null) {
			if(aux.info == x) {
				prim.nodo_siguiente = aux;
			}
			prim = aux;
			raiz = aux;
		}
	}
	//Borra el último
	public void borrarUltimo(int x) {
		Nodo aux = raiz;
		Nodo previo = raiz;
		while(aux != null) {
			if(aux.info == x) {
				previo.nodo_siguiente = aux.nodo_siguiente;
			}
			
			previo = aux;
			aux = aux.nodo_siguiente;
		}
	}
    //inserta un nodo con el valor x en la posicion dada por parámetro
	public void insertaPos (int posicion, int x){
		Nodo aux = raiz;
		
		while(aux != null) {
			if(posicion == aux) {
				
			}
		}
	}
	//size:tamaño lista
	public void size() {
		
	}
	//boolean esta (int x) : devuelve true si existe un nodo en la lista con ese valor
	public boolean apareceLista(boolean x) {
		
	}
	//int estaPosicion (int x) : devuelve la posición del elemento x en la lista, -1 en caso
	public  int estaPosicion (int x) {
		
	}
	//insertaPos (int posicion, int x): inserta un nodo con el valor x en la posición dada
	public int insertaPos(int posicion, int x) {
		
	}
	
	//MAIN
	public static void main(String[] args) {
		 Lista lista = new Lista();
		
		 lista.insertaPrimero(4);
		 lista.insertaPrimero(7);
		 lista.insertaPrimero(6);
		 
		 
		 lista.borrarNumero(4);
		 //lista.comprobarLista(7);
		lista.primero();
		lista.ultimo();
		 lista.borrarPrimero(6);
		 lista.borrarUltimo(6);
		 lista.mostrarLista(0);
		 System.out.println();
	}

}
