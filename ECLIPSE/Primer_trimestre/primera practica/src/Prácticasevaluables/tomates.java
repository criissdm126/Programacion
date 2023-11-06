package Prácticasevaluables;
import java.util.Scanner;
public class tomates {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		final double tomates =1.95;
		final double numkilos = 5;
		
		System.out.println("Numero de tomates que desea:  ");
		int numero = sc.nextInt();
		double kilos = (numero/numkilos);
		double importe = (numkilos*tomates)*9;
		double round_importe = Math.round(importe*100.0)/100;
		
		
		if (kilos >=3) {
			int extra = (int)(2*(kilos-3));
			double descuento = importe*0.2;
			double importedescuento = Math.round(descuento*100.0)/100;
			double total = importe - importedescuento;
			double round_importetotal = Math.round(total*100.0)/100;
			System.out.println("Has comprado:  " + kilos + " kilos de tomates");
			System.out.println("Total: " + round_importetotal + "(" + importe + "euros" + importedescuento + "euros dedescuento");
			System.out.println("Se le regala: " + extra + " tomates");
			
		}
		
		else {
			System.out.println("total a pagar: " + round_importe);
		}
		
		sc.close();


	}

}
