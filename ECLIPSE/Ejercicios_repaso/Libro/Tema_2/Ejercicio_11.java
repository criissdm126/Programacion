package Tema_2;

import java.util.*;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 9999: ");
		int num = sc.nextInt();
		
		if (num >= 0 && num <= 9) {
			System.out.println("El numero " + num + " es capicua");
		}
		
		else if (num >= 10 && num <= 99) {
		    if(num%10 == num/10){
		    	System.out.println("El numero " + num + " es capicua");
		    }
		    else {
		    	System.out.println("El numero " + num + " no es capicua");
		    }		
		}
		
		else if (num>= 100 && num <= 999) {
		    if(num%10 == num/100){
		    	System.out.println("El numero " + num + " es capicua");
		    }
		    else {
		    	System.out.println("El numero " + num + " no es capicua");
		    }
		}
		
		else if (num>= 1000 && num <= 9999) {
		    if(num%10 == num/1000){
		    	System.out.println("El numero " + num + " es capicua");
		    }
		    else {
		    	System.out.println("El numero " + num + " no es capicua");
		    }
		}
		
		sc.close();

	}

}

/* Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
 * La aplicación tendrá que indicar si el número itroducido es capicúa.
 */
