package Recursividad;

public class Ejercicio4 {

    public static void main(String[] args) {
        
    	int numero = 123; // Número para sumar las cifras
        
    	int suma = sumaCifras(numero);
       
    	System.out.println("La suma de las cifras del número " + numero + " es: " + suma);
    }

    public static int sumaCifras(int numero) {
        
    	if (numero < 10) {
            
    		return numero;
        }
    	
    	else {
            
    		return numero % 10 + sumaCifras(numero / 10);
        }
    }
}


/* sumaCifras, suma los valores de los dígitos que tenga un número.
 * Por ejemplo si introducimos 123 saldrá 6
 */