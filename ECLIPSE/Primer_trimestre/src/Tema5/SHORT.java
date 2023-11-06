package Tema5;

import java.util.Arrays;
public class SHORT {

	public static void main(String[] args) {
		
		
		int elementos []= {15, 5, 9, 11};
		Arrays.sort(elementos);
		
		for (int i=0; i<elementos.length;i++) {
			System.out.println(elementos[i] + "");
		}
		System.out.println("");
		
		for (int i=elementos.length-1; i>=0; i--) {
			System.out.println(elementos[i] + "");
		}

	}

}
