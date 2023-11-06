package Bucles;

import java.util.*;

public class Ej_09_NumeroAleatorio {

    public static void main(String[] args) {
        
        int numeroSecreto = (int)(Math.random()*99)+1; // Genera un número aleatorio entre 1 y 100
        int intentos = 10;
        Scanner sc = new Scanner(System.in);
        
        // Se dan 10 intentos para adivinar el número secreto
        while (intentos > 0) {
            System.out.print("Introduce un numero entre 1 y 100: ");
            int numeroIntroducido = sc.nextInt();
            
            if (numeroIntroducido == numeroSecreto) { //en caso de ser iguales
                System.out.println("¡Enhorabuena! Has adivinado el numero secreto.");
                break;
            }
            
            else if(numeroIntroducido < 0 || numeroSecreto < 0) {
                System.out.println("Numero introducido incorrecto, introduce otro numero.");
            }
            
            else if (numeroIntroducido < numeroSecreto) { //cuando el aleatorio es mayor
                System.out.println("El numero secreto es mayor.");
            }
            
            else { //aleatorio es menor
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

