package Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        
    	int[][] matriz = {
           
    			{1, 2, 3, 4},
            
    			{5, 6, 7, 8},
           
    			{9, 10, 11, 12}
        };

        System.out.println("Imprimir primera fila:");
        imprimirPrimeraFila(matriz);

        System.out.println("\nImprimir última fila:");
        imprimirUltimaFila(matriz);

        System.out.println("\nImprimir primera columna:");
        imprimirPrimeraColumna(matriz);

        System.out.println("\nImprimir primera fila, última fila y primera columna:");
        imprimirPrimeraUltimaFilaYPrimeraColumna(matriz);
    }

    public static void imprimirPrimeraFila(int[][] matriz) {
        
    	for (int j = 0; j < matriz[0].length; j++) {
            
        	System.out.print(matriz[0][j] + " ");
        }
        
    	System.out.println();
    }

    public static void imprimirUltimaFila(int[][] matriz) {
        
    	int ultimaFila = matriz.length - 1;
       
    	for (int j = 0; j < matriz[ultimaFila].length; j++) {
            
    		System.out.print(matriz[ultimaFila][j] + " ");
        }
        
    	System.out.println();
    }

    public static void imprimirPrimeraColumna(int[][] matriz) {
        
    	for (int i = 0; i < matriz.length; i++) {
            
    		System.out.println(matriz[i][0]);
        }
    }

    public static void imprimirPrimeraUltimaFilaYPrimeraColumna(int[][] matriz) {
        
    	imprimirPrimeraFila(matriz);
        
    	imprimirUltimaFila(matriz);
        
    	imprimirPrimeraColumna(matriz);
    }
}


/* Crear y cargar una matriz de 3 filas por 4 columnas. 
 * Hacer:
 *     - Método que imprima la primera fila
 *     - Método que imprima la última fila
 *     - Método que imprima la primera columna
 *     - Método que imprima la primera fila, la última fila y la primera columna
 */
