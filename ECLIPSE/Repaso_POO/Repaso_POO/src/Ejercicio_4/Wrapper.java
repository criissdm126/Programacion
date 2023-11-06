package Ejercicio_4;

import java.util.*;


public class Wrapper {
	
	public static int getUltimaCifra(int num) {
        String strNum = Integer.toString(num);
        int ultimaCifra = Character.getNumericValue(strNum.charAt(strNum.length() - 1));
        return ultimaCifra * 2;
    }

    public static int leeNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }

}
