package Tema5;

import java.util.Arrays;

public class copyOf {

	public static void main(String[] args) {
		
		int elementos []= {3, 8, 9, 10};
		System.out.println(elementos);
		
		elementos [2] = 21;
		
		elementos = Arrays.copyOf(elementos, 5);
		
		System.out.println(elementos);
		
		System.out.println(Arrays.toString(elementos));
	

	}

}
