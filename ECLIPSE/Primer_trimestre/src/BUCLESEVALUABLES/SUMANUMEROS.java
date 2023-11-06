package BUCLESEVALUABLES;

import java.util.*;

public class SUMANUMEROS {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int operacion = 0;
		
		do {
			System.out.println("Cuando aparezca un cero, sumaremos todos los digitos introducidos hasta ese 0.");
			System.out.println("Introduzca un numero:");
			num = sc.nextInt();
			operacion = operacion + num;
		} while (num !=0);
		System.out.println(operacion);
		
		sc.close();


	}

}
