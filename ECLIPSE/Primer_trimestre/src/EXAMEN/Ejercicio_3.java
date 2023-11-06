package EXAMEN;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Cuando introduzca un numero negativo o mayor a 99, el proceso se dentendra.Pon un numero:");
			num =sc.nextInt();
			System.out.println(numeroEntero(num));
		} while(numeroEntero(num)>0);
		
		sc.close();

	}
	
	static int numeroEntero (int num) {
	int result =0;
	if (num>=0 && num<=99) {
		if (num < 9) {
			result = 1;
		}
		else if (num>9 && num<899) {
			result=2;
		}
		else {
			result=-1;
		}
	}
	return result;
}
}
