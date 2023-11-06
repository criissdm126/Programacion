package NODO;

public class Prueba {

	public static void main(String[] args) {
		
	
		
		Nodo a = new Nodo();
		a.info = 4;
		System.out.println(a.info);
		
		
		Nodo b = new Nodo();
		b.info = 7;
		
		Nodo c = new Nodo();
		c.info = 6;
		
		a.nodo_siguiente = b;
		b.nodo_siguiente = c;
		
		System.out.println();
		
		//insertarPrimero(4);
		//insertarPrimero(7);
		//insertarUltimo(6);
		
	

	}



}
