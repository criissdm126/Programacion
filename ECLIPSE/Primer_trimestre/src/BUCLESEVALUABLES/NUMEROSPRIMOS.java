package BUCLESEVALUABLES;

import java.util.Scanner;

public class NUMEROSPRIMOS {

	public static void main(String[] args) {
		
		System.out.println("Escriba un numero:");
		Scanner sc= new Scanner(System.in);
		int num1,num,contador;
		boolean primo;
		contador=0;
		num=sc.nextInt();
		for(int i=2;i<=num;i++){
		primo=true;
		num1=2;
		while (num1<=i-1 && primo==true){
		if (i%num1==0)
		primo=false;
		num1++;
		}
		if (primo==true){
		contador++; 
		System.out.println(i+(" es primo"));
		}
		}
		
		System.out.println("Entre 0 y " + num + " existen "+ contador + " numeros primos");
		sc.close();


	}

}
