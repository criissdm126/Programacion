package Bucles_anidados;

public class Escalera {

    public static void main(String[] args) {
        
    	int filas = 5;
        
        for (int i = 1; i <= filas; i++) { // columnas
            for (int j = i; j <= filas; j++) { // filas
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/* Pintar escalera
 * 12345 – 2345 – 345 – 45 – 5
 */
