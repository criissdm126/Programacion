package Recursividad;

public class Ejercicio5 {

    public static void main(String[] args) {
        
    	int base = 3; // Base de la potencia
       
    	int exponente = 4; // Exponente de la potencia
        
    	int resultado = potencia(base, exponente);
        
    	System.out.println(base + " elevado a " + exponente + " es igual a: " + resultado);
    }

    public static int potencia(int base, int exponente) {
       
    	if (exponente == 0) {
            
    		return 1;
        }
    	
    	else {
            
    		return base * potencia(base, exponente - 1);
        }
    }
}

/*potencia de un numero.
 * Tendrá dos parámetros, la base y el exponente.
 * Por ejemplo si ejecutamos potencia (3,4) hará 3 elevado a 4 de forma recursiva
 */
