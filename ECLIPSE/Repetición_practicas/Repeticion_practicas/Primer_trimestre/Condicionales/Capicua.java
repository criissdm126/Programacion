package Condicionales;


import java.util.*;

public class Capicua {

	public static void main(String[] args) {
		
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero de tres cifras, y se le dira si es capicua o no.");
		int num = sc.nextInt();
		
		int primero;
		int segundo;
		int tercero; 
		//int cuarto;
		
		if(num < 100 || num > 999 || num < 0) {
			System.out.println("Numero incorrecto, tiene que ser positivo y de tres cifras.");
		}
		
        else {
			primero = num / 100;
			segundo = (num % 100) / 10;
			tercero = num % 10;
            
            if (primero == tercero && segundo == segundo) {
				System.out.println("El numero " + num + " es capicua.");
			}
			else {
				System.out.println("El numero " + num + " no es capicua.");
			}
		}
        
        sc.close();
	}
}

/*Pedir por teclado un número de tres cifras y decir si es igual o no al revés del número.
 * Por ejemplo 232 es igual.
 */