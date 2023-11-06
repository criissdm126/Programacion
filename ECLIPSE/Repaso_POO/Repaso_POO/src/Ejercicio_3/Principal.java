package Ejercicio_3;

public class Principal {

	public static void main(String[] args) {
		
		Programador programador = new Programador("Juan", 30, 50000);
		programador.calcularBono();
		System.out.println("Salario actual del programador: " + programador.getSalario() + " € ");
		System.out.println(programador);

		Gerente gerente = new Gerente("María", 40, 80000);
		gerente.calcularBono();
		System.out.println("Salario actual del gerente: " + gerente.getSalario() + " € ");
		System.out.println(gerente);


	}

}
