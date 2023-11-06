package Clase_abstracta;

public abstract class Empleado {
	
	String nombre;
	int id_empleado;
	//double salario = 1.200;
	private double salario;
	
	public Empleado(double salario) {
		super();
		this.setSalario(salario);
	}

	
	
	public abstract double calcularBono();



	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
