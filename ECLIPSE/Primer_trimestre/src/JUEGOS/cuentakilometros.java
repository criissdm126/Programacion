package JUEGOS;

public class cuentakilometros {

	public static void main(String[] args) {
		
String cambio1 = "1";
		
		for (int num1 =0; num1<=9; num1++) {
			for (int num2=0; num2<=9; num2++) {
				for (int num3 = 0; num3 <= 9; num3 ++) {
					if (num3 == 1) {
						System.out.println (num1 + "" + num2 + "" + "L");
					}
					else if (num2 == 1) {
						System.out.println (num1 + "" + "L" + "" + num3);
					}
					else if (num1 == 1) {
						System.out.println ("L" + "" + num2 + "" + num3);
					}
					else 
						System.out.println (num1 + "" + num2 + "" + num3);
				}
				
			}
		}

	}

}
