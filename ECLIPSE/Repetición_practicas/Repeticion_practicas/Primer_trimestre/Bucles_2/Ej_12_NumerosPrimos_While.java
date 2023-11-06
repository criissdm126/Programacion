package Bucles_2;

import java.util.*;

public class Ej_12_NumerosPrimos_While {

	public static void main(String[] args) {
        
	    System.out.println("Escriba un numero:"); //se pregunta el número
	    Scanner sc= new Scanner(System.in);
	    
	    int num1 = 2;
	    int num2 = sc.nextInt();
	    int numprimo = 0;
	    boolean primo;

	    while (num1 <= num2) {
	        primo = true;
	        int numDivisor = 2;

	        while (numDivisor <= num1 - 1 && primo) { //no es primo
	            if (num1 % numDivisor == 0) {
	                primo = false;
	            }
	            numDivisor++;
	        }
	        
	        if (primo) { //en caso de ser primo
	            numprimo++;
	            System.out.println(num1 + " es primo");
	        }
	        num1++;
	    }

	    System.out.println("Entre 1 y " + num2 + " existen "+ numprimo + " numeros primos");
	    sc.close();
	}
}