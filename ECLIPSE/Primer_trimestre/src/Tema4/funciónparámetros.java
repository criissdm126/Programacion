package Tema4;

public class funciónparámetros {

	public static void main(String[] args) {
		int a = mayor (12,3);
		System.out.println(a);
		System.out.println(mayor (12,12));
		int c = 12, d = 24;
		System.out.println(mayor (c,d));
	
}
	static int mayor (int num1, int num2) {
		
		int nummax = 0;
		
		if (num1 > num2) {
			nummax = num1;
	}
		else if (num2 > num1) {
			nummax = num2;
		}
		
		else if (num1 == num2) {
			nummax = 0;
		}
		return nummax;
		
		
	}

	}


