package Ejercicio_3;

public class Programador extends Empleado{
	
	 public Programador(String nombre, int edad, double salario) {
	        super(nombre, edad, salario);
	    }

	    public void calcularBono() {
	        double bono = getSalario() * 0.2;
	        setSalario(getSalario() + bono);
	    }


}
