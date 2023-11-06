package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		System.out.print("Ingresa un numero: ");
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2;
		int num3;
		String uno = "";
		String dos = "";
		String tres = "";
		num3 = num1 / 10;
		num2 = (num1 % 10) / 1;
		if (num2 == 1) {
		uno = "uno";
		}
		else if (num2 == 2) {
		uno = "dos";
		}
		else if (num2 == 3) {
		uno = "tres";
		}
		else if (num2 == 4) {
		uno = "cuatro";
		}
		else if (num2 == 5) {
		uno = "cinco";
		}
		else if (num2 == 6) {
		uno = "seis";
		}
		else if (num2 == 7) {
		uno = "siete";
		}
		else if (num2== 8) {
		uno = "ocho";
		}
		else if (num2 == 9) {
		uno = "nueve";
		}
		if (num3 == 1 && num2 == 0) {
		dos = "diez";
		}
		else if (num3 == 1 && num2 == 1) {
		dos = "once";
		}
		else if (num3 == 1 && num2 == 2) {
		dos = "doce";
		}
		else if (num3 == 1 && num2 == 3) {
		dos = "trece";
		}
		else if (num3 == 1 && num2 == 4) {
		dos = "catorce";
		}
		else if (num3 == 1 && num2 == 5) {
		dos = "quince";
		}
		else if (num3 == 1 && num2 == 6) {
		dos = "dieciseis";
		}
		else if (num3 == 1 && num2 == 7) {
		dos = "diecisiete";
		}
		else if (num3 == 1 && num2 == 8) {
		dos = "dieciocho";
		}
		else if (num3 == 1 && num2 == 9) {
		dos = "diecinueve";
		}
		if (num3== 2) {
		tres = "veinte";
		}
		else if(num3 == 3) {
		tres = "treinta";
		}
		else if(num3 == 4) {
		tres = "cuarenta";
		}
		else if(num3 == 5) {
		tres = "cincuenta";
		}
		else if(num3 == 6) {
		tres = "sesenta";
		}
		else if(num3 == 7) {
		tres = "setenta";
		}
		else if(num3 == 8) {
		tres = "ochenta";
		}
		else if(num3 == 9) {
		tres = "noventa";
		}
		if (num1 < 10) {
		System.out.println("El numero es: "+ uno);
		}
		else if(num1 < 20) {
		System.out.println("El numero es: "+ dos);
		}
		else if(num1 < 100){
		if (num1 % 10 == 0){
		System.out.println("El numero es: "+ tres);
		}
		}
		else{
		System.out.printf("El numero es: %s y %s\n",tres,uno);
		}
		sc.close();

	}

}
