package Tema3;

import java.util.Scanner;

public class BUCLESANIDADOS {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			
			for (int i=1; i<=4; i++) {
				System.out.println("--------Ejecutando i " + i);
				for (int j=1; j<=3; j++){
					System.out.println("Ejecutando j " + j);
				}
			}
			sc.close();
		}

	}