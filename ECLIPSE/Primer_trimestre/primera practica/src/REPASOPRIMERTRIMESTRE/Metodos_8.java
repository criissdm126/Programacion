package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Metodos_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int resultado =0;
		System.out.println("Escribe un numero binario: ");
		
		int binario = new Scanner(System.in).nextInt();
		System.out.println("Es binario" + numeroBinario(binario));
		
		if(numeroBinario(binario)){
			resultado = binario(binario);
			System.out.println("El numero decimal es: " + resultado);
			
		}
		
		sc.close();

	}
	
	
	private static int binario(int binario) {
		// TODO Auto-generated method stub
		return 0;
	}


	static boolean numeroBinario (int a) {
		 
		int unidad =0;
		boolean bin = true;
		while (a!=0) {
			 unidad = a%10;
			if((unidad!=0) && (unidad!=1)) {
				bin=false;
				a=a/10;
			}
		}
		
		return bin;
		
	}
	


}
