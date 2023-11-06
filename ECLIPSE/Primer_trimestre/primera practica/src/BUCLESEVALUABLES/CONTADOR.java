package BUCLESEVALUABLES;


public class CONTADOR {

	public static void main(String[] args) {
		
		
		int num = 100;
		int num2;
		int contador = 0;
		
		
		while (num >0) {
			System.out.println(num);
			num = num - 2;
			num2 = num + 1;
			
			int digito = num2 % 10;
			if(digito == 7) {
				contador++;
			}
		}
		
		System.out.println("Existen: "  +  contador + " sietes");
		
		

	}

}
