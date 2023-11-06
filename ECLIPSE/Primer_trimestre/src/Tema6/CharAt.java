package Tema6;

import java.util.Scanner;

public class CharAt {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        java.lang.String a = "hola";
	        java.lang.String b = "aloha";

	        if (a.charAt(3) == b.charAt(3)) {
	            System.out.println("Los caracteres en la posición 3 de las cadenas son iguales");
	        } else {
	            System.out.println("Los caracteres en la posición 3 de las cadenas son distintos");
	        }

	        sc.close();

	    }

}
