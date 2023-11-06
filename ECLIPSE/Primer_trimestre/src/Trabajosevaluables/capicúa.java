package Trabajosevaluables;

import java.util.Scanner;


public class capicúa {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un numero de tres cifras:");
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int primero;
		int segundo;
		int tercero; 
		int cuarto;
		
		
		if (num <10) {
			System.out.println("No puede ser capicua");
		}
		else if (num<100){
			primero = num/100;
			segundo=num%10;
			if (primero == segundo) {
				System.out.println("Es capicua");
			}
			else {
				System.out.println("No es capicua");
			}
		}
		
		
		else if (num<1000) {
			tercero = num%10;
			primero = num/100;
			if (primero==tercero) {
				System.out.println("Es capicua");
			}
			else {
				System.out.println("No es capicua");
			}
		}
		
		else if (num < 1000) {
			cuarto = num%10;
			tercero =(num/10)%10;
			segundo = (num/100)%10;
			primero =(num/1000);
			if (primero==cuarto  && segundo == tercero) {
				System.out.println("Es capicua");
			}
			else {
				System.out.println("No es capicua");
			}
		}
		
		
		sc.close();
	}

}
