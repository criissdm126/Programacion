package Arrays;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (número de filas y columnas): ");
        int x = scanner.nextInt();

        int[][] matriz = new int[x][x];

        // Cargar la matriz con valores
        for (int i = 0; i < matriz.length; i++) {
            
        	for (int j = 0; j < matriz[i].length; j++) {
                
        		if (i == j) {
                    
        			matriz[i][j] = 'X';
                }
        		
        		else {
                    
        			matriz[i][j] = '-';
                }
            }
        }

        // Imprimir la diagonal principal
        System.out.println("Diagonal principal:");
       
        for (int i = 0; i < matriz.length; i++) {
            
        	for (int j = 0; j < matriz[i].length; j++) {
                
        		System.out.print(matriz[i][j] + " ");
            }
            
        	System.out.println();
        }
    }
}


/*  Crear y cargar una matriz con x filas y x columnas. Imprimir la diagonal principal
 * Por ejemplo con una 4x4 se vería lo siguiente:
 *   X - - -
 *   - X- -
 *   - - X-
 *   - - - X
 */
