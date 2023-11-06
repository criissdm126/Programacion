package Ejercicio_7;

public class Array_bidimensional {

	public static void main(String[] args) {
		
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.println("Posición [" + i + "][" + j + "]: " + array[i][j]);
		    }
		}


	}

}

// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.