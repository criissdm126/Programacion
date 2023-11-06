package Condicionales;

import java.util.Scanner;

public class Ej_5_Bombillas {

	public static void main(String[] args) {
		
		
		// si los dígitos dan 3 o más = b2
		// menos b1
		
		Scanner sc= new Scanner(System.in);
      
      System.out.println("Si la suma de los digitos de ambos numeros es menor a 3, se enciende b1, si es 3 o mas, se enciende b2.");
      System.out.println("Ingrese dos numeros:"); //SE PREGUNTAN LOS NÚMEROS

      boolean b1 = false;
      boolean b2 = false;
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      
      if (num1 < 100 && num1 >= 10 && num2 <10 && num2 >= 0 || num2 < 100 && num2 >= 10 && num1 <10 && num1 >=0 || num1 > 10 && num1 < 100 || num2 > 10 && num2 < 100)  { //2 digitos
         
         b2 = true;
         }
         
      else if(num1 >= 100 && num2 >= 0 || num1 >=0 && num2 >=100) { // digitos 3 o mas
         b2 = true;
      }
      
     /* else if (num1 > 10 && num1 < 100 || num2 > 10 && num2 < 100) { //  2 digitos
    	  b2 = true;
      }*/
      
      else if(num1 < 10 && num1 >= 0 && num2 < 10 && num2 >=0){ // si el numero es 2 o menos
			b1=true;
		}

      System.out.println("Bombilla b1: " + b1);
      System.out.println("Bombilla b2: " + b2);
      
      sc.close();
	}
}



/*Hay 2 bombillas apagadas (b1 y b2). Introducir por teclado 2 números.
 * Si sumando los dígitos de los 2 números el número de dígitos es mayor a 3, se enciende b1, sino se enciende b2. b1 y b2 tienen que ser variables booleanas, mostrar en el programa el estado final de las bombillas.
 * Por ejemplo, si los números son 76 y 123, son 5 dígitos y por eso se encendería b1
 */