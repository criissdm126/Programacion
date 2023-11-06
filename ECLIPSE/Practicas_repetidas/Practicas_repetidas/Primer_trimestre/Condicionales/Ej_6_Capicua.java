package Condicionales;


import java.util.*;

public class Ej_6_Capicua {

	public static void main(String[] args) {
		
        
        Scanner sc = new Scanner(System.in);
        
        //se pide el numero
        System.out.println("Escribe un numero de tres cifras, y se le dira si es capicua o no.");
		int num = sc.nextInt();
		
		int primero;
		int segundo;
		int tercero; 
		
		//si tiene menos o más de 3 digitos y en caso de ser negativo
		if(num < 100 || num > 999 || num < 0) {
			System.out.println("Numero incorrecto, tiene que ser positivo y de tres cifras.");
		}
		
		// en caso contrario se dice si es capicúa o no
        else {
			primero = num / 100; // primer dígito
			segundo = (num % 100) / 10; // segundo dígito
			tercero = num % 10; // tercer dígito
            
            if (primero == tercero && segundo == segundo) { // se comparan si primer y tercer dígito son iguales, y si el segundo es igual a segundo
				System.out.println("El numero " + num + " es capicua.");
			}
			else { // en caso de que el primer y tercer dígito son distintos
				System.out.println("El numero " + num + " no es capicua.");
			}
		}
        
        sc.close();
	}
}

/*Pedir por teclado un número de tres cifras y decir si es igual o no al revés del número.
 * Por ejemplo 232 es igual.
 */