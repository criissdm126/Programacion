package Bucles;

import java.util.*;

public class NumeroAleatorio {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio .nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 10;
        Scanner sc = new Scanner(System.in);
        
        // Se dan 10 intentos para adivinar el número secreto
        while (intentos > 0) {
            System.out.print("Introduce un numero entre 1 y 100: ");
            int numeroIntroducido = sc.nextInt();
            
            if (numeroIntroducido == numeroSecreto) {
                System.out.println("¡Enhorabuena! Has adivinado el numero secreto.");
                break;
            }
            
            else if(numeroIntroducido < 0 || numeroSecreto < 0) {
            	System.out.println("Numero introducido incorrecto, introduce otro numero.");
            }
            
            else if (numeroIntroducido < numeroSecreto) {
                System.out.println("El numero secreto es mayor.");
            }
            
            else {
                System.out.println("El numero secreto es menor.");
            }
            
            intentos--;
            System.out.println("Te quedan " + intentos + " intentos.");
        }
        
        // Si se agotan los intentos, se muestra el número secreto
        if (intentos == 0) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        }
        
        sc.close();
    }
}

/*Se genera un nº secreto aleatorio (entre 1 y 100).
* El usuario introduce un nº por teclado.
* Hay 10 intentos para adivinar el nº secreto, indicar si el nº introducido es mayor o menor
*/

