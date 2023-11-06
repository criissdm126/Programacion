package Ejercicio_1;

import java.util.*;

public class Ejercicio {
   
	public static void main(String[] args) {
        int numero = leeNumero();
        int ultimaCifraDoble = getUltimaCifra(numero) * 2;
        System.out.println("La última cifra doble es: " + ultimaCifraDoble);
    }


/*Desde el programa main se mostrará por consola el resultado de la operación con la siguiente instrucción:
System.our.println(getUltimaCifra(leeNumero())); */
	
	/*Desarrolla un método leeNumero() para leer una cadena de texto por teclado y convertir dicha cadena a número.
	
	Llamar al método getUltimaCifra indicando como parámetro el número que devuelva el método anterior. Este método:
	 
	 	Pasa el número a String y obtiene la última cifra.
		
		Convierte esa cifra a entero y la multiplica por 2*/


	 public static int leeNumero() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        String numeroStr = scanner.nextLine();
	        int numero = Integer.parseInt(numeroStr);
	        return numero;
	    }

	    public static int getUltimaCifra(int numero) {
	        String numeroStr = Integer.toString(numero);
	        char ultimaCifraChar = numeroStr.charAt(numeroStr.length() - 1);
	        int ultimaCifra = Character.getNumericValue(ultimaCifraChar);
	        return ultimaCifra;
	    }
	}