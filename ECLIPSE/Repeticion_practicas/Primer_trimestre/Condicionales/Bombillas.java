package Condicionales;

import java.util.Scanner;

public class Bombillas {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Si la suma de los digitos de ambos numeros es menor a 3, se enciende b1, si es 3 o mas, se enciende b3.");
	    System.out.println("Ingrese dos numeros:"); //SE PREGUNTAN LOS NÚMEROS

	    boolean b1 = false;
	    boolean b3 = false;
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    
	    int digits1 = 0;
	    int digits2 = 0;
	    
	    // contar la cantidad de dígitos de cada número
	    while (num1 > 0) {
	        digits1 += num1 % 10;
	        num1 /= 10;
	    }
	    while (num2 > 0) {
	        digits2 += num2 % 10;
	        num2 /= 10;
	    }

	    int sumDigits = digits1 + digits2;
	    
	    if (sumDigits > 3){ // si la suma de dígitos es mayor a 3
	        b1 = false; // se apaga b1
	        b3 = true; // se enciende b3
	    }
	    else { // si la suma de dígitos es menor o igual a 3
	        b1 = true; // se enciende b1
	        b3 = false; // se apaga b3
	    }
	    

	    System.out.println("Bombilla b1: " + b1);
	    System.out.println("Bombilla b3: " + b3);
	    
	    sc.close();
	}
}

/*Hay 2 bombillas apagadas (b1 y b2). Introducir por teclado 2 números.
 * Si sumando los dígitos de los 2 números el número de dígitos es mayor a 3, se enciende b1, sino se enciende b2. b1 y b2 tienen que ser variables booleanas, mostrar en el programa el estado final de las bombillas.
 * Por ejemplo, si los números son 76 y 123, son 5 dígitos y por eso se encendería b1
 */