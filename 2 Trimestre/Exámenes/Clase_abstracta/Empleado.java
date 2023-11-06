package Clase_abstracta;

public abstract class Empleado {
	
	String nombre;
	int edad;
	double salario;
	
	public Empleado(double salario) {
		super();
		this.salario = salario;
	}

	
	
	public abstract void calcularBono() {
		
	}

}
