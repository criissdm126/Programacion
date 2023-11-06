package estructuras_de_control;

import java.util.*;

public class Condicional {

	public static void main(String[] args) {
		
		System.out.println("Escriba un numero, puede ser negativo o positivo: ");
		Scanner sc =  new Scanner(System.in);
		
		int  numeroIf = sc.nextInt();

	if(numeroIf < 0) {
		System.out.println("El numero introducido es negativo.");
	}
	else if (numeroIf == 0) {
		System.out.println("El numero introducido es cero.");
	}
	else if (numeroIf > 0) {
		System.out.println("El numero introducido es positivo.");
	}
		sc.close();

	}

}
