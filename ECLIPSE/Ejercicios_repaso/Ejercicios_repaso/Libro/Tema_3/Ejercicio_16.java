package Tema_3;
import java.util.*;

public class Ejercicio_16 {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número n: ");
	        int n = sc.nextInt();

	        // Calcular los valores para cada fila
	        int[] fila = new int[n];
	        fila[0] = 1;
	        for (int i = 1; i < n; i++) {
	            fila[i] = fila[i-1] * (n-i) / i;
	        }

	        // Dibujar el triángulo
	        for (int i = 0; i < n; i++) {
	            // Imprimir los espacios en blanco
	            for (int j = 0; j < n-i-1; j++) {
	                System.out.print(" ");
	            }
	            // Imprimir los números de la fila
	            for (int j = 0; j <= i; j++) {
	                System.out.print(fila[j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}