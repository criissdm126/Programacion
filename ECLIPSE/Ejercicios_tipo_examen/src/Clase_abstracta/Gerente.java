package Clase_abstracta;

public class Gerente extends Empleado{
	
	double sal;

	public Gerente(double salario) {
		super(salario);
		
	}
	
	public double calcularBono() {
		//30%
		sal = (getSalario()*30)/100;
		return sal;
	}
	

public String toString() {
	System.out.println("El bono que se le aplica al gerente es de: " + sal);
	return null;
}

}
