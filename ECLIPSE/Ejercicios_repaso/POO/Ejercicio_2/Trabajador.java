package Ejercicio_2;

public class Trabajador extends Persona{
	
	double salario;
	
	//CONSTRUCTOR
	public Trabajador(int edad, int telefono, String nombre) {
		super(edad, telefono, nombre);
	}

	public Trabajador(int edad, int telefono, String nombre, double salario) {
		super(edad, telefono, nombre);
		this.salario = salario;
	}
	
	//GETTER Y SETTER

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	

}
