package Ejercicios;
import java.io.*;
import java.util.Scanner;
/*leer numero espera leer un numero por teclado
 * hasta que no se escriba un numero correcto no avanza.
 * cuando tengas el numero correcto lo cargará en la variable numero
 */

public class Buffer {

	public static void main(String[] args) {
		InputStreamReader sc = new InputStreamReader (System.in); 
		BufferedReader br = new BufferedReader (sc);
		//Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print("Introduzca un numero: ");
            try {
                numero = Integer.parseInt(br.readLine());
                numeroValido = false;
            } catch (IOException e) {
                System.out.println("Problema de lectura de datos");
            }
            catch(NumberFormatException n) {
				System.out.println("No es correcto, introduzca un numero entero.");
				numeroValido = true;
			}
        }
        System.out.println("El numero introducido es: " + numero);
    }
}
		/*Scanner scanner = new Scanner(System.in);
        int numero = leerNumero(scanner);
        System.out.println("El numero introducido es: " + numero);
        scanner.close();
		

	}
	
	public static int leerNumero(Scanner scanner) {
        int numero;
        do {
            System.out.print("Introduzca un numero: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Introduzca un numero valido: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);
        return numero;
    }*/

