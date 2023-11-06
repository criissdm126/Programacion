package Tema5;

import java.util.Arrays;

public class ComparaArrays {

	public static void main(String[] args) {
		
		int a[] = {3,7};
		int b[] = {3,7};
		
		
		if (Arrays.equals(a, b)) {
			System.out.println("Son iguales");
		}
		else System.out.println("No son iguales");

	}

}
