package TEMA1;

import java.util.*;

public class EJERCICIO19 {

	public static void main(String[] args) {
		
		double infantil;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon el numero de entradas infantiles que desea:");
		infantil = sc.nextDouble();
		
		double adultos;
		System.out.println("Pon el numero de entradas de adultos que desea:");
		adultos = sc.nextDouble();
		
		infantil = infantil*15.50;
		adultos = adultos*20;
		 
		double compra;
		compra = (infantil + adultos);
		System.out.println("El total de las entradas sin descuento: " + compra);
		 
		double descuento = compra >= 100 ? compra*5.0/100.0: 0;
		System.out.println("El descuento que se le aplica: " + descuento);
		compra -= descuento;
		
		System.out.println("El total de las entradas con descuento: " + compra);
		
		sc.close();


	}

}
