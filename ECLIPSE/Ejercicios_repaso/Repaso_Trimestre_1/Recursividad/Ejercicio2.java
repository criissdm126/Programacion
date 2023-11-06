package Recursividad;

public class Ejercicio2 {

    public static void main(String[] args) {
    	
        String palabra = "Hola"; // Cadena a invertir
        String invertida = invertirCadena(palabra);
        
        System.out.println("Cadena invertida: " + invertida);
    }

    public static String invertirCadena(String cadena) {
       
    	if (cadena.isEmpty()) {
           
    		return cadena;
        }
    	else {
            
    		char primerCaracter = cadena.charAt(0);
           
    		String restoCadena = cadena.substring(1);
            
    		String cadenaInvertida = invertirCadena(restoCadena);
            
    		return cadenaInvertida + primerCaracter;
        }
    }
}


// invierteString , si introduzco como parámetro Hola saldrá aloh