package Tema5;

import java.util.Arrays;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		int tabla [] = {2,8,9,11,15};
		System.out.println(Arrays.toString(tabla));
		
		int busca = 9;
		int indice [] = buscarTodos(tabla,busca);
		
		System.out.println("El numero " + busca + " se encuentra en el indice");
		System.out.println(Arrays.toString(indice));
		
		}
	
	static int [] buscarTodos(int t[], int clave) {
		
		int encontradoEn[] = new int[0];
		
		for (int i=0; i<t.length; i++) {
			if(t[i] == clave) {
				encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
				encontradoEn[encontradoEn.length - 1] = i;
		}
	
	}
		return encontradoEn;
	}
}

	


