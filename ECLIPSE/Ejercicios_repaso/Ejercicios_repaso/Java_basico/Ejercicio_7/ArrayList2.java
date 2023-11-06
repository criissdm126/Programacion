package Ejercicio_7;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
		    numeros.add(i);
		}

		for (int i = numeros.size() - 1; i >= 0; i--) {
		    if (numeros.get(i) % 2 == 0) {
		        numeros.remove(i);
		    }
		}

		for (int numero : numeros) {
		    System.out.println(numero);
		}

	}

}
/*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */