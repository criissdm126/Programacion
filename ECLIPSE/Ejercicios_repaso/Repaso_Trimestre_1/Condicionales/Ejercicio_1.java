package Condicionales;

import java.util.*;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
        
        if (num1 % 2 == 0 && num2 % 2 == 0) { //en caso de ser ambos pares
            System.out.println("Los dos números son pares");
        }
        
        else if (num1 % 2 != 0 && num2 % 2 != 0) {// en caso de ser ambos impares
            System.out.println("Los dos números son impares");
        }
        
        else { // si uno es par y otro impar
            System.out.println("Los dos números son distintos");
        }
        
        sc.close();
    }
}

/*
 * Ejercicio:
2 variables, num1 y num2
Si num1 y num2 son pares: "Los dos números son pares"
Si num1 y num2 son impares: "Los dos numeros son impares"
Si num1 y num2 son par e impar: "Los dos numeros son distintos"

 */
