package Ejercicicios1;

//import java.util.Scanner;

public class Cuentavocales {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner (System.in);
		String a = "pera";
		//a = sc.nextLine();
		System.out.println(a);
		
		String b = "Euforia";
		//b = sc.nextLine();
		System.out.println(b);
	
		int vocal1 = a.length();
		int vocal2 = b.length();
		
		boolean igual = false;
		//boolean desigual = false;
		
		if ((vocal1 == 5) || (vocal2 != 5)) {
			System.out.println("La palabra uno contiene 4 vocales.");
			igual = true;
		}
		else if ((vocal1  != 5) && (vocal2 != 5)){
			igual = false;
			System.out.println("La palabra NO contiene 5 vocales.");
		}
		
	//	sc.close();
		

	}

}
