package Empresa;

public class Programador  extends Empleado{
	
	double sal;

	public Programador(double salario) {
		super(salario);
		
	}
	
	public double calcularBono() {
		//20%
		sal = (salario*20)/100;
		return sal;
	}
	public String toString() {
		System.out.println("El bono que se le aplica al programador es de: " + sal);
		return null;
	}

}
