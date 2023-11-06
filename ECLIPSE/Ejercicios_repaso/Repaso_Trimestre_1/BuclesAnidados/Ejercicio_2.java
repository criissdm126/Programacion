package BuclesAnidados;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Ingrese el número de letras: ");
        int numeroLetras = scanner.nextInt();

        char letra = 'a';
        for (int i = numeroLetras; i >= 1; i--) { // Bucle externo para las filas
            
        	for (int j = 0; j < i; j++) { // Bucle interno para las letras de cada fila
               
        		System.out.print((char) (letra + j) + " "); // Imprimir la letra
            }
        	
            System.out.println(); // Salto de línea después de imprimir una fila
            
            letra++; // Pasar a la siguiente letra
        }
    }
}


/* Pintar escalera de letras según el número de letras que indique el usuario por  teclado.
 * Por ejemplo la siguiente ejecución sería con letras=4;
 *    d c b a
 *    c b a 
 *    b a
 *    a
 */
