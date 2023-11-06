package Tema5;

import java.util.Arrays;
import java.util.Scanner;

class Actividad_5 {

	public static void main(String[] args) {
		
		int enteros[] = new int [10];

		
		
		for (int i=0; i<enteros.length; i++) {
			enteros[i] = (int)(Math.random()*11);
			Arrays.sort(enteros);
		}
		
	
		
		System.out.println("Los numeros son: " + Arrays.toString(enteros));
		
		
		System.out.println("Escriba un numero, y lo colocaremos en el orden correspondiente:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		enteros = insertaOrdenado (num, enteros);
		System.out.println(Arrays.toString(enteros));

		
		sc.close();
	
	}
	static int [] insertaOrdenado (int x, int c[]) {
		int pos = Arrays.binarySearch(c, x);
		//Si no esta en el Array
		if (pos<0) {
			pos =((pos*-1)-1);
		}
		//Si esta en el Array
		else {
			pos -=1;
		}
		
		c=Arrays.copyOf(c, (c.length + 1));
		c[c.length - 1] =x;
		Arrays.sort(c);
		return c;
	}


}
