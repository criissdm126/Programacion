package Arrays;

public class Ejercicio6 {
    
	public static void main(String[] args) {
        
		// Crear la primera matriz de tamaño 4x2
        int[][] matriz1 = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
        };

        // Crear la segunda matriz de tamaño 2x4
        int[][] matriz2 = new int[2][4];

        // Transponer la primera matriz en la segunda matriz
        for (int i = 0; i < matriz1.length; i++) {
            
        	for (int j = 0; j < matriz1[0].length; j++) {
                
        		matriz2[j][i] = matriz1[i][j];
            }
        }

        // Mostrar la primera matriz
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);

        // Mostrar la segunda matriz transpuesta
        System.out.println("Matriz 2 (transpuesta de la matriz 1):");
        mostrarMatriz(matriz2);
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
       
    	for (int i = 0; i < matriz.length; i++) {
    		
    		for (int j = 0; j < matriz[0].length; j++) {
                
    			System.out.print(matriz[i][j] + " ");
            }
            
    		System.out.println();
        }
        
    	System.out.println();
    }
}


// Utilizando dos tablas de tamaño 4x2 y 2x4, cargar la primera y transponerla en  la segunda