package Tema3;

public class multiplicaciónDOWHILE {

	public static void main(String[] args) {
		
		int x=4;
		int mult=10;
		int resultado = 0;
		
		do
		{
			resultado = x*mult;
			System.out.println(x + "*" + mult + "=" + resultado);
			mult --;
		}
		while (mult >=1);


	}

}
