package Métodos;

public class Ejercicio8 {

    public static void main(String[] args) {
        
    	boolean digito1 = true;
        boolean digito2 = false;
        boolean digito3 = true;
        int decimal = convertirBinarioADecimal(digito1, digito2, digito3);
        
        System.out.println("El número decimal es: " + decimal);
    }

    public static int convertirBinarioADecimal(boolean digito1, boolean digito2, boolean digito3) {
    	
    	int decimal = (digito1 ? 4 : 0) + (digito2 ? 2 : 0) + (digito3 ? 1 : 0);
        return decimal;
    }
}


/* Generar un programa para pasar de binario a decimal con 3 dígitos.
 * El usuario  elige por teclado que valor le da a cada dígito. 
 * Cada dígito puede tomar el valor 0 ó 1.
 * Mostrar el resultado en decimal dependiendo de los valores introducidos en los  3 dígitos.
 * Hacer el programa con tres variantes:
 *      • Los dígitos tienen que ser de tipo entero
 *      • Los dígitos tienen que ser de tipo booleano
 *      • Los dígitos tienen que ser de tipo carácter.
 */


