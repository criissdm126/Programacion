package Bucles;

import java.util.*;

public class NumerosPrimos {

    public static void main(String[] args) {
        
        System.out.println("Escriba un numero:");
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2 = sc.nextInt();
		int numprimo;
		boolean primo;
		numprimo=0;
        
        for(int i=2;i<=num2;i++){
            primo=true;
            num1=2;
            
            while (num1<=i-1 && primo==true){
                if (i%num1==0)
                primo=false;
                num1++;
                
            }
            
            if (primo == true) {
                numprimo++;
                System.out.println(i+(" es primo"));
            }

        }
        
        System.out.println("Entre 1 y " + num2 + " existen "+ numprimo + " numeros primos");
        sc.close();
    }
}

/*Realizar un programa que nos pida un número n,
* y nos diga cuantos números hay entre 1 y n que son primos
*/
