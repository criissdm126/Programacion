package Arrays;

public class Marco {

    public static void main(String[] args) {
        
    	int filas = 8;
        int columnas = 6;
        int[][] matriz = new int[filas][columnas];

        // Rellenar el interior de la matriz con 0
        for (int i = 1; i < filas - 1; i++) {
            for (int j = 1; j < columnas - 1; j++) {
                matriz[i][j] = 0;
            }
        }

        // Rellenar los bordes de la matriz con 1
        for (int i = 0; i < filas; i++) {
            matriz[i][0] = 1; // Bordes izquierdos
            matriz[i][columnas - 1] = 1; // Bordes derechos
        }
        for (int j = 0; j < columnas; j++) {
            matriz[0][j] = 1; // Bordes superiores
            matriz[filas - 1][j] = 1; // Bordes inferiores
        }

        // Mostrar la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/* Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 
 * salvo los de los bordes que deben ser 1. Mostrarla.
 */