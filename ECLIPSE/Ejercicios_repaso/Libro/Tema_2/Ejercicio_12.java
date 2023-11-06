package Tema_2;

import java.util.*;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu numero del DNI y le asignamos una letra: ");
		int numDNI = sc.nextInt();
		
		int letra1 = numDNI%2;
		
		char letra2 = 0;
		if (letra1== 0) {
			letra2 = 'T';
		}
		else if (letra1 == 1) {
			letra2 = 'R';
		}
		else if (letra1 == 2) {
			letra2 = 'W';
		}
		else if (letra1== 3) {
			letra2 = 'A';
		}
		else if (letra1 == 4) {
			letra2 = 'G';
		}
		else if(letra1 == 5) {
			letra2 = 'M';
		}
		else if (letra1 == 6) {
			letra2 = 'Y';
		}
		else if (letra1 == 7) {
			letra2 = 'F';
		}
		else if (letra1 == 8) {
			letra2 = 'P';
		}
		else if (letra1 == 9) {
			letra2 = 'D';
		}
		else if (letra1== 10) {
			letra2 = 'X';
		}
		else if (letra1 == 11) {
			letra2 = 'B';
		}
		else if (letra1 == 12) {
			letra2 = 'N';
		}
		else if (letra1 == 13) {
			letra2 = 'J';
		}
		else if (letra1 == 14) {
			letra2 = 'Z';
		}
		else if (letra1 == 15) {
			letra2 = 'S';
		}
		else if (letra1 == 16) {
			letra2 = 'Q';
		}
		else if (letra1 == 17) {
			letra2 = 'V';
		}
		else if (letra1 == 18) {
			letra2 = 'H';
		}
		else if (letra1 == 19) {
			letra2 = 'L';
		}
		else if (letra1 == 20) {
			letra2 = 'C';
		}
		else if (letra1 == 21) {
			letra2 = 'K';
		}
		else if (letra1 == 22) {
			letra2 = 'E';
		}
		System.out.println("La letra del DNI es: " + letra2);
		
		sc.close();

	}

}

/*El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número d ela siguiente forma:
 *          letra = número DNI módulo 22
 *Basándote en esta información, elige la letra a partir de la numeación de la siguiente tabla:
 *           0 = T
 *           1 = R
 *           2 = W
 *           3 = A
 *           4 = G
 *           5 = M
 *           6 = Y
 *           7 = F
 *           8 =  P 
 *           9 = D
 *           10 = X
 *           11 = B
 *           12 = N
 *           13 = J
 *           14 = Z
 *           15 = S
 *           16 = Q
 *           17 = V
 *           18 = H
 *           19 = L
 *           20 = C
 *           21 = K
 *           22 = E
 * y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde. 
 * Observa que un número de 8 dígitos esta dentro del rango del tipo int.
 */
