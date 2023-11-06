package BuclesAnidados;

public class Ejercicio_1 {

    public static void main(String[] args) {
    	
        for (int i = 1; i <= 5; i++) { // Bucle externo para las filas
            
        	for (int j = i; j <= 5; j++) { // Bucle interno para los números de cada fila
                
        		System.out.print(j); // Imprimir el número
            }
            
        	System.out.println(); // Salto de línea después de imprimir una fila
        }
    }
}

/* Pintar escalera
 * 12345 – 2345 – 345 – 45 – 5
 */
