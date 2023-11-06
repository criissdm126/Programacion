package Condicionales;

import java.util.Scanner;

public class Ejercicio_5 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        double promedio = (num1 + num2) / 2.0;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("El promedio de los números es: " + promedio);

        sc.close();
    }
}


/*
 * Ejercicio:
 * Dados dos números introducidos por pantalla, calcular su suma, la resta y el promedio
 */
