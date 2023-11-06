package Empresa;

public abstract class Empleado {
	
	String nombre;
	int id_empleado;
	double salario = 1.200;
	
	public Empleado(double salario) {
		super();
		this.salario = salario;
	}

	
	
	public abstract double calcularBono();

}