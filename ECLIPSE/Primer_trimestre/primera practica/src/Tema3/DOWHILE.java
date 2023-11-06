package Tema3;

import java.util.Scanner;

public class DOWHILE {

	public static void main(String[] args) {
		
		
		int a = 0;
		int num = 0, total =0;
		double media;
		Scanner sc = new Scanner (System.in);{
		do{
			System.out.println("Dime un numero aleatorio");
			num ++;
			a = sc.nextInt();
			total = total + a;
			
		}
			while (num<5);
		
		System.out.println("la suma total es:" + total);
		
		
	     media = total/5;
		System.out.println("La smedia es :" + media);
		
		sc.close();

	}

}
}
