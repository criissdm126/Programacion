package Metodos;

	import java.util.Scanner;

	public class binario {

		public static void main(String[] args) {
			
			binario();

		}
		
		public static void  binario() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Escribe un numero entero, sin decimales y positivo, como maximo de 3 digitos, y  se mostrara ese mismo numero pero en binario: ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("numero incorrecto, tiene que ser mayor que 0");
			}
			
			else if(num > 999) {
				System.out.println("numero incorrecto, tiene que ser menor que 1000");
			}
			else {
	            String binario = "";

	            while (num > 0) {
	                int residuo = num % 2;
	                binario = residuo + binario;
	                num /= 2;
	            }

	            System.out.println("El numero en binario es: " + binario);
	        }
	    }
	}

	// Método para convertir de decimal a binario