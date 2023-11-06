package Trabajosevaluables;

import java.util.Scanner;

public class tomates {

	public static void main(String[] args) {
		
		System.out.println("Numero de tomates que desea:  ");
		Scanner sc = new Scanner(System.in);
		double precio = 0.2;
		int tomates = sc.nextInt();
		
		
		
		
		double total = tomates*precio;
		total = Math.round(total * 100)/100;
		System.out.println("El precio sin ningun tipo de descuento, es de:  " + total + " euros");
		
		
		if (tomates>=15) {
			double descuento = total*0.8;
			descuento = Math.round(descuento*100)/100;
			
			System.out.println("Le vamos a aplicar un descuento del 20%, se le quedaria en: " + descuento);
			System.out.println("Ahorra: " + (total - descuento) + " euros");
			
			int extra = 2*((tomates-15)/5);
			System.out.println("Al llegar a los 3kg de tomates, por cada kg extra que compre se le regalan 2 tomates");
			if (extra==0) {
				System.out.println("No le corresponde ningun tomate de regalo");
			}
			else {
				System.out.println("Le corresponde: " + extra + " tomates de regalo");
			}
		}
		
		
		
		sc.close();

	}

}
