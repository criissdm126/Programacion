package Métodos;

public class Ejercicio8_int {

	public static void main(String[] args) {
        
		int digito1 = 1;
        int digito2 = 0;
        int digito3 = 1;
        int decimal = convertirBinarioADecimal(digito1, digito2, digito3);
        
        System.out.println("El número decimal es: " + decimal);
    }

    public static int convertirBinarioADecimal(int digito1, int digito2, int digito3) {
        
    	int decimal = digito1 * 4 + digito2 * 2 + digito3;
        return decimal;
    }
}