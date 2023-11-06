package Tema5;

import java.util.Arrays;

public class Arrays_3x3 {

	public static void main(String[] args) {
		
		int tabla [][] = {{6,8,2}, {2,6,10},{7,2,3}};
		System.out.println (Arrays.deepToString (tabla));
		System.out.println();
		
		pintarMatriz (tabla);
		System.out.println();
		

	}
     static void pintarMatriz (int a[][]) {
		
		for(int fila=0; fila<=a.length; fila++) {
			for (int columna=0; columna<=a[fila].length; columna++) {
				System.out.println(a[fila][columna]);
			}
			System.out.println();
			
		}
     }

}
