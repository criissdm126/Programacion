package Ejercicio_1;

public class principal {

	public static void main(String[] args) {
		
		Ejemplo ob1 = new Ejemplo();
		Ejemplo ob2 = new Ejemplo();
		
		ob1.x = 10;
		ob2.x=12;
		
		Ejemplo.y=100;
		
		System.out.println("ob1.suma(): " + ob1.suma());
		System.out.println("ob2.suma(): " + ob2.suma());
		System.out.println(Ejemplo.dimeY());

	}

}

class Ejemplo{
	int x;   //atributo instancia
	static int y;   //atributo de clase
	
	int suma() {
		y/=2;
		return x+y;
	}
	
	static int dimeY() {
		return y;
	}
}
