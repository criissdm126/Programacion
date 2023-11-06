package Ejercicio2;

public class Bucles {

    public static void main(String[] args) {
    	
        
        for (int i = 2; i <= 8; i += 2) {// Bucle para controlar las filas
            
            for (int j = 1; j <= 4; j++) {// Bucle para controlar las columnas
                System.out.print(i); // Imprime el número de la fila
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}


/* Diseña un programa que pinte por pantalla lo siguiente.
 * Utiliza bucles anidados.
 *        2222
 *        4444
 *        6666
 *        8888
 */