package Prácticasevaluables;

import java.util.Scanner;

public class palabras {

	public static void main(String[] args) {
		
		
		System.out.println("Tiene que introducir tres palabras, se colocaran de la mas larga a la más corta, en caso de ser iguales, alfabeticamente.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera palabra: ");
		String uno= sc.nextLine();
		
		System.out.println("Introduzca la segunda palabra: " );
		String dos = sc.nextLine();
		
		System.out.println("Introduzca la tercera palabra: ");
		String tres = sc.nextLine();
		
		
		int longuitud1 = uno.length();
		int longuitud2 = dos.length();
		int longuitud3 = tres.length();
		
		
		if (longuitud1 > longuitud2  && longuitud2 > longuitud3) {
			System.out.println(uno + "-" + dos + "-"+ tres);
		}
		else if (longuitud1 > longuitud3 && longuitud3 > longuitud2){
			System.out.println( uno + "- " + tres + "-" + dos);
		}
		else if (longuitud2 > longuitud1 && longuitud1 > longuitud3) {
			System.out.println(dos + "-" +  uno + "-" + tres);
		}
		
		else if (longuitud2 > longuitud3 && longuitud3 > longuitud1) {
			System.out.println(dos + "-" + tres + "-" + uno);
		}
		
		else if (longuitud3 > longuitud1 && longuitud1 > longuitud2) {
			System.out.println(tres + "-" + uno + "-" + dos);
		}
			
		else if (longuitud3 > longuitud2 && longuitud2 > longuitud1) {
			System.out.println(tres + "- " + dos + "-" + uno);
		}
		
		
		  if ((uno.compareToIgnoreCase(dos) < 0) && (dos.compareToIgnoreCase(tres) < 0)) {
		   System.out.println(uno + " > " + dos + " > " + tres);
		  }
		  else if ((uno.compareToIgnoreCase(tres) < 0) && (tres.compareToIgnoreCase(dos) < 0)) {
			   System.out.println(uno + " > " + tres + " > " + dos);
		  }
		 
		  else if ((dos.compareToIgnoreCase(uno) < 0) && (uno.compareToIgnoreCase(tres) < 0)) {
		   System.out.println(dos + " > " + uno + " > " + tres);
		  }
		  else if ((dos.compareToIgnoreCase(tres) < 0) && (tres.compareToIgnoreCase(uno) < 0)) {
		   System.out.println(dos + " > " + tres + " > " + uno);
		  }
		  
		  
		  else if ((tres.compareToIgnoreCase(uno) < 0) && (uno.compareToIgnoreCase(dos) < 0)) {
		   System.out.println(tres + " > " +uno + " > " + dos);
		  }
		  else if ((tres.compareToIgnoreCase(dos) < 0) && (dos.compareToIgnoreCase(uno) < 0)) {
			  System.out.println( tres + " > " + uno + " = " + dos);
		  }
		  
		  else if ((uno.compareToIgnoreCase(dos) == 0) && (dos.compareToIgnoreCase(tres) < 0)) {
		   System.out.println(tres + " > " + uno + " = " + dos);
		  }
		  else if ((uno.compareToIgnoreCase(tres) == 0) && (tres.compareToIgnoreCase(dos) < 0)) {
		   System.out.println(dos + " > " + uno + " = " + tres);
		  }
		  else if ((dos.compareToIgnoreCase(tres) == 0) && (tres.compareToIgnoreCase(uno) < 0)) {
		   System.out.println( uno + " > " + dos + " = " + tres);
		  }
		  
		  
		  else if ((dos.compareToIgnoreCase(tres) == 0) && (dos.compareToIgnoreCase(uno) > 0)) {
		   System.out.println(dos + " = " + tres + " > " + uno);
		  }
		  else if ((uno.compareToIgnoreCase(dos) == 0) && (uno.compareToIgnoreCase(tres) > 0)) {
			  System.out.println(uno + " = "  + dos + " > " + tres);
		  }
			  
			  
			  else  {
			   System.out.println(uno + " = " + dos + " = " + tres);
			  }

		 
		
		sc.close();

	}

}
