package Métodos;

public class Ejercicio2 {

    public static void main(String[] args) {
        
    	String palabra1 = "casa";
        boolean tieneTodasLasVocales1 = cuentaVocales(palabra1);
        System.out.println("La palabra '" + palabra1 + "' tiene todas las vocales: " + tieneTodasLasVocales1);

        String palabra2 = "murciélago";
        boolean tieneTodasLasVocales2 = cuentaVocales(palabra2);
        System.out.println("La palabra '" + palabra2 + "' tiene todas las vocales: " + tieneTodasLasVocales2);
    }

    public static boolean cuentaVocales(String palabra) {
        
    	// Convertir la palabra a minúsculas para comparar
        palabra = palabra.toLowerCase();

        boolean tieneA = false;
        boolean tieneE = false;
        boolean tieneI = false;
        boolean tieneO = false;
        boolean tieneU = false;

        for (int i = 0; i < palabra.length(); i++) {
            
        	char caracter = palabra.charAt(i);
            
        	switch (caracter) {
                
        	case 'a':
                    tieneA = true;
                    break;
                
        	case 'e':
                    tieneE = true;
                    break;
               
        	case 'i':
                    tieneI = true;
                    break;
                
        	case 'o':
                    tieneO = true;
                    break;
                
        	case 'u':
                    tieneU = true;
                    break;
                
        	default:
                   
                	// No hacer nada si el carácter no es una vocal
                    break;
            }
        }

        return tieneA && tieneE && tieneI && tieneO && tieneU;
    }
}


/* Método cuentaVocales, recibirá un String como parámetro.
 * Devolverá true si  contiene las 5 vocales, o false si no tiene las 5.
 * Por ejemplo ejecutándolo con “casa” devolverá false, y ejecutándolo con “murciélago” devuelve true.
 * Cuidado que se pueden introducir vocales en mayúscula.
 */

