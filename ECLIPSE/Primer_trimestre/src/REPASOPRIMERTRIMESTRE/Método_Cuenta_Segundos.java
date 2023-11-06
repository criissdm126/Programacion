package REPASOPRIMERTRIMESTRE;

public class Método_Cuenta_Segundos {

	public static void main(String[] args) {
		
		int segundos = 1;
		int  horas=1;
		int minutos = 60;
		
		int resultado;
		resultado = cuentaSegundos (horas, minutos, segundos);
		System.out.println(resultado);
	}
	
	static int cuentaSegundos (int h, int m, int s) {
		return (h*3600 + m*60 + s);
	}


	}


