package Prácticasevaluables;

import java.util.Scanner;

public class HORÓSCOPO {

	public static void main(String[] args) {
		System.out.println("Dime tu dia de nacimiento: ");
		Scanner sc = new Scanner(System.in);
		int dia;
		dia = sc.nextInt();
		
		System.out.println("Dime tambien tu mes de nacimiento: ");
		double mes;
		mes = sc.nextDouble();
		
		
		
		if(dia>=21 && dia<=31 && mes==3 || dia>=1 && dia<=19 && mes==4){
			System.out.println("Tu signo del zodiaco es Aries");
		}
		else if (dia>=20 && dia<=30 && mes==4 || dia>=1 && dia<=20 && mes==5){
			System.out.println("Tu signo del zodiaco es Tauro");
		}
		else if (dia>=21 && dia<=31 && mes==5 || dia>=1 && dia<=20 && mes==6) {
			System.out.println("Tu signo del zodiaco es Géminis");
		}
		else if (dia>=21 && dia<=30 && mes==6 || dia>=1 && dia<=22 && mes==7) {
			System.out.println("Tu signo del zodiaco es Cáncer");
		}
		else if (dia>=22 && dia<=31 && mes==7 || dia>=1 && dia<=22 && mes==8) {
			System.out.println("Tu signo del zodiaco es Leo");
		}
		else if (dia>=23 && dia<=31 && mes==8 || dia>=1 && dia<=22 && mes==9) {
			System.out.println("Tu signo del zodiaco es Virgo");
		}
		else if (dia>=23 && dia<=30 && mes==9|| dia>=1 && dia<=22 && mes==10) {
			System.out.println("Tu signo del zodiaco es Libra");
		}
		else if (dia>=23 && dia<=31 && mes==10|| dia>=1 && dia<=21 && mes==11) {
			System.out.println("Tu signo del zodiaco es Escorpio");
		}
		else if (dia>=22 && dia<=30 && mes==11|| dia>=1 && dia<=21 && mes==12) {
			System.out.println("Tu signo del zodiaco es Sagitario");
		}
		else if (dia>=22 && dia<=31 && mes==12|| dia>=1 && dia<=19 && mes==1) {
			System.out.println("Tu signo del zodiaco es Capricornio");
		}
		else if (dia>=20 && dia<=31 && mes==1|| dia>=1 && dia<=18 && mes==2) {
			System.out.println("Tu signo del zodiaco es Acuario");
		}
		else if (dia>=19 && dia<=28 && mes==2|| dia>=1 && dia<=20 && mes==13) {
			System.out.println("Tu signo del zodiaco es Piscis");
		}
		
		sc.close();
	

	}

}
