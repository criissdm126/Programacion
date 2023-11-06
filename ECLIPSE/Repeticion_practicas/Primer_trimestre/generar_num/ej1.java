package generar_num;

import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int suma = 0;
		System.out.println("Cuando ponga un 0, se parara el contador, y se sumarán todos los numeros hasta el momento.");
		
		
		do {
			System.out.println("Escriba un numero: ");
			num = sc.nextInt();
			suma = suma + num;
			
		}
		while(num != 0);
	
		
		System.out.println("La suma total es: " + suma);
		
		sc.close();

	}

}
/* generar los siguientes numeros:
 * 1 1 2 3 5 8 13
 * 
 * numeros fibonacci
 */
