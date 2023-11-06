package TEMA2;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		double nota;
		Scanner sc = new Scanner(System.in);
		nota = sc.nextDouble();
		
		    if (nota<=4) {
			System.out.println("Suspenso.");
			System.out.println("Animo...");
			}
			else if  (nota == 5) {
				System.out.println("Suficiente.");
			}
			else if (nota == 6) {
				System.out.println("Bien.");
			}
			else if (nota == 7) {
				System.out.println("Notable.");
			}
			else if (nota == 8) {
				System.out.println("Notable.");
			}
			else if (nota == 9) {
				System.out.println("Sobresaliente.");
				System.out.println("Enhorabuena.");
			}
			else if (nota == 10) {
				System.out.println("Sobresaliente.");
				System.out.println("Enhorabuena.");
			}
		    
			sc.close();

	}

}
