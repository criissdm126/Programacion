package Catch;


//import java.util. *;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int [] numeros = {1, 2, 3};
			//int calculo = numeros [1]/0;
			
			System.out.println(numeros[10]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posicion fuera del array");
		}
		
		catch (Exception e) {
			System.out.println("algo fue mal");
		}

	}

}
//finally se ejecuta siempre, si el try falla salta al try y al finally
//si el try se hace bien salta al  finally
