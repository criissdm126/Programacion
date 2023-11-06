package String;

public class Ejercicio_1 {

		public static void main(String[] args) {
	        String texto = "Hola Mundo";

	        // Usando substring para obtener una parte del texto
	        String subcadena = texto.substring(5);
	        System.out.println("Substring: " + subcadena);

	        // Usando contains para verificar si una subcadena está presente
	        boolean contiene = texto.contains("Mundo");
	        System.out.println("Contiene 'Mundo': " + contiene);

	        // Usando toUpperCase para convertir el texto a mayúsculas
	        String mayusculas = texto.toUpperCase();
	        System.out.println("Mayúsculas: " + mayusculas);

	        // Usando charAt para obtener un carácter en una posición específica
	        char caracter = texto.charAt(1);
	        System.out.println("Carácter en posición 1: " + caracter);

	        // Usando equalsIgnoreCase para comparar texto ignorando mayúsculas/minúsculas
	        boolean igualIgnorando = texto.equalsIgnoreCase("hola mundo");
	        System.out.println("Igual ignorando mayúsculas/minúsculas: " + igualIgnorando);

	        // Usando equals para comparar texto teniendo en cuenta mayúsculas/minúsculas
	        boolean igual = texto.equals("Hola Mundo");
	        System.out.println("Igual teniendo en cuenta mayúsculas/minúsculas: " + igual);

	        // Usando compareTo para comparar texto lexicográficamente
	        int comparacion = texto.compareTo("Adiós");
	        System.out.println("Comparación con 'Adiós': " + comparacion);
	  }
}



/*
 * Hacer un programa que use la variable String y las siguientes funciones:
 *          substring
 *          contains
 *          toUpperCase
 *          charAt
 *          equalsIgnoreCase
 *          equals
 *          compareTo
 */
