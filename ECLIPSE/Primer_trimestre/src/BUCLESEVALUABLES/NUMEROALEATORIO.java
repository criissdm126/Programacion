package BUCLESEVALUABLES;

import java.util.Scanner;

public class NUMEROALEATORIO {

	public static void main(String[] args) {
		
		System.out.println("Tienes que adivinar un numero comprendido entre el 1 y el 100.");
		System.out.println("Introduzca un numero:");
		Scanner sc= new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*99)+1;
		int intentos = 10;
		int acierto = sc.nextInt();
		intentos--;
		
		while ((acierto!=aleatorio) && (intentos >0)) {
			
			if(aleatorio>acierto) {
				System.out.println("El numero es mayor");
				}
			else {
				System.out.println("El numero es menor.");
				}
			System.out.println("Te quedan: " + intentos);
			intentos --;
			acierto = sc.nextInt();
				}
		
		if (intentos == 0) {
			System.out.println("Se te han acabado los intentos, el numero era: " + aleatorio);
				}
		else if (acierto == aleatorio) {
			System.out.println("Enhorabuena, has acertado el numero.");
				}
				 
				sc.close();



	}

}
