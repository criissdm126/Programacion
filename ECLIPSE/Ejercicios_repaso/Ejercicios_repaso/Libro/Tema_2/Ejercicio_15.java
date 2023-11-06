package Tema_2;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero, que corresponde con la base del triangulo: ");
			double base = sc.nextDouble();
			
			System.out.println("Introduce un numero, que sera la altura del trianfulo: ");
			double altura = sc.nextDouble();
			
			
			if(base <= 0 && altura <=0) {
				System.out.println("Numero incorrecto, no puede ser negativo.");
			}
			else {
				double operacion = base * altura;
				double resultado = operacion/2;
				System.out.println("El area del triangulo es: " + resultado);
			}
			
			sc.close();

	}

}
/*Escribe una app que solicite por consola dos números reales que corresponden a la base y altura del triángulo.
 * Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido
 */
