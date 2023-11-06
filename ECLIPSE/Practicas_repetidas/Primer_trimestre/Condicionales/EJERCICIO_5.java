package Condicionales;

import java.util.Scanner;

public class EJERCICIO_5 {

	public static void main(String[] args) {
		Scanner jk= new Scanner(System.in);
		boolean bombilla_1=false;
		boolean bombilla_2=false;
		System.out.println("Introduzca un numero");
		int numero_1=jk.nextInt();
		int numero_2=jk.nextInt();
		if(numero_1<100&&numero_1>=0&&numero_2<10&&numero_2>=0) {
			bombilla_2=true;
			System.out.println("Se enciende la bombilla 2 y se apaga la bombilla 1");
		}else if (numero_2<100&&numero_2>=0&&numero_1<10&&numero_1>=0){
			bombilla_2=true;
			System.out.println("Se enciende la bombilla 2 y se apaga la bombilla 1");
		}else {
			bombilla_1=true;
		System.out.println("Se enciende la bombilla 1 y se apaga la bombilla 2");
		}
		jk.close();
	}

}
