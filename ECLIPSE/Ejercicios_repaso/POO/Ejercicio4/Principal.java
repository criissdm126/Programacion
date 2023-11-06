package Ejercicio4;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        int numero = leeNumero();
        int resultado = getUltimaCifra(numero);
        
        System.out.println(resultado);
    }
    
    
    // Método para leer una cadena de texto por teclado y convertirla en un número
    public static int leeNumero() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        String cadena = scanner.nextLine();
        int numero = Integer.parseInt(cadena);
        
        return numero;
    }
    
    // Método para obtener la última cifra de un número y multiplicarla por 2
    public static int getUltimaCifra(int numero) {
        
        String numeroString = String.valueOf(numero);
        
        char ultimaCifraChar = numeroString.charAt(numeroString.length() - 1);
        
        int ultimaCifra = Integer.parseInt(String.valueOf(ultimaCifraChar));
        
        return ultimaCifra * 2;
    }
}


/* Desarrolla un método leeNumero() para leer una cadena de texto por teclado y  convertir dicha cadena a número.
• Llamar al método getUltimaCifra indicando como parámetro el número que 
devuelva el método anterior. Este método:
a. pasa el número a String y obtiene la última cifra.
b. convierte esa cifra a entero y la multiplica por 2
• Desde el programa main se mostrará por consola el resultado de la operación con la 
siguiente instrucción System.out.println(getUltimaCifra(leeNumero()));
*/