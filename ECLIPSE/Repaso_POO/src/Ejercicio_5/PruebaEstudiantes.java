package Ejercicio_5;

public class PruebaEstudiantes {
	
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		e1.mostrarInfo();
		Estudiante e2 = new Estudiante();
		e2.mostrarInfo();
		e1.b++; 
		Estudiante.b++; 
		e2.mostrarInfo();
		}
		}
		class Estudiante {
		int a; 
		static int b; 
		Estudiante() {
		b++;
		}
		public void mostrarInfo() {
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
		}

}
