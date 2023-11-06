package Tema2;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = (int) (Math.random()*99) + 1;
		
		int b;
		b = (int) (Math.random()*99) + 1;
		
		
		System.out.println("A es: " + a);
		System.out.println("B es: " + b);
		
		int resultadosuma;
		resultadosuma = sc.nextInt();
		int resultadoresta;
		resultadoresta = sc.nextInt();
		int resultadomultiplicacion;
		resultadomultiplicacion = sc.nextInt();
		int suma = (int)(Math.random()* 3);
		int resta = (int)(Math.random() * 3);
		int multiplicacion = (int) (Math.random() * 3);
		int resultado;
		resultado = sc.nextInt();
	
		
		
		if (suma == 0) { System.out.println ("Sume los siguientes numeros " + a  + "+" +  b);
	        if (resultado == resultadosuma) System.out.println("Es correcto.");
	        else System.out.println("Es incorrecto.");
			System.out.println("El resultado de la suma es " + resultadosuma);
			sc.close();
		}
		
		
		else if (resta == 1) { System.out.println("Reste los siguientes digitos" + a   + b);
		     if (resultado == resultadoresta) System.out.println("Es correcto.");
		     else System.out.println("Es incorrecto.");
			System.out.println("El resultado de la resta es:" + resultadoresta);
			sc.close();
		}
		
		

		
		else if (multiplicacion  == 2) { System.out.println("Multiplique los siguientes digitos" + a + "*" + b);
		 if (resultado == resultadomultiplicacion) System.out.println("Es correcto.");
		 else  System.out.println("Es incorrecto.");
		  sc.close();
		}

	}

}
