package generar_num;


public class Prueba_3 {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 2;

		division(a,b);
		

	}

	public static void division (int a, int b) {
		
		int contador =0 ;
		int resultado = 0;

		while(a>=b) {
			resultado = a - b;
			a = resultado;
			contador ++;
		}
		
		System.out.println(contador);
		
	}

}