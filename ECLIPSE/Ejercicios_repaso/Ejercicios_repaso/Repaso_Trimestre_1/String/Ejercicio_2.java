package String;

import java.util.Scanner;

public class Ejercicio_2 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Eliminar los espacios en blanco y convertir a minúsculas
        String fraseSinEspacios = frase.replaceAll(" ", "").toLowerCase();

        // Invertir la frase
        String fraseInvertida = new StringBuilder(fraseSinEspacios).reverse().toString();

        // Comprobar si la frase original y la frase invertida son iguales
        boolean esPalindromo = fraseSinEspacios.equals(fraseInvertida);

        if (esPalindromo) {
            System.out.println("La frase es un palindromo.");
        } else {
            System.out.println("La frase no es un palindromo.");
        }
    }
}


/*
 * Comprobar si una frase introducida por teclado es un palíndromo
 *     Isaac no ronca así
 *     Ana lava lana
 *     Logra Casillas allí sacar gol.
 *     ¿Son robos o sobornos?
 *     Luz azul
 */
