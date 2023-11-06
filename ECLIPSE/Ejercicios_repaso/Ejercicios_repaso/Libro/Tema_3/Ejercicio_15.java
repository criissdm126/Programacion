package Tema_3;

import java.util.*;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas del triángulo de Pascal: ");
        int numRows = sc.nextInt();
        
        // Creamos una matriz para almacenar los valores
        int[][] pascal = new int[numRows][numRows];
        
        // Calculamos los valores del triángulo de Pascal
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }
        
        // Imprimimos el triángulo de Pascal
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
/*
Diseña una aplicación que dibuje el triángulo de Pascal, para n filas.
Numerando las filas y elementos desde 0, la fórmula para obtener el m - ésimo elemento de la n-ésima fila es:
E(n,m) = n! / m! (n-m)!
Donde n! es el factorial n*/