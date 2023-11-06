package Métodos;

public class Ejercicio8_char {

	public static void main(String[] args) {
        
		char digito1 = '1';
        char digito2 = '0';
        char digito3 = '1';
        int decimal = convertirBinarioADecimal(digito1, digito2, digito3);
       
        System.out.println("El número decimal es: " + decimal);
    }

    public static int convertirBinarioADecimal(char digito1, char digito2, char digito3) {
       
    	int decimal = (digito1 - '0') * 4 + (digito2 - '0') * 2 + (digito3 - '0');
        return decimal;
    }
}