package String;

import java.util.*;

public class Ejercicio_4 {

	 public static void main(String[] args) {
	        
		 
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un email: ");
	        String email = scanner.nextLine();

	        if (esEmailValido(email)) {
	            System.out.println("El email es válido.");
	        } else {
	            System.out.println("El email no es válido.");
	        }
	    }

	    public static boolean esEmailValido(String email) {
	    	
	        // Verificar si el email tiene una sola @ y un solo .
	        if (countOccurrences(email, '@') != 1 || countOccurrences(email, '.') != 1) {
	            return false;
	        }

	        // Obtener el índice de @ y .
	        int atIndex = email.indexOf('@');
	        int dotIndex = email.indexOf('.');

	        // Verificar si el email termina en punto y tiene máximo 3 letras después del último punto
	        if (dotIndex != email.length() - 4 || !esLetra(email.charAt(dotIndex + 1))
	                || !esLetra(email.charAt(dotIndex + 2)) || !esLetra(email.charAt(dotIndex + 3))) {
	            return false;
	        }

	        // Verificar si no hay caracteres especiales antes de @ y después de .
	        for (int i = 0; i < email.length(); i++) {
	            char c = email.charAt(i);
	            if (i < atIndex || (i > dotIndex && i < email.length() - 1)) {
	                if (!esLetra(c) && !esDigito(c) && c != '.' && c != '-' && c != '_') {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public static int countOccurrences(String text, char target) {
	        int count = 0;
	        for (int i = 0; i < text.length(); i++) {
	            if (text.charAt(i) == target) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static boolean esLetra(char c) {
	        return Character.isLetter(c);
	    }

	    public static boolean esDigito(char c) {
	        return Character.isDigit(c);
	    }
	}

/* 
 * Comprobar si un email introducido por teclado es válido o no
 * Para considerar un email válido debe tener una sola @ y un solo . 
 * Variante para comprobar email válido: debe terminar en punto y 3 letras como  máximo que pueden ser es, com o org.
 */

