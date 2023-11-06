package Bucles_2;

import java.util.Scanner;

public class Ej_12_NumerosPrimos_DoWhile {

    public static void main(String[] args) {
        
        System.out.println("Escriba un numero:"); //se pregunta el número
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2 = sc.nextInt();
		int numprimo;
		boolean primo;
		numprimo=0;
        int i=2;
        do{
            primo=true;
            num1=2;
            
            while (num1<=i-1 && primo==true){ //no es primo
                if (i%num1==0)
                primo=false;
                num1++;
                
            }
            
            if (primo == true) { //en caso de ser primo
                numprimo++;
                System.out.println(i+(" es primo"));
            }
            i++;
        } while(i<=num2);
        
        System.out.println("Entre 1 y " + num2 + " existen "+ numprimo + " numeros primos");
        sc.close();
    }
}