package Bucles_2;

import java.util.Scanner;

public class Ej_09_NumeroAleatorio_for {

    public static void main(String[] args) {
        
		System.out.println("Tienes que adivinar un numero comprendido entre el 1 y el 100.");
		System.out.println("Introduzca un numero:");
		Scanner sc= new Scanner(System.in);
		
		int numeroSecreto = (int)(Math.random()*99)+1;
		int intentos = 10;
		//int acierto = sc.nextInt();
		
		// Se dan 10 intentos para adivinar el número secreto
		for (int i = intentos; i > 0; i--) {
		    System.out.print("Introduce un numero entre 1 y 100: ");
		    int numeroIntroducido = sc.nextInt();

		    if (numeroIntroducido == numeroSecreto) { //en caso de ser iguales
		        System.out.println("¡Enhorabuena! Has adivinado el numero secreto.");
		        break;
		    }

		    else if (numeroIntroducido < 0 || numeroSecreto < 0) {
		        System.out.println("Numero introducido incorrecto, introduce otro numero.");
		    }

		    else if (numeroIntroducido < numeroSecreto) { //cuando el aleatorio es mayor
		        System.out.println("El numero secreto es mayor.");
		    }

		    else { //aleatorio es menor
		        System.out.println("El numero secreto es menor.");
		    }

		    System.out.println("Te quedan " + (i-1) + " intentos.");
		}

		// Si se agotan los intentos, se muestra el número secreto
		if (intentos == 0) {
		    System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
		}

		sc.close();

	}

}
