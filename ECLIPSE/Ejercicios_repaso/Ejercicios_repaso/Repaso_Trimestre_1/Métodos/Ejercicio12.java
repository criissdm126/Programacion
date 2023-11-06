package Métodos;

public class Ejercicio12 {

    public static void main(String[] args) {
       
    	int base = 2;
        int exponente = 3;
        
        int resultado = calcularPotencia(base, exponente);
        
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    public static int calcularPotencia(int base, int exponente) {
        
    	if (exponente == 0) {
           
    		return 1;
        }
    	else if (exponente < 0) {
           
    		return 1 / calcularPotencia(base, -exponente);
        }
    	else {
            
    		return base * calcularPotencia(base, exponente - 1);
        }
    }
}


/* Método para calcular una potencia dada para un número dado.
 * No puedes usar  el método Math.pow
 */
