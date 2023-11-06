package Trabajosevaluables;

import java.util.Scanner;

public class letras {

	public static void main(String[] args) {
		
		System.out.print("Ponga un numero comprendido entre el 1 y el 50, si es un numero superior van de 10 en 10 hasta llegar a 100: ");
		Scanner sc= new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2;
		int num3;

		
		String uno = "";
		String dos = "";
		String tres = "";
		
		num3 =num1/10;
        num2 =num1 %10;
        
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
		
		if (num3 == 2 && num2 == 0) {
			dos = "veinte";
		}
		else if (num3 == 2 && num2 == 1) {
			dos = "veintiuno";
		}
		else if (num3 == 2 && num2 == 2) {
			dos = "veintidos";
		}
		else if (num3 == 2 && num2 == 3) {
			dos = "veintitres";
		}
		else if (num3 == 2 && num2 == 4) {
			dos = "veinticuatro";
		}
		else if (num3 == 2 && num2 == 5) {
			dos = "veinticinco";
		}
		else if (num3 == 1 && num2 == 6) {
			dos = "veintiseis";
		}
		else if (num3 == 2 && num2 == 7) {
			dos = "veintisiete";
		}
		else if (num3 == 2 && num2 == 8) {
			dos = "veintiocho";
		}
		else if (num3 == 2 && num2 == 9) {
			dos = "veintinueve";
		}
		
		if (num3 == 3 && num2 == 0) {
			dos = "Treinta";
		}
		else if (num3 == 3 && num2 == 1) {
			dos = "Treinta y uno";
		}
		else if (num3 == 3 && num2 == 2) {
			dos = "Treinta y dos";
		}
		else if (num3 == 3 && num2 == 3) {
			dos = "Treinta y tres";
		}
		else if (num3 == 3 && num2 == 4) {
			dos = "Treinta y cuatro";
		}
		else if (num3 == 3 && num2 == 5) {
			dos = "Treinta y cinco";
		}
		else if (num3 == 3 && num2 == 6) {
			dos = "Treinta y seis";
		}
		else if (num3 == 3 && num2 == 7) {
			dos = "Treinta y siete";
		}
		else if (num3 == 3 && num2 == 8) {
			dos = "Treinta y ocho";
		}
		else if (num3 == 3 && num2 == 9) {
			dos = "Treinta y nueve";
		}

		if (num3 == 4 && num2 == 0) {
			dos = "Cuarenta";
		}
		else if (num3 == 4 && num2 == 1) {
			dos = "Cuarenta y uno";
		}
		else if (num3 == 4 && num2 == 2) {
			dos = "Cuarenta y dos";
		}
		else if (num3 == 4 && num2 == 3) {
			dos = "Cuarenta y tres";
		}
		else if (num3 == 4 && num2 == 4) {
			dos = "Cuarenta y cuatro";
		}
		else if (num3 == 4 && num2 == 5) {
			dos = "Cuarenta y cinco";
		}
		else if (num3 == 4 && num2 == 6) {
			dos = "Cuarenta y seis";
		}
		else if (num3 == 4 && num2 == 7) {
			dos = "Cuarenta y siete";
		}
		else if (num3 == 4 && num2 == 8) {
			dos = "Cuarenta y ocho";
		}
		else if (num3 == 4 && num2 == 9) {
			dos = "Cuarenta y nueve";
		}
		
		if(num3 == 5 && num2 == 0) {
			tres = "cincuenta";
		}
		else if(num3 == 6 && num2 == 0) {
			tres = "sesenta";
		}
		else if(num3 == 7 && num2 == 0) {
			tres = "setenta";
		}
		else if(num3 == 8 && num2 == 0) {
			tres = "ochenta";
		}
		else if(num3 == 9 && num2 == 0) {
			tres = "noventa";
		}
		

		
		if (num1 < 10) {
			System.out.println("El numero es: "+ uno);
		}
		else if(num1 < 50) {
		
				System.out.println("El numero es: "+ dos);
			
		}
		else if(num1 < 100){
			if (num1 % 10 == 0){
			System.out.println("El numero es: "+ tres);
		}
		}
		

		sc.close();
	}
	

}
